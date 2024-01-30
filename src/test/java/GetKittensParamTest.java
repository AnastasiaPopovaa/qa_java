import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)


public class GetKittensParamTest {
    private final int numOfKittens;
    private final int expected;

    public GetKittensParamTest(int numOfKittens, int expected){
        this.numOfKittens = numOfKittens;
        this.expected = expected;

    }

    @Parameterized.Parameters

    public static Object[][] paramData(){
        return new Object[][]{
                {3, 3},
                {5, 5},
                {99, 99}
        };
    }

    @Test
    public void getKittensParamTest(){
        Feline feline = new Feline();
        assertEquals(expected, feline.getKittens(numOfKittens));
    }
}
