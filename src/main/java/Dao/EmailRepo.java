package Dao;

import Entities.Customer;
import Entities.Email;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface EmailRepo extends CrudRepository<Email, String> {

    List<Email> findAllByCustomer(Customer text);


}
