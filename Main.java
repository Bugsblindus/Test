package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random ran = new Random();
        int number = ran.nextInt(50)+500;
        System.out.println("Let's play a game");


        Scanner scaner = new Scanner(System.in);
        int res = scaner.nextInt();

        if (res > number) {
            System.out.println("Less, try again");
            res = scaner.nextInt();
        } else if (res < number) {
            System.out.println("More, try again");
            res = scaner.nextInt();
        } else if (res == number) {
            System.out.println("GG, You Won");

        }
    }
}
