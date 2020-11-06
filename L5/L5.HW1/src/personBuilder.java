public class personBuilder {
    private String name;
    private String username;
    private String password;
    private String address;
    private String phone;
    private String grade;
    private int age;

    public personBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public personBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public personBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public personBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public personBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public personBuilder setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public personBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }
}
