

public class inheritance {
    public static void main(String agrs[]){ 
    Fish shark = new Fish();
    shark.eat();
}
}

// base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}
 
// derived class or Subclass

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }
}