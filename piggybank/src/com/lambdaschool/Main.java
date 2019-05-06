package com.lambdaschool;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args)
    {
        double myValue = 0;
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        ArrayList<Coin> piggyBank = new ArrayList<>();

        piggyBank.add(new Quarter());

        piggyBank.add(new Dime());

        piggyBank.add(new Dollar(5));

        piggyBank.add(new Nickel(3));

        piggyBank.add(new Dime(7));

        piggyBank.add(new Dollar());

        piggyBank.add(new Penny(10));

        for (Coin c : piggyBank)
        {
            System.out.println(c);
            myValue += c.getValue();
        }

        System.out.println("\nThe piggy bank holds " + fp.format(myValue));
    }
}
