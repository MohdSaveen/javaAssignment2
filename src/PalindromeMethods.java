import java.util.Scanner;

public class PalindromeMethods {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        boolean sc=pallindrome(str);
        System.out.println(sc);
    }
    public static boolean pallindrome(String string){
        int i=0;
        int j=string.length()-1;
        while(i<j){
            if(string.charAt(i)!=string.charAt(j)){
                return false;
            }i++;j--;
        }return true;
    }
}
