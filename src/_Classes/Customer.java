package _Classes;

import java.util.ArrayList;

public class Customer extends User
{
    private String password;
    // using arraylist because the list is flexible and increasing.
    private ArrayList<Car> carsList;

    public Customer(String name, String email, String password, ArrayList<Car> carsList)
    {
        super(name, email);
        this.password = password;
        this.carsList = carsList;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public ArrayList<Car> getCars() {
        return carsList;
    }
}
