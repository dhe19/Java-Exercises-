package works.workers;

public abstract class Employee extends Worker {
    protected final long employeeId;
    protected final String hireDate;

    public Employee(String name, String birthDate, String endDate, long employeeId, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public void terminate(String endDate) {
        this.endDate = endDate;
    }
}
