package HibernateLearning.Entity;

import jakarta.persistence.*;

@Entity //(name="emp18)
//@Table (name = "emp11")
public class Employee {
  @Column(name = "emp_name")
    private String name;
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
  @Column(name = "emp_gen")
    private String gender;
  @Column
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
