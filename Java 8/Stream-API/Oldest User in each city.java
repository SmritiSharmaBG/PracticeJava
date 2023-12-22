import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<User> list = Stream.of(
                new User("User1", "City1", 20),
                new User("User2", "City3", 44),
                new User("User3", "City2", 78),
                new User("User4", "City4", 34),
                new User("User5", "City3", 6),
                new User("User6", "City1", 40),
                new User("User7", "City2", 52),
                new User("User8", "City3", 90)
        ).collect(Collectors.toList());
        // return the oldest user from each city using stream api

        Map<String, Optional<User>> ans = list.stream().collect(
                Collectors.groupingBy(
                        User::getCity,
                        Collectors.reducing(BinaryOperator.maxBy(
                                (user1, user2) -> Integer.compare(user1.getAge(), user2.getAge())
                        ))
                )
        );

        System.out.println(ans);
    }

}
