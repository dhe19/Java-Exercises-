package works.workers;

import java.time.LocalDate;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

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
        int age = now.getYear() - birthDay.getYear();
        return age;
    }

}
