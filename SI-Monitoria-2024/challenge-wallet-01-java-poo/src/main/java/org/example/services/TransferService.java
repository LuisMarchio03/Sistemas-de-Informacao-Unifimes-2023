package org.example.services;

import org.example.entities.User;

public class TransferService {

    /**
     * Realiza uma transferência de dinheiro entre dois usuários.
     *
     * @param sender   Usuário que envia o dinheiro
     * @param receiver Usuário que recebe o dinheiro
     * @param amount   Valor a ser transferido
     * @return true se a transferência foi bem-sucedida, false caso contrário
     */
    public boolean transferMoney(User sender, User receiver, double amount) {
        // Verifica se o remetente tem saldo suficiente
        if (sender.getBalance() >= amount) {
            // Realiza a transferência deduzindo o valor da carteira do remetente
            sender.setBalance(sender.getBalance() - amount);
            // Adiciona o valor à carteira do destinatário
            receiver.setBalance(receiver.getBalance() + amount);
            return true; // Transferência bem-sucedida
        } else {
            return false; // Transferência não é possível por saldo insuficiente
        }
    }

    /**
     * Reverte uma transação de transferência de dinheiro.
     *
     * @param sender   Usuário remetente
     * @param receiver Usuário destinatário
     * @param amount   Valor da transação a ser revertida
     */
    public void rollbackTransaction(User sender, User receiver, double amount) {
        // Adiciona o valor de volta à carteira do remetente
        sender.setBalance(sender.getBalance() + amount);
        // Deduz o valor da carteira do destinatário
        receiver.setBalance(receiver.getBalance() - amount);
    }
}
