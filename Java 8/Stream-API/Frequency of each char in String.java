import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    String input = "SmritiSharma";
    Map<String, Long> map =
            Arrays.stream(input.split("")).collect(
                    Collectors.groupingBy(
                            Function.identity(), Collectors.counting()
                    )
            );
}
