package RPG.com.characters;

import RPG.com.equipment.armor.Armor;
import RPG.com.equipment.armor.LeatherArmor;
import RPG.com.equipment.righthand.Dagger;
import RPG.com.equipment.righthand.RightHand;
import RPG.com.equipment.secondhand.Buckler;
import RPG.com.equipment.secondhand.SecondHand;
import RPG.com.skills.DoubleStrike;
import RPG.com.skills.Skill;


public class Rogue extends Character {

    private static final int baseStrength = 10;
    private static final int baseDexterity = 15;
    private static final int baseVitality = 10;
    private static final int baseEnergy = 5;

    private static final int baseHealthPoints = 200;
    private static final int baseManaPoints = 100;

    private static final RightHand BaseRightHand = new Dagger();
    private static final SecondHand BaseSecondHand = new Buckler();
    private static final Armor BaseArmor = new LeatherArmor();
    private static final Skill BaseSkill = new DoubleStrike();

    public Rogue(int strength, int dexterity, int vitality, int energy, Armor armor, RightHand rightHand, SecondHand secondHand, Skill skill) {
        super(strength, dexterity, vitality, energy, armor, rightHand, secondHand, skill);
    }
    public Rogue(int strength, int dexterity, int vitality, int energy) {
        this(strength, dexterity, vitality, energy, BaseArmor, BaseRightHand, BaseSecondHand, BaseSkill);
    }
    public Rogue(Armor armor, RightHand rightHand, SecondHand secondHand, Skill skill) {
        this(baseStrength, baseDexterity,baseVitality,baseEnergy, armor, rightHand, secondHand, skill);
    }
    public Rogue() {
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
