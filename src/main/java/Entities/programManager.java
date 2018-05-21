package Entities;


import javax.persistence.*;
import java.util.HashSet;
import java.util.List;

@Entity
@Table(name = "programManagers")
public class programManager {
    @Id
    @GeneratedValue
    int id;

    @Column
    String name;

    @Column
    int activeAccounts;

    @OneToMany
    Customer customerInvolved;

    @Column
    String email;


    List<String> customers;

    boolean activeColdCalling;

    public programManager() {
    }

    public programManager(String name, int activeAccounts, Customer customerInvolved, String email, List<String> customers, boolean activeColdCalling) {
        this.name = name;
        this.activeAccounts = activeAccounts;
        this.customerInvolved = customerInvolved;
        this.email = email;
        this.customers = customers;
        this.activeColdCalling = activeColdCalling;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getActiveAccounts() {
        return activeAccounts;
    }

    public void setActiveAccounts(int activeAccounts) {
        this.activeAccounts = activeAccounts;
    }

    public Customer getCustomerInvolved() {
        return customerInvolved;
    }

    public void setCustomerInvolved(Customer customerInvolved) {
        this.customerInvolved = customerInvolved;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getCustomers() {
        return customers;
    }

    public void setCustomers(List<String> customers) {
        this.customers = customers;
    }

    public boolean isActiveColdCalling() {
        return activeColdCalling;
    }

    public void setActiveColdCalling(boolean activeColdCalling) {
        this.activeColdCalling = activeColdCalling;
    }
}
