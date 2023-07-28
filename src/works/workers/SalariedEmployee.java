package works.workers;

public class SalariedEmployee extends Employee {
    private final double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay() {
        return annualSalary;
    }

    public void retire() {
        isRetired = true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
