public class CyclesTheme {
    public static void main(String[] args) {
        //1.Подсчет суммы четных и нечетных чисел
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int i = -10;
        int sumEven = 0;
        int sumOdd = 0; 
        do {
            i++;
            if (i % 2 == 0) {
                sumEven++;
            } else {
                sumOdd++;
            }
        } while(i < 22);
        System.out.println("Сумма четных: " + sumEven);
        System.out.println("Сумма нечетных: " + sumOdd);

        //2.Вывод чисел между max и min
        System.out.println("\n2.Вывод чисел между max и min");
        int firstNum = 10;
        int secondNum = 5;
        int thirdNum = -1;
        int max = 0;
        if (firstNum > secondNum && firstNum > thirdNum) {
            max = firstNum;
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            max = secondNum;        
        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            max = thirdNum;
        }
        int min = 0;
        if (firstNum < secondNum && firstNum < thirdNum) {
            min = firstNum;
        } else if (secondNum < firstNum && secondNum < thirdNum) {
            min = secondNum;        
        } else if (thirdNum < firstNum && thirdNum < secondNum) {
            min = thirdNum;
        }
        for (int j = min; j <= max; j++) {
             System.out.println (j);
         }

        //3.Вывод реверсивного числа и суммы его цифр
        System.out.println("\n3.Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int reverse = 0;
        int sumDigit = 0;
        while (srcNum != 0) {
            sumDigit = sumDigit + srcNum % 10;          
            reverse = (srcNum % 10) + reverse * 10;
            srcNum = srcNum / 10;            
        }
        System.out.println ("Реверс числа 1234: " + reverse);       
        System.out.println ("Сумма цифр числа 1234: " + sumDigit);

        //4.Вывод чисел на консоль в несколько строк
        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        int step = 0;
        for (int j = 1; j <= 24; j = j + 2) {
            if (step > 4) {
                System.out.println ("");
                step = 0;             
            }
            System.out.format("%2d", j);
            System.out.print (" ");
            step ++;
         }
         System.out.println (" 0  0  0");

        //5.Проверка количества единиц на четность
        System.out.println("\n5.Проверка количества единиц на четность");
        srcNum = 3141591;
        int cntOne = 0;
        while (srcNum != 0) {
            if (srcNum % 10 == 1) {
                cntOne ++;
            }    
            srcNum = srcNum / 10;
        }
        System.out.println ("Количество едениц в числе 3141591: " + cntOne);
        if (cntOne % 2 == 0) {
            System.out.println ("Количество единиц четное");
        } else {
            System.out.println ("Количество единиц нечетное");        
        }

        //6.Проверка количества единиц на четность
        System.out.println("\n6.Отображение фигур в консоли");
        for (int j = 1; j <= 5; j ++) {
            for (int k = 1; k <= 10; k ++) {
                System.out.print ("*");
            }
            System.out.println ("");            
        }
        int numLines = 5;
        int cntSymb = 0;       
        while (numLines != 0) {
            cntSymb = numLines;
            while (cntSymb != 0) {
                System.out.print ("#");
                cntSymb --;
            }
            numLines --;
            System.out.println ("");
        }
        i = 1; 
        cntSymb = 0;
        int prntSym = 0;
        do {            
            if (i < 4) {
                cntSymb ++;
            } else {
                cntSymb --;
            } 
            prntSym = cntSymb;           
            do {                
                System.out.print ("$");
                prntSym --;
            } while(prntSym > 0);    
            System.out.println ("");
            i++;
        } while(i < 6);

        //7.Отображение ASCII-символов
        System.out.println("\n7.Отображение ASCII-символов");
        System.out.println ("Символы, идущие до цифр и имеющие нечетные коды:");
        for (int j = 0; j <= 47; j ++) {
            if (j % 2 != 0) {
                System.out.println (j + " - " + (char) (j));
            }                            
         }
        System.out.println ("Маленькие английские буквы, имеющие четные коды:");
        for (int j = 97; j <= 122; j ++) {
            if (j % 2 == 0) {
                System.out.println (j + " - " + (char) (j));
            }                            
         }

        //8.Проверка, является ли число палиндромом
        System.out.println("\n8.Проверка, является ли число палиндромом");
        int palindromNum = 1234321;
        srcNum = palindromNum;
        reverse = 0;
            while (srcNum != 0) {            
            reverse = (srcNum % 10) + reverse * 10;
            srcNum = srcNum / 10;            
        }        
        if (palindromNum == reverse) {
            System.out.println ("Число " + palindromNum +  " является палиндромом");
        } else {
            System.out.println ("Число " + palindromNum +  " не является палиндромом");
        }

        //9.Определение, является ли число счастливым
        System.out.println("\n9.Определение, является ли число счастливым");
        int happyNum = 235954;
        srcNum = happyNum;
        int tempNum = 0;
        int firstThreeNum = 0;
        int secondThreeNum = 0;
        int cnt = 0;
        while (srcNum != 0) {
            cnt ++;
            tempNum = srcNum % 10;
            srcNum = srcNum / 10;
            if (cnt < 4) {
                secondThreeNum = secondThreeNum + tempNum;
            } else if (cnt >= 4) {
                firstThreeNum = firstThreeNum + tempNum;
            }
        }
        System.out.println ("abc = " + firstThreeNum);
        System.out.println ("def = " + secondThreeNum);
        if (firstThreeNum == secondThreeNum) {
            System.out.println ("Число " + happyNum +  " является счастливым");
        } else {
            System.out.println ("Число " + happyNum +  " не является счастливым");
        }

        //10.Вывод таблицы умножения Пифагора
        System.out.println("\n10.Вывод таблицы умножения Пифагора");
        System.out.println ("     |                         ");
        System.out.println ("     |   2  3  4  5  6  7  8  9");
        System.out.println ("_____|_________________________");
        tempNum = 0;
        for (int j = 2; j <= 9; j ++) {
            System.out.println ("     |                         ");
            System.out.print ("  " + j + "  |  ");
            for (int k = 2; k <= 9; k ++) {
                tempNum = j * k;
                System.out.format("%2d", tempNum);
                System.out.print (" ");
            }
            System.out.println ("");            
        }

    }
}