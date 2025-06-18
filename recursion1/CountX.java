/* https://codingbat.com/prob/p170371

Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
*/

public class CountX {
    public static int countX(String str) {

        if (str.isEmpty()){
            return 0;
        } else {
            int count = (str.charAt(0) == 'x' ? 1:0);
            return count + countX(str.substring(1));
        }

    }

    public static void main(String[] args) {
        System.out.println(countX("xxhixx"));
        System.out.println(countX("xhixhix"));
        System.out.println(countX("hi"));

    }

}
