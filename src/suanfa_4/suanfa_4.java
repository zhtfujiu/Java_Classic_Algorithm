package suanfa_4;

/**
 * Created by 昊天 on 2016/6/13.
 * 【程序4】  题目：将一个大于2的正整数分解质因数。
 */
public class suanfa_4 {
    public static void main(String[] args) {
        devideNumber(100);
    }

    //成员函数执行拆分操作
    private static void devideNumber(int num) {
        int i = 2;
        System.out.print(num+" = ");
        /**
         * num != i是在判断是否是2  3  5等质数
         * i <= num防止溢出
         */
        while (num != i && i <= num) {
            /**
             * 先判断这个i是不是num的因数
             */
            if (num % i == 0) {
                //是他的因数，然后除掉
                num /= i;
                //把刚刚的因数打印出来
                System.out.print(i+" × ");
            }
            /**
             * 有可能num除i之后，i还是num的因数，所以检测一下
             * 若i不再是num的因数，则i自增
             *
             * 不用考虑会不会打印出一个合数因子
             * 因为每一个合数都是小素数相乘得来的
             */
            if (num % i != 0) {
                i++;
            }
        }
        //上述循环退出的条件是i=num，所以最后还有一个因数就是num自身
        System.out.println(num);
    }
}
