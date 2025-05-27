package java.AdapterPattern;

class Hospital implements hospitalInterface {

    @Override
    public void getPatientDetails(int patientId) {
        System.out.println("Hospital: Fetching patient details for ID: " + patientId); 
    }
    
}
