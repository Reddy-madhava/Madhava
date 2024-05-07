package Testing;

public class ConvertCharacter {
    public static void main(String[] args) {
//        System.out.println(toUppercase(""));
        System.out.println(tc1singleCharacter());
        System.out.println(tc2checkNull());
        System.out.println(tc3multipleCharacters());
        System.out.println(tc4checkSpaces());
        System.out.println(tc5checkNums());
        System.out.println(tc6charandnum());
        System.out.println(tc7allUppercases());
        System.out.println(tc8checkEmpty());
        System.out.println(tc9allLowercases());
        System.out.println(tc10specialCharacters());
    }

    public static String toUppercase(String str) {
        if (str != null) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    result += (char) (str.charAt(i) - 32);
                } else {
                    result += str.charAt(i);
                }
            }
            return result;
        }else {
            return "null";
        }
    }

    public static boolean tc1singleCharacter(){
        String input = "a";
        String expected = "A";
        String res=toUppercase(input);
        if(res.equals(expected)){
            return  true;
        }else {
            return  false;
        }
    }

    public static boolean tc2checkNull(){
        String input = null;
        String expected = "null";
        String res=toUppercase(input);
        if(res.equals(expected)){
            return  true;
        }else {
            return  false;
        }
    }
    public static boolean tc3multipleCharacters(){
        String input = "maddyAB";
        String expected = "MADDYAB";
        String res=toUppercase(input);
        if(res.equals(expected)){
            return  true;
        }else {
            return  false;
        }
    }

    public static boolean tc4checkSpaces(){
        String input = "   ";
        String expected = "   ";
        String res=toUppercase(input);
        if(res.equals(expected)){
            return  true;
        }else {
            return  false;
        }
    }

    public static boolean tc5checkNums(){
        String input = "1234";
        String expected = "1234";
        String res=toUppercase(input);
        if(res.equals(expected)){
            return  true;
        }else {
            return  false;
        }
    }

    public static boolean tc6charandnum(){
        String input = "abc12";
        String expected = "ABC12";
        String res=toUppercase(input);
        if(res.equals(expected)){
            return  true;
        }else {
            return  false;
        }
    }
    public static boolean tc7allUppercases(){
        String input = "ABC";
        String expected = "ABC";
        String res=toUppercase(input);
        if(res.equals(expected)){
            return  true;
        }else {
            return  false;
        }
    }

    public static boolean tc8checkEmpty(){
        String input = "";
        String expected = "";
        String res=toUppercase(input);
        if(res.equals(expected)){
            return  true;
        }else {
            return  false;
        }
    }

    public static boolean tc9allLowercases(){
        String input = "maddy";
        String expected = "MADDY";
        String res=toUppercase(input);
        if(res.equals(expected)){
            return  true;
        }else {
            return  false;
        }
    }

    public static boolean tc10specialCharacters(){
        String input = "@!#";
        String expected = "@!#";
        String res=toUppercase(input);
        if(res.equals(expected)){
            return  true;
        }else {
            return  false;
        }
    }




}
