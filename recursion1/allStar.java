/* https://codingbat.com/prob/p183394

Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
*/
public class allStar {
    public static String allStar(String str) {

        if (str.length() <= 1) {
            return str;
        } else {
            String newOne = str.charAt(0)+"*";
            return newOne + allStar(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(allStar("hello"));
        System.out.println(allStar("abc"));
        System.out.println(allStar("ab"));
    }
}
