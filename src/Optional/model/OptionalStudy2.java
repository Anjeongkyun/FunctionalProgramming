package Optional.model;

import java.util.Optional;

public class OptionalStudy2 {
    public static void main(String[] args) {
        Optional<User> maybeUser = Optional.ofNullable(maybeGetUser(true));
        //null이 아니고 값이 있다면 값 표출하라.
        maybeUser.ifPresent(user -> System.out.println(user));
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
