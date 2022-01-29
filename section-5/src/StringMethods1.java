public class StringMethods1 {
    public static void main(String[] args) {
        String name="Arun";
        String name2="Arun";
        String name3="Rob";
        for(char x:name.toCharArray())
            System.out.print(x+" ");
        System.out.println();
        if(name.equals(name2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        if(name.compareTo(name3)>0){
            System.out.println(name+" > "+name3);
        }
        else
            System.out.println(name+" < "+name3);
    }
}
