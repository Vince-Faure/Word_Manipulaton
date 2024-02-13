import java.util.Scanner;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    public static String addWord(){
        System.out.println("Inserez un mot");
        Scanner inputWord = new Scanner(System.in);
        String newWord=inputWord.nextLine();
        Word addWord = new Word(newWord);
        String finalWord = addWord.getWord();
        return finalWord;

    }

}
