package lk.ijse.GDSE65.HelloShoes.dao;

import lk.ijse.GDSE65.HelloShoes.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity, String> {

}
