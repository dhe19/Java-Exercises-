import works.workers.Worker;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Eduardo","1995-08-02",LocalDate.now().toString());
        System.out.println(worker.getAge());
    }
}

