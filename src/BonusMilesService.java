public class BonusMilesService {
    public int calculate(int cost) {
        int mile = 20;
        int bonus = cost / mile;
        System.out.println("Количество бонусных миль:" + bonus);
        return cost;
    }
}
