package Online_Medical_Management_System;

public class Admin {
    private final String admin_id ;
    private String admin_name ;
    private String admin_email;
    private String admin_password;
    public Admin(String admin_id ,String admin_name , String admin_email ,String admin_password) {
        this.admin_id = admin_id;
        this.admin_name = admin_name ;
        this.admin_email = admin_email ;
        this.admin_password = admin_password;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_email() {
        return admin_email;
    }

    public void setAdmin_email(String admin_email) {
        this.admin_email = admin_email;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }
    public String toString(){
        return "Admin{"+
                "id ='" + admin_id + '\''+
                "name ='"+ admin_name + '\''+
                "email ='" + admin_email + '\''+
                "password='" + admin_password + '\''+
                '}';
    }
}
