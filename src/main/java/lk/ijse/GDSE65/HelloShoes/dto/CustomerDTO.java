package lk.ijse.GDSE65.HelloShoes.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CustomerDTO {
    private String customer_code;
    private String customer_name;
    private String customer_gender;
    private String customer_joined_date;
    private String customer_level;
    private String customer_total_points;
    private String customer_dob;
    private String customer_address_building_no_or_name;
    private String customer_address_lane;
    private String customer_address_main_city;
    private String customer_address_main_state;
    private String customer_address_postal_code;
    private String customer_contact_no;
    private String customer_email;
    private String customer_recent_purchase;
}
