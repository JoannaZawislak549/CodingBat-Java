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
