package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        User user = new User();
        user.SetLogin("user1");
        System.out.println(user.Login);

    }
}
