import com.example.Animal;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AnimalTest {

    @Test
    public void testGetFoodHerbivore() throws Exception {
        // Создаем экземпляр Animal
        Animal animal = new Animal();
        // Запрашиваем еду для травоядного животного
        List<String> food = animal.getFood("Травоядное");
        // Проверяем что полученный список еды соответствует ожидаемому
        assertEquals(List.of("Трава", "Различные растения"), food);
    }

    @Test
    public void testGetFoodPredator() throws Exception {
        // Создаем экземпляр Animal
        Animal animal = new Animal();
        // Запрашиваем еду для хищного животного
        List<String> food = animal.getFood("Хищник");
        // Проверяем что полученный список еды соответствует ожидаемому
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void testGetFoodUnknownType() {
        // Создаем экземпляр Animal
        Animal animal = new Animal();
        // Проверяем что при запросе еды для неизвестного типа животного выдается исключение
        Exception exception = assertThrows(Exception.class, () -> {
            animal.getFood("Непонятное животное");
        });
        // Проверяем что сообщение об ошибке соответствует ожидаемому
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }

    @Test
    public void testGetFamily() {
        // Создаем экземпляр Animal
        Animal animal = new Animal();
        // Проверяем что метод getFamily возвращает ожидаемое значение
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}


