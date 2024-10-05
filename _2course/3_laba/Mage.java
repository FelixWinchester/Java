class Mage extends Player {

    public Mage(String name) {
        super(name, 80, 15, 5, 0, 0);
    }

    public void castSpell(Player target) {
        if (isAlive) {
            System.out.println(name + " кастует заклинание на " + target.name);
            target.decreaseHealth(attackPower);
        }
    }
}
