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
