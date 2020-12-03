package _Classes;
import java.util.Date;

public class Order
{
    private Customer customer;
    private Car car;
    private Date date;
    private String status;

    public Order(Customer customer, Car car, Date date, String status)
    {
        this.customer = customer;
        this.car = car;
        this.date = date;
        this.status = status;
    }


    // Setters & Getters

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer newCustomer) {
        this.customer = newCustomer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car newCar) {
        this.car = newCar;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date newDate) {
        this.date = newDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        this.status = status;
    }
}
