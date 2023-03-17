// Parent class
 class Bicycle
{

    public int gear;
    public int speed;

    public Bicycle(int gear,int speed)
    {
        this.gear=gear;
        this.speed= speed;
    }
    public  void applyBreak(int decrement)
    {
        speed -= decrement;
    }
    public void speedUp(int increment)
    {
        speed += increment;
    }
    public String toString(){
        return ("Number of gears are : " + gear + "\n" + "speed of bicycle is: "+ speed);
    }

}

// child class

class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gear , int speed,int starHeight) {
        super(gear, speed);
        seatHeight = starHeight;
    }

    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
    public  String toString()
    {
        return (super.toString()+"\nseat height is "+ seatHeight);
    }
}

class TestInheritance{
    public static void main(String args[])
    {
        MountainBike mb = new MountainBike(3,100,25);
        System.out.println(mb.toString());
        System.out.println("-------After applying breaks-------");
        mb.applyBreak(10);
        System.out.println("-------After applying accelerator ");
        mb.speedUp(80);
        System.out.println(mb.toString());
        System.out.println("-------After adjusting seat height-----");
        mb.setHeight(30);
        System.out.println(mb.toString());

    }
}





  