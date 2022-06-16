package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    
    public static void main(String[] args) {        
        Jaeger firstJaeger = new Jaeger();        
        firstJaeger.setModelName("Striker Eureka");
        firstJaeger.setMark("Mark-5");
        firstJaeger.setOrigin("Australia");
        firstJaeger.setHeight(76.2f);
        firstJaeger.setWeight(1.85f);
        firstJaeger.setStrength(10);
        firstJaeger.setArmor(9);

        Jaeger secondJaeger = new Jaeger();
        secondJaeger.setModelName("Coyote Tango");
        secondJaeger.setMark("Mark-1");
        secondJaeger.setOrigin("Japan");
        secondJaeger.setHeight(85.34f);
        secondJaeger.setWeight(2.312f);
        secondJaeger.setStrength(7);
        secondJaeger.setArmor(4);
        
        System.out.println("Jaeger " + firstJaeger.getModelName() + " в дрифте: " + firstJaeger.drift());
        System.out.print("Активация режима VortexCannon для Jaeger " + firstJaeger.getModelName() + ": ");
        firstJaeger.useVortexCannon();
        System.out.println("Jaeger " + firstJaeger.getModelName() + " в режиме сканирования: " + firstJaeger.scanKaiju());
        System.out.print("Действие для Jaeger " + firstJaeger.getModelName() + ": ");
        firstJaeger.move();
        System.out.println("\nJaeger " + secondJaeger.getModelName() + " в дрифте: " + secondJaeger.drift());
        System.out.print("Активация режима VortexCannon для Jaeger " + secondJaeger.getModelName() + ": ");
        secondJaeger.useVortexCannon();
        System.out.println("Jaeger " + secondJaeger.getModelName() + " в режиме сканирования: " + secondJaeger.scanKaiju());
        System.out.print("Действие для Jaeger " + secondJaeger.getModelName() + ": ");
        secondJaeger.move();
        System.out.println("\nOrigin Jaeger " + firstJaeger.getModelName() + ": " + firstJaeger.getOrigin());
        firstJaeger.setOrigin(secondJaeger.getOrigin());
        System.out.println("Origin Jaeger " + firstJaeger.getModelName() + ": " + firstJaeger.getOrigin());
        System.out.println("\nWeight Jaeger " + firstJaeger.getModelName() + ": " + firstJaeger.getWeight());
        firstJaeger.setWeight(1.5f);
        System.out.println("Weight Jaeger " + firstJaeger.getModelName() + ": " + firstJaeger.getWeight());
    }
}