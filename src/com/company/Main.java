package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
System.out.print("What is your name?");
    Scanner keyboard= new Scanner(System.in);
    String name =keyboard.nextLine();
    System.out.println("Hello" + name);
    }
}
