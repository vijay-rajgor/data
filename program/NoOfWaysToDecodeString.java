package vijay.program;

public class NoOfWaysToDecodeString {


    static private int helper(String code,int lengthFromLast){

        if(lengthFromLast == 0)
            return 1;

        String s = String.valueOf(code.charAt(code.length() - lengthFromLast));

        if(s.equalsIgnoreCase("0"))
            return 0;

        int result = helper(code,lengthFromLast-1);
       // int digit = Integer.parseInt(code.substring(code.length() - lengthFromLast, code.length() - lengthFromLast +1));

        if( lengthFromLast >= 2 &&  Integer.parseInt(code.substring(code.length() - lengthFromLast, code.length() - lengthFromLast +2))<=26){
            result += helper(code, lengthFromLast-2);
        }
        return result;

    }

    public static void main(String[] args) {

        String code = "1234";

        System.out.println(helper(code, code.length()));
    }

}
