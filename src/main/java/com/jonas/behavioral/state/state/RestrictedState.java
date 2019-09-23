package com.jonas.behavioral.state.state;

import com.jonas.behavioral.state.context.Account;

/**
 * <p>
 * 受限状态：具体状态类
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-23
 */
public class RestrictedState extends AbstractState {
    public RestrictedState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("当前账户为受限状态，无法取款");
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息");
    }
}
