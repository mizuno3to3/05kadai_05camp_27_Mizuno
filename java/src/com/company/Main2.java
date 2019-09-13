package com.company;

public class Main2 {
    public static void main(String[] args) {
        String[] greetings;
        greetings= new String[4];
        greetings[0]="Hello";
        greetings[1]="こんにちは";
        greetings[2]="ニーハオ";
        greetings[3]="ボンジュール";

        System.out.println(greetings[0]);
        System.out.println(greetings[1]);
        System.out.println(greetings[2]);
        System.out.println(greetings[3]);
        System.out.println(greetings.length);

        String[] greetings2={"Hello","こんにちは","ニーハオ","チャオ"};
        System.out.println(greetings2.length);



        int[] num2={1,2,3,4,5};
        System.out.println(num2[0]);
        System.out.println(num2[1]);
        System.out.println(num2[2]);
        System.out.println(num2[3]);
        System.out.println(num2[4]);

        for(int i = 0; i < greetings2.length; i++) {
            System.out.println(greetings2[i]);
        }





    }
}
