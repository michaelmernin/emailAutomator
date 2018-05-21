package Dao;

import Entities.Customer;
import Entities.programManager;
import org.springframework.data.repository.CrudRepository;

public interface ProgramManagerRepo extends CrudRepository<programManager, String> {

    programManager findFirstByName (String text);

    programManager findFirstByCustomerInvolved (Customer text);



}
