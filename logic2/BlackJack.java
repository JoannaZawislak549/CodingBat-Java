/*https://codingbat.com/prob/p117019
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
*/

import static java.lang.Math.abs;

public class BlackJack {

    public static int blackJack(int a, int b) {
        if((21-a) < 0 && (21-b) < 0){
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        }

        if(abs((21-a)) > abs((21-b))){
            return b;
        } else {
            return a;
        }


    }

    public static void main(String[] args) {
        System.out.println(blackJack(23,22));

    }
}
