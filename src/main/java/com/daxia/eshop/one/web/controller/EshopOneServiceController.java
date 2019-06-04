package com.daxia.eshop.one.web.controller;

import com.daxia.eshop.one.service.EshopInventoryService;
import com.daxia.eshop.one.service.EshopPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/4 11:33
 * @Version 1.0
 */

@RestController
@RequestMapping("/one")
public class EshopOneServiceController {
    
    @Autowired
    private EshopInventoryService eshopInventoryService;
    
    @Autowired
    private EshopPriceService eshopPriceService;
    
    @RequestMapping("/findInventoryByProductId")
    public String findInventoryByProductId(Long productId){
        return eshopInventoryService.findByProductId(productId);
    }
    
    @RequestMapping("/findPriceByProductId")
    public String findPriceByProductId(Long productId){
        return eshopPriceService.findByProductId(productId);
    }
}
