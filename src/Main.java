import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<Human>();
//Создаём 24 бигхьюмана и 23 смолхьюмана и незнайку
        for(int i=0; i<23; i++) {
            BigHuman Vova = new BigHuman("Vova");
            SmallHuman Stepa = new SmallHuman("Stepa");
            humanList.add(Vova);
            humanList.add(Stepa);
        }
        BigHuman Vova = new BigHuman("Vova");
        humanList.add(Vova);
        Dunno dunno = new Dunno("dunno");

        humanList.add(dunno);
        dunno.convertDays(dunno.countFood(humanList));
//        System.out.println(dunno);
//        System.out.println(dunno.hashCode());
//        Dunno dunno2 = new Dunno("dunno2");
//        System.out.println(dunno2.hashCode());


    }
}