package classwork23.sentence_test;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
//import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {
    private Sentence sentence;

    @BeforeEach
    public void setUp(){
        System.out.println("setUp start");
       this.sentence = new Sentence();
        System.out.println("setUp end");
    }
    @Test
    public void testCountWords() {
        Sentence sentence = new Sentence();
        int countAnimalInSentence = sentence.countWords("cat dog cat dog");
        Assertions.assertEquals(4, countAnimalInSentence);
    }

    @Test
    public void testCountSymbols() {
        Sentence sentence = new Sentence();
        int countAnimalSymbols = sentence.countSymbols("cat dog cat dog");
        Assertions.assertEquals(15, countAnimalSymbols);

    }

  /*  Sentence sentence;

    @BeforeEach // перед каждым
    void setUp() {
        sentence = new Sentence();
    }

    @Test
    void countWords() {
        String str = "One, two, three, four";
        assertEquals(4,sentence.countWords(str));
    }

    @Test
    void countSymbols() {
        String str = "One? Two. Three";
        assertEquals(15, sentence.countSymbols(str));
    } */
}