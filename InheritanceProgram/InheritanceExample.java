import java.util.*;
import java.io.*;
import java.text.*;

public class InheritanceExample
{
   public static void main (String[]args)
   {
      
      //PART 1
      Car Explorer = new FordTruck("Explorer",0,100); 
      
      Explorer.drive();                               
      
      System.out.println(Explorer);                   
      
      Explorer.drive();                               
      
      System.out.println(Explorer);                   
            
      System.out.println();                           
           
      FordTruck truck = new FordTruck("Explorer",0,100); //accessing a private variable from a subclass
      
      System.out.println(truck.getSuperNum() + "\n");

      
      //PART 2
      Scanner scan = new Scanner(System.in);
      ArrayList <Bird> Zoo = new ArrayList <Bird>();
      boolean looper = true;
      String menu, birdAdded, callSign;
      int i;
      
      do
      {
      
         menu = "Which option do you wish to select?\n"
              + "0 - eat\n"
              + "1 - chirp\n"
              + "2 - tap dance penguins\n"
              + "3 - add new bird\n"
              + "4 - fly\n"
              + "5 - swim\n"
              + "6 - remove based on callsign\n"
              + "7 - print\n"
              + "8 - quit.";
         System.out.println(menu); 
                  
         switch (scan.nextInt())
         {
            case 0: //eat
                  for (i=0; i<Zoo.size(); i++)
                  {
                     Zoo.get(i).eat();
                  }
                  break;
                  
            case 1: //chirp
                  for (i=0; i<Zoo.size(); i++)
                  {
                     Zoo.get(i).chirp();
                  }
                  
                  break;
                  
            case 2: //tap dance penguins
                  for (i=0; i<Zoo.size(); i++)
                  {
                     if (Zoo.get(i) instanceof Penguin)
                     {
                        Penguin tempPenguin = (Penguin) Zoo.get(i); //cast ZooBird into Penguin to make it tapDance
                        tempPenguin.tapDance();
                     }
                  }
                  break;
                  
            case 3: //add new bird
                  System.out.println("Which would you like to add? (P = penguin and H = hummingbird)");
                  birdAdded = scan.next();
                  
                  if(birdAdded.equals("H"))
                  {
                     System.out.println("Enter in a name, callsign, and the number of meals previously eaten.");             
                     Bird birdizzle = new HummingBird(scan.next(), scan.next(), scan.nextInt()); 
                     Zoo.add(birdizzle);                                           
                  }
                  
                  if(birdAdded.equals("P"))
                  {
                     System.out.println("Enter in a callsign, and the number of meals previously eaten.");
                     Bird birdizzle = new Penguin(scan.next(), scan.nextInt()); 
                     Zoo.add(birdizzle);                                 
                  }   
                  break;
                  
            case 4: //fly
                  for (i=0; i<Zoo.size(); i++)
                  {
                     Zoo.get(i).fly();
                  }                        
                  break;
                  
            case 5: //swim
                  for (i=0; i<Zoo.size(); i++)
                  {
                     Zoo.get(i).swim();
                  }     
                  break;
                  
            case 6: //remove based on callsign
                  System.out.println("Which callsign would you like to remove?");
                  callSign = scan.next();
                  for (i=0; i<Zoo.size(); i++)
                  {
                     if(callSign.equals(Zoo.get(i).getCallSign()))
                     {
                        Zoo.remove(i);
                     }
                  }              
                  break;
                  
            case 7: //print
                  for (i=0; i<Zoo.size(); i++)
                  {
                   System.out.println(Zoo.get(i));
                   System.out.println();
                  }  
                  break;
                  
            case 8: //quit
                  looper = false;
                  break;         
         } 
         System.out.println();    
      }while(looper);
   
   }
}