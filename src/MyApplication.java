import com.people.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApplication {
    public static void main(String[] args) {
        List<Payable> people = new ArrayList<>();
       people.add(new Employee("John", "Lennon", "lawyer", 27045.98));
       people.add(new Employee("George", "Harrison","teacher", 50000.00));
       people.add(new Student("Ringo", "Star", 2.65));
       people.add(new Student("Paul", "McCartney", 4.0));

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Payable> payables) {
        payables.forEach(payable -> {
            System.out.println(payable.toString() +  " earns " + payable.getPaymentAmount() + " tenge");
        });
    }
}
