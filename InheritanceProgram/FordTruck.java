public class FordTruck extends Car
{

   private int haulingCapacity;
   
   
   public FordTruck(String n, float s, int hc)
   {
      super(n,s);
      haulingCapacity = hc;                
   }
   

   public float drive()
   {
      return speed++;
   }


   public String toString() 
   {
      String fordTruck = "Name: "+name+"\n";
      fordTruck += "Speed: "+speed+"\n";
      fordTruck += "Hauling Capacity: "+haulingCapacity+"\n";   
      return fordTruck; 
   }

   public int getSuperNum() //added to examplify super
   {
      return super.getNum();
   } 


}