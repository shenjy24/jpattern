package com.jonas.behavioral.state.state;

import com.jonas.behavioral.state.context.Account;

/**
 * <p>
 * 抽象状态类
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-23
 */
public abstract class AbstractState {
    protected Account account;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void computeInterest();

    //状态转换
    public void stateCheck() {
        if (account.getBalance() > 0) {
            account.setState(new NormalState(account));
        } else if (account.getBalance() > -2000 && account.getBalance() <= 0) {
            account.setState(new OverdraftState(account));
        } else if (account.getBalance() == -2000) {
            account.setState(new RestrictedState(account));
        } else if (account.getBalance() < -2000) {
            System.out.println("操作受限！");
        }
    }

}
