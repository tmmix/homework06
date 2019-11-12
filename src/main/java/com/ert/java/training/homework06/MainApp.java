package com.ert.java.training.homework06;
import java.util.*;
public class MainApp {
    public static void main(String[] args) {
        List<String> wordSet = new ArrayList<>();
        Set<String> uniqueWords = new TreeSet<>();
        wordSet.add("Яблоко");
        wordSet.add("Мандарин");
        wordSet.add("Банан");
        wordSet.add("Слива");
        wordSet.add("Огурец");
        wordSet.add("Яблоко");
        wordSet.add("Яблоко");
        wordSet.add("Огурец");
        wordSet.add("Банан");
        wordSet.add("Лимон");
        wordSet.add("Мандарин");
        wordSet.add("Апельсин");
        wordSet.add("Яблоко");
        wordSet.add("Банан");
        wordSet.add("Арбуз");
        wordSet.add("Слива");
        wordSet.add("Огурец");
        wordSet.add("Помидор");
        wordSet.add("Помидор");
        wordSet.add("Мандарин");
        wordSet.add("Банан");
        wordSet.add("Огурец");
        wordSet.add("Слива");
        System.out.println(wordSet);
        uniqueWords.addAll(wordSet);
        Iterator<String> iter = uniqueWords.iterator();
        String word;
        while (iter.hasNext()) {
            word = iter.next();
            System.out.println(word + ": " + Collections.frequency(wordSet, word));
        }

        PhoneBook pb = new PhoneBook();
        pb.get("");
        pb.add("Hower", "555666");
        pb.add("Hower", "5556667");
        pb.add("Hower", "987864565");
        pb.add("Aterq", "5556998998");
        pb.get("Hower");
        pb.get("Aterq");
    }
}
