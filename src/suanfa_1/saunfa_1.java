package suanfa_1;

/**
 * Created by 昊天 on 2016/6/13.
 *
 * 【程序1】  题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class saunfa_1 {
    public static void main(String args[]){
        int i;
        for(i=1;i<=10;i++)
            System.out.println(f(i));
    }
    private static int f(int x) {
        if(x==1 || x==2)
            return 1;
        else
            return f(x-1)+f(x-2);
    }
}
