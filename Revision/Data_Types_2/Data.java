import java.util.Scanner;


class Data {
    static byte a;
    static short b;
    static int c;
    static long d;
    static float e;
    static double f;
    static boolean g;
    static char h;
    static String i;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a: ");
        a = input.nextByte();
        System.out.println("b: ");
        b = input.nextShort();
        System.out.println("c: ");
        c = input.nextInt();
        System.out.println("d: ");
        d = input.nextLong();
        System.out.println("e: ");
        e = input.nextFloat();
        System.out.println("f: ");
        f = input.nextDouble();
        System.out.println("g: ");
        g = input.nextBoolean();
        System.out.println("h: ");
        h = input.next().charAt(0);
        System.out.println("i: ");
        input.nextLine();
        i = input.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        
    }
}