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

        String someEmail = "jkan@naver.com";
        String nullEmail = null;

        Optional<String> maybeEmail = Optional.of(someEmail);
        Optional<String> maybeEmail2 = Optional.empty();
        Optional<String> maybeEmail3 = Optional.ofNullable(someEmail);
        Optional<String> maybeEmail4 = Optional.ofNullable(nullEmail);

        System.out.println(maybeEmail);
        System.out.println(maybeEmail2);
        System.out.println(maybeEmail3);
        System.out.println(maybeEmail4);

        String email = maybeEmail.get();
        System.out.println(email);

        if(maybeEmail2.isPresent()){
            System.out.println(maybeEmail2.get());
        }

        String defaultEmail= "default@email.com";
        String email3 = maybeEmail2.orElse(defaultEmail);
        String email4 = maybeEmail2.orElseGet(() -> defaultEmail);
        String email5 = maybeEmail.orElseThrow(() -> new RuntimeException("email not present"));


    }

    public static boolean userEquals(User u1, User u2) {
        return u1.getId() == u2.getId()
                    && u1.getName().equals(u2.getName())
                    && u1.getEmailAddress().equals(u2.getEmailAddress())
                    && u1.isVerified() == u2.isVerified();
    }


}
