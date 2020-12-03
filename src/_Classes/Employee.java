package _Classes;

public class Employee extends User
{
    private int id;
    private Manager manager;

    public Employee(String name, String email, int id, Manager manager)
    {
        super(name, email);
        this.id = id;
        this.manager = manager;
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

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager newManager) {
        this.manager = newManager;
    }
}
