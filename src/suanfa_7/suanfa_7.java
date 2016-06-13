package suanfa_7;

import java.util.Scanner;

/**
 * Created by 昊天 on 2016/6/13.
 * 【程序7】  题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */
public class suanfa_7 {
    public static void main(String[] args) {
        String str = null;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        int numOfLetter = 0, numOfNull = 0, numOfNum = 0, numOfOther = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 48 && chars[i] <= 57) {
                numOfNum++;
            }
            if ((chars[i] >= 65 && chars[i] <= 90) || (chars[i] >= 97 && chars[i] <= 122)) {
                numOfLetter++;
            }
            if (chars[i] == ' ') {
                numOfNull++;
            }
        }
        numOfOther = chars.length - numOfLetter - numOfNum - numOfNull;
        System.out.println("字母 " + numOfLetter + "\n数字 " + numOfNum + "\n空格 " + numOfNull + "\n其他 " + numOfOther);
    }
}
