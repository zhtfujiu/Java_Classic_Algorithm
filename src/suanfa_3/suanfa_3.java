package suanfa_3;

/**
 * Created by 昊天 on 2016/6/13.
 * 【程序3】  题目：打印出所有的 “水仙花数 “，
 * 所谓 “水仙花数 “是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 “水仙花数 “，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class suanfa_3 {
    public static void main(String [] args){
        for (int i=100;i<=999;i++){
            if (isRight(i)){
                System.out.println(i);
            }
        }
    }
    //成员方法判断是否是水仙花数
    private static boolean isRight(int num){
        //获取该数字每一位
        int[] intArray=getEveryItem(num);
        return  (intArray[0]*intArray[0]*intArray[0]+
                intArray[1]*intArray[1]*intArray[1]+
                intArray[2]*intArray[2]*intArray[2]==num);
    }
    //成员方法对数字进行拆分
    private static int[]  getEveryItem(int num){
        int[] intArray=new int[3];
        char[] charArray=(num+"").toCharArray();
        for (int i=0;i<3;i++){
            intArray[i]=charArray[i]-48;
        }
        return intArray;
    }
}
