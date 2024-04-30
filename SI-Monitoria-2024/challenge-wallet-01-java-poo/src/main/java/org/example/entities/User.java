package org.example.entities;

/**
 * Representa um usuário no sistema.
 */
public class User {
    private int id;
    private String fullName; // Nome completo do usuário
    private String cpf; // CPF do usuário (formato: XXX.XXX.XXX-XX)
    private String email; // Endereço de e-mail do usuário
    private String password; // Senha do usuário
    private double balance; // Saldo disponível na carteira do usuário

    /**
     * Construtor para inicializar um novo usuário com os atributos especificados.
     *
     * @param fullName Nome completo do usuário
     * @param cpf CPF do usuário
     * @param email Endereço de e-mail do usuário
     * @param password Senha do usuário
     * @param balance Saldo inicial da carteira do usuário
     */
    public User(int id, String fullName, String cpf, String email, String password, double balance) {
        this.id = id;
        this.fullName = fullName;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    /**
     * Obtém o id do usuário.
     *
     * @return O id do usuário
     */
    public int getId() {
        return id;
    }

    /**
     * Define o id do usuário.
     *
     * @param id O novo id do usuário
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome completo do usuário.
     *
     * @return O nome completo do usuário
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Define o nome completo do usuário.
     *
     * @param fullName O novo nome completo do usuário
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Obtém o CPF do usuário.
     *
     * @return O CPF do usuário
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do usuário.
     *
     * @param cpf O novo CPF do usuário
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o endereço de e-mail do usuário.
     *
     * @return O endereço de e-mail do usuário
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o endereço de e-mail do usuário.
     *
     * @param email O novo endereço de e-mail do usuário
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém a senha do usuário.
     *
     * @return A senha do usuário
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define a senha do usuário.
     *
     * @param password A nova senha do usuário
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Obtém o saldo disponível na carteira do usuário.
     *
     * @return O saldo disponível na carteira do usuário
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Define o saldo disponível na carteira do usuário.
     *
     * @param balance O novo saldo disponível na carteira do usuário
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Retorna uma representação em formato de String do usuário.
     *
     * @return Uma String representando o usuário
     */
    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                '}';
    }
}
