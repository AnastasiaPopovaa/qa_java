import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class LionParamTest {
    Feline feline = new Feline();

    //Lion lion = new Lion(feline);
    private final String sex;
    private final boolean hasMane;

    public LionParamTest(String sex, Boolean hasMane) throws Exception {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getManeParam() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveNameTest(){

        Lion lion = Mockito.mock(Lion.class);
        Mockito.when(lion.doesHaveMane()).thenReturn(hasMane);
        assertEquals(hasMane, lion.doesHaveMane());
    }
    @Test
    public void getSexNo(){
        Exception exception = assertThrows(Exception.class, () -> {
        Lion lion = new Lion("кто-то", feline);
        lion.doesHaveMane();

        });
    assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }



    }
