public class Medic extends Hero{
    public int healPoints=50;

    public String increaseExperience(){
        int part = (((10*healPoints)/100)+healPoints);
        return  "healpoints: " + healPoints + " увеличился на 10%: " + part;

    }



    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность Medic Damage");
    }
}
