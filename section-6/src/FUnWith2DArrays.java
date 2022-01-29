import java.util.Random;

public class FUnWith2DArrays {
    public static void main(String[] args) {
    int[][] my2DAr=new int[3][3];
    fill2DArray(my2DAr);
    print2DArr(my2DAr);
    System.out.println();
    twice2DArray(my2DAr);
    print2DArr(my2DAr);
    }

    static void twice2DArray( int[][] twoDArr){
        for(int i=0;i<twoDArr.length;i++){
            for(int j=0;j<twoDArr[i].length;j++){
                twoDArr[i][j]*=2;
            }
        }
    }

    static void fill2DArray(int[][] twoDArr){
        Random rand=new Random();
        for(int i=0;i<twoDArr.length;i++){
            for(int j=0;j<twoDArr[i].length;j++){
                twoDArr[i][j]= rand.nextInt(100);
            }
        }
    }
    static void print2DArr(int[][] twoDArr){
        for(int[] x:twoDArr){
            for(int n:x){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
