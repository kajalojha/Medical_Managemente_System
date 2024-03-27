package Online_Medical_Management_System;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Online_Medical_Management_System.Online_Medical_Management_System.*;


public class Admin_Manager {
    Admin admin = new Admin("101" , "kajal","kajal@gmail.com ", "1529");
    List<Admin> adminList ;
    List<Donor>donorList;
    List<Appointment>pendingAppointmentlist ;
    List<Appointment>confirmAppointmentlist ;
    List<Appointment>appointmentList;

    Admin_Manager(){
        adminList = new ArrayList<>();
        pendingAppointmentlist = new ArrayList<>();
        confirmAppointmentlist = new ArrayList<>();
        donorList = new ArrayList<>();
    }


    public void registerAdmin()
    {
        System.out.println("Enter the id of admin");
        String adminId = scanner.nextLine();
        scanner.nextLine();
        System.out.println("enter name of admin ");
        String adminName = scanner.nextLine();
        System.out.println("enter the email of admin ");
        String adminEmail = scanner.nextLine();
        System.out.println("enter password ");
        String password = scanner.nextLine();
        for(Admin admin : adminList){
            if(admin.getAdmin_id().equals(adminId )&& admin.getAdmin_password().equals(password)){
                System.out.println("Admin already exist !!");
                return;
            }
        }
        Admin admin = new Admin(adminId , adminName ,adminEmail,password);
        adminList.add(admin);
        System.out.println("Admin added successfully..");
        System.out.println(adminList);
    }

    public List<Appointment> getAppointments(String doctorId) {
        Doctor doctor = findDoctorByid(doctorId);
        if (doctor != null) {
            return doctor.getAppointments();
        } else {
            System.out.println("Doctor not found.");
            return new ArrayList<>(); // Return an empty list if doctor is not found
        }
    }
    Doctor findDoctorByid(String doctor_id){
        for(Doctor doctor : doctorManager.doctorList){
            if(doctor.getDoc_id().equals(doctor_id)){
                return doctor;
            }
        }
        return null;
    }
public boolean loginAdmin() {
    System.out.println("Enter admin id:");
    String id = scanner.nextLine();
    scanner.nextLine();
    System.out.println("Enter password:");
    String password = scanner.nextLine();

    // Loop through the admin list to find a matching admin
    for (Admin admin : adminList) {
        if (admin.getAdmin_id().equals(id) && admin.getAdmin_password().equals(password)) {
            System.out.println("Admin logged in successfully.");
            return true; // Admin found, return true
        }
    }

    System.out.println("Admin does not exist. Please register yourself first.");
    return false; // Admin not found, return false
}

    public void addDonor() {
        System.out.println("Enter the donor details:");
        System.out.println("Enter the id:");
        String id = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the blood group :");
        String bloodGroup = scanner.nextLine();
        System.out.println("Enter the email:");
        String email = scanner.nextLine();
        System.out.println("Enter the phone number:");
        String phonenumber = scanner.nextLine();
        //check doctor already exist or not
        for(Donor donor : donorList){
            if(donor.getDonorId().equals(id)){
                System.out.println(" donor already exists ");
                return;
            }
        }
       Donor donor = new Donor(id , bloodGroup , email ,phonenumber)  ;
        donorList.add(donor);
        System.out.println(" donor added successfully !!! ");
        System.out.println(donorList);
    }
    public void deleteDonor() {
        System.out.println("Enter the User details that you want to delete :");
        System.out.println("Enter the id:");
        String id = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the email :");
        String email = scanner.nextLine();
        //check doctor already exist or not
        for(Donor donor : donorList){
            if(donor.getDonorId().equals(id)){
                donorList.remove(donor);
                System.out.println(" donor deleted  successfully  ");
                return;
            }
        }

        System.out.println("invalid information !!! ");

    }
    public void displayPendingAppointment()
    {
        System.out.println("pending appointmnts :");
        for(Appointment appointment : pendingAppointmentlist){
            System.out.println(appointment);
        }
    }
    public void viewDonor() {
        for (Donor donor : donorList) {
            System.out.println(donor);
        }
    }
    public void showAppointments()
        {
            if(appointmentList.size()==0)
            {
                System.out.println("No any Appointment ");
            }
            else
            {
                for(Appointment appointments : appointmentList)
                {
                    System.out.println(appointments);
                }
            }
        }
    }



