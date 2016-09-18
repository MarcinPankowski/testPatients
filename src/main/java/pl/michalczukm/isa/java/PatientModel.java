package pl.michalczukm.isa.java;

import java.util.ArrayList;
import java.util.List;

public class PatientModel {
    private final List<PatientApp> patients;

    public PatientModel() {
        patients = new ArrayList<>();

        patients.add(new PatientApp("Jan", "Kowalski",21));
        patients.add(new PatientApp("Jan", "Nowalski",21));
        patients.add(new PatientApp("Krzysiek", "Nowak",21));
        patients.add(new PatientApp("Krzysiek", "Nowak",21));
        patients.add(new PatientApp("Piotr", "Szulc",21));
        patients.add(new PatientApp("Pawel", "Szulcz",21));
        patients.add(new PatientApp("Irena", "Kowalska",21));

        patients.add(new PatientApp("Marlena", "Wymbor",21));
        patients.add(new PatientApp("Marlena", "Wymbor",21));
        patients.add(new PatientApp("Marlena", "Wymbor",21));
        patients.add(new PatientApp("Marlena", "Wymbor",21));

    }

    public List<PatientApp> getAll() {
        return patients;
    }

    public void Add(PatientApp patient) {
        patients.add(patient);

    }
}
