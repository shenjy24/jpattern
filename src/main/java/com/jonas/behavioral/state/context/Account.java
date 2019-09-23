package com.jonas.behavioral.state.context;

import com.jonas.behavioral.state.state.AbstractState;
import com.jonas.behavioral.state.state.NormalState;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 环境类（上下文）
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-23
 */
public class Account {
    @Setter
    private AbstractState state; //维持一个对抽象状态对象的引用
    private String owner;        //开户名
    @Getter
    @Setter
    private double balance = 0;  //账户余额

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.state = new NormalState(this);
        System.out.println(this.owner + "开户，初始金额为" + balance);
        System.out.println("---------------------------------------------");
    }

    public void deposit(double amount) {
        System.out.println(this.owner + "存款" + amount);
        state.deposit(amount); //调用状态对象的deposit()方法
        System.out.println("现在余额为" + this.balance);
        System.out.println("现在帐户状态为" + this.state.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "取款" + amount);
        state.withdraw(amount); //调用状态对象的withdraw()方法
        System.out.println("现在余额为" + this.balance);
        System.out.println("现在帐户状态为" + this.state.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    public void computeInterest() {
        state.computeInterest(); //调用状态对象的computeInterest()方法
    }

}
