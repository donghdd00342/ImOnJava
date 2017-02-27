///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package itest;
//
//import java.util.Random;
//
///**
// *
// * @author DongHo
// */
//public class RandomString {
//
//    private static final char[] symbols;
//
//    static {
//        StringBuilder tmp = new StringBuilder();
//        for (char ch = '0'; ch <= '9'; ++ch) {
//            tmp.append(ch);
//        }
//        for (char ch = 'a'; ch <= 'z'; ++ch) {
//            tmp.append(ch);
//        }
//        symbols = tmp.toString().toCharArray();
//    }
//
//    private final Random random = new Random();
//
//    private final char[] buf;
//
//    public RandomString(int length) {
//        if (length < 1) {
//            throw new IllegalArgumentException("length < 1: " + length);
//        }
//        buf = new char[length];
//    }
//
//    public String nextString() {
//        for (int idx = 0; idx < buf.length; ++idx) {
//            buf[idx] = symbols[random.nextInt(symbols.length)];
//        }
//        return new String(buf);
//    }
//}
//// test
//
//class main {
//
//    public static void main(String[] args) {
//        RandomString randStr = new RandomString(10);
//        String barCode = randStr.nextString().toUpperCase();
//        System.out.println(barCode);
//    }
//}