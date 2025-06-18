/* https://codingbat.com/prob/p183562
We want to make a row of bricks that is goal inches long. 
We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
Return true if it is possible to make the goal by choosing from the given bricks. 
This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks

makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true

*/

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
