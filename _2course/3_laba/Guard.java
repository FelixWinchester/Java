class WarriorGuard extends Warrior {
    private int additionalDefense = 10;

    public WarriorGuard(String name) {
        super(name);
        this.defense += additionalDefense;  // Дополнительная защита
    }

    @Override
    public void decreaseHealth(int value) {
        System.out.println(name + " имеет дополнительную защиту: " + additionalDefense);
        super.decreaseHealth(value);
    }
}
