package com.daxia.eshop.one.service;

import com.daxia.eshop.one.fallback.EshopInventoryServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/4 11:11
 * @Version 1.0
 */

@FeignClient(value = "eshop-inventory-service", fallback = EshopInventoryServiceFallback.class)
public interface EshopInventoryService {
    
    @RequestMapping(value = "/productInventory/findByProductId", method = RequestMethod.GET)
    String findByProductId(@RequestParam(value = "productId") Long productId);
    
}
