public class Calculator {

    private int a;
    private int b;
    private char sign;
    private int result = 1;

    public int getA() {
        return a;
    }
 
    public void setA(int a) {
        this.a = a;
    }
    
    public int getB() {
        return b;
    }
 
    public void setB(int b) {
        this.b = b;
    }
    
    public char getSign() {
        return sign;
    }
 
    public void setSign(char sign) {
        this.sign = sign;
    }

    public int getResult() {
        switch(sign) {
        case '+' :
            result = a + b;
            break;
        case '-' :
            result = a - b;
            break;
        case '*' :
            result = a * b;
            break;
        case '/' :
            result = a / b;
            break;
        case '%' :
            result = a % b;
            break;
        case '^' :
            for (int i = 1; i <= b; i++) {
                result *= a;        
            }
            break;
        default:
            System.out.println("Знак математической операции задан неверно.");
        }
        return result;
    }
}
