package lk.ijse.GDSE65.HelloShoes.controller;

import jakarta.servlet.http.HttpServletResponse;
import lk.ijse.GDSE65.HelloShoes.dto.CustomerDTO;
import lk.ijse.GDSE65.HelloShoes.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@RequiredArgsConstructor
public class customer {
    private final CustomerService customerService;

    @GetMapping("/health")
    public String healthTest(){return "customer health test :)";}

    @CrossOrigin(origins = "http://localhost:63342")
    @PostMapping
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        System.out.println(customerDTO);
        return customerService.saveCustomer(customerDTO);
    }
}
