package pl.michalczukm.isa.java;

import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private final List<Patient> patients;

    public PatientService() {
        patients = new ArrayList<>();

        patients.add(new Patient("Jan", "Kowalski"));
        patients.add(new Patient("Krzysiek", "Nowak"));
        patients.add(new Patient("Krzysiek", "Nowak"));
        patients.add(new Patient("Piotr", "Szulc"));
        patients.add(new Patient("Pawel", "Szulcz"));
        patients.add(new Patient("Irena", "Kowalska"));
        patients.add(new Patient("Marlena", "Wymbor"));
        patients.add(new Patient("Marlena", "Wymbor"));

    }

    public List<Patient> getAll() {
        return patients;
    }

    public void Add(Patient patient) {
        patients.add(patient);
    }
}
