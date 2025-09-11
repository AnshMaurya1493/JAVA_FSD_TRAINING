package Day2;

public class LocalVariable {
    static String name="Ansh";

    public static void showMessage()
    {
     String message="Hello from Local Variable";
     System.out.println(message);
    }
}

class Main{
    public static void main(String[] args) {
        LocalVariable obj1=new LocalVariable();
        LocalVariable obj2=new LocalVariable();
        obj1.name="Aman";
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        //System.out.println(LocalVariable.name);;
        //LocalVariable.showMessage();
    }
}