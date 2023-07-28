package works.workers;

public class HourlyEmployee extends Employee {
    private final double hourlyPayRate;

    public HourlyEmployee(
            String name,
            String birthDate,
            String endDate,
            long employeeId,
            String hireDate,
            double hourlyPayRate) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return hourlyPayRate * 8;
    }

    public double getDoublePay() {
        return (hourlyPayRate * 8) * 2;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
