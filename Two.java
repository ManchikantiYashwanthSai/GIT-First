public class Two {
    public static void main(String[] args)
    {
Parent p = new Parent();
Parent p1= new Child();
p.method();
p1.method();
    }
    
}
class Parent 
{
    public void method()
    {
        System.out.println("This is  Parent method ");
    }
}
class Child extends Parent 
{
    public void method()
    {
         System.out.println("This is  Child method ");
    }
}
