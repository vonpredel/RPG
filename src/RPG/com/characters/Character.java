package RPG.com.characters;


import RPG.com.equipment.armor.Armor;
import RPG.com.equipment.righthand.RightHand;
import RPG.com.equipment.secondhand.SecondHand;
import RPG.com.skills.Skill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Character implements BaseGet {

    private static final String[] types = {"Warrior","Rogue","Mage"};
    private static final List<Character> typesObj = new ArrayList<>(Arrays.asList(new Warrior(),new Rogue(),new Mage()));

    private int strength;
    private int dexterity;
    private int vitality;
    private int energy;

    private int healthPoints;
    private int manaPoints;
    private int minDmg;
    private int maxDmg;
    private int defence;
    private int accuracy;
    private int currHealthPoints;
    private int currManaPoints;

    private Armor armor;
    private RightHand rightHand;
    private SecondHand secondHand;

    private Skill skill;

    public Character(int strength, int dexterity, int vitality, int energy, Armor armor, RightHand rightHand, SecondHand secondHand, Skill skill) {
        this.strength = strength + secondHand.getTrinketStrengthBonus();
        this.dexterity = dexterity + secondHand.getTrinketDexterityBonus();
        this.vitality = vitality + secondHand.getTrinketVitalityBonus();
        this.energy = energy + secondHand.getTrinketEnergyBonus();

        this.armor = armor;
        this.rightHand = rightHand;
        this.secondHand = secondHand;
        this.skill = skill;
    }
    public Character() {

    }

    public void generateBasicStats() {
        healthPoints = getBaseHealthPoints() + (getVitality()*10) + secondHand.getTrinketHpBonus();
        manaPoints = getBaseManaPoints() + (getEnergy()*10) + secondHand.getTrinketManaBonus();
        minDmg = getStrength()/4 + rightHand.getMinDmgBonus() + secondHand.getTrinketDmgMinBonus();
        maxDmg = getStrength()/2 + rightHand.getMaxDmgBonus() + secondHand.getTrinketDmgMaxBonus();
        defence = getDexterity()/5 + armor.getBonusArmor() + secondHand.getTrinketDefenceBonus();
        accuracy = getDexterity()*2 + rightHand.getAccBonus() + secondHand.getTrinketAccuracyBonus();

        armor = getArmor();
        rightHand = getRightHand();
        secondHand = getSecondHand();
        skill = getSkill();

        currHealthPoints = healthPoints;
        currManaPoints = manaPoints;
    }
    public void showStats() {
        System.out.println("strength" + strength);
        System.out.println("dexterity" + dexterity);
        System.out.println("vitality" + vitality);
        System.out.println("energy" + energy);
        System.out.println("hp" + healthPoints);
        System.out.println("mp" + manaPoints);
        System.out.println(armor);
        System.out.println("defence" + defence);
        System.out.println("min damage" + minDmg);
        System.out.println("max damage" + maxDmg);
        System.out.println("accuracy" + accuracy);
        System.out.println("currHp" + currHealthPoints);
    }

    public int attack(Character target) {
        int damage = getMinDmg() + (int)(Math.random() * getMaxDmg());
        int damageDealt = damage - target.getDefence();
        if (damageDealt < 0)
            damageDealt = 0;
        return damageDealt;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getMinDmg() {
        return minDmg;
    }

    public void setMinDmg(int minDmg) {
        this.minDmg = minDmg;
    }

    public int getMaxDmg() {
        return maxDmg;
    }

    public void setMaxDmg(int maxDmg) {
        this.maxDmg = maxDmg;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public RightHand getRightHand() {
        return rightHand;
    }

    public void setRightHand(RightHand rightHand) {
        this.rightHand = rightHand;
    }

    public SecondHand getSecondHand() {
        return secondHand;
    }

    public void setSecondHand(SecondHand secondHand) {
        this.secondHand = secondHand;
    }

    public int getCurrHealthPoints() {
        return currHealthPoints;
    }

    public void setCurrHealthPoints(int currHealthPoints) {
        this.currHealthPoints = currHealthPoints;
    }

    public int getCurrManaPoints() {
        return currManaPoints;
    }

    public void setCurrManaPoints(int currManaPoints) {
        this.currManaPoints = currManaPoints;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public static String[] getTypes() {
        return types;
    }

    public static List<Character> getTypesObj() {
        return typesObj;
    }

    @Override
    public int getBaseHealthPoints() {
        return 0;
    }

    @Override
    public int getBaseManaPoints() {
        return 0;
    }

    @Override
    public int getBaseStrength() {
        return 0;
    }

    @Override
    public int getBaseDexterity() {
        return 0;
    }

    @Override
    public int getBaseVitality() {
        return 0;
    }

    @Override
    public int getBaseEnergy() {
        return 0;
    }

    @Override
    public RightHand getBaseRightHand() {
        return null;
    }

    @Override
    public SecondHand getBaseSecondHand() {
        return null;
    }

    @Override
    public Armor getBaseArmor() {
        return null;
    }

    @Override
    public Skill getBaseSkill() {
        return null;
    }
}
