import java.util.ArrayList;
import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> fnames=new ArrayList<>();
        ArrayList<String> lnames=new ArrayList<>();
        String name;
        String fname;
        String lname;
        for(int i=0;i<3;i++){
            System.out.println("Enter name");
            name=sc.nextLine();
            int ind=name.indexOf(" ");
            fname=name.substring(0,ind);
            lname=name.substring(ind+1);
            fnames.add(fname);
            lnames.add(lname);
        }
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++){
                System.out.print(fnames.get(i)+" ");
                System.out.println(lnames.get(j));
            }
    }
}
