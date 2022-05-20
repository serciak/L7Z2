package com.company;

public class Main {

    public static void main(String[] args) {
        DictionaryDirectAddress<String> daa = new DictionaryDirectAddress<>(16);

        daa.put(5, "nic");
        System.out.println(daa.get(5));
        daa.put(20, "cos");
        System.out.println(daa);
    }
}
