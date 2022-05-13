package com.company;

public class Main {

    public static void main(String[] args) {
        DirectAdressArray<String> daa = new DirectAdressArray<>(16);

        daa.add(5, "nic");
        System.out.println(daa.get(5));
        daa.add(20, "cos");
        System.out.println(daa);
    }
}
