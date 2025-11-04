public class methodOveriding {
    public static void main(String args[]){
        Deer D1 = new Deer();
        D1.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything ");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass..");
    }
}