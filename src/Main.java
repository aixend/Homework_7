public class Main {
    public static void main(String[] args) {
        HavingSuperAbility heroes[] = { new Magic(),new Warrior(),new Medic()};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
        }




        //дз на сообразительность
        Medic medic = new Medic();
        Magic magic = new Magic();
        Warrior warrior = new Warrior();
        Hero[] allheroes = new Hero[]{ medic,magic,warrior};
        for (int i = 0; i < allheroes.length; i++) {
            System.out.println(medic.increaseExperience() + " " + allheroes[i]);

        }

    }
}