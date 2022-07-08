package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Customerdto {
    String cusID;
    String name;
    String Address;
    String IDcard;
    String drivinglicence;
    int contactno;


}
