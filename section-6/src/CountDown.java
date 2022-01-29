public class CountDown {
    public static void main(String[] args) {
        countDown(10);
        countUpto(3,5);
    }
    static void countDown(int n){
        if(n>=0){
            System.out.println(n);
            countDown(n-1);
        }
    }
    static void countUpto(int from,int to){
        if(from<=to){
            System.out.println(from);
            countUpto(from+1,to);
        }
    }
}
