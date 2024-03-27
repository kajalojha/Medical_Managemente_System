package Online_Medical_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String doc_id ;
    private String doc_name ;
    private String doc_email;
    private String doc_password;
    private String doc_specialist;
    private String doc_appointments;
    List<Appointment> appointments;
    public Doctor(String doc_id ,String doc_name , String doc_email ,String doc_password,String doc_specialist,String doc_appointments) {
        this.doc_id = doc_id;
        this.doc_name = doc_name ;
        this.doc_email = doc_email ;
        this.doc_password = doc_password;
        this.doc_specialist = doc_specialist;
        this.doc_appointments = doc_appointments;
        appointments = new ArrayList<>();
    }

    public String getDoc_password() {
        return doc_password;
    }

    public void setDoc_password(String doc_password) {
        this.doc_password = doc_password;
    }

    public String getDoc_id() {
        return doc_id;
    }

    public String getDoc_email() {
        return doc_email;
    }

    public void setDoc_email(String doc_email) {
        this.doc_email = doc_email;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public String getDoc_specialist() {
        return doc_specialist;
    }

    public String getDoc_appointments() {
        return doc_appointments;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public void setDoc_appointments(String doc_appointments) {
        this.doc_appointments = doc_appointments;
    }

    public void setDoc_specialist(String doc_specialist) {
        this.doc_specialist = doc_specialist;
    }
    public String toString(){
        return "Doctor{"+
                "id ='" + doc_id + '\''+
                "name ='"+ doc_name + '\''+
                "email ='" + doc_email + '\''+
                "specialist ='" + doc_specialist + '\''+
                "appoinmenta  ='" + doc_appointments + '\''+
                "password='" + doc_password + '\''+
                '}';
    }
    public List<Appointment> getAppointments() {
        return appointments;
    }


}
