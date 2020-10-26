package print;

public class U{

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void printOut(int a){
        System.out.println(a);
    }

    public static void printOut(String a){
        System.out.println(a);
    }

    public static void printOut(boolean a){
        System.out.println(a);
    }
}