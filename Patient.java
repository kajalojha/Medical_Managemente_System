package Online_Medical_Management_System;

public class Patient {
    private String patient_id ;
    private String patient_name ;
    private String patient_email;
    private String patient_password;
    private String patient_appointments;
    private String priscription ;
    public Patient(String patient_id , String patient_name , String patient_email , String patient_password, String patient_appointments,String priscription) {
        this.patient_id = patient_id;
        this.patient_name = patient_name ;
        this.patient_email = patient_email ;
        this.patient_password = patient_password;
        this.patient_appointments = patient_appointments;
        this.priscription = priscription;
    }

    public String getPatient_appointments() {
        return patient_appointments;
    }

    public void setPatient_appointments(String patient_appointments) {
        this.patient_appointments = patient_appointments;
    }

    public String getPriscription() {
        return priscription;
    }

    public void setPriscription(String priscription) {
        this.priscription = priscription;
    }

    public String getPatient_password() {
        return patient_password;
    }

    public void setPatient_password(String patient_password) {
        this.patient_password = patient_password;
    }

    public String getPatient_email() {
        return patient_email;
    }

    public void setPatient_email(String patient_email) {
        this.patient_email = patient_email;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }
    public String getPatient_id() {
        return patient_id;
    }
    public String toString(){
        return "Patient {"+
                "id ='" + patient_id + '\''+
                "name ='"+ patient_name + '\''+
                "email ='" + patient_email + '\''+
                "appoinments  ='" + patient_appointments + '\''+
                "password='" + patient_password + '\''+
                '}';
    }

}
