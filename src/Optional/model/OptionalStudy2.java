package Optional.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalStudy2 {
    public static void main(String[] args) {


        Optional<User> maybeUser = Optional.ofNullable(maybeGetUser(true));
        //null이 아니고 값이 있다면 값 표출하라.
//        maybeUser.ifPresent(user -> System.out.println(user));

//        maybeUser가 True면 user에 getId를 넣는다. 아니면 아무것도 안넣는다.
        Optional<Integer> maybeId = Optional.ofNullable(maybeGetUser(true))
                .map(user -> user.getId());

        //두개 같다.
//        maybeId.ifPresent(id -> System.out.println(id));
        maybeId.ifPresent(System.out::println);
    }

    private static User maybeGetUser(boolean returnUser) {

        if(returnUser){
            return new User()
                    .setId(1001)
                    .setName("jkan")
                    .setEmailAddress("dkswjdrbs12@aver.com")
                    .setVerified(false);
        }
        return null;
    }

}
