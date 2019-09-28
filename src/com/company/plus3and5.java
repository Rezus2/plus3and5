package com.company;

import java.util.Scanner;

public class plus3and5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x>0 && (x/100)>0 && x%5==0 && 10>(x/100))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
