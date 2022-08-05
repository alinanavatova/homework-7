package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic(45, 20, "magic");
        Medic medic = new Medic(50, 0, "healing");
        Warrior warrior = new Warrior(40, 30, "fighting");

        Hero[] heroes = {magic, medic, warrior};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility(heroes[i].getSuperAbilityType());
        }
    }
}
