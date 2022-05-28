public class GuessNumber {
    
    private int userNum;
    private int computerNum;

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public void setComputerNum(int computerNum) {
        this.computerNum = computerNum;
    }

    public int guess() {        
        if (userNum > computerNum) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return 0;
        } else if (userNum < computerNum) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return 0;
        } else {
            return 1;
        }
    }
}