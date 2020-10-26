public abstract class Car 
{

   protected float speed = 0;
   protected String name;
   
   private int number = 4; //added to exemplify accessing a variable through super keyword
     
   public abstract float drive();
   
   public Car(String n, float s)
   {
      name = n;
      speed = s;
   }
   
   public int getNum()
   {
      return number;
   }

}