package com.ecommerce.inventoryservice.repository;

import com.ecommerce.inventoryservice.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRespository extends JpaRepository<Inventory,Long> {
Inventory findInventoryByProudctId(Long productId);
List<Inventory> findByProudctIdIn(List<Long> productId);
}
