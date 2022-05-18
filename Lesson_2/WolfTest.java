public class WolfTest {
	
    public static void main(String[] args) {		
		Wolf greyWolf = new Wolf();
		greyWolf.sex = 'M';
		greyWolf.nickName = "Grey Wolf";
		greyWolf.weight = 15.5f;
		greyWolf.height = 1.5f;
		greyWolf.age = 2;
		greyWolf.color = "Grey";
		
		System.out.println("sex: " + greyWolf.sex);
		System.out.println("nickName: " + greyWolf.nickName);
		System.out.println("weight: " + greyWolf.weight);
		System.out.println("height: " + greyWolf.height);
		System.out.println("age: " + greyWolf.age);
		System.out.println("color: " + greyWolf.color);
		
		greyWolf.move();
		greyWolf.sit();
		greyWolf.run();
		greyWolf.howl();
		greyWolf.hunt();	
		
	}
}