package RPG.com.equipment.righthand;


public class Staff extends RightHand {

    private static final int minDmg = 1;
    private static final int maxDmg = 4;
    private static final int acc = 20;

    public Staff() {
        super(minDmg, maxDmg, acc);
    }

}
