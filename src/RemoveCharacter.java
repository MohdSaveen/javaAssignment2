import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        System.out.println("Enter a character");
        char ch=scanner.next().charAt(0);
         String str=removeCharacter(string,ch);
        System.out.println(str);
    }public static String removeCharacter(String string,char ch){
        String sc="";
        char[] ch1=string.toCharArray();
        for(int i=0;i<string.length();i++) {
            if(ch1[i]!=ch){
                sc+=ch1[i];
            }
        }return sc;
    }
}
