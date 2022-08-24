package Creational.Factory.src;

import java.util.Scanner;

interface  Animal {
    abstract String getAnimal();

    abstract String makeSound();

    abstract String lifeSpan();
}

class Lion implements Animal {
    public String getAnimal() {
        return "Animal : Lion";
    }

    public String makeSound() {
        return "Sound : Roars";
    }

    public String lifeSpan() {
        return "Life Span : 35";
    }
}

class Cat implements Animal {
    public String getAnimal() {
        return "Animal : Cat";
    }

    public String makeSound() {
        return "Sound : Meows";
    }

    public String lifeSpan() {
        return "Life Span : 25";
    }
}

class Dog implements Animal {
    public String getAnimal() {
        return "Animal : Dog";
    }

    public String makeSound() {
        return "Sound : Barks";
    }

    public String lifeSpan() {
        return "Life Span : 22";
    }
}

public class AnimalFactoryDemo {
    public static Animal getAnimalType(char choice) {
        Animal ani = null;
        if (choice == 'l') ani = new Lion();
        else if (choice == 'd') ani = new Dog();
        else if (choice == 'c') ani = new Cat();
        return ani;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal aobj;
        System.out.println("Welcome to Animal Planet");
        System.out.println("1.Lion(l)");
        System.out.println("2.Dog(d)");
        System.out.println("3.Cat(c)");
        System.out.println("Enter u r choice :");
        aobj = getAnimalType(sc.next().charAt(0));
        System.out.println(aobj.getAnimal());
        System.out.println(aobj.makeSound());
        System.out.println(aobj.lifeSpan());
        sc.close();
    }
}