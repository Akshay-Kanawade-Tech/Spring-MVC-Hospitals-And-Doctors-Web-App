package domain;

public class SearchDoctor {

    private int doct_id;
    private String doctorName;

    private String doctorRegistrationNumber;

    private String city;

    private String gender;

    //getter setter
    public int getDoct_id() {
        return doct_id;
    }

    public void setDoct_id(int doct_id) {
        this.doct_id = doct_id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorRegistrationNumber() {
        return doctorRegistrationNumber;
    }

    public void setDoctorRegistrationNumber(String doctorRegistrationNumber) {
        this.doctorRegistrationNumber = doctorRegistrationNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    //constructor
    public SearchDoctor(int doct_id, String doctorName, String doctorRegistrationNumber, String city, String gender) {
        this.doct_id = doct_id;
        this.doctorName = doctorName;
        this.doctorRegistrationNumber = doctorRegistrationNumber;
        this.city = city;
        this.gender = gender;
    }

    public SearchDoctor() {
    }

    @Override
    public String toString() {
        return "Domain{" +
                "doct_id=" + doct_id +
                ", doctorName='" + doctorName + '\'' +
                ", doctorRegistrationNumber='" + doctorRegistrationNumber + '\'' +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public SearchDoctor getDoctorsByName(String doctorName) {
        return null;
    }

    public SearchDoctor getdoctorByRegistrationNumber(String doctorName) {
        return  null;
    }
}
