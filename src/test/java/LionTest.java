import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    @Test

    public void getFoodTest() throws Exception{
        List<String> expectFood = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion ("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectFood);
        assertEquals(expectFood, lion.getFood());
    }

    @Test
    public void getKittensTest() throws Exception{
        Lion lion = new Lion ("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1,  lion.getKittens());
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
