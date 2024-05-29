package lk.ijse.GDSE65.HelloShoes.dao;

import lk.ijse.GDSE65.HelloShoes.dto.CustomerDTO;
import lk.ijse.GDSE65.HelloShoes.entity.CustomerEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity, String> {
    @Query(nativeQuery = true, value = "SELECT * FROM customer c WHERE c.customer_code LIKE CONCAT(:customerCode, '%')")
    CustomerEntity getCustomerEntityStartingBy(@Param("customerCode") String customerCode);
}
