package Entities;

import javax.persistence.*;
import java.io.File;
import java.sql.Timestamp;

@Entity
@Table(name = "emails")
public class Email {

    @Id
    @GeneratedValue
    int id;

    Object actualEmail;

    @OneToMany
    Customer recipient;

    @Column
    Timestamp dateSent;

    @Column
    int numberSent;

    public Email(Object actualEmail, Customer recipient, Timestamp dateSent, int numberSent) {
        this.actualEmail = actualEmail;
        this.recipient = recipient;
        this.dateSent = dateSent;
        this.numberSent = numberSent;
    }

    public Email() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getActualEmail() {
        return actualEmail;
    }

    public void setActualEmail(Object actualEmail) {
        this.actualEmail = actualEmail;
    }

    public Customer getRecipient() {
        return recipient;
    }

    public void setRecipient(Customer recipient) {
        this.recipient = recipient;
    }

    public Timestamp getDateSent() {
        return dateSent;
    }

    public void setDateSent(Timestamp dateSent) {
        this.dateSent = dateSent;
    }

    public int getNumberSent() {
        return numberSent;
    }

    public void setNumberSent(int numberSent) {
        this.numberSent = numberSent;
    }
}
