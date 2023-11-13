import java.util.List;
import static java.lang.Integer.min;
public class Dunno extends Human implements AbleToCountFood, AbleToConvertDays {
    private static final int normOfCal = 2000;
    public Dunno(String name) {
        super(name,normOfCal);
    }
    @Override
    public int countFood(List<Human> humanlist) {
        int i = 0;
        double a = 20;
        int minNumberOfDays = (int) Math.pow(a, a);
        for (Food food : Food.values()) {
            int foodSupply = food.getFoodSupply();
            int normOfFoodForAllHumans = 0;
            for (Human human : humanlist) {
                normOfFoodForAllHumans += human.getNormOfFood()[i];
            }
            int numberOfDays = foodSupply / normOfFoodForAllHumans;
            minNumberOfDays = min(numberOfDays, minNumberOfDays);
            i++;
        }
        say(minNumberOfDays);
        return minNumberOfDays;
    }
    @Override
    public int[] convertDays(int days) {
        int years = days / 360;
        int months = days / 30;
        months -= years * 12;
        int[] yearsAndMonths = new int[]{years, months};
        say(yearsAndMonths);
        return yearsAndMonths;
    }
    private  void say(int[] yearsAndMonths) {
        System.out.println("Нам осталось еды на " + yearsAndMonths[0] + " год(а)/лет и " + yearsAndMonths[1] + " месяц(а)(ев)");
    }
    private void say(int days) {
        System.out.println("Нам осталось еды на " + days + " д(ня)(ней)(ень)");
    }
}