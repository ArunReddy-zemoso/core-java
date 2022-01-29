public class MethodsDemo {
    public static void main(String[] args) {
        PrintHello();
        PrintNumber(2);
        System.out.println(give1());
        System.out.println(add(1,2));
        System.out.println(square(1.1));
    }
    public static void PrintHello(){
        System.out.println("Hello");
    }
    static void PrintNumber(int a){
        System.out.println(a);
    }
    static int give1(){
        return 1;
    }
    static int add(int a,int b){
        return a+b;
    }
    static Double square(double x){
        return x*x;
    }
}
