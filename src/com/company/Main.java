package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in1.nextInt();
        if(Integer.toString(a).length() != 6)
        {
            System.out.print("Введите 6-значное число!!!");
        }
        else {
            System.out.print(a / 100000 + " + ");
            System.out.print(a / 10000 % 10 + " + ");
            System.out.print(a / 1000 % 10);
            if ((a / 100000) + (a / 10000 % 10) + (a / 1000 % 10) == (a % 1000 / 100) + (a % 100 / 10) + (a % 10)) {
                System.out.print(" = " + a % 1000 / 100 + " + ");
                System.out.print(a % 100 / 10 + " + ");
                System.out.print(a % 10);
                System.out.print("\nЧисло - счастливое: " + (a / 100000) + (a / 10000 % 10) + (a / 1000 % 10) + " и " + (a % 1000 / 100) + (a % 100 / 10) + (a % 10) + "!");
            } else {
                System.out.print(" != " + a % 1000 / 100 + " + ");
                System.out.print(a % 100 / 10 + " + ");
                System.out.print(a % 10);
                System.out.print("\nЧисло - не счастливое: " + (a / 100000) + (a / 10000 % 10) + (a / 1000 % 10) + " и " + (a % 1000 / 100) + (a % 100 / 10) + (a % 10) + "!");
            }
        }
    }
}