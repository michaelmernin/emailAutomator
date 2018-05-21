package Dao;

import Entities.Customer;
import Entities.Email;
import Entities.programManager;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<Customer, String> {

    List<Customer> findAllByProgramManager_Name(String text);

    Customer findFirstByName(String text);

    //List<C findAllBy(String text);





   // Email findAllByEmailAssociated(String text);
}
