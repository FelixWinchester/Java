public class Game2d {

    public static void main(String[] args) {
        WarriorGuard warrior = new WarriorGuard("Ork the Guard");
        Mage mage = new Mage("Gandalf");
        Priest priest = new Priest("Healer");

        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(priest);

        warrior.attack(mage);
        priest.heal(mage);
        mage.castSpell(warrior);

        System.out.println(warrior);
        System.out.println(mage);
        System.out.println(priest);
    }
}
