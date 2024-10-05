class Priest extends Player {

    public Priest(String name) {
        super(name, 70, 5, 3, 0, 0);
    }

    public void heal(Player target) {
        if (isAlive) {
            System.out.println(name + " лечит " + target.name);
            target.increaseHealth(attackPower);
        }
    }
}
