public class Microwave {
    private String brand;
    private int maxPower;

    public Microwvave()
    {
        brand= "No brand";
        maxPower = 800;
    }

    public Microwave (String Manufacturer)
    {
      brand = manufacturer;
      maxPower =  800;
    }

    public Microwave()
    {
        brand = "no brand ";
        maxPower = 880;
    }

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
         Microwave m2 = new Microwave;
         Microwave m3 = new Microwave(500);
         Microwave m4 = new Microwave("LG");
        
    }
}

