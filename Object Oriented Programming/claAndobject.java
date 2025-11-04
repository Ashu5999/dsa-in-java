

public class claAndobject {
  public static void main(String args[]){
    Pen p1 = new Pen();  // created a pen object calles p1
     p1.setColor("blue");
     System.out.println(p1.color);

     Bankaccount myAcc = new Bankaccount();
     myAcc.username = "ashuTiwari";
     System.out.println(myAcc.username);
   //  myAcc.password   // password cannot be assible
}  


}

 class Bankaccount{
    public String username;
    private String password;

 }

  class Pen  {
    String color;
    int tip;
    void setColor(String newColor){
        color =  newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
  }

  