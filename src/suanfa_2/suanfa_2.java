package suanfa_2;

/**
 * Created by 昊天 on 2016/6/13.
 * <p>
 * 【程序2】 题目：判断101-200之间有多少个素数，并输出所有素数。
 */
public class suanfa_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 101; i < 200; i++) {
            if (isRight(i)) {
                sum++;
                System.out.println(i);
            }
        }
        System.out.println("共有素数" + sum + "个");
    }

    //成员函数检测是否是素数
    private static boolean isRight(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
