public class UserInfo {

    private String nameofperson;
    private String emailid;

    UserInfo(String nameofperson, String emailid) {
        this.nameofperson = nameofperson;
        this.emailid = emailid;
    }

    void displayUserInfo() {
        System.out.println("Person's Name is: " + nameofperson);
        System.out.println("Person's Email ID is: " + emailid);
    }

    String getName() {
        return nameofperson;
    }
}
