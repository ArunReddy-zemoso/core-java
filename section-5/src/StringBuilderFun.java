public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Arun Kumar");
        sb.append(" Reddy");
        System.out.println(sb);
        sb.insert(0,"Mr. ");
        System.out.println(sb);
        sb.replace(0,3,"Marella");
        System.out.println(sb);
        sb.delete(0,8);
        System.out.println(sb);
    }
}
