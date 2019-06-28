import java.util.Objects;

public class Player implements Comparable<Player> {
    private String name;
    private String surname;
    private int result;

    @Override
    public String toString() {
        return name + " " + surname + ";" + result;
    }

    public Player(String name, String surname, int result) {
        this.name = name;
        this.surname = surname;
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return result == player.result &&
                name.equals(player.name) &&
                surname.equals(player.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, result);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public int compareTo(Player o) {
        if (this.result > o.result)
            return 1;
        else if (this.result < o.result)
            return -1;
        else return 0;
    }
}
