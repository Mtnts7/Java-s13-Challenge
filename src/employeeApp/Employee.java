package employeeApp;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    private void checkId(int id){
        if (id<0){
            this.id=0;
        }else{
            this.id=id;
        }
    }
    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        checkId(id);
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public void addHealthPlan(int index, String name){
        if (index>=0 && index == healthplans.length){
            if(healthplans == null){
                healthplans[index]=name;
                System.out.println("Healthplan added at index: "+index);
            }else{
                System.out.println("Index: "+index+ " is already occupied.");
            }
        }else{
            System.out.println("Invalid index: "+index);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }
}
