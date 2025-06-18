public class MakeBricks {

    public static void makeBricks(int small, int big, int sum){
        boolean result = true;
        if((small*1 + big*5) < sum){
            result = false;
        }
        double howManyBig = (double) sum / 5.0;
        double howManySmall = sum - ((int) howManyBig * 5);
        if (howManySmall > small){
            result = false;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        makeBricks(3,1,8);
        makeBricks(3,1,9);
    }
}
