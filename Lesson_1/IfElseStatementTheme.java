public class IfElseStatementTheme {
    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 1;
        if (age > 20) {
            System.out.println("Ваш возраст больше 20");
        } else {
            System.out.println("Ваш возраст до 20");
        }
        boolean male = true;
        if (!male) {
            System.out.println("Ваш пол не мужской");
        }
        double height = 1.7d;
        if (height < 1.8) {
            System.out.println("Ваш рост меньше 1.8");
        } else {
            System.out.println("Ваш рост больше 1.8");
        }

        char firstLetterName = "Ralph".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква вашего имени M");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква вашего имени I");
        } else {
            System.out.println("Первая буква вашего имени " + firstLetterName);
        }

        //2. Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа");
        int firstNum = 78;
        int secondNum = 12;
        if (firstNum > secondNum) {
            System.out.println("Максимальное число " + firstNum);
            System.out.println("Минимальное число " + secondNum);
        } else if (firstNum < secondNum) {
            System.out.println("Максимальное число " + secondNum);
            System.out.println("Минимальное число" + firstNum);
        } else {
            System.out.println("Числа: " + firstNum + " и " + secondNum + " равны");
        }

        //3. Работа с числом
        System.out.println("\n3. Работа с числом");
        int srcNum = 456;
        if (srcNum % 2 == 0) {
            System.out.println("Число " + srcNum + " четное");
        } else {
            System.out.println("Число " + srcNum + " нечетное");
        }
        if (srcNum > 0) {
            System.out.println("Число " + srcNum + " положительное");
        } else if (srcNum < 0) {
            System.out.println("Число " + srcNum + " отрицательное");
        } else {
            System.out.println("Число " + srcNum + " является нулем");
        }

        //4. Поиск общей цифры в числах
        System.out.println("\n4. Поиск общей цифры в числах");
        firstNum = 789;
        secondNum = 129;
        if ((firstNum / 100) == (secondNum / 100)) {
            System.out.print("В третьем разряде совпала цифра: ");
            System.out.println(firstNum / 100);
        } 
        if ((firstNum / 10 % 10) == (secondNum / 10 % 10)) {
            System.out.print("Во втором разряде совпала цифра: ");
            System.out.println(firstNum / 10 % 10);
        }
        if ((firstNum % 10) == (secondNum % 10)) {
            System.out.print("В первом разряде совпала цифра: ");
            System.out.println(firstNum / 100);
        }

        //5. Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду");       
        char symInChar = '\u005A';
        System.out.print(symInChar);
        if ((symInChar >= 'A' && symInChar <= 'Z') || (symInChar >= 'А' && symInChar <= 'Я') || (symInChar == 'Ё')) {
            System.out.println(" - это большая буква");
        } else if ((symInChar >= 'a' && symInChar <= 'z') || (symInChar >= 'а' && symInChar <= 'я') || (symInChar == 'ё')) {
            System.out.println(" - это маленькая буква");
        } else if ((symInChar >= '0' && symInChar <= '9')) {
            System.out.println(" - это число");
        } else {
            System.out.println(" -  это не буква и не число");
        }

        //6. Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        double percent = 0;
        double totalSum = 0;
        if (deposit < 100000) {
            percent = deposit * 0.05;
        } else if (deposit >= 100000 && deposit <= 300000) {
            percent = deposit * 0.07;        
        } else if (deposit > 300000) {
            percent = deposit * 0.1;
        }        
        totalSum = deposit + percent;
        System.out.println("Сумма вклада - " + deposit);
        System.out.println("Начисленный % - " + percent);
        System.out.println("Итоговая сумма с % - " + totalSum);

        //7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
        int percentHistory = 59;        
        int scoreHistory;                
        if (percentHistory <= 60) {
            scoreHistory = 2;
        } else if (percentHistory > 60 && percentHistory <= 73) {
            scoreHistory = 3;        
        } else if (percentHistory > 73 && percentHistory <= 91) {
            scoreHistory = 4;
        } else {
            scoreHistory = 4;
        }
        int percentProgramming = 91;
        int scoreProgramming;
        if (percentProgramming <= 60) {
            scoreProgramming = 2;
        } else if (percentProgramming > 60 && percentProgramming <= 73) {
            scoreProgramming = 3;        
        } else if (percentProgramming > 73 && percentProgramming <= 91) {
            scoreProgramming = 4;
        } else {
            scoreProgramming = 4;
        }
        int avgScore;
        int avgPercent;
        avgScore = (scoreHistory + scoreProgramming) / 2;
        avgPercent = (percentHistory + percentProgramming) / 2;
        System.out.println("История - " + scoreHistory);
        System.out.println("Программирование - " + scoreProgramming);
        System.out.println("Средний балл оценок по предметам - " + avgScore);
        System.out.println("Средний % по предметам - " + avgPercent);

        //8. Расчет прибыли (убытка)
        System.out.println("\n8. Расчет прибыли (убытка)");
        int rental = 5000;
        int avgSale = 15000;
        int costPrice = 9000;
        int profit =  ((avgSale - costPrice) - rental) * 12;
        if (profit < 0) {
            System.out.println("Убыток: " + profit);
        } else {            
            System.out.println("Прибыль: +" + profit);
        }

        //9. Определение существования треугольника
        System.out.println("\n9. Определение существования треугольника");
        int a = 4;
        int b = 3;
        int c = 5;                
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник может существовать");
        } else {
            System.out.println("Треугольник не может существовать");
        }
        int leg1 = 0;
        int leg2 = 0;
        int hypotenuse = 0;
        if (a > b && a > c) {
            leg1 = b;
            leg2 = c;
            hypotenuse = a;
        } else if (b > a && b > c) {
            leg1 = a;
            leg2 = c;
            hypotenuse = b;        
        } else if (c > b && c > a) {
            leg1 = a;
            leg2 = b;
            hypotenuse = c;
        } 
        System.out.println("Первый катет треугольника: " + leg1);
        System.out.println("Второй катет треугольника: " + leg2);
        System.out.println("Гипотенуза треугольника: " + hypotenuse);
        double areaTriangle = 0;
        areaTriangle = 0.5 * leg1 * leg2;
        System.out.println("Площадь треугольника: " + areaTriangle);
        if (leg1 == 3 && leg2 == 4) {
            System.out.println(" " + "\\");
            System.out.println(" " + " " + "\\");
            System.out.println("|" + " " + " " + "\\");
            System.out.println("|" + " " + " " +  " " + "\\");
            System.out.println("|" + "_" + "_" + "_" + "_"+ "\\");
        } else if (leg1 == 4 && leg2 == 3) {
            System.out.println("|" + "\\");
            System.out.println("|" + " " + "\\");
            System.out.println("|" + " " + " " + "\\");
            System.out.println("|" + "_" + "_" + "_" + "\\");
        }

        //10. Подсчет количества банкнот
        System.out.println("\n10. Подсчет количества банкнот");
        int sum = 567;
        int denomination50 = 50;
        int denomination10 = 10;
        int denomination1 = 1;
        int banknote50 = sum / denomination50;        
        int banknote10 = (sum % denomination50) / denomination10;       
        int banknote1 = sum % denomination10;
        int sumBack = banknote50 * denomination50 + banknote10 * denomination10 + banknote1;
        System.out.println("Доступны номиналы банкнот: " + denomination50 + ", " + denomination10 + ", " + denomination1);
        System.out.println("Требуемое количество банкнот:");
        System.out.println("Номинал 50: " + banknote50);
        System.out.println("Номинал 10: " + banknote10);
        System.out.println("Номинал 1: " + banknote1);
        System.out.println("Исходная сумма: " + sumBack);

    }
}