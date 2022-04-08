public class VariablesTheme {
    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль (это название задачи)
        System.out.println("Создание переменных и вывод их значений на консоль");        
        byte cpuNum = 6;
        short freqCpu = 3600;
        int cntMon = 1;
        long workTime = 23000000;
        float speedInt = 100.56f;
        double speedRam = 2100.654654646d;
        char symCpu = 'A';
        boolean isComp = true;
        System.out.println(cpuNum);
        System.out.println(freqCpu);
        System.out.println(cntMon);
        System.out.println(workTime);
        System.out.println(speedInt);
        System.out.println(speedRam);
        System.out.println(symCpu);
        System.out.println(isComp);        

        //Расчет стоимости товара со скидкой
        System.out.println("\nРасчет стоимости товара со скидкой");
        int sumPrice = 100 + 200;
        double sumSale = sumPrice * 0.11;
        double costWithSale = sumPrice - sumSale;
        System.out.println("Скидка: " + sumSale);
        System.out.println("Стоимость со скидкой: " + costWithSale);       

        //Вывод на консоль слова JAVA
        System.out.println("\nВывод на консоль слова JAVA");
		System.out.println("   J    a  v     v  a   ");
		System.out.println("   J   a a  v   v  a a  ");
		System.out.println("J  J  aaaaa  V V  aaaaa ");
		System.out.println(" JJ  a     a  V  a     a");       

        //Отображение min и max значений числовых типов данных
        System.out.println("\nОтображение min и max значений числовых типов данных");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807l;
        System.out.println(byteMax);
        System.out.println(shortMax);
        System.out.println(intMax);
        System.out.println(longMax);
        System.out.println(++byteMax);
        System.out.println(++shortMax);
        System.out.println(++intMax);
        System.out.println(++longMax);
        System.out.println(--byteMax);
        System.out.println(--shortMax);
        System.out.println(--intMax);
        System.out.println(--longMax);       

        //Перестановка значений переменных
        System.out.println("\nПерестановка значений переменных");
        float numF = 12345.67f;
        double numD = 76543.21d;
        double tmpNum;
        System.out.println(numF);
        System.out.println(numD);

        tmpNum = numD;
        numD = (double) numF;
        numF = (float) tmpNum;        

        System.out.println(numF);
        System.out.println(numD);       

        //Вывод символов и их кодов
        System.out.println("\nВывод символов и их кодов");
        int num35 = 35;
        int num38 = 38;
        int num64 = 64;
        int num94 = 94;
        int num65 = 65;
        System.out.println(num35 + " - " + (char) (num35));
        System.out.println(num38 + " - " + (char) (num38));
        System.out.println(num64 + " - " + (char) (num64));
        System.out.println(num94 + " - " + (char) (num94));
        System.out.println(num65 + " - " + (char) (num65));       

        //Произведение и сумма цифр числа
        System.out.println("\nПроизведение и сумма цифр числа");
        int srcNum = 345;
        int firstDigit = srcNum / 100;
        int secondDigit = srcNum / 10 % 10;
        int thirdDigit = srcNum % 10;
        System.out.println(firstDigit * secondDigit * thirdDigit);
        System.out.println(firstDigit + secondDigit + thirdDigit);       

        //Вывод на консоль ASCII-арт Дюка
        System.out.println("\nВывод на консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char space = ' ';
        char underscore = '_';
        char lBracket = '(';
        char rBracket = ')';
		System.out.println("" + space + space + space + space + slash + backSlash + space + space + space + space);    
        System.out.println("" + space + space + space + slash + space + space + backSlash + space + space + space);
        System.out.println("" + space + space + slash + underscore + lBracket + space + rBracket + backSlash + space + space);
        System.out.println("" + space + slash + space + space + space + space + space + space + backSlash + space);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backSlash + underscore + underscore + backSlash);       

        //Отображение количества сотен, десятков и единиц числа
        System.out.println("\nОтображение количества сотен, десятков и единиц числа");
        srcNum = 123;
        firstDigit = srcNum / 100;
        secondDigit = srcNum / 10 % 10;
        thirdDigit = srcNum % 10;
        System.out.println("В числе 123 - " + firstDigit + " сотня");
        System.out.println("В числе 123 - " + secondDigit + " десятка");
        System.out.println("В числе 123 - " + thirdDigit + " единицы");        

        //Преобразование секунд
        System.out.println("\nПреобразование секунд");
        int totalSec = 86399;
        int hour = totalSec / 3600;
        int min = totalSec / 60 % 60;
        int sec = totalSec % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}