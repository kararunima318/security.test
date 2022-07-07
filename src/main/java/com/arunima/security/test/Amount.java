package com.arunima.security.test;

public class Amount {

    int initialAmount=10000;
    int balance= 10000;

    public int getMoney(int inputAmount)
    {
        balance = balance - inputAmount;

        if (inputAmount < balance)
        {
            return balance;

        }
        else{
            return balance = initialAmount;
        }
    }

}
