public class hierarchialInheri {
    public static void main(String args[]){
    Dog dogggy = new Dog();  // objected created
   dogggy.color = "black";
   
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

class Dog extends Animal{         
  void bark(){
    System.out.println("barks");
  }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

