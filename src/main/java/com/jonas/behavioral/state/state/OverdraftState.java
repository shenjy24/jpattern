package com.jonas.behavioral.state.state;

import com.jonas.behavioral.state.context.Account;

/**
 * <p>
 * 透支状态：具体状态类
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-23
 */
public class OverdraftState extends AbstractState {

    public OverdraftState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息！");
    }
}
