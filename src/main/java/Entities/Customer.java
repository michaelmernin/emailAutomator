package Entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
@Table(name = "Customers")
public class Customer {

    @Id
    @GeneratedValue
    int id;

    @Column
    String name;

    @OneToMany
    Email emailAssociated;

    List<String> emailsList;

    @ManyToOne
    programManager programManager;

    Timestamp firstEmailSent;

    boolean isActive;

    int emailsSent;

    public Customer() {
    }

    public Customer(String name, Email emailAssociated, List<String> emailsList, Entities.programManager programManager, Timestamp firstEmailSent, boolean isActive, int emailsSent) {
        this.name = name;
        this.emailAssociated = emailAssociated;
        this.emailsList = emailsList;
        this.programManager = programManager;
        this.firstEmailSent = firstEmailSent;
        this.isActive = isActive;
        this.emailsSent = emailsSent;
    }

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

    public Email getEmailAssociated() {
        return emailAssociated;
    }

    public void setEmailAssociated(Email emailAssociated) {
        this.emailAssociated = emailAssociated;
    }

    public Entities.programManager getProgramManager() {
        return programManager;
    }

    public void setProgramManager(Entities.programManager programManager) {
        this.programManager = programManager;
    }

    public Timestamp getFirstEmailSent() {
        return firstEmailSent;
    }

    public void setFirstEmailSent(Timestamp firstEmailSent) {
        this.firstEmailSent = firstEmailSent;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getEmailsSent() {
        return emailsSent;
    }

    public void setEmailsSent(int emailsSent) {
        this.emailsSent = emailsSent;
    }
}
