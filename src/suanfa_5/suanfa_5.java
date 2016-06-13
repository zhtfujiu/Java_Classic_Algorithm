package suanfa_5;

import java.util.Scanner;
/**
 * Created by 昊天 on 2016/6/13.
 * 【程序5】  题目：利用条件运算符的嵌套来完成此题：
 * 学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 */
public class suanfa_5 {
    public static void main(String[] args) {
        System.out.println("Please input a score:");
        int score ;
        Scanner scanner=new Scanner(System.in);
        score=scanner.nextInt();
        char remark = score >= 90 ? 'A' : (score >= 60 ? 'B' : 'C');
        System.out.print(remark);
    }
}
