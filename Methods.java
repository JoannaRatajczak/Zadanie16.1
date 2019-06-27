import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Methods {


    static void addPlayer(List<Player> playerList) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Podaj wynik kolejnego gracza (lub stop):");
            String name = scanner.nextLine();
            if (name.equals("stop")) {
                break;
            }
            String surname = scanner.nextLine();
            int result = scanner.nextInt();
            Player player = new Player(name, surname, result);
            playerList.add(player);


        } while (!scanner.nextLine().equals("stop"));

        System.out.println("Dane posortowano i zapisano do pliku stats.csv.");
    }

    static void sortAndWrite(File file, List<Player> playerList) throws FileNotFoundException {
        Collections.sort(playerList);
        PrintWriter printWriter = new PrintWriter(file);
        for (int i = 0; i < playerList.size(); i++) {
            printWriter.println(playerList.get(i));
        }
        printWriter.close();
    }

}
