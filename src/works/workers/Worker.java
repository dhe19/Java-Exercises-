package works.workers;

import java.time.LocalDate;

public abstract class Worker {
    protected String name;
    protected String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        //create two new LocalDates
        //we convert our string birthday into LocalDate
        LocalDate birthDay = LocalDate.parse(birthDate);
        //we save our current date
        LocalDate now = LocalDate.now();
        //other way to get the age but useLess because only wan the difference between ages;
        // var age = now.minusYears(birthDay.getYear());
        return now.getYear() - birthDay.getYear();
    }

    public abstract double collectPay();

    public abstract void terminate(String endDate);

}
