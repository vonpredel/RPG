package RPG.com.GUI;

import RPG.CreateCharacter;
import RPG.com.characters.Character;
import RPG.com.equipment.armor.Armor;
import RPG.com.equipment.righthand.RightHand;
import RPG.com.equipment.secondhand.SecondHand;
import RPG.com.skills.Skill;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


class GamePanel extends JPanel {

    private Character tempHero;
    private Character tempFoe;
    private RightHand tempRightHand;
    private SecondHand tempSecondHand;
    private Armor tempArmor;
    private Skill tempSkill;
    private int currHeroHp,currFoeHp,currHeroMp,currFoeMp;

    GamePanel() {
        super();
        setLayout(new BorderLayout());
        initializeCreatePanel();
    }
    private void initializeCreatePanel() {

        String[] types = Character.getTypes();
        String[] righthands = RightHand.getRightHands();
        String[] secondhands = SecondHand.getSecondHands();
        String[] armors = Armor.getArmors();
        String[] skills = Skill.getSkills();

        ArrayList<Character> typesObj = (ArrayList<Character>) new Character().getTypesObj();
        ArrayList<Armor> armorsObj = (ArrayList<Armor>) new Armor().getArmorsObj();
        ArrayList<RightHand> rightHandsObj = (ArrayList<RightHand>) new RightHand().getRightHandsObj();
        ArrayList<SecondHand> leftHandsObj = (ArrayList<SecondHand>) new SecondHand().getSecondHandsObj();
        ArrayList<Skill> skillsObj = (ArrayList<Skill>) new Skill().getSkillsObj();
        //=======================================================================================
        //=================================== Create Hero Panel =================================
        //=======================================================================================
        JPanel CreateHeroPanel = new JPanel();
        CreateHeroPanel.setLayout(new BoxLayout(CreateHeroPanel, BoxLayout.Y_AXIS));
        JPanel ChoosePanel = new JPanel();
        JPanel StatsChoosePanel = new JPanel();

        JLabel chooseCharacter = new JLabel("Wybierz postać");
        JButton createHero = new JButton("Stwórz postać");
        JButton createFoe = new JButton(("Stwórz peciwnika"));
        JTextField CharacStr = new JTextField("STR");
        JTextField CharacDex = new JTextField("DEX");
        JTextField CharacVit = new JTextField("VIT");
        JTextField CharacEne = new JTextField("ENE");
        CharacStr.setPreferredSize(new Dimension(40,30));
        CharacDex.setPreferredSize(new Dimension(40,30));
        CharacVit.setPreferredSize(new Dimension(40,30));
        CharacEne.setPreferredSize(new Dimension(40,30));

        JComboBox comboRightHand = new JComboBox();
        comboRightHand.addItem("Prawa Ręka");
        for(int i1 = 0; i1 < righthands.length; i1++) {
            comboRightHand.addItem(righthands[i1]);
        }

        JComboBox comboLeftHand = new JComboBox();
        comboLeftHand.addItem("Lewa Ręka");
        for (int i2 = 0; i2 < secondhands.length; i2++) {
            comboLeftHand.addItem(secondhands[i2]);
        }

        JComboBox comboArmor = new JComboBox();
        comboArmor.addItem("Pancerz");
        for (int i3 = 0; i3 < armors.length; i3++) {
            comboArmor.addItem(armors[i3]);
        }

        JComboBox comboSkill = new JComboBox();
        comboSkill.addItem("Umiejętność");
        for (int i4 = 0; i4 < skills.length; i4++) {
            comboSkill.addItem(skills[i4]);
        }

        JComboBox comboCharacter = new JComboBox();

        comboCharacter.addItem("Wybierz Postać");
        for(int i5 = 0; i5 < types.length; i5++) {
            comboCharacter.addItem(types[i5]);
        }
        comboCharacter.addActionListener(e -> {
            for (Character a : typesObj) {
                if (comboCharacter.getSelectedItem().equals(a.getClass().getSimpleName())) {
                    CharacStr.setText(String.valueOf(a.getBaseStrength()));
                    CharacDex.setText(String.valueOf(a.getBaseDexterity()));
                    CharacVit.setText(String.valueOf(a.getBaseVitality()));
                    CharacEne.setText(String.valueOf(a.getBaseEnergy()));
                    comboRightHand.setSelectedItem(a.getBaseRightHand().getClass().getSimpleName());
                    comboLeftHand.setSelectedItem(a.getBaseSecondHand().getClass().getSimpleName());
                    comboArmor.setSelectedItem(a.getBaseArmor().getClass().getSimpleName());
                    comboSkill.setSelectedItem(a.getBaseSkill().getClass().getSimpleName());
                }
            }
        });

        ChoosePanel.add(createHero);
        ChoosePanel.add(createHero);
        ChoosePanel.add(chooseCharacter);
        ChoosePanel.add(comboCharacter);
        ChoosePanel.add(createFoe);
        StatsChoosePanel.add(CharacStr);
        StatsChoosePanel.add(CharacDex);
        StatsChoosePanel.add(CharacVit);
        StatsChoosePanel.add(CharacEne);
        StatsChoosePanel.add(comboRightHand);
        StatsChoosePanel.add(comboLeftHand);
        StatsChoosePanel.add(comboArmor);
        StatsChoosePanel.add(comboSkill);

        CreateHeroPanel.add(ChoosePanel);
        CreateHeroPanel.add(StatsChoosePanel);
        add(CreateHeroPanel, BorderLayout.PAGE_START);

        //======================================================================================
        //======================================== TAGS ========================================
        //======================================================================================

        JLabel lprimaryStats = new JLabel("-- Statystyki --");
        JLabel lsecondaryStats = new JLabel("-- Dodatkowe --");
        JLabel lequipment = new JLabel("-- Ekwipunek --");

        JLabel rprimaryStats = new JLabel("-- Statystyki --");
        JLabel rsecondaryStats = new JLabel("-- Dodatkowe --");
        JLabel requipment = new JLabel("-- Ekwipunek --");

        //=======================================================================================
        //=================================== Hero Panel ========================================
        //=======================================================================================

        JPanel HeroPanel = new JPanel();
        HeroPanel.setLayout(new BoxLayout(HeroPanel, BoxLayout.Y_AXIS));

        JLabel heroName = new JLabel("Twoja postać");

        JLabel heroStrength = new JLabel("Siła");
        JLabel heroDexterity = new JLabel("Zręczność");
        JLabel heroVitality = new JLabel("Witalność");
        JLabel heroEnergy = new JLabel("Energia");

        JLabel heroHealthPoints = new JLabel("P.życia");
        JLabel heroManaPoints = new JLabel("Mana");
        JLabel heroDmg = new JLabel("Obrażenia");
        JLabel heroDefence = new JLabel("Obrona");
        JLabel heroAccuracy = new JLabel("Celność");

        JLabel heroRightHand = new JLabel("Prawa Ręka");
        JLabel heroLeftHand = new JLabel("Lewa Ręka");
        JLabel heroArmor = new JLabel("Pancerz");
        JLabel heroSkill = new JLabel("Umiejętność");

        HeroPanel.add(heroName);
        HeroPanel.add(lprimaryStats);
        HeroPanel.add(heroStrength);
        HeroPanel.add(heroDexterity);
        HeroPanel.add(heroVitality);
        HeroPanel.add(heroEnergy);
        HeroPanel.add(lsecondaryStats);
        HeroPanel.add(heroHealthPoints);
        HeroPanel.add(heroManaPoints);
        HeroPanel.add(heroDmg);
        HeroPanel.add(heroDefence);
        HeroPanel.add(heroAccuracy);
        HeroPanel.add(lequipment);
        HeroPanel.add(heroRightHand);
        HeroPanel.add(heroLeftHand);
        HeroPanel.add(heroArmor);
        HeroPanel.add(heroSkill);

        add(HeroPanel, BorderLayout.LINE_START);

        //=======================================================================================
        //=================================== Foe Panel ========================================
        //=======================================================================================

        JPanel FoePanel = new JPanel();
        FoePanel.setLayout(new BoxLayout(FoePanel, BoxLayout.Y_AXIS));

        JLabel foeName = new JLabel("Postać przeciwnika");

        JLabel foeStrength = new JLabel("Siła");
        JLabel foeDexterity = new JLabel("Zręczność");
        JLabel foeVitality = new JLabel("Witalność");
        JLabel foeEnergy = new JLabel("Energia");

        JLabel foeHealthPoints = new JLabel("P.życia");
        JLabel foeManaPoints = new JLabel("Mana");
        JLabel foeDmg = new JLabel("Obrażenia");
        JLabel foeDefence = new JLabel("Obrona");
        JLabel foeAccuracy = new JLabel("Celność");

        JLabel foeRightHand = new JLabel("Prawa Ręka");
        JLabel foeLeftHand = new JLabel("Lewa Ręka");
        JLabel foeArmor = new JLabel("Pancerz");
        JLabel foeSkill = new JLabel("Umiejętność");

        FoePanel.add(foeName);
        FoePanel.add(rprimaryStats);
        FoePanel.add(foeStrength);
        FoePanel.add(foeDexterity);
        FoePanel.add(foeVitality);
        FoePanel.add(foeEnergy);
        FoePanel.add(rsecondaryStats);
        FoePanel.add(foeHealthPoints);
        FoePanel.add(foeManaPoints);
        FoePanel.add(foeDmg);
        FoePanel.add(foeDefence);
        FoePanel.add(foeAccuracy);
        FoePanel.add(requipment);
        FoePanel.add(foeRightHand);
        FoePanel.add(foeLeftHand);
        FoePanel.add(foeArmor);
        FoePanel.add(foeSkill);

        add(FoePanel, BorderLayout.LINE_END);

        //=======================================================================================
        //=================================== Logs Panel ========================================
        //=======================================================================================

        JPanel LogPanel = new JPanel(new BorderLayout());

        JLabel HeroCurrHp = new JLabel("HeroCurrHp");
        JLabel FoeCurrHp = new JLabel("FoeCurrHp");
        JLabel HeroCurrMp = new JLabel("HeroCurrMp");
        JLabel FoeCurrMp = new JLabel("FoeCurrMp");
        JLabel logName = new JLabel("                                                          Tutaj Logi");

        JPanel heroLogPanel = new JPanel();
        JPanel foeLogPanel = new JPanel();

        heroLogPanel.setLayout(new BoxLayout(heroLogPanel, BoxLayout.Y_AXIS));
        foeLogPanel.setLayout(new BoxLayout(foeLogPanel, BoxLayout.Y_AXIS));

        heroLogPanel.add(HeroCurrHp);
        heroLogPanel.add(HeroCurrMp);

        foeLogPanel.add(FoeCurrHp);
        foeLogPanel.add(FoeCurrMp);

        LogPanel.add(heroLogPanel, BorderLayout.LINE_START);
        LogPanel.add(logName, BorderLayout.CENTER);
        LogPanel.add(foeLogPanel, BorderLayout.LINE_END);

        add(LogPanel, BorderLayout.PAGE_END);

        //=======================================================================================
        //=================================== Combat Panel ======================================
        //=======================================================================================

        JPanel CombatPanel = new JPanel();

        JPanel HeroAction = new JPanel();
        HeroAction.setLayout(new BoxLayout(HeroAction, BoxLayout.Y_AXIS));
        JPanel FoeAction = new JPanel();
        FoeAction.setLayout(new BoxLayout(FoeAction, BoxLayout.Y_AXIS));

        JButton HeroAttack = new JButton("Atakuj");
        JButton FoeAttack = new JButton("Atakuj");
        JButton HeroSkillAttack = new JButton("Skill");
        JButton FoeSkillAttack = new JButton("Skill");

        HeroAction.add(HeroAttack);
        HeroAction.add(HeroSkillAttack);
        FoeAction.add(FoeAttack);
        FoeAction.add(FoeSkillAttack);

        HeroAttack.addActionListener(e -> {
            HeroAttack(FoeCurrHp, logName);
        });

        FoeAttack.addActionListener(e -> {
            FoeAttack(HeroCurrHp, logName);
        });



        HeroAttack.setEnabled(false);
        FoeAttack.setEnabled(false);
        HeroSkillAttack.setEnabled(false);
        FoeSkillAttack.setEnabled(false);

        JCheckBox combatName = new JCheckBox("Rozpocznij walke");
        combatName.addActionListener(e -> {
            if (combatName.isSelected()) {
                createHero.setEnabled(false);
                createFoe.setEnabled(false);
                HeroAttack.setEnabled(true);
                FoeAttack.setEnabled(true);
                HeroSkillAttack.setEnabled(true);
                FoeSkillAttack.setEnabled(true);
                HeroCurrHp.setText("HeroCurrHp = " + currHeroHp);
                FoeCurrHp.setText("FoeCurrHp = " + currFoeHp);
                HeroCurrMp.setText("HeroCurrMp = " + currHeroMp);
                FoeCurrMp.setText("FoeCurrMp = " + currFoeMp);
                HeroSkillAttack.setText(tempHero.getSkill().getClass().getSimpleName());
                FoeSkillAttack.setText(tempFoe.getSkill().getClass().getSimpleName());
            }
            else if (!combatName.isSelected()) {
                createHero.setEnabled(true);
                createFoe.setEnabled(true);
                HeroAttack.setEnabled(false);
                FoeAttack.setEnabled(false);
                HeroSkillAttack.setEnabled(false);
                FoeSkillAttack.setEnabled(false);
            }
        });


        CombatPanel.add(HeroAction);
        CombatPanel.add(combatName);
        CombatPanel.add(FoeAction);

        add(CombatPanel, BorderLayout.CENTER);

        //=======================================================================================
        //=================================== Action Listeners ====================================
        //=======================================================================================

        CreateCharacter charac = new CreateCharacter();

        createHero.addActionListener((ActionEvent e) -> {
            createHero(armorsObj, rightHandsObj, leftHandsObj, skillsObj, CharacStr, CharacDex, CharacVit, CharacEne, comboRightHand, comboLeftHand, comboArmor, comboSkill, comboCharacter, heroName, heroStrength, heroDexterity, heroVitality, heroEnergy, heroHealthPoints, heroManaPoints, heroDmg, heroDefence, heroAccuracy, heroRightHand, heroLeftHand, heroArmor, heroSkill, charac);
            currHeroHp = getTempHero().getCurrHealthPoints();
            currHeroMp = getTempHero().getCurrManaPoints();
        });

        createFoe.addActionListener((ActionEvent e) -> {
            createFoe(armorsObj, rightHandsObj, leftHandsObj, skillsObj, CharacStr, CharacDex, CharacVit, CharacEne, comboRightHand, comboLeftHand, comboArmor, comboSkill, comboCharacter, foeName, foeStrength, foeDexterity, foeVitality, foeEnergy, foeHealthPoints, foeManaPoints, foeDmg, foeDefence, foeAccuracy, foeRightHand, foeLeftHand, foeArmor, foeSkill, charac);
            currFoeHp = getTempFoe().getCurrHealthPoints();
            currFoeMp = getTempFoe().getCurrManaPoints();
        });




    }

    private void FoeAttack(JLabel heroCurrHp, JLabel logName) {
        int random = (int)(Math.random() * 100);
        if (getTempFoe().getAccuracy() >= random) {
            int damageDealt = getTempFoe().attack(getTempHero());
            currHeroHp -= damageDealt;
            logName.setText("                          Przeciwnik zadał Ci "+ damageDealt + "Ptk obrażeń");
            heroCurrHp.setText("HeroCurrHp = " + currHeroHp);
            if (currHeroHp <= 0) JOptionPane.showMessageDialog(null, "Zostałeś pokonany");
        }
        else logName.setText("                          spudłowałeś");
    }

    private void HeroAttack(JLabel foeCurrHp, JLabel logName) {
        int random = (int)(Math.random() * 100);
        if (getTempHero().getAccuracy() >= random) {
            int damageDealt = getTempHero().attack(getTempFoe());
            currFoeHp -= damageDealt;
            logName.setText("                          Zadałeś "+ damageDealt + "Ptk obrażeń przeciwnikowi");
            foeCurrHp.setText("FoeCurrHp = " + currFoeHp);
            if (currFoeHp <= 0) JOptionPane.showMessageDialog(null, "Zabiłeś przeciwnika");
        }
        else logName.setText("                          spudłowałeś");
    }

    private void setTempItems(ArrayList<Armor> armorsObj, ArrayList<RightHand> rightHandsObj, ArrayList<SecondHand> leftHandsObj, ArrayList<Skill> skillsObj, JComboBox comboRightHand, JComboBox comboLeftHand, JComboBox comboArmor, JComboBox comboSkill) {
        for (RightHand a : rightHandsObj)
            if (comboRightHand.getSelectedItem().equals(a.getClass().getSimpleName()))
                setTempRightHand(a);
        for (SecondHand a : leftHandsObj)
            if (comboLeftHand.getSelectedItem().equals(a.getClass().getSimpleName()))
                setTempSecondHand(a);
        for (Armor a : armorsObj)
            if (comboArmor.getSelectedItem().equals(a.getClass().getSimpleName()))
                setTempArmor(a);
        for (Skill a : skillsObj)
            if (comboSkill.getSelectedItem().equals(a.getClass().getSimpleName()))
                setTempSkill(a);
    }

    private void createHero(ArrayList<Armor> armorsObj, ArrayList<RightHand> rightHandsObj, ArrayList<SecondHand> leftHandsObj, ArrayList<Skill> skillsObj, JTextField characStr, JTextField characDex, JTextField characVit, JTextField characEne, JComboBox comboRightHand, JComboBox comboLeftHand, JComboBox comboArmor, JComboBox comboSkill, JComboBox comboCharacter, JLabel heroName, JLabel heroStrength, JLabel heroDexterity, JLabel heroVitality, JLabel heroEnergy, JLabel heroHealthPoints, JLabel heroManaPoints, JLabel heroDmg, JLabel heroDefence, JLabel heroAccuracy, JLabel heroRightHand, JLabel heroLeftHand, JLabel heroArmor, JLabel heroSkill, CreateCharacter charac) {
        setTempItems(armorsObj, rightHandsObj, leftHandsObj, skillsObj, comboRightHand, comboLeftHand, comboArmor, comboSkill);

        String heroType = (String) comboCharacter.getSelectedItem();
        setTempHero(charac.createCharacter(heroType,Integer.parseInt(characStr.getText()),Integer.parseInt(characDex.getText()),Integer.parseInt(characVit.getText()),Integer.parseInt(characEne.getText())
        ,getTempRightHand(),getTempSecondHand(), getTempArmor(),getTempSkill()));
        getTempHero().generateBasicStats();
        heroName.setText(getTempHero().getClass().getSimpleName());
        heroStrength.setText("Siła                   " + String.valueOf(getTempHero().getStrength()));
        heroDexterity.setText("Zręczność      " + String.valueOf(getTempHero().getDexterity()));
        heroVitality.setText("Witalność       " + String.valueOf(getTempHero().getVitality()));
        heroEnergy.setText("Energia             " + String.valueOf(getTempHero().getEnergy()));
        heroHealthPoints.setText("P.życia            " + String.valueOf(getTempHero().getHealthPoints()));
        heroManaPoints.setText("Mana               " + String.valueOf(getTempHero().getManaPoints()));
        heroDmg.setText("Obrażenia       " + String.valueOf(getTempHero().getMinDmg() + " - " + String.valueOf(getTempHero().getMaxDmg())));
        heroDefence.setText("Obrona             " + String.valueOf(getTempHero().getDefence()));
        heroAccuracy.setText("Celność            " + String.valueOf(getTempHero().getAccuracy()));
        heroRightHand.setText("Prawa Ręka    " + getTempHero().getRightHand().getClass().getSimpleName());
        heroLeftHand.setText("Lewa Ręka     " + getTempHero().getSecondHand().getClass().getSimpleName());
        heroArmor.setText("Pancerz           " + getTempHero().getArmor().getClass().getSimpleName());
        heroSkill.setText("Umiejętność   " + getTempHero().getSkill().getClass().getSimpleName());
    }

    private void createFoe(ArrayList<Armor> armorsObj, ArrayList<RightHand> rightHandsObj, ArrayList<SecondHand> leftHandsObj, ArrayList<Skill> skillsObj, JTextField characStr, JTextField characDex, JTextField characVit, JTextField characEne, JComboBox comboRightHand, JComboBox comboLeftHand, JComboBox comboArmor, JComboBox comboSkill, JComboBox comboCharacter, JLabel foeName, JLabel foeStrength, JLabel foeDexterity, JLabel foeVitality, JLabel foeEnergy, JLabel foeHealthPoints, JLabel foeManaPoints, JLabel foeDmg, JLabel foeDefence, JLabel foeAccuracy, JLabel foeRightHand, JLabel foeLeftHand, JLabel foeArmor, JLabel foeSkill, CreateCharacter charac) {
        setTempItems(armorsObj, rightHandsObj, leftHandsObj, skillsObj, comboRightHand, comboLeftHand, comboArmor, comboSkill);

        String foeType = (String) comboCharacter.getSelectedItem();
        setTempFoe(charac.createCharacter(foeType,Integer.parseInt(characStr.getText()),Integer.parseInt(characDex.getText()),Integer.parseInt(characVit.getText()),Integer.parseInt(characEne.getText())
                ,getTempRightHand(),getTempSecondHand(), getTempArmor(),getTempSkill()));
        getTempFoe().generateBasicStats();
        foeName.setText(getTempFoe().getClass().getSimpleName());
        foeStrength.setText("Siła                   " + String.valueOf(getTempFoe().getStrength()));
        foeDexterity.setText("Zręczność      " + String.valueOf(getTempFoe().getDexterity()));
        foeVitality.setText("Witalność       " + String.valueOf(getTempFoe().getVitality()));
        foeEnergy.setText("Energia             " + String.valueOf(getTempFoe().getEnergy()));
        foeHealthPoints.setText("P.życia            " + String.valueOf(getTempFoe().getHealthPoints()));
        foeManaPoints.setText("Mana               " + String.valueOf(getTempFoe().getManaPoints()));
        foeDmg.setText("Obrażenia       " + String.valueOf(getTempFoe().getMinDmg() + " - " + String.valueOf(getTempFoe().getMaxDmg())));
        foeDefence.setText("Obrona             " + String.valueOf(getTempFoe().getDefence()));
        foeAccuracy.setText("Celność            " + String.valueOf(getTempFoe().getAccuracy()));
        foeRightHand.setText("Prawa Ręka    " + getTempFoe().getRightHand().getClass().getSimpleName());
        foeLeftHand.setText("Lewa Ręka     " + getTempFoe().getSecondHand().getClass().getSimpleName());
        foeArmor.setText("Pancerz           " + getTempFoe().getArmor().getClass().getSimpleName());
        foeSkill.setText("Umiejętność   " + getTempFoe().getSkill().getClass().getSimpleName());
    }

    private Character getTempHero() {
        return tempHero;
    }

    private void setTempHero(Character tempHero) {
        this.tempHero = tempHero;
    }

    private Character getTempFoe() {
        return tempFoe;
    }

    private void setTempFoe(Character tempFoe) {
        this.tempFoe = tempFoe;
    }

    private RightHand getTempRightHand() {
        return tempRightHand;
    }

    private void setTempRightHand(RightHand tempRightHand) {
        this.tempRightHand = tempRightHand;
    }

    private SecondHand getTempSecondHand() {
        return tempSecondHand;
    }

    private void setTempSecondHand(SecondHand tempSecondHand) {
        this.tempSecondHand = tempSecondHand;
    }

    private Armor getTempArmor() {
        return tempArmor;
    }

    private void setTempArmor(Armor tempArmor) {
        this.tempArmor = tempArmor;
    }

    private Skill getTempSkill() {
        return tempSkill;
    }

    private void setTempSkill(Skill tempSkill) {
        this.tempSkill = tempSkill;
    }
}
