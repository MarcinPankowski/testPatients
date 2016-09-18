package pl.michalczukm.isa.java;

/**
 * Created by marcinpankowski on 18.09.16.
 */
public class Visits {

    private Doctor doctor;
    private PatientApp patient;


    public Visits(Doctor doctor, PatientApp patient){
        this.doctor = doctor;
        this.patient = patient;
        System.out.println("Many Visits");
    }
}
