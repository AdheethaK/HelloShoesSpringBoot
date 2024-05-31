package lk.ijse.GDSE65.HelloShoes.dao;

import lk.ijse.GDSE65.HelloShoes.dto.CustomerDTO;
import lk.ijse.GDSE65.HelloShoes.entity.CustomerEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity, String> {
    @Query(nativeQuery = true, value = "SELECT * FROM customer c WHERE c.customer_code LIKE CONCAT(:customerCode, '%')")
    CustomerEntity getCustomerEntityStartingBy(@Param("customerCode") String customerCode);

    @Query(nativeQuery = true, value = "SELECT c.customer_code FROM customer c WHERE c.customer_code LIKE CONCAT(:customerCode, '%')")
    String getCustomerFullCodeBy(@Param("customerCode") String customerCode);

    @Transactional
//    The EntityManager doesn't flush change automatically by default
    @Modifying(flushAutomatically = true, clearAutomatically = true)
    @Query(nativeQuery = true,value = "UPDATE customer c SET " +
            "c.customer_name = :customerName, " +
            "c.customer_gender = :customerGender, " +
            "c.customer_joined_date = :customerJoinedDate, " +
            "c.customer_level = :customerLevel, " +
            "c.customer_total_points = :customerTotalPoints, " +
            "c.customer_dob = :customerDob, " +
            "c.customer_address_building_no_or_name = :customerAddressBuildingNoOrLane, " +
            "c.customer_address_lane = :customerAddressLane, " +
            "c.customer_address_main_city = :customerAddressMainCity, " +
            "c.customer_address_main_state = :customerAddressMainState, " +
            "c.customer_address_postal_code = :customerAddressPostalCode, " +
            "c.customer_contact_no = :customerContactNo, " +
            "c.customer_email = :customerEmail, " +
            "c.customer_recent_purchase = :customerRecentPurchase " +
            "WHERE c.customer_code = :customerCode")
        //    UPDATE table_name SET column1 = value1, column2 = value2, ...WHERE condition;
    int update(
            @Param("customerCode") String customerCode,
            @Param("customerName") String customerName,
            @Param("customerGender") String customerGender,
            @Param("customerJoinedDate") String customerJoinedDate,
            @Param("customerLevel") String customerLevel,
            @Param("customerTotalPoints") String customerTotalPoints,
            @Param("customerDob") String customerDob,
            @Param("customerAddressBuildingNoOrLane") String customerAddressBuildingNoOrLane,
            @Param("customerAddressLane") String customerAddressLane,
            @Param("customerAddressMainCity") String customerAddressMainCity,
            @Param("customerAddressMainState") String customerAddressMainState,
            @Param("customerAddressPostalCode") String customerAddressPostalCode,
            @Param("customerContactNo") String customerContactNo,
            @Param("customerEmail") String customerEmail,
            @Param("customerRecentPurchase") String customerRecentPurchase);
}
