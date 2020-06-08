package com.cui.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo03 {
    public static void main(String[] args) {
        String regex = "ab{2}";
        String phone ="abab";
        boolean b = phone.matches(regex);
        System.out.println(b);
    }
}
