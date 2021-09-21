package ru.job4j.bank;

import java.util.Objects;

/**
 * Содержит пользовательские данные, а так же способы взаимодействия с ними
 *
 * @author Stikkerrr
 * @version 1.0
 */
public class User {
    /**
     * Паспортные данные пользователя
     */
    private String passport;
    /**
     * Имя пользователя
     */
    private String username;

    /**
     * Создает объект класса User
     *
     * @param passport паспортные данные пользователя
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Предоставляет паспортные данные пользователя
     *
     * @return возвращает строку, содержащую паспортные данные пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Назначает паспортные данные пользователя
     *
     * @param passport паспортные данные
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Предоставляет имя пользователя
     *
     * @return возвращает имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Назначает имя пользователя
     *
     * @param username имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
