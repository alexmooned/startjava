public class VariablesTheme {
    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль (это название задачи)
        System.out.println("Создание переменных и вывод их значений на консоль");        
        byte procNum = 6;
        short freqCpu = 3600;
        int cntMon = 1;
        long workTime = 23000000;
        float speedInt = 100.56f;
        double speedOperMem = 2100.654654646d;
        char symProc = 'A';
        boolean isComp = true;
        System.out.println(procNum);
        System.out.println(freqCpu);
        System.out.println(cntMon);
        System.out.println(workTime);
        System.out.println(speedInt);
        System.out.println(speedOperMem);
        System.out.println(symProc);
        System.out.println(isComp);
        System.out.println("");

        //Расчет стоимости товара со скидкой
        System.out.println("Расчет стоимости товара со скидкой");
        int sumPrice = 100 + 200;
        double sumSale = sumPrice * 0.11;
        double costWithSale = sumPrice - sumSale;
        System.out.println(sumSale);
        System.out.println(costWithSale);
        System.out.println("");

        //Вывод на консоль слова JAVA
        System.out.println("Вывод на консоль слова JAVA");
		System.out.println("   J    a  v     v  a   ");
		System.out.println("   J   a a  v   v  a a  ");
		System.out.println("J  J  aaaaa  V V  aaaaa ");
		System.out.println(" JJ  a     a  V  a     a");
        System.out.println("");

        //Отображение min и max значений числовых типов данных
        System.out.println("Отображение min и max значений числовых типов данных");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807l;
        System.out.println(byteMax);
        System.out.println(shortMax);
        System.out.println(intMax);
        System.out.println(longMax);
        System.out.println(byteMax+1);
        System.out.println(shortMax+1);
        System.out.println(intMax+1);
        System.out.println(longMax+1);
        System.out.println(byteMax-1);
        System.out.println(shortMax-1);
        System.out.println(intMax-1);
        System.out.println(longMax-1);
        System.out.println("");

        //Перестановка значений переменных
        System.out.println("Перестановка значений переменных");
        float numFloat = 12345.67f;
        double numDouble = 76543.21d;
        double numTree;
        System.out.println(numFloat);
        System.out.println(numDouble);

        numTree = numDouble;
        numDouble = (double) numFloat;
        numFloat = (float) numTree;        

        System.out.println(numFloat);
        System.out.println(numDouble);
        System.out.println("");

        //Вывод символов и их кодов
        System.out.println("Вывод символов и их кодов");
        int num1 = 35;
        int num2 = 38;
        int num3 = 64;
        int num4 = 94;
        int num5 = 65;
        System.out.println(num1+" - "+(char) (num1));
        System.out.println(num2+" - "+(char) (num2));
        System.out.println(num3+" - "+(char) (num3));
        System.out.println(num4+" - "+(char) (num4));
        System.out.println(num5+" - "+(char) (num5));
        System.out.println("");

        //Произведение и сумма цифр числа
        System.out.println("Произведение и сумма цифр числа");
        int num = 345;
        int numFirst = num / 100;
        int numSecond = num / 10 % 10;
        int numThree = num % 10;
        System.out.println(numFirst*numSecond*numThree);
        System.out.println(numFirst+numSecond+numThree);
        System.out.println("");

        //Вывод на консоль ASCII-арт Дюка
        System.out.println("Вывод на консоль ASCII-арт Дюка");
        char sym1 = '/';
        char sym2 = '\\';
        char sym3 = ' ';
        char sym4 = '_';
        char sym5 = '(';
        char sym6 = ')';
        System.out.println(sym3+""+sym3+""+sym3+""+sym3+""+sym1+""+sym2+""+sym3+""+sym3+""+sym3+""+sym3);
        System.out.println(sym3+""+sym3+""+sym3+""+sym1+""+sym3+""+sym3+""+sym2+""+sym3+""+sym3+""+sym3);
        System.out.println(sym3+""+sym3+""+sym1+""+sym4+""+sym5+""+sym3+""+sym6+""+sym2+""+sym3+""+sym3);
        System.out.println(sym3+""+sym1+""+sym3+""+sym3+""+sym3+""+sym3+""+sym3+""+sym3+""+sym2+""+sym3);
        System.out.println(sym1+""+sym4+""+sym4+""+sym4+""+sym4+""+sym1+""+sym2+""+sym4+""+sym4+""+sym2);
        System.out.println("");

        //Отображение количества сотен, десятков и единиц числа
        System.out.println("Отображение количества сотен, десятков и единиц числа");
        num = 123;
        numFirst = num / 100;
        numSecond = num / 10 % 10;
        numThree = num % 10;
        System.out.println("В числе 123 - "+numFirst+" сотня");
        System.out.println("В числе 123 - "+numSecond+" десятка");
        System.out.println("В числе 123 - "+numThree+" единицы");
        System.out.println("");

        //Преобразование секунд
        System.out.println("Преобразование секунд");
        int secTot = 86399;
        int hour = secTot / 3600;
        int min = secTot / 60 % 60;
        int sec = secTot / 1 % 60;
        System.out.println(hour+":"+min+":"+sec);
    }
}