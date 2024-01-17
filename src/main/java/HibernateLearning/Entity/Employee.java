package HibernateLearning.Entity;

import jakarta.persistence.*;

<<<<<<< Updated upstream:src/main/java/HibernateLearning/Entity/Employee.java
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
=======
@Entity
@Table(name = "Emp220")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
    private int employeeId;
    private String name;
    private String email;
    @OneToOne(targetEntity = Address.class,cascade = CascadeType.ALL)
    private Address address;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
>>>>>>> Stashed changes:src/main/java/hiberbate/entity/Employee.java

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< Updated upstream:src/main/java/HibernateLearning/Entity/Employee.java
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
=======
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
>>>>>>> Stashed changes:src/main/java/hiberbate/entity/Employee.java
    }
}
