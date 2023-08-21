package ait.user.model;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        if(emailIsValid(email)){
            this.email = email;
        }else {
            System.out.println(email+"is not valid");
        }
    }
    /*
    -"@" - exist and only one
    -'.' - min one dot after @
    - min two symbols after last dot
    - alphabetic, digits, @, . , _ , -
     */
    private boolean emailIsValid(String email){
        //TODO
        return false;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
