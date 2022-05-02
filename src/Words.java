import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//import static com.sun.tools.jdeprscan.CSV.split;

public class Words {

    ArrayList <Object> words = new ArrayList<>();

    public String randomWord(){
        Random random = new Random();
        return words.get(random.nextInt(words.size())).toString().toUpperCase();
    }
    public void readFile() {
        String filename = "src/words.txt";
        String row;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while ((row = reader.readLine()) != null) {
                row.split(",");
                //Arrays.stream(data).forEach(System.out::println);
                //System.out.println("-----------------");
                words.add(row);
                //System.out.println(row);
            }
        } catch (FileNotFoundException e) {
            // erro na abertura do arquivo
            System.out.println("+erro na abertura do arquivo+");
        } catch (IOException e) {
            // erro na leitura do arquivo
            System.out.println("*erro na leitura do arquivo*");
        }
    }

    public void readFileII() {
        String filename = "src/words.txt";
        String row;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while ((row = reader.readLine()) != null) {
                String[] data = row.split(",");

                Arrays.stream(data).forEach(System.out::println);

                System.out.println("-----------------");
                words.add(row);
                //System.out.println(row);
            }
        } catch (FileNotFoundException e) {
            // erro na abertura do arquivo
            System.out.println("+erro na abertura do arquivo+");
        } catch (IOException e) {
            // erro na leitura do arquivo
            System.out.println("*erro na leitura do arquivo*");
        }
    }

    public void show(Words words){
        for (int i = 0; i < words.words.size(); i++){
            System.out.println(words.randomWord());
        }
    }

}
