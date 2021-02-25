class Main 
{ 
    

    public static void main ( String [] args)
    {
        emptyTalk(); 
        talk("hallo");
        nameDate("Chistian", 25);

    }


    public static void emptyTalk() 
    { 
    
    System.out.println("");
    
    }
    






    public static void talk(String i )
    {
        System.out.println(i);



    }

    public static void nameDate(String name, int age)
    {
         System.out.println("my name is " + name + " and iam " + age + " years old ");

    }
}

