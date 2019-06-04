package com.daxia.eshop.one.service;

import com.daxia.eshop.one.fallback.EshopPriceServiceFallback;
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

@FeignClient(value = "eshop-price-service", fallback = EshopPriceServiceFallback.class)
public interface EshopPriceService {
    
    @RequestMapping(value = "/productPrice/findByProductId", method = RequestMethod.GET)
    String findByProductId(@RequestParam(value = "productId") Long productId);
    
}
