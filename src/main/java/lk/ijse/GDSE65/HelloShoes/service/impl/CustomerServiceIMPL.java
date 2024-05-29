package lk.ijse.GDSE65.HelloShoes.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.GDSE65.HelloShoes.dao.CustomerRepo;
import lk.ijse.GDSE65.HelloShoes.dto.CustomerDTO;
import lk.ijse.GDSE65.HelloShoes.service.CustomerService;
import lk.ijse.GDSE65.HelloShoes.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerServiceIMPL implements CustomerService {
    private final CustomerRepo customerRepo;
    private final Mapping mapping;

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        customerDTO.setCustomer_code(customerDTO.getCustomer_code()+ UUID.randomUUID().toString());
        return mapping.toCustomerDTO(customerRepo.save(mapping.toCustomerEntity(customerDTO)));
    }

    @Override
    public void deleteCustomer(String customer_Id) {

    }

    @Override
    public CustomerDTO getSelectedCustomer(String customer_Id) {
        return mapping.toCustomerDTO(customerRepo.getCustomerEntityStartingBy(customer_Id));
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        return null;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) {
        return false;
    }
}
