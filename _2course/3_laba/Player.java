abstract class Player {
    protected String name;
    protected int currentHealth;
    protected int maxHealth;
    protected boolean isAlive;
    protected int posX;
    protected int posY;
    protected int attackPower;
    protected int defense;

    public Player(String name, int maxHealth, int attackPower, int defense, int posX, int posY) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.attackPower = attackPower;
        this.defense = defense;
        this.posX = posX;
        this.posY = posY;
        this.isAlive = true;
    }

    public void increaseHealth(int value) {
        if (isAlive) {
            currentHealth = Math.min(currentHealth + value, maxHealth);
            System.out.println(name + " восстанавливает здоровье на " + value + ". Текущее здоровье: " + currentHealth);
        }
    }

    public void decreaseHealth(int value) {
        if (isAlive) {
            currentHealth -= Math.max(0, value - defense);
            if (currentHealth <= 0) {
                currentHealth = 0;
                isAlive = false;
                System.out.println(name + " умирает.");
            } else {
                System.out.println(name + " получает урон. Текущее здоровье: " + currentHealth);
            }
        }
    }

    public void move(int x, int y) {
        posX = x;
        posY = y;
        System.out.println(name + " перемещается на новую позицию: (" + posX + ", " + posY + ")");
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Здоровье: " + currentHealth + "/" + maxHealth + ", Статус: " + (isAlive ? "Жив" : "Мертв") +
                ", Позиция: (" + posX + ", " + posY + ")";
    }
}
