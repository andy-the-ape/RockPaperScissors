import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StrategyGuide {
    private File file;
    private ArrayList<Character> opponentStrategy;
    private ArrayList<Character> myStrategy;

    public StrategyGuide(String filepath) {
        this.file = new File(filepath);
        opponentStrategy = new ArrayList<>();
        myStrategy = new ArrayList<>();
        translateStrategyGuide();
    }

    public void translateStrategyGuide() {
        try {
            FileReader fr = new FileReader(this.file);
            Scanner sc = new Scanner(fr);
            ArrayList<String> strings = new ArrayList<>();
            while (sc.hasNextLine()) {
                strings.add(sc.nextLine());
            }
            sc.close();
            fr.close();
            for (String s : strings) {
                opponentStrategy.add(s.charAt(0));
                myStrategy.add(s.charAt(2));
            }
        }
        catch (IOException e) {
            System.out.println("IOException caught.");
        }
    }

    public ArrayList<Character> getOpponentStrategy() {
        return opponentStrategy;
    }

    public ArrayList<Character> getMyStrategy() {
        return myStrategy;
    }
}
