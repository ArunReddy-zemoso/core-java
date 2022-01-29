public class ArrayFun {
    public static void main(String[] args) {
        int[] arr;
        arr=new int[3];
        arr[0]=10;
        arr[1]=22;
        arr[2]=33;
        for(int i=0;i< arr.length;i++) System.out.println(arr[i]);

        for(int x:arr) System.out.println(x);
    }
}
