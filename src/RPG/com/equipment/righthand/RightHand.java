package RPG.com.equipment.righthand;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RightHand {

    private int minDmgBonus;
    private int maxDmgBonus;
    private int accBonus;

    private static final String[] rightHands = {"Sword","Dagger","Staff","Axe"};
    private static final List<RightHand> rightHandsObj = new ArrayList<>(Arrays.asList(new Sword(),new Dagger(),new Staff(),new Axe()));


    public RightHand(int minDmgBonus, int maxDmgBonus, int accBonus) {
        this.minDmgBonus = minDmgBonus;
        this.maxDmgBonus = maxDmgBonus;
        this.accBonus = accBonus;
    }

    public RightHand() {

    }

    public int getMinDmgBonus() {
        return minDmgBonus;
    }

    public int getMaxDmgBonus() {
        return maxDmgBonus;
    }

    public int getAccBonus() {
        return accBonus;
    }

    public static String[] getRightHands() {
        return rightHands;
    }

    public static List<RightHand> getRightHandsObj() {
        return rightHandsObj;
    }
}
