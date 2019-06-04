package com.daxia.eshop.one.fallback;

import com.daxia.eshop.one.service.EshopInventoryService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/4 11:46
 * @Version 1.0
 */

@Component
public class EshopInventoryServiceFallback implements EshopInventoryService {
    @Override
    public String findByProductId(Long productId) {
        return "降级库存数据";
    }
}
