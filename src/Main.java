public class Main {
    public static void main(String[] args) {
        HavingSuperAbility heroes[] = { new Magic(),new Warrior(),new Medic(50)};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            if (HavingSuperAbility[i] instanceof  Medic){
                System.out.println(((Medic) HavingSuperAbility[i]).getHealPoints());
                ((Medic)HavingSuperAbility[i]).increaseExperience();
                System.out.println(((Medic) HavingSuperAbility[i]).getHealPoints());
            }
        }
        }




        //дз на сообразительность

        }

    }
