public class EmailValidator {
    public static void main(String[] args) {
        String[] validEmails = {"user@example.com", "root@localhost"};
        String[] invalidEmails = {"myhost@@@com.ru", "@my.ru", "Julia String"};

        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        for (String email : validEmails) {
            System.out.println(email + " is valid? " + email.matches(emailRegex));
        }

        for (String email : invalidEmails) {
            System.out.println(email + " is valid? " + email.matches(emailRegex));
        }
    }
}