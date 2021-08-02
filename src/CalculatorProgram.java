import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number1 value");
        int num=scanner.nextInt();
        System.out.println("Enter the operator sign");
        String sign=scanner.next();
        System.out.println("Enter the number2 value");
        int num2=scanner.nextInt();
        int result=calculator(num,num2,sign);
        System.out.println(result);

    }public static int calculator(int number1,int number2,String sign){
        return switch (sign) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*", "x" -> number1 * number2;
            case "/" -> number1 / number2;
            case "%" -> number1 % number2;
            default -> 0;
        };
    }
}
