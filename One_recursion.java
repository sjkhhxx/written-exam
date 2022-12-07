public class One_recursion {
    public static void main(String[] args) {
        String testStr = "hello";
        String revers = revers(testStr);
        System.out.println(revers);
    }
    public static String revers(String str){
        if(str.length()<=1){
            return str;
        }
        String subStr = str.substring(1);
        char firstStr = str.charAt(0);
        return revers(subStr)+firstStr;
    }
}
