package com.company;

import java.util.Scanner;

public class kadai01 {
    public static void main(String[] args) {
        //タイトル
        String title = "【健康度診断ツール】";
        System.out.println(title);


        String[] questions = {"たばこを吸いますか?", "甘いお菓子を食べますか?", "運動しますか？", "お酒を飲みますか？", "睡眠時間は？"};
        String[] choices = {"1.毎日吸う　2.時々吸う 3.全く吸わない", "1.毎日食べる　2.時々食べる 3.食べない", "1.全くしない 2時々する 3.毎日する", "1.毎日飲む　2.時々飲む 3.飲まない", "1.平均5時間未満　2平均5－6時間　3.平均7時間以上"};
        int[] input =new int[5];

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(choices[i]);
            Scanner scanner=new Scanner(System.in);
            input[i]= scanner.nextInt();
        }

        //診断結果タイトル
        String result1 = "あなたの健康度は・・・・・";
        System.out.println(result1);

        //診断結果表示
        String good = "健康的な生活です！今後も規則正しい生活を続けましょう！";
        String normal = "健康的な生活です！今後も規則正しい生活を続けましょう！";
        String bad = "不健康的な生活です！今すぐ生活習慣を見直して！！";

        int result2 =input[0]+input[1]+input[2]+input[3]+input[4];

        if (result2 >= 12) {
            System.out.println(good);
        } else {
            if (result2 >= 8) {
                System.out.println(normal);
            } else {
                System.out.println(bad);
            }
        }
    }
}
//        //たばこの質問
//        String smorking1="あなたはたばこを吸いますか？";
//        System.out.println(smorking1);
//        //たばこの質問選択肢
//        String[] smorking2=new String[3];
//        smorking2[0]="1.毎日吸う";
//        smorking2[1]="2．時々吸う";
//        smorking2[2]="3.全く吸わない";
//        for(int i = 0; i<smorking2.length; i++){
//            System.out.printf(smorking2[i]);
//        }
//        System.out.println("");
//
//        //たばこ入力欄
//        Scanner scanner1=new Scanner(System.in);
//        int input1= scanner1.nextInt();
//
//        //お菓子の質問
//        String sugar1="あなたは甘いお菓子を食べますか？";
//        System.out.println(sugar1);
//        //お菓子の質問選択肢
//        String[] sugar2=new String[3];
//        sugar2[0]="1.毎日食べる";
//        sugar2[1]="2．時々食べる";
//        sugar2[2]="3.食べない";
//        for(int i = 0; i<sugar2.length; i++){
//            System.out.printf(sugar2[i]);
//        }
//        System.out.println("");
//
//        //お菓子入力欄
//        Scanner scanner2=new Scanner(System.in);
//        int input2= scanner2.nextInt();
//
//        //運動の質問
//        String run1="あなたは運動しますか？";
//        System.out.println(run1);
//
//        //運動の質問選択肢
//        String[] run2=new String[3];
//        run2[0]="1.全くしない";
//        run2[1]="2．時々する";
//        run2[2]="3.毎日する";
//        for(int i = 0; i<run2.length; i++){
//            System.out.printf(run2[i]);
//        }
//        System.out.println("");
//
//        //運動入力欄
//        Scanner scanner3=new Scanner(System.in);
//        int input3= scanner3.nextInt();
//
//        //睡眠質問
//        String sleep1="あなたは十分に睡眠をとっていますか？";
//        System.out.println(sleep1);
//
//        //睡眠の質問選択肢
//        String[] sleep2=new String[3];
//        sleep2[0]="1.平均5時間未満";
//        sleep2[1]="2．平均5－6時間";
//        sleep2[2]="3.平均7時間以上";
//        for(int i = 0; i<sleep2.length; i++){
//            System.out.printf(sleep2[i]);
//        }
//        System.out.println("");
//
//      //睡眠入力欄
//        Scanner scanner4=new Scanner(System.in);
//        int input4= scanner4.nextInt();
//
//        //お酒の質問
//        String drink1="あなたはお酒を飲みますか？";
//        System.out.println(drink1);
//
//        //お酒の質問選択肢
//        String[] drink2=new String[3];
//        drink2[0]="1.毎日飲む";
//        drink2[1]="2．時々飲む";
//        drink2[2]="3.飲まない";
//        for(int i = 0; i<drink2.length; i++){
//            System.out.printf(drink2[i]);
//        }
//        System.out.println("");
//
//        //お酒入力欄
//        Scanner scanner5=new Scanner(System.in);
//        int input5= scanner5.nextInt();


