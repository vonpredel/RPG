package RPG.com.skills;


import RPG.com.characters.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Skill {

    private static final String[] skills = {"Thrust", "DoubleStrike", "Fireball"};
    private static final List<Skill> skillsObj = new ArrayList<>(Arrays.asList(new Thrust(),new DoubleStrike(),new Fireball()));

    private int manaCost;

    public Skill(int manaCost) {
        this.manaCost = manaCost;
    }

    public Skill() {

    }
// ----------- asdasdsad asdas das- da-s -dsa- d-as- -as- das- d-as- a-s d-as- da-s d-as- d-a sd-a-


    public int useSkill(Character target) {
        return 0;
    }

    public static String[] getSkills() {
        return skills;
    }

    public static List<Skill> getSkillsObj() {
        return skillsObj;
    }
}
