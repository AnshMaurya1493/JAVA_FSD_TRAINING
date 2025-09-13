public class ConstructorDemo
{
    int id;
    String name;
    ConstructorDemo()
    {
        this.id=0;
        this.name="Unknown";

    }
    ConstructorDemo(int id, String name)
    {
        this.id=id;
        this.name=name;
    }

    public void display()
    {
        System.out.println("ID: "+id+", Name: "+name);
    }

    public static void main(String[] args) {
        System.out.println("------Constructor Demonstration------");
        ConstructorDemo obj1=new ConstructorDemo();
        ConstructorDemo obj2=new ConstructorDemo(1,"Alice");
        obj1.display();
        obj2.display();
    }
}