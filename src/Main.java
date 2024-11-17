public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(500);
        boss.setDefence("physical");
        System.out.println("boss information: ");
        System.out.println("boss health: " + boss.getHealth() + ", boss damage:" + boss.getDamage() + ", boss defence:" + boss.getDefence());

        System.out.println("heroes information: ");
        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("hero health: " + hero.getHealth() + ", hero damage:" + hero.getDamage() + ", hero super ability: " + hero.getSuperAbility());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(900, 200, "magical");
        Hero hero2 = new Hero(800, 100);
        Hero hero3 = new Hero(700, 150, "medic");
        return new Hero[]{hero1, hero2, hero3};
    }
}