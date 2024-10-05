class Race {
    private int bonusDefense;
    private int bonusAttack;

    public Race(int bonusDefense, int bonusAttack) {
        this.bonusDefense = bonusDefense;
        this.bonusAttack = bonusAttack;
    }

    public int getBonusDefense() {
        return bonusDefense;
    }

    public int getBonusAttack() {
        return bonusAttack;
    }
}

class PlayerWithRace extends Player {
    private Race race;

    public PlayerWithRace(String name, int maxHealth, int attackPower, int defense, int posX, int posY, Race race) {
        super(name, maxHealth, attackPower, defense, posX, posY);
        this.race = race;
        this.defense += race.getBonusDefense();
        this.attackPower += race.getBonusAttack();
    }
}
