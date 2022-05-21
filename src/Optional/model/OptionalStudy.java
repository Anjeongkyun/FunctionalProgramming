package Optional.model;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalStudy {
    public static void main(String[] args) {
        User user1 = new User()
                .setId(1001)
                .setName("jkan")
                .setVerified(false);

        User user2 = new User()
                .setId(1001)
                .setName("jkan")
                .setEmailAddress("dkswjdrbs12@naver.com")
                .setVerified(false);

//        System.out.println("same ? " + userEquals(user1, user2));

        String someEmail = "dkswjdrbs12@naver.com";
        String nullEmail = null;

        Optional<String> maybeEmail = Optional.of(someEmail);
        Optional<String> maybeEmail2 = Optional.empty();
        Optional<String> maybeEmail3 = Optional.ofNullable(someEmail);
        Optional<String> maybeEmail4 = Optional.ofNullable(nullEmail);

        String email = maybeEmail.get();
        System.out.println(email);

        if(maybeEmail.isPresent()){
            System.out.println(maybeEmail.get());
        }

        String defaultEmail= "default@email.com";
        String email3 = maybeEmail2.orElse(defaultEmail);
        String email4 = maybeEmail2.orElseGet(() -> defaultEmail);
        String email5 = maybeEmail2.orElseThrow(() -> new RuntimeException("email not present"));

        System.out.println(email3);
        System.out.println(email4);
        System.out.println(email5);


    }

    public static boolean userEquals(User u1, User u2) {
        return u1.getId() == u2.getId()
                    && u1.getName().equals(u2.getName())
                    && u1.getEmailAddress().equals(u2.getEmailAddress())
                    && u1.isVerified() == u2.isVerified();
    }


}
