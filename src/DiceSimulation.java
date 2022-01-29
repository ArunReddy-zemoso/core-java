import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random rand=new Random();
        int diceVal;
        for (int i=0;i<10;i++){
            diceVal=rand.nextInt(6)+1;
            System.out.println(diceVal);
        }
    }
}
