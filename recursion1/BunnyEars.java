/* https://codingbat.com/prob/p183649

We have a number of bunnies and each bunny has two big floppy ears. 
We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
*/

public class BunnyEars {
    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0){
            return 0;
        }
        if (bunnies%2 == 0){
            return  3 + bunnyEars2(bunnies-1);
        }

        return 2 + bunnyEars2(bunnies-1);

    }

    public static void main(String[] args) {
        System.out.println(bunnyEars2(5));
        System.out.println(bunnyEars2(2));
        System.out.println(bunnyEars2(4));
        System.out.println(bunnyEars2(3));
        System.out.println(bunnyEars2(0));
        System.out.println(bunnyEars2(1));
    }

}
