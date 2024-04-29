package classwork23.sentence_test;

public class Sentence {
    // count words
    public int countWords(String str){
       String[] words = str.split(" ");
       return words.length;
    }

    // count symbols
    public int countSymbols(String str){
        String[] symbols = str.split("");
        return symbols.length;
    }

}
