package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    
    public static void main(String[] args) {        
        Wolf greyWolf = new Wolf();
        greyWolf.setSex('M');
        greyWolf.setNickName("Grey Wolf");
        greyWolf.setWeight(15.5f);
        greyWolf.setHeight(1.5f);
        greyWolf.setAge(9);
        greyWolf.setColor("Grey");
        
        System.out.println("sex: " + greyWolf.getSex());
        System.out.println("nickName: " + greyWolf.getNickName());
        System.out.println("weight: " + greyWolf.getWeight());
        System.out.println("height: " + greyWolf.getHeight());
        System.out.println("age: " + greyWolf.getAge());
        System.out.println("color: " + greyWolf.getColor());        
        
    }
}