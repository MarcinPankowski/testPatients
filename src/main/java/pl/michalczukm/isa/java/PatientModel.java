package pl.michalczukm.isa.java;

import java.util.ArrayList;
import java.util.List;

public class PatientModel {
    private final List<PatientApp> patientApps;

    public PatientModel() {
        patientApps = new ArrayList<>();

        patientApps.add(new PatientApp("Jan", "Kowalski",21));
        patientApps.add(new PatientApp("Jan", "Nowalski",21));
        patientApps.add(new PatientApp("Krzysiek", "Nowak",21));
        patientApps.add(new PatientApp("Krzysiek", "Nowak",21));
        patientApps.add(new PatientApp("Piotr", "Szulc",21));
        patientApps.add(new PatientApp("Pawel", "Szulcz",21));
        patientApps.add(new PatientApp("Irena", "Kowalska",21));

        patientApps.add(new PatientApp("Marlena", "Wymbor",21));
        patientApps.add(new PatientApp("Marlena", "Wymbor",21));
        patientApps.add(new PatientApp("Marlena", "Wymbor",21));
        patientApps.add(new PatientApp("Marlena", "Wymbor",21));

    }

    public List<PatientApp> getAll() {
        return patientApps;
    }

    public void Add(PatientApp patientApp) {
        patientApps.add(patientApp);
    }
}
