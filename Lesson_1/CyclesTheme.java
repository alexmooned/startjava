public class CyclesTheme {
    public static void main(String[] args) {
        //1.Подсчет суммы четных и нечетных чисел
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int cnt = -10;
        int sumEven = 0;
        int sumOdd = 0; 
        do {
            cnt++;
            if (cnt % 2 == 0) {
                sumEven++;
            } else {
                sumOdd++;
            }
        } while(cnt < 22);
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
        for (int i = max - 1; i > min; i--) {
             System.out.println(i);
         }

        //3.Вывод реверсивного числа и суммы его цифр
        System.out.println("\n3.Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int reverseNum = 0;
        int sumDigits = 0;
        while (srcNum != 0) {
            sumDigits += srcNum % 10;          
            reverseNum = (srcNum % 10) + reverseNum * 10;
            srcNum /= 10;            
        }
        System.out.println("Реверс числа 1234: " + reverseNum);       
        System.out.println("Сумма цифр числа 1234: " + sumDigits);

        //4.Вывод чисел на консоль в несколько строк
        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        int count = 0;
        for (int i = 1; i <= 24; i += 2) {
            if (count > 4) {
                System.out.println();
                count = 0;             
            }
            System.out.format("%3d", i);           
            count++;
         }         
         if (count < 5) {            
            for (int i = 1; i <= 5 - count; i++) {               
                System.out.format("%3d", 0);
            }
        }        

        //5.Проверка количества единиц на четность
        System.out.println("\n\n5.Проверка количества единиц на четность");
        srcNum = 3141591;
        int countUnits = 0;
        while (srcNum != 0) {
            if (srcNum % 10 == 1) {
                countUnits++;
            }    
            srcNum /= 10;
        }
        System.out.println("Количество единиц в числе 3141591: " + countUnits);
        if (countUnits % 2 == 0) {
            System.out.println("Количество единиц четное");
        } else {
            System.out.println("Количество единиц нечетное");        
        }

        //6.Отображение фигур в консоли
        System.out.println("\n6.Отображение фигур в консоли");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();            
        }
        System.out.println();
        int numLines = 5;
        int cntSymb = 0;       
        while (numLines != 0) {
            cntSymb = numLines;
            while (cntSymb != 0) {
                System.out.print("#");
                cntSymb--;
            }
            numLines--;
            System.out.println();
        }
        System.out.println();
        cnt = 1; 
        cntSymb = 0;
        int prntSym = 0;
        do {            
            if (cnt < 4) {
                cntSymb++;
            } else {
                cntSymb--;
            } 
            prntSym = cntSymb;           
            do {                
                System.out.print("$");
                prntSym--;
            } while(prntSym > 0);    
            System.out.println();
            cnt++;
        } while(cnt < 6);

        //7.Отображение ASCII-символов
        System.out.println("\n7.Отображение ASCII-символов");
        System.out.println("Символы, идущие до цифр и имеющие нечетные коды:");
        System.out.println("Dec" + "   " + "Char");
        for (int i = 0; i <= 47; i++) {
            if (i % 2 != 0) {               
                System.out.format("%3d - %s%n", i, (char) i);                
            }                            
        }        
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {              
                System.out.format("%3d - %s%n", i, (char) i);
            }                            
        }

        //8.Проверка, является ли число палиндромом
        System.out.println("\n8.Проверка, является ли число палиндромом");
        int palindromNum = 1234321;
        srcNum = palindromNum;
        reverseNum = 0;
        while (srcNum != 0) {            
            reverseNum = (srcNum % 10) + reverseNum * 10;
            srcNum /= 10;            
        }        
        if (palindromNum == reverseNum) {
            System.out.println("Число " + palindromNum +  " является палиндромом");
        } else {
            System.out.println("Число " + palindromNum +  " не является палиндромом");
        }

        //9.Определение, является ли число счастливым
        System.out.println("\n9.Определение, является ли число счастливым");
        int happyNum = 235954;
        srcNum = happyNum;
        int tempNum = 0;
        int leftHalfNum = 0;
        int rightHalfNum = 0;
        cnt = 0;
        while (srcNum != 0) {
            cnt++;
            tempNum = srcNum % 10;
            srcNum /= 10;
            if (cnt < 4) {
                rightHalfNum += tempNum;
            } else if (cnt >= 4) {
                leftHalfNum += tempNum;
            }
        }
        System.out.println("Сумма первой тройки цифр = " + leftHalfNum);
        System.out.println("Сумма второй тройки цифр = " + rightHalfNum);
        if (leftHalfNum == rightHalfNum) {
            System.out.println("Число " + happyNum +  " является счастливым");
        } else {
            System.out.println("Число " + happyNum +  " не является счастливым");
        }

        //10.Вывод таблицы умножения Пифагора
        System.out.println("\n10.Вывод таблицы умножения Пифагора");               
        System.out.print("__|");
        for (int i = 2; i <= 9; i++) {               
            System.out.print("__" + i);               
        }
        System.out.println();
        tempNum = 0;
        for (int i = 2; i <= 9; i++) {           
            System.out.print(" "+ i + "| ");
            for (int j = 2; j <= 9; j++) {               
                System.out.format("%2d ", j * i);               
            }
            System.out.println();            
        }

    }
}