package hiberbate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address220")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String Addressline1;
    private String city;
    private String state;
    private String country;
    private int pincode;

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddressline1(String string) {
        return Addressline1;
    }

    public void setAddressline1(String addressline1) {
        Addressline1 = addressline1;
    }

    public String getCity(String lucknow) {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState(String string) {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry(String india) {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPincode(int i) {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public void setEmployee(Employee employee) {
    }
}
