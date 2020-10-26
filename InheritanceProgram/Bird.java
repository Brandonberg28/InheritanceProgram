public abstract class Bird
{

   public abstract void fly();
   public abstract void chirp();
   public abstract void swim();
   public abstract void eat();

   protected String callsign;
   protected boolean canSwim;
   protected int mealsEaten;
   
   public Bird(String cs, int me)
   {
      callsign = cs;
      mealsEaten = me;
   }

   public String getCallSign()
   {
      return callsign;
   }


}

