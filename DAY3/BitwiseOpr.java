public class BitwiseOpr {

    public static void main(String [] args)
    {
        int a=12;
        int b=10;
        System.out.println("Number: a = "+a +"binary = "+Integer.toBinaryString(a));
        System.out.println("Number: b = "+b +"binary = "+Integer.toBinaryString(b));
        System.out.println("............Bitwise Operation...............");
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(~a); //bitwise not
        System.out.println(a << 2); // bitwise left shift
        System.out.println(a >> 2); // bitwise left shift
        System.out.println(a >>> 2); // unsigned right shift

    }
}