package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        String str = in.nextLine();
        boolean answer = str.matches("(((1[0-9][0-9])|(2[0-5][0-5]))\\.){3}((1[0-9][0-9])|(2[0-5][0-5]))");
        if(answer){
            System.out.println("OK");
        }
        else {
            System.out.println("Error");
        }
    }
}