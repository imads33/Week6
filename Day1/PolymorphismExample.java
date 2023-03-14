class Example{
     public void read()
    {
      System.out.println("the name of the book is atomic habbits");
    }
    public void read(String name)
    {
      System.out.println("the name of the book is : "+name);
    }
    public void read(int no_of_copies)
    {
      System.out.println("the copies are "+no_of_copies);
    }
}

class PolymorphismExample{
    public static void main(String[] args){
        Example e=new Example();
        e.read();
        e.read("Naruto");
        e.read(10);
    }
}