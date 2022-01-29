import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        try {
            infile=new Scanner(new File("input.txt"));
            int input=0;
            while (infile.hasNext()){
                input+=infile.nextInt();
            }
            System.out.println(input);
            infile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
