import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continued = "yes";
        while (continued.equals("yes")) {
            Calculator calc = new Calculator();                        
            System.out.print("Введите первое число: ");
            calc.setA(scanner.nextInt());
            scanner.nextLine(); 
            System.out.print("Введите знак математической операции: ");
            calc.setSign(scanner.next().charAt(0)); 
            System.out.print("Введите второе число: ");
            calc.setB(scanner.nextInt());
            scanner.nextLine();
            System.out.println(calc.getA() + " " + calc.getSign() + " " + calc.getB() + " = " + calc.calculate());            
            continued = "";
            while (!continued.equals("no") && !continued.equals("yes")) {   
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                continued = scanner.nextLine(); 
            }
        }       
    }
}