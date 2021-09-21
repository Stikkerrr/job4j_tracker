package ru.job4j.bank;

import java.util.Objects;

/**
 * Модель, содержащая описание банковского счета
 *
 * @author Stikkerrr
 * @version 1.0
 */
public class Account {
    /**
     * Реквизиты лицевого счета
     */
    private String requisite;
    /**
     * Баланс лицевого счета
     */
    private double balance;

    /**
     * Создает объект класса Account
     *
     * @param requisite реквизиты лицевого счета
     * @param balance баланс лицевого счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод для получения реквизитов лицевого счета
     *
     * @return возвращает реквизиты лицевого счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод для присвоения реквизитов лицевого счета
     *
     * @param requisite устанавливаемые реквизиты
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод для получения баланса лицевого счета
     *
     * @return возвращает баланс лицевого счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод для присвоения баланса лицевого счета
     *
     * @param balance сумма изменения баланса
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
