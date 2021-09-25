package ru.job4j.bank;

import java.util.*;

/**
 * Содержит список всех пользователей и их лицевых счетов,
 * а так же методы взаимодействия с ними.
 *
 * @author Stikkerrr
 * @version 1.0
 */
public class BankService {
    /**
     * Список пользователей и их лицевых счетов
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет нового пользователя
     *
     * @param user добавляемый пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Добавляет новый лицевой счет пользователю
     *
     * @param passport паспортные данные пользователя
     * @param account добавляемый лицевой счет
     */
    public void addAccount(String passport, Account account) {
        var currentUser = findByPassport(passport);
        if (currentUser.isPresent()) {
            var listAccounts = users.get(currentUser.get());
            if (!listAccounts.contains(account)) {
                listAccounts.add(account);
            }
        }
    }

    /**
     * Ищет пользователя по серийному номеру его паспорта
     *
     * @param passport паспортные данные по которым будет вестись поиск
     * @return возвращает найденный объект пользователя или NULL
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(key -> passport.equals(key.getPassport()))
                .findFirst();
    }

    /**
     * Ищет лицевой счет по паспортным данным пользователя и реквизитам
     *
     * @param passport паспортные данные пользователя
     * @param requisite реквизиты лицевого счета
     * @return возвращает найденный лицевой счет или NULL
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        var user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                .stream()
                .filter(a -> a.getRequisite().contains(requisite))
                .findFirst());
    }

    /**
     * Переводит деньги между двумя лицевыми счетами пользователей
     *
     * @param srcPassport паспортный данные пользователя со счета которого
     *                    будет производиться перевод средств
     * @param srcRequisite реквизиты лицевого счета с которого будет производится перевод
     * @param destPassport паспортные данные пользователя на счет которого
     *                     будут зачислены средства
     * @param destRequisite реквизиты лицевого счета на который
     *                      будет производится зачисление средств
     * @param amount сумма перевода
     * @return результат операции (Boolean)
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        var srcAccount = findByRequisite(srcPassport, srcRequisite);
        var destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            return true;
        }
        return false;
    }
}
