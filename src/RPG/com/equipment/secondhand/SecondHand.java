package RPG.com.equipment.secondhand;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondHand {


    private int trinketStrengthBonus;
    private int trinketDexterityBonus;
    private int trinketEnergyBonus;
    private int trinketVitalityBonus;
    private int trinketAccuracyBonus;
    private int trinketDmgMinBonus;
    private int trinketDmgMaxBonus;
    private int trinketDefenceBonus;
    private int trinketHpBonus;
    private int trinketManaBonus;

    private static final String[] secondHands = {"Shield" , "Buckler" , "Orb","HolyBook"};
    private static final List<SecondHand> secondHandsObj = new ArrayList<>(Arrays.asList(new Shield(),new Buckler(), new Orb(),new HolyBook()));

    public SecondHand(int trinketStrengthBonus, int trinketDexterityBonus, int trinketEnergyBonus, int trinketVitalityBonus, int trinketAccuracyBonus, int trinketDmgMinBonus, int trinketDmgMaxBonus, int trinketDefenceBonus, int trinketHpBonus, int trinketManaBonus) {
        this.trinketStrengthBonus = trinketStrengthBonus;
        this.trinketDexterityBonus = trinketDexterityBonus;
        this.trinketEnergyBonus = trinketEnergyBonus;
        this.trinketVitalityBonus = trinketVitalityBonus;
        this.trinketAccuracyBonus = trinketAccuracyBonus;
        this.trinketDmgMinBonus = trinketDmgMinBonus;
        this.trinketDmgMaxBonus = trinketDmgMaxBonus;
        this.trinketDefenceBonus = trinketDefenceBonus;
        this.trinketHpBonus = trinketHpBonus;
        this.trinketManaBonus = trinketManaBonus;
    }
    public SecondHand() {

    }

    public int getTrinketStrengthBonus() {
        return trinketStrengthBonus;
    }

    public int getTrinketDexterityBonus() {
        return trinketDexterityBonus;
    }

    public int getTrinketEnergyBonus() {
        return trinketEnergyBonus;
    }

    public int getTrinketVitalityBonus() {
        return trinketVitalityBonus;
    }

    public int getTrinketAccuracyBonus() {
        return trinketAccuracyBonus;
    }

    public int getTrinketDmgMinBonus() {
        return trinketDmgMinBonus;
    }

    public int getTrinketDmgMaxBonus() {
        return trinketDmgMaxBonus;
    }

    public int getTrinketDefenceBonus() {
        return trinketDefenceBonus;
    }

    public int getTrinketHpBonus() {
        return trinketHpBonus;
    }

    public int getTrinketManaBonus() {
        return trinketManaBonus;
    }

    public static String[] getSecondHands() {
        return secondHands;
    }

    public static List<SecondHand> getSecondHandsObj() {
        return secondHandsObj;
    }
}
