public class HummingBird extends Bird
{

   private String name;
   
   public HummingBird(String n, String cs, int me)
   {
      super(cs,me);
      name = n;      
   }
   
   public void fly()
   {
      System.out.println(name+" is flying high!");
   }

   public void chirp()
   {
      System.out.println(name+" chirps!");
   }
   
   public void eat()
   {
      mealsEaten++;
   }
   
   public void swim()
   {
      System.out.println("Hummingbirds cannot swim");
   }

   public String toString()
   {
      String HummingBird = "Name: "+name+"\n";
      HummingBird += "Meals Eaten: "+mealsEaten+"\n";
      HummingBird += "Can Swim: False \n";
      HummingBird += "Callsign: "+callsign;
      return HummingBird; 
   }
}