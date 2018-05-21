package Controller;

import Dao.CustomerRepo;
import Dao.EmailRepo;
import Dao.ProgramManagerRepo;
import Entities.Customer;
import Entities.Email;
import Entities.programManager;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.parameters.P;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.sql.Timestamp;
import java.util.*;

@RestController
public class Controller {


    HashMap<String, String> completedAccounts = new HashMap<>();
    HashMap<String, String> onHoldAccounts = new HashMap<>();
    HashMap<String, String> activeAccounts = new HashMap<>();


    @Autowired
    ProgramManagerRepo programManagerRepo;

    @Autowired
    EmailRepo emailRepo;

    @Autowired
    CustomerRepo customerRepo;

    @PostConstruct
    public void fillData() {
        if (programManagerRepo.count() == 0) {
            programManager chris = new programManager("Chris", 0, null, null, null, true);
            programManagerRepo.save(chris);
            programManager jody = new programManager("Jody", 0, null, null, null, true);
            programManagerRepo.save(jody);
            programManager tori = new programManager("Tori", 0, null, null, null, true);
            programManagerRepo.save(tori);
            programManager gita = new programManager("Gita", 0, null, null, null, true);
            programManagerRepo.save(gita);
        }
    }


    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String login() {
        return "SplashPage";
    }

    @RequestMapping(path = "/pmLogin", method = RequestMethod.POST)
    public String loginAttempt(Model model, String textLogin, String password) throws Exception {

        List<Email> emailsScheduled;
        List<Customer> assignedCustomers;
        HashMap<String, Object> userInfo = new HashMap<>();


        programManager pm = programManagerRepo.findFirstByName(textLogin);

        assignedCustomers = customerRepo.findAllByProgramManager_Name(pm.getName());
        //emailsScheduled = emailRepo.findAllByCustomer(pm.getCustomer());

//        for(Customer x : assignedCustomers){
//
//
//        }


        //model.addAttribute(assignedCustomers);
        //model.addAttribute(emailsToSend);
        model.addAttribute(assignedCustomers);
        //model.addAttribute(emailsScheduled);

        return "PmAccountOverview";
    }


    @RequestMapping(path = "/addCustomer", method = RequestMethod.POST)
    public String addCustomer(Model model, String text, List<Email> emails, programManager programManager) {
        Customer x = new Customer(null, null, null, null, null, false, 0);
        customerRepo.save(x);


        return "PmAccountOverview";

    }

    @RequestMapping(path = "/addCustomerEmails", method = RequestMethod.POST)
    public String addition(Model model, String text) {


        return "PmAccountOverview";

    }

    @RequestMapping(path = "/de-activateCustomerEmails", method = RequestMethod.POST)
    public String retraction(Model model, String deactivateAcct) {


        Customer x = customerRepo.findFirstByName(deactivateAcct);
        customerRepo.delete(x);


        return "PmAccountOverview";

    }

    @RequestMapping(path = "/activateCustomer", method = RequestMethod.POST)
    public String activateCustomer(Model model, String activateAcct) {

        return "PmAccountOverview";

    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String rwelcome() {

        return "hello world";
        //return "SplashPage";
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String ewelcome() {

        return "hello world";
        //return "SplashPage";
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String swelcome() {

        return "hello world";
        //return "SplashPage";
    }


}
