
class task4
{ 
  
    public static void main(String [] args)
    {

        int [] num = new int [4];
        String [] letter =  new String [4];
        boolean [] jump = new boolean[4]; 
      
        

            letAry(letter); 
            System.out.println(letter);
            numAry(num); 
            System.out.println(num);
          

    }
     

        public static void letAry(String[] letter)
        {
        letter[0] = "Hej";
        letter[1] = "Med";  
        letter[2] = "Jer";
        letter[3] = "Alle";
        for(int i = 0; i < letter.length; i++)
        {
            System.out.println(letter[i]);
        }

        }
        
    	public static void numAry(int[] num)
        {
        int sumt = 0; 
        num[0] = 1; 
        num[1] = 2; 
        num[2] = 3; 
        num[3] = 4; 

        for (int i = 0; i <  num.length; i++)
        {
        sumt = sumt + num[i];
        
        }
        System.out.println("sum = " + sumt); 

    }       
}

