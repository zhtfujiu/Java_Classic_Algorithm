package suanfa_6;

import java.util.Scanner;

/**
 * Created by 昊天 on 2016/6/13.
 * 【程序6】  题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 */
public class suanfa_6 {
    public static void main(String[] args) {
        System.out.println("Please input two numbers:");
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("最大公约数:" + getYueshu(a, b));
        System.out.println("最小公倍数:" + getBeishu(a, b));
    }

    //最大公约数
    private static int getYueshu(int a, int b) {
        //采用辗转相除法
        //a=b*n+r
        //直到a=b*n
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    //最小公倍数
    private static int getBeishu(int a, int b) {
        return a * b / getYueshu(a, b);
    }
}
