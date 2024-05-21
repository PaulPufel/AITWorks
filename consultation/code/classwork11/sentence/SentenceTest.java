package classwork11.sentence;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

// Разработать тесты для методов, которые работают
// с предложением - определение кол-ва слов и кол-ва букв.

public class SentenceTest {

    private Sentence sentence;

    @BeforeEach
    public void setUp() {
        this.sentence = new Sentence();
    }

    @Test
    public void testCountWords() {
        int countAnimalInSentence = this.sentence.countWords("cat dog qwq dkdks");
        Assertions.assertEquals(4, countAnimalInSentence);
    }

    @Test
    public void testCountSymbols() {
        int countAnimalSymbols = this.sentence.countSymbols("cat dog qwq dkdks");
        Assertions.assertEquals(17, countAnimalSymbols);
    }
}