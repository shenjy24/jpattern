package com.jonas.behavioral.state.state;

import com.jonas.behavioral.state.context.Account;

/**
 * <p>
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-23
 */
public class NormalState extends AbstractState {

    public NormalState(Account account) {
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
        System.out.println("正常状态，无须支付利息！");
    }

}
