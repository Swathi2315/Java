public class Doctor {
    public static void main(String args[]) {
        String names[] = {"Dr. Smith", "Dr. Patel", "Dr. Lee"};
        int yearsOfExperience[] = {15, 10, 20};
        long patientCounts[] = {5000L, 3000L, 7000L};
        char specialties[] = {'Cardiology', 'Orthopedics', 'Pediatrics'}; 

        System.out.print("Doctors are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Years of experience are: ");
        for (int i = 0; i < yearsOfExperience.length; i++) {
            System.out.print(yearsOfExperience[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Patient counts are: ");
        for (int i = 0; i < patientCounts.length; i++) {
            System.out.print(patientCounts[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Specialties are: ");
        for (int i = 0; i < specialties.length; i++) {
            System.out.print(specialties[i] + " ");
        }
    }
}
