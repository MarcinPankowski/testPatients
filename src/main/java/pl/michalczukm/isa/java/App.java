package pl.michalczukm.isa.java;

import java.util.List;


public class App
{
    public static void main( String[] args ) {

        PatientModel patientModel = new PatientModel();
        DoctorService doctorService = new DoctorService();
        List<PatientApp> patientApps = patientModel.getAll();
        //coment to revert

        for (PatientApp patientApp : patientApps) {
            System.out.println(String.format(">> %1$s %2$s <<", patientApp.getFirstName(), patientApp.getLastName()));
        }
    }  //cx
}
