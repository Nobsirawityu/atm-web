package th.ac.ku.atm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.ku.atm.model.BankAccount;
import th.ac.ku.atm.model.Customer;
import th.ac.ku.atm.service.BankAccountService;

@Controller
@RequestMapping("/bankaccount")
public class BankAccountController {

    private BankAccountService accountService;

    public BankAccountController(BankAccountService accountService){
        this.accountService = accountService;
    }

    @GetMapping
    public String getBankAccountPage(Model model) {
        //model.addAttribute("alAccounts", accountService.getAllAccount());
        return "Bankaccount";
    }

//    @PostMapping
//    public String openBankAccount(@ModelAttribute BankAccount bankAccount, Model model) {
//        bankAccountService.createBankAccount(bankAccount);
//        model.addAttribute("allBankAccounts", bankAccountService.getBankAccount());
//        return "redirect:bankaccount";
//    }
}
