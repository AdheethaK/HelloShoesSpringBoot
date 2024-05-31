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
    public int updateCustomer(CustomerDTO customerDTO) {
        String customerFullCode = customerRepo.getCustomerFullCodeBy(customerDTO.getCustomer_code());
        return customerRepo.update(
                customerFullCode,
                customerDTO.getCustomer_name(),
                customerDTO.getCustomer_gender(),
                customerDTO.getCustomer_joined_date(),
                customerDTO.getCustomer_level(),
                customerDTO.getCustomer_total_points(),
                customerDTO.getCustomer_dob(),
                customerDTO.getCustomer_address_building_no_or_name(),
                customerDTO.getCustomer_address_lane(),
                customerDTO.getCustomer_address_main_city(),
                customerDTO.getCustomer_address_main_state(),
                customerDTO.getCustomer_address_postal_code(),
                customerDTO.getCustomer_contact_no(),
                customerDTO.getCustomer_email(),
                customerDTO.getCustomer_recent_purchase()
        );
    }

}
