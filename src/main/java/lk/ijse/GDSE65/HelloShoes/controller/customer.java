package lk.ijse.GDSE65.HelloShoes.controller;

import lk.ijse.GDSE65.HelloShoes.dto.CustomerDTO;
import lk.ijse.GDSE65.HelloShoes.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@RequiredArgsConstructor
public class customer {
    private final CustomerService customerService;
    Logger logger = LoggerFactory.getLogger(customer.class);

    @GetMapping("/health")
    public String healthTest(){return "customer health test :)";}

    @CrossOrigin(origins = "http://localhost:63342")
    @PostMapping
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        logger.info("customer save method accessed");
        return customerService.saveCustomer(customerDTO);
    }

    @CrossOrigin(origins = "http://localhost:63342")
    @GetMapping
    public CustomerDTO searchCustomer(@RequestParam String customerCode){
        logger.info("customer search method accessed ");
        return customerService.getSelectedCustomer(customerCode);
    }

    @CrossOrigin(origins = "http://localhost:63342")
    @PutMapping
    public int updateCustomer(@RequestBody CustomerDTO customerDTO){
        logger.info("customer update method accessed");
        return customerService.updateCustomer(customerDTO);
    }
}
