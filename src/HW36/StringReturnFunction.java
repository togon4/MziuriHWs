package HW36;
import java.util.function.Function;

public class StringReturnFunction implements Function<String, String> {
    @Override
    public String apply(String input) {
        return input;
    }
}

