package org.ejb.ejb;

import jakarta.ejb.EJB;
import jakarta.ejb.Stateful;

@Stateful
public class BalanceEJB {

    @EJB
    private ToolBoxEJB toolBoxEJB;

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance = toolBoxEJB.add(balance, amount);
    }

    public void withdraw(int amount) {
        balance = toolBoxEJB.remove(balance, amount);
    }
}
