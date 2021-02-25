class Main
{
  public static boolean happy = true;



  public static void main(String [] args) 
{
   
  int counter2;
  
  
  if (iAmHappy())
   {
     upperSting("hey med jer");
     counter2 = counter(2,8);
     System.out.println(counter2);
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }
}


  public static boolean iAmHappy()
  {
  if (happy == true)
  {  return true;
  }else {
      return false; 
  }
  } 

    public static int counter(int a, int b)
    {

      return a + b; 
    }
  
  public static void upperSting(String a)
  {
  
    System.out.println(a.toUpperCase());
  
  }
  public static boolean bigletter(String a)
  {
    if (Character.isUpperCase(a.charAt(0)))
    {
      return true; 
    } else {
      return false; 
     }
    }
    

  }

    
