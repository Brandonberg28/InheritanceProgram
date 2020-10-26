public class Penguin extends Bird
{

   public Penguin(String cs, int me)
   {
      super(cs,me);     
   }

   public void fly()
   {
      System.out.println("Penguins cannot fly");
   }

   public void swim()
   {
      System.out.println("Swimming Penguin!");
   }

   public void eat()
   {
      mealsEaten += 3;
   }

   public void chirp()
   {
      System.out.println("Penguin Chirping!");
   }

   public void tapDance()
   {
      System.out.println("Tap Dancing Penguins!");
   }

   public String toString()
   {
      String HummingBird = "Penguin: \n";
      HummingBird += "Meals Eaten: "+mealsEaten+"\n";
      HummingBird += "Can Swim: True \n";  
      HummingBird += "Callsign: "+callsign;
      return HummingBird; 
   }


}