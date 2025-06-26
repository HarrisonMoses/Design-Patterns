package javaCode.AdapterPattern;


class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        
        InsuranceA insuranceA = new InsuranceA();
        InsuranceAdapter insuranceAdapter = new InsuranceAdapter(insuranceA);

        
        hospital.getPatientDetails(123);
        insuranceAdapter.getPatientDetails(456);
        
    }
}