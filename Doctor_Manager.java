package Online_Medical_Management_System;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static Online_Medical_Management_System.Online_Medical_Management_System.*;

public class Doctor_Manager {
     public List<Doctor>doctorList;
     List<Appointment>appointmentList;
     List<Appointment>PendingList ;
    public Doctor_Manager(){
        this.doctorList = new ArrayList<>();
        this.appointmentList = new ArrayList<>();
        this.PendingList = new ArrayList<>();
    }
    public void registerDoctor()
    {
        System.out.println("Enter the id ");
        String Id = scanner.nextLine();
        scanner.nextLine();
        System.out.println("enter name  ");
        String Name = scanner.nextLine();
        System.out.println("enter the email");
        String Email = scanner.nextLine();
        System.out.println("enter specialist");
        String specialist = scanner.nextLine();
        System.out.println("enter appointments ");
        String appointment = scanner.nextLine();
        System.out.println("enter password ");
        String password = scanner.nextLine();
        for(Doctor doctor : doctorList){
            if(doctor.getDoc_id().equals(Id )&& doctor.getDoc_password().equals(password)){
                System.out.println("Doctor already exist !!");
                return;
            }
        }
        Doctor doctor = new Doctor(Id,Name,Email,password,specialist , appointment);
        doctorList.add(doctor);
        System.out.println("Doctor added successfully..");
        System.out.println(doctorList);
    }
    public Doctor logindoctor()
    {
        System.out.println("Enter the Id ");
        String Id = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the password");
        String password = scanner.nextLine();
        Doctor doctorToFind = null;
        for(Doctor doctor: doctorList)
        {
            if(doctor.getDoc_id().equals(Id) && doctor.getDoc_password().equals(password))
            {
                doctorToFind = doctor;
                break;
            }
        }
        if(doctorToFind!=null)
        {
            System.out.println("doctor is log in");
            return doctorToFind;
        }
        else
        {
            System.out.println(" not found , register your self before login");
            return null;
        }
    }
    public void addDoctor() {
        System.out.println("Enter the doctor details:");
        System.out.println("Enter the id:");
        String id = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the email:");
        String email = scanner.nextLine();
        System.out.println("Enter the specialist:");
        String specialist = scanner.nextLine();
        System.out.println("Enter the appointments:");
        String appointments = scanner.nextLine();
        System.out.println("Enter the password:");
        String password = scanner.nextLine();
        //check doctor already exist or not
        for(Doctor doctor : doctorList){
            if(doctor.getDoc_id().equals(id)){
                System.out.println("doctor already exists ");
                return;
            }
        }
        Doctor doctor = new Doctor(id , name , email ,specialist , appointments , password)  ;
        doctorList.add(doctor);
        System.out.println("doctor added successfully !!! ");
        System.out.println(doctorList);
    }
    public void deleteDoctor() {
        System.out.println("Enter the doctor details that you want to delete :");
        System.out.println("Enter the id:");
        String id = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the password :");
        String password = scanner.nextLine();
        //check doctor already exist or not
        for(Doctor doctor : doctorList){
            if(doctor.getDoc_id().equals(id)){
                doctorList.remove(doctor);
                System.out.println("doctor deleted  successfully  ");
                return;
            }
        }

        System.out.println("invalid information !!! ");

    }

public void addAppointmentDoctor( Doctor doctor ,Appointment appointment){
    for(Appointment appointment1 : appointmentList){
        appointmentList.add(appointment1);
    }

    appointmentList.add(appointment);

}
public void viewPaient(){

        for(Patient patient : patientManager.patientList){
            System.out.println(patient);
        }
}
    public void giveSuggestion(Doctor doctor ,Patient patient, String suggestion) {
        System.out.println("Doctor " + doctor.getDoc_name() + " suggests to patient " + patient.getPatient_name() + ": " + suggestion);
    }

    public void approveAppointment() {
        System.out.println("All the pending appointments are:");
        if (PendingList.isEmpty()) {
            System.out.println("No pending appointments");
            return;
        }
        for (Appointment appointment : doctorManager.PendingList) {
            System.out.println(appointment);
        }

        System.out.println("Enter the title of the appointment you want to approve:");
        String title = scanner.nextLine();

        Appointment appointmentToApprove = null;
        for (Appointment appointment : doctorManager.PendingList) {
            if (appointment.getTitle().equals(title)) {
                appointmentToApprove = appointment;
                break;
            }
        }

        if (appointmentToApprove != null) {
            appointmentToApprove.setStatus("approved");
            // Handle further actions, such as adding to doctor's schedule, etc.
            System.out.println("Appointment is approved");
        } else {
            System.out.println("No appointment with this ID exists");
        }
    }

    public void declineAppointments() {
        System.out.println("All the pending appointments are:");
        if (PendingList.isEmpty()) {
            System.out.println("No pending appointments");
            return;
        }
        for (Appointment appointment : PendingList) {
            System.out.println(appointment);
        }

        System.out.println("Enter the title of the appointment you want to decline:");
        String title = scanner.nextLine();

        Appointment appointmentToDecline = null;
        for (Appointment appointment : PendingList) {
            if (appointment.getTitle().equals(title)) {
                appointmentToDecline = appointment;
                break;
            }
        }

        if (appointmentToDecline != null) {
            appointmentToDecline.setStatus("declined");
            System.out.println("Appointment is declined");
        } else {
            System.out.println("No appointment with this ID exists");
        }
    }
    public void viewAppointments() {
        if (!appointmentList.isEmpty()) {
            for (Appointment appointment : appointmentList) {
                System.out.println(appointment);
            }
        } else {
            System.out.println("No appointments are scheduled yet.");
        }
    }

    public void viewPatients() {
        if (!appointmentList.isEmpty()) {
            for (Appointment appointment : appointmentList) {
                System.out.println(appointment.getPatientEmail());
            }
        } else {
            System.out.println("No appointments are scheduled yet.");
        }
    }

    public void provideAdvice() {
        viewPatients();
        System.out.println("Enter the id of the patient to which you want to give advice:");
        String patientId = scanner.next();

        Patient patient = findPatientById(patientId);
        if (patient != null) {
            System.out.println("Enter the advice for the patient:");
            String advice = scanner.nextLine();
            patient.setPriscription(advice);
            System.out.println("Advice has been provided to the patient successfully.");
        } else {
            System.out.println("Patient not found.");
        }
    }

    private Patient findPatientById(String id) {
        for (Patient patient : patientManager.patientList) {
            if (patient.getPatient_id().equals(id)) {
                return patient;
            }
        }
        return null; // Patient not found
    }
}




