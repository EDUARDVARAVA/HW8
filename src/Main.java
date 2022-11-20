public class Main {
    public static void main(String[] args) {
        Therapist therapist = new Therapist();
        Patient patient = new Patient();
        patient.setPlan(1);

        therapist.naznachitVraca(patient);

        System.out.println(patient.getDoctor());
    }
}