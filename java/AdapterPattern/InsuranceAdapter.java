package java.AdapterPattern;

// This code is part of the Adapter Pattern implementation in Java.
// It adapts the InsuranceA class to the hospitalInterface.

class InsuranceAdapter implements hospitalInterface {
    private InsuranceA insuranceA;

    public InsuranceAdapter(InsuranceA insuranceA) {
        this.insuranceA = insuranceA;
    }
    @Override
    public void getPatientDetails(int patientId) {
        this.insuranceA.fetchPatientsDetails(patientId);
    }

    
}
