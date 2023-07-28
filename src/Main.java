import works.workers.HourlyEmployee;
import works.workers.SalariedEmployee;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "Eduardo",
                "1995-08-02",
                LocalDate.now().toString(),
                2,
                "08-08-2023",
                25000.00,
                false
        );
        System.out.println(salariedEmployee.getAge());
        System.out.println(salariedEmployee.collectPay());
        salariedEmployee.retire();
        salariedEmployee.terminate("08-08-2028");
        System.out.println(salariedEmployee);
        System.out.println("------------------------");

        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Eduardo",
                "1995-08-02",
                LocalDate.now().toString(),
                2,
                "08-08-2023",
                80.758
        );
        System.out.println(hourlyEmployee.getAge());
        System.out.println(hourlyEmployee.collectPay());
        System.out.println(hourlyEmployee.getDoublePay());
        System.out.println(hourlyEmployee);
        System.out.println("------------------------");


    }
}

