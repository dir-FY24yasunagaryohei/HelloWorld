package sample;

import javax.swing.text.GapContent;

public class Logical {

    public static void main(String[] args) {
        int score = 59; // 成績
        
        //and:scoreが40以上、かつ50以下
        System.out.println("scoreが40以上、かつ50以下：");
        System.out.println(score >= 40 && score <= 50);
        
        //or:scoreが40以上、または50以下：
        System.out.println("socreが40以上、または50以下：");
        System.out.println(score >= 40 || score <= 50);
        
        //not:scoreが60以上ではない
        System.out.println("scoreが60以上ではない：");
        System.out.println(!(score >= 60));

    }

}
