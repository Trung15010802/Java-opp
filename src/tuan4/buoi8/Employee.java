package tuan4.buoi8;

import tuan4.buoi8.testprotected.Person;

public class Employee extends Person {
    double salary = 10_000_000;

    @Override
    public String toString() {
        String str = "";
        str = "Name: " + this.name;
        str += " Birthday: " + this.birthday;
        str += " Salary: " + this.salary;
        return str;
    }
}
