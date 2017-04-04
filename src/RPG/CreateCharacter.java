package RPG;

import RPG.com.characters.Character;
import RPG.com.characters.Mage;
import RPG.com.characters.Rogue;
import RPG.com.characters.Warrior;
import RPG.com.equipment.armor.Armor;
import RPG.com.equipment.righthand.RightHand;
import RPG.com.equipment.secondhand.SecondHand;
import RPG.com.skills.Skill;

import javax.swing.*;

public class CreateCharacter {

    public Character createCharacter(String type,int str, int dex, int vit, int ene) {
        if (type.equals("Wybierz Postać")) JOptionPane.showMessageDialog(null, "Wybierz postać !");
        else if (type.equals("Warrior")) return new Warrior(str,dex,vit,ene);
        else if (type.equals("Rogue")) return new Rogue(str,dex,vit,ene);
        else if (type.equals("Mage")) return new Mage(str,dex,vit,ene);
        return null;
    }

    public Character createCharacter(String type, int str, int dex, int vit, int ene, RightHand rh, SecondHand lh, Armor arm, Skill skill) {
        if (type.equals("Wybierz Postać")) JOptionPane.showMessageDialog(null, "Wybierz postać !");
        else if (type.equals("Warrior")) return new Warrior(str,dex,vit,ene,arm,rh,lh,skill);
        else if (type.equals("Rogue")) return new Rogue(str,dex,vit,ene,arm,rh,lh,skill);
        else if (type.equals("Mage")) return new Mage(str,dex,vit,ene,arm,rh,lh,skill);
        return null;
    }

}
