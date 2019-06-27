import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:/Users/rtaj/Desktop/stats.csv");
        List<Player> playerList = new ArrayList<>();
        Methods.addPlayer(playerList);
        Methods.sortAndWrite(file, playerList);
    }
}
