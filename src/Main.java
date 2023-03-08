public class Main {
    public static void main(String[] args) {
        StrategyGuide s = new StrategyGuide("strategyguide.txt");
        PointSystem p = new PointSystem();

        p.calculatePoints(s);

        System.out.println("\nYou scored a total of "+p.totalPoints+" points.");
        // Testing it works:
//        System.out.println(s.getOpponentStrategy().get(3));
//        System.out.println(s.getMyStrategy().get(3));



    }
}
