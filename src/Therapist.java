public class Therapist extends Doctor{
    @Override
    void treat() {
        System.out.println("Я лечу всё. Терапевт");
    }

    void naznachitVraca(Patient patient){
        if (patient.getPlan() == 1){
            patient.setDoctor(new Surgeon());
            patient.getDoctor().treat();
            return;
        }
        if (patient.getPlan() == 2){
            patient.setDoctor(new Dantist());
            patient.getDoctor().treat();
            return;
        }
        patient.setDoctor(new Therapist());
        patient.getDoctor().treat();
        return;
    }
}
