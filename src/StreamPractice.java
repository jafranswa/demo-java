import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {
    // Function to get Stream of String[]
    private static Stream<String[]> getMapStream()
    {
        return Stream.of(new String[][] {
                {"CAR", "Audi"},
                {"BIKE", "Harley Davidson"}
        });
    }

    // Program to convert Stream to a Map in Java 8
    public static void main(String args[])
    {
        // get stream of String[]
        Stream<String[]> stream = getMapStream();

        // construct a new map from the stream
        Map<String, String> vehicle =
                stream.collect(Collectors.toMap(e -> e[0], e -> e[1]));

        System.out.println(vehicle);
    }
}
