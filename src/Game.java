import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Game {
    private final String name = "FORCA";
    private String word;
    private int lives;
    private String wholeWord; // palavra inteira
    private String lettersUsed;
    private char letterIn;

    private int gibbet;

    public Game() {
        //this.word = new Words().toString();
        Words words;
        words = Words.getInstance();

        this.word =  words.toString();
        this.lives = 6;
        lettersUsed = "";
    }

    public String getName() {
        return name;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public String getWholeWord() {
        return wholeWord;
    }

    public void setWholeWord(String wholeWord) {
        this.wholeWord = wholeWord;
    }

    public String getLettersUsed() {
        return lettersUsed;
    }

    public void setLettersUsed(String lettersUsed) {
        this.lettersUsed = lettersUsed;
    }

    public char getLetterIn() {
        return letterIn;
    }

    public void setLetterIn(char letterIn) {
        this.letterIn = letterIn;
    }

    public int getGibbet() {
        return gibbet;
    }

    public void setGibbet(int gibbet) {
        this.gibbet = gibbet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        Game game = (Game) o;
        return getLives() == game.getLives() && getLetterIn() == game.getLetterIn() && getGibbet() == game.getGibbet() && Objects.equals(getName(), game.getName()) && Objects.equals(getWord(), game.getWord()) && Objects.equals(getWholeWord(), game.getWholeWord()) && Objects.equals(getLettersUsed(), game.getLettersUsed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWord(), getLives(), getWholeWord(), getLettersUsed(), getLetterIn(), getGibbet());
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", word='" + word + '\'' +
                ", lives=" + lives +
                ", wholeWord='" + wholeWord + '\'' +
                ", lettersUsed='" + lettersUsed + '\'' +
                ", letterIn=" + letterIn +
                ", gibbet=" + gibbet +
                '}';
    }

    public void newGame(Player player) {
        int aux = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("PLAYER: " + player.getName().toUpperCase());
        System.out.println("============================");
        System.out.println("    ** Iniciar um jogo? ** ");
        System.out.println("        [1- SIM ] ");
        System.out.println("        [2- NÃO ] ");
        System.out.println("============================");
        try {
            aux = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("    [Favor selecione 1 ou 2]");
            newGame(player);
        }
        if (aux == 1) {
            run();
        }
        if (aux == 2){
            System.out.println("    [OK Até mais!!]");
            System.exit(0);
        }
    }

    /**
     * BIEMVIDO AO JOGO DA FORCA
     */
    public void welcome(){
        System.out.println("\n#####################################################################");
        System.out.println("#               BIEMVIDO AO JOGO DA FORCA                           #");
        System.out.println("#####################################################################\n");
    }

    /**
     * Switch case desenho forca
     * @param op operação do status do desenho
     */
    public void forca(int op){
        switch (op){
            case 1:
                System.out.println("          \n" +
                        "===========|*|       \n" +
                        "||         |*|       \n" +
                        "||         (x,x)      \n" +
                        "||       --------     \n" +
                        "||          /|\\     \n" +
                        "||          / \\     \n" +
                        "---------------------\n" +
                        "####  ENFORCADO  ####\n");
                System.out.println(" Continue trinando! ");
                return;

            case 2:
                System.out.println("          \n" +
                        "===========|*|       \n" +
                        "||         |*|       \n" +
                        "||                   \n" +
                        "||        ('',)      \n" +
                        "||         /|\\      \n" +
                        "||         / \\      \n" +
                        "---------------------\n");
                break;
            case 3:
                System.out.println("          \n" +
                        "===========|*|       \n" +
                        "||         |*|       \n" +
                        "||                   \n" +
                        "||        ('',)      \n" +
                        "||         /|\\      \n" +
                        "||         /         \n" +
                        "---------------------\n");
                break;

            case 4:
                System.out.println("          \n" +
                        "===========|*|       \n" +
                        "||         |*|       \n" +
                        "||                   \n" +
                        "||        ('',)      \n" +
                        "||         /|\\      \n" +
                        "||                   \n" +
                        "---------------------\n");
                break;

            case 5:
                System.out.println("          \n" +
                        "===========|*|       \n" +
                        "||         |*|       \n" +
                        "||                   \n" +
                        "||        ('',)      \n" +
                        "||         /|       \n" +
                        "||                   \n" +
                        "---------------------\n");
                break;


            case 6:
                System.out.println("          \n" +
                        "===========|*|       \n" +
                        "||         |*|       \n" +
                        "||                   \n" +
                        "||        ('',)      \n" +
                        "||          |        \n" +
                        "||                   \n" +
                        "---------------------\n");
                break;


            case 7:
                System.out.println("          \n" +
                        "===========|*|       \n" +
                        "||         |*|       \n" +
                        "||                   \n" +
                        "||        ('',)      \n" +
                        "||                   \n" +
                        "||                   \n" +
                        "||                   \n" +
                        "---------------------\n");
                break;

            case 8:
                System.out.println("          \n" +
                        "===========|*|       \n" +
                        "||         |*|       \n" +
                        "||                   \n" +
                        "||                   \n" +
                        "||                   \n" +
                        "||                   \n" +
                        "||                   \n" +
                        "---------------------\n");
                break;

        }

    }

    /**
     * Verifica se a letra digitada existe na palavra
     * @param word palavra a ser acertada
     * @param letter letra digitada pelo usuário
     * @return caso letra exista retorna true, caso contrário false
     */
    public boolean varification(String word, char letter){
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == letter){
                return true;
            }
        }
        return false;
    }


    /**
     * Pede uma letra ao usário
     * @return letra digitada pelo usuário
     */
    public char inChar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("* Digite uma letra: * ");
        char value = scanner.next().charAt(0);
        return Character.toUpperCase(value);
    }

    /**
     *  Verifica se ganha ou perde
     * @param victory letras acertadas
     * @param lives vidas restantes
     * @param word palavra a ser acertada
     * @return se ganha ou perde retorna true, se não false
     */
    public boolean resume(int victory, int lives, String word){
        if (lives == 0){
            System.out.println("\n[PERDEU!!]");
            forca(1);
            System.out.println("** A palavra era:  [" + word + "] **");
            return true;
        }
        if (victory == word.length()){
            System.out.println("\n  [VENCEU!!!]");
            System.out.println("  [PARABÉNS]");
            return true;
        }
        return false;
    }

    public void wineer(){
        System.out.println("\n  [VENCEU!!!]");
        System.out.println("  [PARABÉNS]  ");

    }
    public void endGame() {
        int aux = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println("============================");
        System.out.println("  ** Deseja jogar novamente? **");
        System.out.println("    [1- Sim ]");
        System.out.println("    [2- Terminar jogo] ");
        System.out.println("============================");
        try {
            aux = sc.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Favor selecione 1 ou 2.");
            endGame();
        }
        if (aux == 1) {
            setLives(6);
            setGibbet(8);
            setLettersUsed("");
            run();
        }
        if (aux == 2) {
            System.out.println("    [OK Até a próxima!!] ");
            System.exit(0);
        }
    }

    /**
     * Roda o jogo da forca
     */
    public void run(){
        String word;
        ArrayList  wordAux = new ArrayList<>();
        gibbet = 8;

        int victory = 0;
        //Words words = new Words();
        Words words;
        words = Words.getInstance();

        // abre o arquivo texto
        words.readFile();

        // atribui a wors uma palavra aleatória randomica
        word = words.randomWord();

        // Mensagem de bemvindo
        welcome();

        // imprime forca
        forca(gibbet);

        // imprime taçinhos da palavra random length
        System.out.println("* [Palavra a ser adivinhada: ] * " );
        for (int i = 0; i < word.length(); i++){
            wordAux.add("_");
            System.out.print("_");
        }

        do{
            System.out.println();
            System.out.println("\n* Vidas: * \n" + (lives));

            System.out.println();
            System.out.println("* Letras usadas: "+ lettersUsed.length() + " * \n [" + lettersUsed + "]");

            // Digita palavra toda
            wholeWord = inString();
            if (word.equals(wholeWord)){
                wineer();
                endGame();
            }else{
                //System.out.println("Errou! a palavra não era essa, continue tentando.");
                lives--;
                gibbet--;
            }

            // invoca inChar() que retorna un char input do usuário
            letterIn = inChar();

            // Verifica se a letra eiste na palavra
            if (varification(word,letterIn)){
                for (int i = 0; i < word.length(); i++){
                    if (word.charAt(i) == letterIn){
                        wordAux.set(i,letterIn);
                        victory++;
                    }
                }
            }else{
                // Verifica se a letra não existe na palavra decrementa vidas, desenha prox na forca e
                // adiciona a letra a letras usadas
                lives--;
                gibbet--;
                lettersUsed += letterIn;
            }

            // Imprime a forca 'boneco'
            forca(gibbet);

            // Imprime a palavra em tracinhos e letras se acertadas
            System.out.print(wordAux);
            System.out.println("\n********************************************************");

        }while (!resume(victory,getLives(), word));

        // Menú final/ recomeço
        endGame();
    }

    public String inString(){
        int aux = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================================");
        System.out.println("  ** Deseja tentar a palavra? **");
        System.out.println("        [1- SIM ] ");
        System.out.println("        [2- NÃO ] ");
        System.out.println("========================================================");
        try {
            aux = sc.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("[Favor selecione 1 ou outro.]");
        }
        if (aux == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("* [Digite uma palavra:] * ");
            String value = scanner.next();
            return value.toUpperCase();
        }
        if (aux == 2){
            lives++;
            gibbet++;
        }
        return "";
    }
}
