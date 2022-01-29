public class HouseDemo  {
    public static void main(String[] args) {
    House myHouse=new House();
    House yourHouse=new House(10,3,"blue");

    myHouse.setNumStories(2);
    myHouse.setNumWindows(6);
    myHouse.setColor("red");

//    yourHouse.setColor("blue");
//    yourHouse.setNumWindows(10);
//    yourHouse.setNumStories(3);

    printHouseData(myHouse);
        System.out.println();
    printHouseData(yourHouse);
    }
    static void printHouseData(House obj){
        System.out.println("My house is "+obj.getColor()+" and has "+obj.getNumStories()+" stories and "+obj.getNumWindows()+" windows.");
    }
}
