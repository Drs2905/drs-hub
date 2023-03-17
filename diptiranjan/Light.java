public class Light
 {
  public static void main(String args[])
  {
    int lightspeed=186000;
    long days= 1000;
    long seconds;
    long distance= 150000000;
    seconds= days * 24 * 60 * 60;
    distance = lightspeed*seconds;
    System.out.println(" in " + days);
    System.out.println(" days light will travel about");
    System.out.println(distance + " miles");
  }
 }
