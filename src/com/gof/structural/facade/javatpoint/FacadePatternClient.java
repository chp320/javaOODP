package com.gof.structural.facade.javatpoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Step6.
 * Create a client that can purchase the mobiles from MobileShop through ShopKeeper.
 */
public class FacadePatternClient {
    private static int choice ;
    public static void main(String[] args) throws NumberFormatException, IOException {
        do {
            //
            System.out.println("======= Mobile Shop =======");
            System.out.println("    1. iPhone");
            System.out.println("    2. Samsung");
            System.out.println("    3. BlackBerry");
            System.out.println("    4. Exit");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());

            ShopKeeper sk = new ShopKeeper();

            switch (choice) {
                case 1:
                    sk.iphoneSale();
                    break;
                case 2:
                    sk.samsungSale();
                    break;
                case 3:
                    sk.blackBerrySale();
                    break;
                default:
                    System.out.println("Nothing You Purchased!");
                    return;
            }

        } while (choice != 4);
    }
}
