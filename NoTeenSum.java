public class NoTeenSum {
    public static int noTeenSum(int a, int b, int c) {
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);

        return a + b + c;
    };
    public static int fixTeen(int n) {
        if(n > 10 && n < 15 || n > 16 && n <20){
            return 0;
        }
        else{
            return n;
        }
    };

    public static void main(String[] args) {
        int sum = NoTeenSum.noTeenSum(1,11,17);
        System.out.println(sum);


    }
}

