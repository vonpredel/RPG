package RPG.com.equipment.armor;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Armor {

    private int bonusArmor;

    private static final String[] armors = {"LeatherArmor","ClothArmor","MailArmor","PlateArmor"};
    private static final List<Armor> armorsObj = new ArrayList<>(Arrays.asList(new MailArmor(),new LeatherArmor(), new ClothArmor(), new PlateArmor()));



    public Armor(int bonusArmor) {
        this.bonusArmor = bonusArmor;
    }

    public Armor() {

    }

    public int getBonusArmor() {
        return bonusArmor;
    }

    public static String[] getArmors() {
        return armors;
    }

    public static List<Armor> getArmorsObj() {
        return armorsObj;
    }
}
