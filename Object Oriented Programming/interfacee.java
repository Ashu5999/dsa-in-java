public class interfacee{
    


    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();  // Cat meows
        c.sleep();  // Cat sleeps
    }
}

interface Animal {
    void sound();  // abstract method
    void sleep();  // abstract method
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
