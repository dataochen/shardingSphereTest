package org.cdt.service;

import org.cdt.DO.OrderSpu;
import org.cdt.DO.OrderSpuExample;
import org.cdt.mapper.OrderSpuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author dataochen
 * @Description
 * @date: 2020/12/22 11:20
 */
@Component
public class OrderSpuServiceImpl {
    @Autowired
    private OrderSpuMapper orderSpuMapper;

    public List<OrderSpu> queryList(String orderId) {
        OrderSpuExample orderSpuExample = new OrderSpuExample();
        OrderSpuExample.Criteria criteria = orderSpuExample.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        return orderSpuMapper.selectByExample(orderSpuExample);
    }

    public void insert() {
        OrderSpu orderSpu = new OrderSpu();
        orderSpu.setOrderId(System.currentTimeMillis() + "");
        orderSpu.setCreatedTime(new Date());
        orderSpu.setSkuId("test001");
        orderSpu.setMerchantId("test");
        orderSpu.setShopId("t");
        orderSpu.setUserId("c");

        orderSpuMapper.insertSelective(orderSpu);
    }
}
