package lk.ijse.GDSE65.HelloShoes.service;

import lk.ijse.GDSE65.HelloShoes.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    void deleteCustomer(String customer_Id);
    CustomerDTO getSelectedCustomer(String customer_Id);
    List<CustomerDTO> getAllCustomer();
    int updateCustomer(CustomerDTO customerDTO);
}
