public class multiLevel {
    public static void main(String args[]){
    Dog dogggy = new Dog();  // objected created
   dogggy.color = "black";
   System.out.println(dogggy.color);
   dogggy.speak();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("barks");
    }
}

class Mammals extends Animal{
    int legs;
    void speak(){
        System.out.println("speaks");
    }
}

class Dog extends Mammals{         // here class Dog inhert the properties and function of both class Mammals amd Class Animal
    String breed;
}