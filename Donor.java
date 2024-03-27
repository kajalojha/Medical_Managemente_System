package Online_Medical_Management_System;

public class Donor {
    private String donorId;
    private String bloodGroup;
    private String contactNumber;
    private String email;

    // Constructor
    public Donor(String donorId,  String bloodGroup, String contactNumber, String email) {
        this.donorId = donorId;
        this.bloodGroup = bloodGroup;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    // Getters and setters
    public String getDonorId() {
        return donorId;
    }

    public void setDonorId(String donorId) {
        this.donorId = donorId;
    }



    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString method to represent the object as a string
    @Override
    public String toString() {
        return "Donor{" +
                "donorId='" + donorId + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
