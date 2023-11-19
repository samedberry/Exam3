import java.util.ArrayList;
import java.util.List;

public class TestSchoolRecords {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Student("John Doe", "1600 Pennsylvania Ave", "202-555-1600", "notthepres@whitehouse.gov", "freshman"));
        people.add(new Student("Jennifer Smith", "10 Downing St", "303-555-0010", "optimus@gov.uk", "junior"));
        people.add(new Faculty("Dave Trollman", "300 Elsewhere Ave", "303-555-0300", "notatroll@underbridge.com", "Economics", 300.00, "3/3/2000", "9-5, M-F", "Senior"));
        people.add(new Faculty("Jane Young", "400 Right Here Rd", "404-555-0400", "eldest@school.edu", "History", 400.00, "4/4/1980", "9-5, M-F", "senior"));
        people.add(new Staff("Hugh Mann", "500 Nowhere Ln", "505-555-0500", "realperson@fakemail.com", "HR", 500.00, "5/5/2020", "Onboarding Expert"));
        people.add(new Staff("N. B. Jones", "600 Somewhere Cir", "606-555-0600", "zeroonetwo@newfashioned.com", "IT", 600.00, "6/6/2010", "Tech Support"));


        //Traverse the list of Persons using a foreach loop and print the details of each person to the screen using the toString method
        System.out.println("ALL PEOPLE:");
        for (Person person : people) {
            System.out.println(person.toString());
        }

        System.out.println();
        System.out.println("JUST EMPLOYEES:");
        List<Person> employees = onlyEmployees(people);

        for (Person person : employees) {
            System.out.println(person.toString());
        }

    }

    //a function which takes a list of persons and returns a new list containing all of the persons from
    // the first list that are a subclass of Employee
    public static List<Person> onlyEmployees(List<Person> people) {
        for (int i = people.size() - 1; i >= 0; i--) {
            if (people.get(i) instanceof Employee) {
            } else {
                people.remove(i);
            }
        }
        return people;
    }

}
