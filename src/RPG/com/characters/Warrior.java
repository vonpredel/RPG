package RPG.com.characters;

import RPG.com.equipment.armor.Armor;
import RPG.com.equipment.armor.MailArmor;
import RPG.com.equipment.righthand.RightHand;
import RPG.com.equipment.righthand.Sword;
import RPG.com.equipment.secondhand.SecondHand;
import RPG.com.equipment.secondhand.Shield;
import RPG.com.skills.Skill;
import RPG.com.skills.Thrust;


public class Warrior extends Character {

    private static final int baseStrength = 15;
    private static final int baseDexterity = 10;
    private static final int baseVitality = 15;
    private static final int baseEnergy = 0;

    private static final int baseHealthPoints = 250;
    private static final int baseManaPoints = 50;

    private static final RightHand BaseRightHand = new Sword();
    private static final SecondHand BaseSecondHand = new Shield();
    private static final Armor BaseArmor = new MailArmor();
    private static final Skill BaseSkill = new Thrust();

    public Warrior(int strength, int dexterity, int vitality, int energy, Armor armor, RightHand rightHand, SecondHand secondHand, Skill skill) {
        super(strength, dexterity, vitality, energy, armor, rightHand, secondHand, skill);
    }
    public Warrior(int strength, int dexterity, int vitality, int energy) {
        this(strength, dexterity, vitality, energy, BaseArmor, BaseRightHand, BaseSecondHand, BaseSkill);
    }
    public Warrior(Armor armor, RightHand rightHand, SecondHand secondHand, Skill skill) {
        this(baseStrength, baseDexterity,baseVitality,baseEnergy, armor, rightHand, secondHand, skill);
    }
    public Warrior() {
        this(baseStrength, baseDexterity,baseVitality,baseEnergy, BaseArmor, BaseRightHand, BaseSecondHand, BaseSkill);
    }

    public int getBaseHealthPoints() {
        return baseHealthPoints;
    }

    public int getBaseManaPoints() {
        return baseManaPoints;
    }

    public int getBaseStrength() {
        return baseStrength;
    }

    public int getBaseDexterity() {
        return baseDexterity;
    }

    public int getBaseVitality() {
        return baseVitality;
    }

    public int getBaseEnergy() {
        return baseEnergy;
    }

    public RightHand getBaseRightHand() {
        return BaseRightHand;
    }

    public SecondHand getBaseSecondHand() {
        return BaseSecondHand;
    }

    public Armor getBaseArmor() {
        return BaseArmor;
    }

    public Skill getBaseSkill() {
        return BaseSkill;
    }
}
