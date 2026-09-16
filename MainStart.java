import java.util.Scanner;

public class MainStart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== PASSWORD SECURITY MANAGER =====");
        System.out.println();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your email ID: ");
        String email = sc.nextLine();

        UserInfo user = new UserInfo(name, email);

        System.out.println();

        user.displayUserInfo();

        System.out.println();

       
        System.out.print("Enter website name: ");
        String website = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        Password p = new StrongPwd(website, password);

        System.out.println();

        p.displayPassword();

        p.displayType();

        System.out.println();

       
        StrengthManager security = new StrengthManager();

        security.checkStrength(p.getPassword());

        security.checkStrength(p.getPassword(), 8);

        System.out.println();

        
        FileSaving file = new FileSaving();

        file.savePassword(p);

        sc.close();
    }
}