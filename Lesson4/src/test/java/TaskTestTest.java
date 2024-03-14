import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTestTest {

    @Test
    void sum() {
        Assertions.assertEquals(5, TaskTest.Sum(2, 3));
    }
}