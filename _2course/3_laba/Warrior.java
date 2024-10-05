class Warrior extends Player {

    public Warrior(String name) {
        super(name, 100, 20, 10, 0, 0);
    }

    public void attack(Player target) {
        if (isAlive) {
            System.out.println(name + " атакует " + target.name);
            target.decreaseHealth(attackPower);
        }
    }
}
