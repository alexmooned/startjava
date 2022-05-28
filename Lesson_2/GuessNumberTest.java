import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scanner.nextLine());
        System.out.println("Игра началась!");        
        String continued = "yes";
        while (continued.equals("yes")) {
            int computerNum = (int) (Math.random() * 100 + 1);            
            GuessNumber guessFirstPlayer = new GuessNumber();
            GuessNumber guessSecondPlayer = new GuessNumber();
            guessFirstPlayer.setComputerNum(computerNum);
            guessSecondPlayer.setComputerNum(computerNum);
            while (true) {
                System.out.print("Игрок " + firstPlayer.name + " введите число: ");
                guessFirstPlayer.setUserNum(scanner.nextInt());
                if (guessFirstPlayer.guess() == 1) {
                    System.out.println("Игрок " + firstPlayer.name + " победил!");
                    break;
                }
                System.out.print("Игрок " + secondPlayer.name + " введите число: ");
                guessSecondPlayer.setUserNum(scanner.nextInt());
                if (guessSecondPlayer.guess() == 1) {
                    System.out.println("Игрок " + secondPlayer.name + " победил!");
                    break;
                }
            }
            scanner.nextLine();
            continued = "";
            while (!continued.equals("no") && !continued.equals("yes")) {                     
                    System.out.println("Хотите продолжить игру? [yes/no]: ");
                    continued = scanner.nextLine(); 
                }
        }
    }
}