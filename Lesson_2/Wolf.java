public class Wolf {
    
    private char sex;
    private String nickName;
    private float weight;
    private float height;
    private int age;
    private String color;
    
    public char getSex() {
        return sex;
    }
     
    public void setSex(char sex) {
        this.sex = sex;
    }
    
    public String getNickName() {
        return nickName;
    }
 
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    public float getWeight() {
        return weight;
    }
 
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public float getHeight() {
        return height;
    }
 
    public void setHeight(float height) {
        this.height = height;
    }
    
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");    
        } else {    
            this.age = age;
        }
    }
    
    public String getColor() {
        return color;
    }
 
    public void setColor(String color) {
        this.color = color;
    }    
    
    public void move() {
        System.out.println("moving");
    }    
    
    public void sit() {
        System.out.println("seating");
    }
    
    public void run() {
        System.out.println("running");
    }
    
    public void howl() {
        System.out.println("howling");
    }
    
    public void hunt() {
        System.out.println("hunting");
        
    }        
}