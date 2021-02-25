class Datamatikker
{ 
    

    public static void main(String [] args)
    {
        Teacher obj = new Teacher("Jens",32,false);
        Student stu1 = new Student("Christian",25,false,"Spring");
        Student stu2 = new Student("Kim",37,false,"Spring"); 

        System.out.println(obj.name + " " + obj.age + " "+ obj.isFemale + " " ); 
        System.out.println(stu1);
        System.out.println(stu2);
    }

}