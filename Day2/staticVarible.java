package Day2;

public class staticVarible {
    static int count=0;
    staticVarible()
    {
        count++;
    }

    public static void main(String[] args) {
        staticVarible obj1=new staticVarible();
        staticVarible obj2=new staticVarible();
        staticVarible obj3=new staticVarible();
        System.out.println(count);
    }
    
    
}
