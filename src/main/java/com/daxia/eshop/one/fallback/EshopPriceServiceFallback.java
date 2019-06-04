package com.daxia.eshop.one.fallback;

import com.daxia.eshop.one.service.EshopPriceService;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/4 11:48
 * @Version 1.0
 */

@Component
public class EshopPriceServiceFallback implements EshopPriceService {
    @Override
    public String findByProductId(Long productId) {
        return "降级价格数据";
    }
}
