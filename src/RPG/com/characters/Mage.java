package RPG.com.characters;

import RPG.com.equipment.armor.Armor;
import RPG.com.equipment.armor.ClothArmor;
import RPG.com.equipment.righthand.RightHand;
import RPG.com.equipment.righthand.Staff;
import RPG.com.equipment.secondhand.Orb;
import RPG.com.equipment.secondhand.SecondHand;
import RPG.com.skills.Fireball;
import RPG.com.skills.Skill;


public class Mage extends Character{

    private static final int baseStrength = 5;
    private static final int baseDexterity = 5;
    private static final int baseVitality = 10;
    private static final int baseEnergy = 20;

    private static final int baseHealthPoints = 100;
    private static final int baseManaPoints = 200;

    private static final RightHand BaseRightHand = new Staff();
    private static final SecondHand BaseSecondHand = new Orb();
    private static final Armor BaseArmor = new ClothArmor();
    private static final Skill BaseSkill = new Fireball();

    public Mage(int strength, int dexterity, int vitality, int energy, Armor armor, RightHand rightHand, SecondHand secondHand, Skill skill) {
        super(strength, dexterity, vitality, energy, armor, rightHand, secondHand, skill);
    }
    public Mage(int strength, int dexterity, int vitality, int energy) {
        this(strength, dexterity, vitality, energy, BaseArmor, BaseRightHand, BaseSecondHand, BaseSkill);
    }
    public Mage(Armor armor, RightHand rightHand, SecondHand secondHand, Skill skill) {
        this(baseStrength, baseDexterity,baseVitality,baseEnergy, armor, rightHand, secondHand, skill);
    }
    public Mage() {
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
