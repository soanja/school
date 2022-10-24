public class Teacher {
    private String lastname;
    private String firstname;
    private String phone;
    private String email;
    private String dateOfRecrutment;
    private String staffNumber;
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDateOfRecrutment() {
        return dateOfRecrutment;
    }
    public void setDateOfRecrutment(String dateOfRecrutment) {
        this.dateOfRecrutment = dateOfRecrutment;
    }
    public String getStaffNumber() {
        return staffNumber;
    }
    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }
    @Override
    public String toString() {
        return "Teacher [lastname=" + lastname + ", firstname=" + firstname + ", phone=" + phone + ", email=" + email
                + ", dateOfRecrutment=" + dateOfRecrutment + ", staffNumber=" + staffNumber + "]";
    }

    
}