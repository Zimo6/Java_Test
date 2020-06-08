package com.domain;
// 判断一个字符串是否由其子串组成
public class A {
    public static void main(String[] args) {
        final boolean r = A.repeatedSubstringPattern("cuicuicuicui");
        System.out.println(r);
    }
    public static boolean repeatedSubstringPattern(String s) {
        return (s+s).substring(1,s.length()*2-1).indexOf(s)!=-1;
    }
}
