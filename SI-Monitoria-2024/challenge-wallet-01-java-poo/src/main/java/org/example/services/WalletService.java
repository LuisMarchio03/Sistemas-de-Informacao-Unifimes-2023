package org.example.services;

import org.example.entities.User;

public class WalletService {

    /**
     * Adiciona um valor ao saldo da carteira de um usuário.
     *
     * @param user   Usuário cujo saldo da carteira será atualizado
     * @param amount Valor a ser adicionado ao saldo
     */
    public void addBalance(User user, double amount) {
        double currentBalance = user.getBalance();
        user.setBalance(currentBalance + amount);
    }

    /**
     * Remove um valor do saldo da carteira de um usuário.
     *
     * @param user   Usuário cujo saldo da carteira será atualizado
     * @param amount Valor a ser removido do saldo
     * @return true se a remoção for bem-sucedida, false caso contrário (saldo insuficiente)
     */
    public boolean removeBalance(User user, double amount) {
        double currentBalance = user.getBalance();
        if (currentBalance >= amount) {
            user.setBalance(currentBalance - amount);
            return true; // Remoção bem-sucedida
        } else {
            return false; // Saldo insuficiente para realizar a remoção
        }
    }

    /**
     * Consulta o saldo atual da carteira de um usuário.
     *
     * @param user Usuário cujo saldo da carteira será consultado
     * @return O saldo atual da carteira do usuário
     */
    public double getBalance(User user) {
        return user.getBalance();
    }
}
