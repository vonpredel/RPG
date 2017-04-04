package RPG.com.characters;

import RPG.com.equipment.armor.Armor;
import RPG.com.equipment.righthand.RightHand;
import RPG.com.equipment.secondhand.SecondHand;
import RPG.com.skills.Skill;

public interface BaseGet {
    int getBaseHealthPoints();
    int getBaseManaPoints();
    int getBaseStrength();
    int getBaseDexterity();
    int getBaseVitality();
    int getBaseEnergy();
    RightHand getBaseRightHand();
    SecondHand getBaseSecondHand();
    Armor getBaseArmor();
    Skill getBaseSkill();
}
