package RPG.com.equipment.righthand;


public class Sword extends RightHand{

    private static final int minDmg = 7;
    private static final int maxDmg = 12;
    private static final int acc = 40;

    public Sword() {
        super(minDmg, maxDmg, acc);
    }

}
