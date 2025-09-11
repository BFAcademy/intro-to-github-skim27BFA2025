public class Microwave {
    private String brand;
    private int maxPower;

    public Microwave (String manufacturer,int power)
    {
    brand =  manufacturer;
    maxPower = power;
    }

    public void spin()
    {
     
    }
    public void spin(boolean spinVal)
    {

    }
    public void cook()
    {

    }
    public void cook(int seconds, int power)
    {
        System.out.println("Cooking for" + seconds + "at" + power + "W");
    }
    public void cook30()
    {
        cook(30,maxPower);

    }
    public void beep()
    {
        System.out.println("beep");
    }
    public void defrost(int time)
    {

    }
    public void deforst (int time , int power)//parameter
    {

    }
    public static void main(String[] args)//those will govern how we interact with this method 
    {
         Microwave mySweetCookingDevice =  new Microwave("Samsung", 800);//creating a microwave
         mySweetCookingDevice.cook30();
         mySweetCookingDevice.cook(120,400);//(120,400)actual parameter(values)
         mySweetCookingDevice.beep();
    }
}

