// authenticating interface
interface CheckingPwd {
    boolean check(String pwd);
}
//here pwd means password and wbst means website
abstract class Password implements CheckingPwd {

    protected String wbst;
    protected String pwd;

    Password(String wbst, String pwd) {
        this.wbst = wbst;
        this.pwd = pwd;
    }

    void displayPassword() {
        System.out.println("website = " + wbst);
        System.out.println("password = " + pwd);
    }

    String getPassword() {
        return pwd;
    }

    public boolean check(String pwd) {
        return pwd.length() >= 9;
    }

    abstract void displayType();
}


class StrongPwd extends Password {

    StrongPwd(String wbst, String pwd) {

        super(wbst, pwd);

    }
//here i am priniting the type of password, ie a strong password type
    void displayType() {

        System.out.println("A strong password");

    }
}