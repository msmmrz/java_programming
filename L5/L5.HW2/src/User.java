public class User {
    private String Username;
    private String Password;

    private static User user;
    public synchronized static User getInstance(){
        if(user==null){
            user = new User();
        }
        return user;
    }
    private User(){};

    public String getUsername() {
        System.out.println("username:"+Username);
        return Username;
    }

    public String getPassword() {
        System.out.println("password:"+Password);
        return Password;
    }

    public void setUsername(String Username) {

        this.Username = Username;
    }

    public void setPassword(String Password) {

        this.Password = Password;
    }


}
