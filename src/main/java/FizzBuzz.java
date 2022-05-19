import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> getNumbers() {
        List<String> numbers = new ArrayList<>();
            for (int i = 1; i < 100; i++) {
                numbers.add("" + i);
            }
        return numbers;
    }
}
