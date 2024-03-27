package Online_Medical_Management_System;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static Online_Medical_Management_System.Online_Medical_Management_System.doctorManager;
import static Online_Medical_Management_System.Online_Medical_Management_System.scanner;

public class Patient_Manager {
    List<Patient> patientList;
    List<Appointment>appointmentList;
    Patient_Manager(){
        this.patientList = new ArrayList<>();
        this.appointmentList = new ArrayList<>();
    }
    public void registerPatient()
    {
        System.out.println("Enter the id ");
        String Id = scanner.nextLine();
        scanner.nextLine();
        System.out.println("enter name  ");
        String Name = scanner.nextLine();
        System.out.println("enter the email");
        String Email = scanner.nextLine();
        System.out.println("enter appointments ");
        String appointment = scanner.nextLine();
        System.out.println("enter priscription :");
        String priscription = scanner.nextLine();
        System.out.println("enter password ");
        String password = scanner.nextLine();
        for(Patient patient : patientList){
            if(patient.getPatient_id().equals(Id )&& patient.getPatient_password().equals(password)){
                System.out.println("Patient already exist !!");
                return;
            }
        }
        Patient patient = new Patient(Id,Name,Email,password, appointment , priscription);
       patientList.add(patient);
        System.out.println("patient added successfully..");
        System.out.println(patientList);
    }
    public Patient loginPatient()
    {
        System.out.println("Enter the Id ");
        String Id = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the password");
        String password = scanner.nextLine();
       Patient patientToFind = null;
        for(Patient patient: patientList)
        {
            if(patient.getPatient_id().equals(Id) && patient.getPatient_password().equals(password))
            {
                patientToFind = patient;
                break;
            }
        }
        if(patientToFind!=null)
        {
            System.out.println("patient log in successfully!! ");
            return patientToFind;
        }
        else
        {
            System.out.println(" not found , register your self before login");
            return null;
        }
    }
    public void addPatient() {
        System.out.println("Enter the patient details:");
        System.out.println("Enter the id:");
        String id = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the email:");
        String email = scanner.nextLine();
        System.out.println("Enter the appointments:");
        String appointments = scanner.nextLine();
        System.out.println("enter priscription :");
        String priscription = scanner.nextLine();
        System.out.println("Enter the password:");
        String password = scanner.nextLine();
        //check doctor already exist or not
        for(Patient patient : patientList){
            if(patient.getPatient_id().equals(id)){
                System.out.println(" patient already exists ");
                return;
            }
        }
        Patient patient = new Patient(id , name , email ,appointments ,priscription , password)  ;
        patientList.add(patient);
        System.out.println("patient  added successfully !!! ");
        System.out.println(patientList);
    }
    public void deletePatient() {
        System.out.println("Enter the Patient details that you want to delete :");
        System.out.println("Enter the id:");
        String id = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the password :");
        String password = scanner.nextLine();
        //check doctor already exist or not
        for(Patient patient : patientList){
            if(patient.getPatient_id().equals(id)){
                patientList.remove(patient);
                System.out.println("patient deleted  successfully  ");
                return;
            }
        }

        System.out.println("invalid information !!! ");
    }


    public  Patient findPatientByid(String patientId){
     for(Patient patient : patientList){
         if(patient.getPatient_id().equals(patientId)){
             return patient;
         }
     }
     return null;
    }
    public  Doctor findDoctorByid(String Doc_id){
        for(Doctor doctor : doctorManager.doctorList){
            if(doctor.getDoc_id().equals(Doc_id)){
                return doctor;
            }
        }
        return null;
    }

    public void viewDoctor(){
        for(Doctor doctor : doctorManager.doctorList){
            System.out.println(doctor);
        }
    }
    public void scheduleAppointment() {
        System.out.println("Enter appointment title:");
        String title = scanner.nextLine();
        System.out.println("Enter doctor's email:");
        String doctorEmail = scanner.nextLine();
        System.out.println("Enter patient's email:");
        String patientEmail = scanner.nextLine();
        System.out.println("Enter appointment subject:");
        String subject = scanner.nextLine();
        // Assuming initial status is "pending"
        String status = "pending";

        Appointment appointment = new Appointment(title, doctorEmail, patientEmail, subject, status);
       appointmentList.add(appointment);
        System.out.println("Appointment scheduled successfully.");
    }

    public void viewAppointments() {
        if (appointmentList.isEmpty()) {
            System.out.println("No appointments.");
            return;
        }
        for (Appointment appointment : appointmentList) {
            System.out.println(appointment);
        }
    }
    public void viewDetails() {
        System.out.println("Enter appointment title:");
        String title = scanner.nextLine();
        Appointment foundAppointment = null;
        for (Appointment appointment : appointmentList) {
            if (appointment.getTitle().equalsIgnoreCase(title)) {
                foundAppointment = appointment;
                break;
            }
        }
        if (foundAppointment != null) {
            System.out.println(foundAppointment);
        } else {
            System.out.println("Appointment not found.");
        }
    }
}
