import java.util.Scanner;

public class Facade {

    public Facade() {}

    public Game game = new Game();

    public void facadeForca(){

        Scanner input = new Scanner(System.in);
        System.out.println("Escolha um número inteiro para opções de teste Facade classe Game ");
        System.out.println();
        System.out.println(" 1 - Imprime opções públicas aleatórias. ");
        System.out.println(" 2 - game.welcome(); ");
        System.out.println(" 3 - game.forca(8); ");
        System.out.println(" 4 - game.run(); ");
        System.out.println(" 5 - game.newGame(p); ");
        System.out.println(" 6 - game.wineer(); ");
        System.out.println(" 7 - game.endGame(); ");
        System.out.println(" 99 - EXIT ");


        int number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println(" 1 - Imprime opções públicas aleatórias.");

                System.out.println(" - getName " + game.getName());
                System.out.println(" - getLives " + game.getLives());
                System.out.println(" - getGibbet " + game.getGibbet());
                System.out.println(" - getWord length " + game.getWord().length());
                System.out.println(" - getLettersUsed " + game.getLettersUsed());
                System.out.println(" - getLetterIn " + game.getLetterIn());
                System.out.println(" - getWholeWord " + game.getWholeWord());
                System.out.println(" - getLetterIn " );
                break;

            case 2:
                System.out.println(" 2 - game.welcome(); ");
                game.welcome();
                break;

            case 3:
                System.out.println(" 3 - game.forca(8);\n");
                game.forca(8);
                break;

            case 4:
                System.out.println(" 4 - game.run(); ");
                game.run();
                break;

            case 5:
                System.out.println(" 5 - game.newGame(p); ");
                Player p = new Player("test");
                game.newGame(p);
                break;

            case 6:
                System.out.println(" 6 - game.wineer(); ");
                break;

            case 7:
                System.out.println(" 7 - game.endGame(); ");
                game.endGame();
                break;

            case 99:
                System.out.println("EXIT 99 ");
                System.exit(99);
                break;

            default:
                System.out.println("O número escolhido é inválido!.");
        }
    }


    // Teste Facade
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.facadeForca();

    }

}
