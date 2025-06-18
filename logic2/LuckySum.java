//https://codingbat.com/prob/p130788


public class LuckySum {
    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a == 13){
            return sum;
        } else if (b == 13) {
            sum = a;
        } else if (c == 13) {
            sum = a + b;
        }else{
        sum = a + b + c;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = luckySum(13,1,2);
        System.out.println(a);
    }
}
