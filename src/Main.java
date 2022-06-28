public class Main {
    public static void main(String[] args) {

        System.out.println("##################################################################################");
        System.out.println("#   - UNIVERSIDADE DO VALE DO ITAJAÍ UNIVALI - KOBRASOL 28/06/2022       ");
        System.out.println("#   - PROFESSORA:       FERNANDA DOS DSNTOS CUNHA                   ");
        System.out.println("#   - BACHARELADO:      CIÊNCIA DA COMPUTAÇÃO PROGRAMAÇÃO ORIENTADA A OBJETOS ");
        System.out.println("#   - MATERIA:          PROGRAMAÇÃO ORIENTADA A OBJETOS ");
        System.out.println("#   - ALUNOS:           LEONARDO DARIO BORGES ");
        System.out.println("##################################################################################");
        System.out.println();

        Player player = new Player("Leonardo");
        Game game = new Game();
        System.out.println();
        player.callGame();

    }
}
