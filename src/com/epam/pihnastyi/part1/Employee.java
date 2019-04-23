package com.epam.pihnastyi.part1;

import java.util.Objects;

public class Employee extends Person {

    private int experience;
    private int salary;

    public Employee() {
            }

    public Employee(String name, int age, int experience, int salary) {
        super(name, age);
        this.experience = experience;
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return experience == employee.experience &&
                salary == employee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experience, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "experience=" + experience +
                ", salary=" + salary +
                '}';
    }
}
