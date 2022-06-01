import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scanner.nextLine());

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        String continued = "yes";

        while (continued.equals("yes")) {
            game.start();
            continued = "";
            while (!continued.equals("no") && !continued.equals("yes")) {                     
                    System.out.println("Хотите продолжить игру? [yes/no]: ");
                    continued = scanner.nextLine(); 
            }
            if(continued.equals("no")) {
                break;
            }
        }
    }
}