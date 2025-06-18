public class MakeChocolate {

    public static int makeChocolate(int small, int big, int goal) {
        int rest;
        if (big > 0) {
            int bigNeeded = goal/5;
            if (big >= bigNeeded){
                rest = goal - bigNeeded*5;
            } else {
                rest = goal - (big*5);
            }
        } else {
            rest = goal;
        }

        if (small >= rest){
            return rest;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 5, 9));
        System.out.println(makeChocolate(4, 0, 9));
        System.out.println(makeChocolate(9, 0, 9));
        System.out.println(makeChocolate(6, 1, 13));

    }

}
