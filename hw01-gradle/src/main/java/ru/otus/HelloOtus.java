package ru.otus;

import com.google.common.base.Joiner;

public class HelloOtus {
    public static void main(String[] args) {
        String[] strs = {"1", "2", "3", null, "4"};

        System.out.println(Joiner.on(" ")
                .skipNulls()
                .join(strs));
    }
}