public class Calculator {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        int a = 2;
        int b = 3;
        char sign = '%';
        int result = 1;
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;        
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;        
        } else if (sign == '%') {
            result = a % b;
        } else if (sign == '^') {
            for (int j = 1; j <= b; j++) {
             result = result * a;        
            }            
        }       
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}