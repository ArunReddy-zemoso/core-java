public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(get(2));
        System.out.println(get(3,4));
        System.out.println(get("arun","reddy"));
    }
    static int get(int n){
        return n*2;
    }
    static  int get(int n,int m){
        return  n*m;
    }
    static String get(String a,String b){
        return a+" "+b;
    }
}
