package Testing;

public class UppercaseToLowercase {
    public static char toLowercase(char str) {
        if(str >= 65 && str <= 90) {
            return (char)(str + 32);
        }
        else if(str >= 97 && str <= 122) {
            return (char)(str - 32);
        }
        else{
            return str;

        }
    }

    public static void main(String[] args) {
        System.out.println(toLowercase('a'));
    }
}
