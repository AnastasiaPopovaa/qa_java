import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());

    }

    @Test
    public void getKittensTest(){
        assertEquals(1, feline.getKittens());
    }


    @Test
    public void getFoodTest() throws Exception{

            assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());

    }


}
