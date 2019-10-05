package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Tom";
        names[1] = "Dan";
        names[2] = "Sam";
        for (String name : names) {

            switch (name) {
                case "Tom":
                    System.out.println("Good morning, " + names[0]);
                    break;
                case "Dan":
                    System.out.println("Good afternoon, " + names[1]);
                    break;
                case "Sam":
                    System.out.println("Good evening, " + names[2]);
                    break;
                default:
                    System.out.println("Good night");


            }
        }
    }
}