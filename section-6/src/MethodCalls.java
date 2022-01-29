public class MethodCalls {
    public static void main(String[] args) {
        doSomething();
    }
    static int getSomeVal(){
    return 150;
    }
    static void doSomething(){
        System.out.println("In Do");
        int res=getSomeVal();
        System.out.println(res);
    }
}
