import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        input.close();

        switch (operator) {
            case '+':
                // addition
                result = number1 + number2;
                break;
            case '-':
                // subtraction
                result = number1 - number2;
                break;
            case '/':
                // division
                result = number1 / number2;
                break;
            case '*':
                // multiplication
                result = number1 * number2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    }
}