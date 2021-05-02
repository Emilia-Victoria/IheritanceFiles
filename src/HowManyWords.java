import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HowManyWords {
    public static void main(String[] args) throws FileNotFoundException {
        File teVas = new File("src/TeVas");
        Scanner sc = new Scanner(teVas);
        int numberOfWords = 0;

        while(sc.hasNext()){
            sc.next();
            numberOfWords +=1;
        }

        System.out.println("Number of words: " + numberOfWords);
    }

}