

class task4
{ 
  
    public static void main(String [] args)
    {

        int [] num = new int [4];
        String [] letter = new String [4];
        boolean [] jump = new boolean[4]; 
        int [] num2 = {10,20,300,40};
        

            letAry(letter); 
            numAry(num);  
          avag(num2); 

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
    
    
    public static void avag(int[] num2)
    {
        int total = 0; 
        for (int j = 0; j < num2.length; j++)
        {
            total = total + num2[j];
            int snit = total/num2.length; 
           
        }
        int snit = total/num2.length;  
        System.out.println(snit);
       
    }
    
}

