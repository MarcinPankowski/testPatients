package pl.michalczukm.isa.java;

import java.util.ArrayList;
import java.util.List;

public class PatientModel {
    private final List<Patient> patients;

    public PatientModel() {
        patients = new ArrayList<>();

        patients.add(new Patient("Kuba", "Kowalski",21));
        patients.add(new Patient("Jan", "Nowalski",21));
        patients.add(new Patient("Krzysiek", "Nowak",21));
        patients.add(new Patient("Krzysiek", "Nowak",21));
        patients.add(new Patient("Piotr", "Szulc",21));
        patients.add(new Patient("Pawel", "Szulcz",21));
        patients.add(new Patient("Irena", "Kowalska",21));

        patients.add(new Patient("Marlena", "Wymbor",21));
        patients.add(new Patient("Marlena", "Wymbor",21));
        patients.add(new Patient("Marlena", "Wymbor",21));
        patients.add(new Patient("Marlena", "Wymbor",21));

    }

    public List<Patient> getAll() {
        return patients;
    }

    public void Add(Patient patient) {
        patients.add(patient);
    }
}
