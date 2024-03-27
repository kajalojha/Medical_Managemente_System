package Online_Medical_Management_System;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Online_Medical_Management_System {
    static Scanner scanner = new Scanner(System.in);

    static Admin_Manager adminManager = new Admin_Manager();
    static Doctor_Manager doctorManager = new Doctor_Manager();
    static Patient_Manager patientManager = new Patient_Manager();


    public static void main(String[] args) throws FileNotFoundException {
        while (true) {
            System.out.println("Select your role:");
            System.out.println("1. Admin");
            System.out.println("2. User ");
            System.out.println("3. Patient ");
            System.out.println("4. Doctor");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Do you want to register or login:");
                    System.out.println("1. Register");
                    System.out.println("2. Login");
                    int option = scanner.nextInt();
                    switch (option) {
                        case 1: {
                            adminManager.registerAdmin();
                            break;
                        }
                        case 2: {
                            if (adminManager.loginAdmin()) {
                                adminMenu();
                            } else {
                                System.out.println("Admin not found.");
                            }
                            break;
                        }
                        default:
                            System.out.println("Select a valid option.");
                            break;
                    }
                    break;
                }

                case 2:{
                    System.out.println("you want to register or login ");
                    System.out.println("1. register ");
                    System.out.println("2 login ");
                    int option = scanner.nextInt();
                    switch(option){
                        case 1:{
                            patientManager.registerPatient();
                            break;
                        }
                        case 2:{
                            patientManager.loginPatient();
                            patientMenu();
                            break;
                        }
                        default:{
                            System.out.println("select a valid optiion");
                            break;
                        }

                    }
                    break;

                }
                case 3:{
                    System.out.println("you want to register or login");
                    System.out.println("1. register ");
                    System.out.println("2. login ");
                    int option = scanner.nextInt();
                    switch (option){
                        case 1:
                        {
                            doctorManager.registerDoctor();
                            break;
                        }
                        case 2:
                        {
                            doctorManager.logindoctor();
                            doctorMenu();
                            break;
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("Select a valid role.");
                    break;
                }
            }
        }
    }

    // Admin menu
    public static void adminMenu() {
        while (true) {
            System.out.println("select an option ");
            System.out.println("Exit");
            System.out.println("1. add doctor");
            System.out.println("2. delete doctor ");
            System.out.println("3. add patient");
            System.out.println("4. delete patient ");
            System.out.println("5. add donor ");
            System.out.println("6. delete donor ");
            System.out.println("7. view donor ");
            System.out.println("8. display pending appointment ");
            System.out.println("9 show all appointment ");
            System.out.println("10 . approve appointment ");
            System.out.println("11. decline appointment ");

            int choice = scanner.nextInt();
            if(choice == 0){
                return;
            }
            switch (choice){
                case 1:
                {
                    doctorManager.addDoctor();
                    break;
                }
                case 2:
                {
                    doctorManager.deleteDoctor();
                    break;
                }
                case 3:
                {
                    patientManager.addPatient();
                    break;
                }
                case 4:
                {
                    patientManager.deletePatient();
                    break;
                }

                case 5:{
                    adminManager.addDonor();
                    break;
                }
                case 6:{
                    adminManager.deleteDonor();
                    break;
                }
                case 7:{
                    adminManager.viewDonor();
                    break;
                }
                case 8: {
                 adminManager.displayPendingAppointment();
                 break;
                }
                case 9:{
                    adminManager.showAppointments();
                    break;
                }
                case 10:{
                    doctorManager.approveAppointment();
                    break;
                }
                case 11:{
                    doctorManager.declineAppointments();
                    break;
                }

                default:{
                    System.out.println("make a valid choice ");
                    break;
                }
            }
        }
    }

    // patient menu
    public static void patientMenu(){
        System.out.println("select an option ");
        System.out.println("0. exit ");
        System.out.println("1. schedule appointment ");
        System.out.println("2. view doctor ");
        System.out.println("3. view donor ");

        int choice = scanner.nextInt();
        if(choice == 0 ){
            return;
        }
        switch(choice){
            case 1:{
               patientManager.scheduleAppointment();
                break;
            }
            case 2:{
                doctorManager.viewPaient();
                break;
            }
            case 3:{
                adminManager.viewDonor();
                break;
            }
            default:{
                System.out.println("select a valid option ..");
                break;
            }
        }
    }
    public static void doctorMenu(){
        System.out.println("select an option ");
        System.out.println("0. exit ");
        System.out.println("1. view patient ");
        System.out.println("2. view donor ");
        System.out.println("3. give advice  ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:{
                doctorManager.viewPaient();
                break;
            }
            case 2:{
                adminManager.viewDonor();
                break;
            }
            case 3:{
                doctorManager.provideAdvice();
                break;
            }

            default:{
                System.out.println("select a valid option ..");
                break;
            }
        }

    }


}

