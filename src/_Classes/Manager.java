package _Classes;

import java.util.ArrayList;

public class Manager extends User
{
    private int id;
    private ArrayList<Employee> employees;

    public Manager(String name, String email, int id, ArrayList<Employee> employees)
    {
        super(name, email);
        this.id = id;
        this.employees = employees;
    }

    // Setters & Getters

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String newName) {
        super.setName(newName);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String newEmail) {
        super.setEmail(newEmail);
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

}
