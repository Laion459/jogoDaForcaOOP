import java.util.Objects;
import java.util.Random;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return Objects.equals(getName(), player.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }

    // Metodos Públicos

    // Cria um novo jogo
    public void callGame(){
        Game game = new Game();
        game.newGame(this);
    }

    // chuta letras aleatórias
    public char randomLetters(){
        Random random = new Random();
        char[] charsRandom = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T'};
        return charsRandom[random.nextInt(charsRandom.length)];
    }
}
