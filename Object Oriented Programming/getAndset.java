

public class getAndset {
     public static void main(String args[]){
    Pen p1 = new Pen();  // created a pen object calles p1
     p1.setColor("blue");
     System.out.println(p1.getcolor());
     p1.setTip(5);
     System.out.println(p1.gettip());
     }
}  






  class Pen  {
     private String color;
    private int tip;

    String getcolor(){
        return this.color;
    }

    int gettip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color =  newColor;
    }
    void setTip(int Tip) {
        this.tip = Tip;
    }
  }
    

