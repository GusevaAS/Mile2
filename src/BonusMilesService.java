public class BonusMilesService {
    public int calculate(int price) {
        int mile = 20;
        int cost = price / mile;
        return cost;
    }
}
