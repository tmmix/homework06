package com.ert.java.training.homework06;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<String>> phoneBook = new HashMap<>();
    public void add(String surname, String phoneNumber) {
        if (phoneBook.containsKey(surname)) {
            phoneBook.get(surname).add(phoneNumber);
        } else {
            HashSet<String> phoneSet = new HashSet<>();
            phoneSet.add(phoneNumber);
            phoneBook.put(surname, phoneSet);
        }
    }

    public void get(String surname) {
        if (phoneBook.containsKey(surname)) {
            System.out.println(phoneBook.get(surname));
        } else {
            System.out.println("Нет записей");
        }
    }
}
