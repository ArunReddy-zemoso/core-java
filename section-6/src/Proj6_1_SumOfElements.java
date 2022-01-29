import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(22);
        list.add(99);
        System.out.println(SumElements(list));
    }
    static int SumElements(ArrayList<Integer> list){
        int s=0;
        for(int x:list)
            s+=x;
        return s;
    }
}
