package lk.ijse.GDSE65.HelloShoes.util;

import lk.ijse.GDSE65.HelloShoes.dto.CustomerDTO;
import lk.ijse.GDSE65.HelloShoes.entity.CustomerEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Mapping {
    private final ModelMapper modelMapper;

//  1.  Customer
    public CustomerDTO toCustomerDTO(CustomerEntity customerEntity){
        return modelMapper.map(customerEntity , CustomerDTO.class);
    }
    public CustomerEntity toCustomerEntity(CustomerDTO customerDTO){
        return modelMapper.map(customerDTO,CustomerEntity.class);
    }
    public List<CustomerDTO> toCustomerDTOList(List<CustomerEntity> customerEntityList){
        return modelMapper.map(customerEntityList , List.class);
    }
}
