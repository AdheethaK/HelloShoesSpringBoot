package lk.ijse.GDSE65.HelloShoes.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
@RequiredArgsConstructor
public class customer {
    @GetMapping("/health")
    public String healthTest(){return "customer health test :)";}
}
