public class StrengthManager {

    void checkStrength(String password) {

        if (password.length() >= 12) {
            System.out.println("Strength: Strong");
        }
        else if (password.length() >= 8) {
            System.out.println("Strength: Medium");
        }
        else {
            System.out.println("Strength: Weak");
        }
    }

    void checkStrength(String password, int minimum) {

        if (password.length() >= minimum) {
            System.out.println("Password meets minimum length.");
        }
        else {
            System.out.println("Password is too short.");
        }
    }
}