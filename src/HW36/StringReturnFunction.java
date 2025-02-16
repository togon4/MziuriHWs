package HW36;
import java.util.function.Function;

class StringReturnFunction implements Function<String, String> {
    @Override
    public String apply(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}


