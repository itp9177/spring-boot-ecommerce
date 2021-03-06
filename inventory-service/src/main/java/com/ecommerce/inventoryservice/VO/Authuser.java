package com.ecommerce.inventoryservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Authuser {
    private Long id;
    private String username;
    private String email;
    List<Object> appUserRoles;
}
