import java.util.ArrayList;

public class PointSystem {

    ArrayList<Integer> pointsPerRound;
    int totalPoints;

    public PointSystem() {
        this.pointsPerRound = new ArrayList<>();
        this.totalPoints = 0;
    }

    public void calculatePoints(StrategyGuide s) {
        for (int i = 0; i < s.getOpponentStrategy().size(); i++) {
            String outcome = play(s,i);
            int points = 0;
            switch (outcome) {
                case "AZ" -> {
                    points = 3;
                    System.out.println("He played Rock, you played Scissors. You score "+points+" points.");
                }
                case "AY" -> {
                    points = 8;
                    System.out.println("He played Rock, you played Paper. You score "+points+" points.");
                }
                case "AX" -> {
                    points = 4;
                    System.out.println("He played Rock, you played Rock. You score "+points+" points.");
                }
                case "BZ" -> {
                    points = 9;
                    System.out.println("He played Paper, you played Scissors. You score "+points+" points.");
                }
                case "BY" -> {
                    points = 5;
                    System.out.println("He played Paper, you played Paper. You score "+points+" points.");
                }
                case "BX" -> {
                    points = 1;
                    System.out.println("He played Paper, you played Rock. You score "+points+" points.");
                }
                case "CZ" -> {
                    points = 6;
                    System.out.println("He played Scissors, you played Scissors. You score "+points+" points.");
                }
                case "CY" -> {
                    points = 2;
                    System.out.println("He played Scissors, you played Paper. You score "+points+" points.");
                }
                case "CX" -> {
                    points = 7;
                    System.out.println("He played Scissors, you played Rock. You score "+points+" points.");
                }
            }
            this.pointsPerRound.add(points);
            totalPoints += points;
        }
    }
    public String play(StrategyGuide s, int i) {
        return String.valueOf(s.getOpponentStrategy().get(i)) +
                s.getMyStrategy().get(i);
    }
}
