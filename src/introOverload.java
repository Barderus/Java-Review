public class introOverload {
    public static void main(String[] args) {

        int x1 = add(1, 2);
        int x2 = add(1, 2, 3);
        int x3 = add(1, 2, 3, 4);
        int x4 = add(1, 2, 3, 4, 5);
        int x5 = add(1.1, 1.2, 1.3);

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);

    }

    static int add (int a, int b){
        System.out.println("This is overloaded method #1");
        return a + b;
    }

    static int add (int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    static int add (int a, int b, int c, int d){
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }

    static int add (int a, int b, int c, int d, int e){
        System.out.println("This is overloaded method #4");
        return a + b + c + d + e;
    }

    static int add (double a, double b, double c){
        System.out.println("This is overloaded method #2");
        return (int) (a + b + c);
    }

}
