package Core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public final class Employee {
    private final String name;
    private final Date DOJ;
    private final ArrayList<Integer> mobileNumbers;
    private final Address address;

    public Employee(String name, Date DOJ, ArrayList<Integer> mobileNumbers, Address address) {
        this.name = name;
        this.DOJ = DOJ;
        this.mobileNumbers = mobileNumbers;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Date getDOJ() {
//        return DOJ;
        return (Date) DOJ.clone();
    }

    public ArrayList<Integer> getMobileNumbers() {
        return (ArrayList<Integer>) mobileNumbers.clone();
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getPinCode());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", DOJ=" + DOJ +
                ", mobileNumbers=" + mobileNumbers +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Smriti",
                new Date(2020, 11, 28),
                new ArrayList<>(Arrays.asList(1234, 987)),
                new Address("Ahemdabad", 2233));

        // employee.name = "Shruti"; -> COMPILATION ERROR
        // employee.DOJ = new Date(2021, 01, 01); -> COMPILATION ERROR because we are directly changing the final parameter

        // However, changing the DOJ via the function will change the DOJ even though its final!
        employee.getDOJ().setDate(18); // this will change the date
        // to avoid this, return a clone of object reference.

        // this can change the list.
        // employee.getMobileNumbers().add(55);
        // So we return a clone of it
        employee.getMobileNumbers().add(55);

        // this will change the City.
        // employee.getAddress().setCity("Delhi");
        // So we return a deep copy of it
        employee.getAddress().setCity("Delhi");

        // But,
        employee.mobileNumbers.add(66);
        // it will still change the number because we are accessing the list directly.
        // in real-world, these types of functions are present outside the class and such activities can't be done, 
        // thanks to PRIVATE access-modifier!

        System.out.println(employee);
    }
}
