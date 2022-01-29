public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIC=new IceCream("Choco",3,2);
        IceCream yourIC=new IceCream("Strawberry",2,1);

        myIC.addToppings("nuts");
        yourIC.addToppings("cherries");

        yourIC.addToppings("Sprinkles");

        printIC(myIC)
;    }
    static void printIC(IceCream iceCream){
        System.out.println(iceCream.getName());
        System.out.println(iceCream.getCost());
        System.out.println("Topped with: ");
        iceCream.printToppings();
        System.out.println();
    }
}
