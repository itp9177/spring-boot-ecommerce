package com.ecommerce.inventoryservice.controller;

import com.ecommerce.inventoryservice.entity.Inventory;
import com.ecommerce.inventoryservice.repository.InventoryRespository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/inventory")
public class InventoryController {
private InventoryRespository inventoryRespository;

@PostMapping("/add")
    public Inventory create(@RequestBody Inventory inventory){
   return inventoryRespository.save(inventory);
}
@GetMapping("/show/{id}")
    public Inventory show(@PathVariable Long id){
    return inventoryRespository.findInventoryByProudctId(id);
}
}
