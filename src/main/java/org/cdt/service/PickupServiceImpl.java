package org.cdt.service;

import org.cdt.DO.PickupOrder;
import org.cdt.DO.PickupOrderExample;
import org.cdt.mapper.PickupOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author dataochen
 * @Description
 * @date: 2020/12/21 15:33
 */
@Component
public class PickupServiceImpl {
    @Autowired
    private PickupOrderMapper pickupOrderMapper;

    public List<PickupOrder> queryList(String orderId) {
        PickupOrderExample pickupOrderExample = new PickupOrderExample();
        PickupOrderExample.Criteria criteria = pickupOrderExample.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        return pickupOrderMapper.selectByExample(pickupOrderExample);
    }

    public List<PickupOrder> queryList4Id(Long id) {
        PickupOrderExample pickupOrderExample = new PickupOrderExample();
        PickupOrderExample.Criteria criteria = pickupOrderExample.createCriteria();
        criteria.andIdEqualTo(id);
        return pickupOrderMapper.selectByExample(pickupOrderExample);
    }

    public List<PickupOrder> queryList4ShopId(String shopId) {
        PickupOrderExample pickupOrderExample = new PickupOrderExample();
        PickupOrderExample.Criteria criteria = pickupOrderExample.createCriteria();
        criteria.andShopIdEqualTo(shopId);
        return pickupOrderMapper.selectByExample(pickupOrderExample);
    }

    public List<PickupOrder> queryList4In(List<String> orderIds) {
        PickupOrderExample pickupOrderExample = new PickupOrderExample();
        PickupOrderExample.Criteria criteria = pickupOrderExample.createCriteria();
        criteria.andOrderIdIn(orderIds);
        return pickupOrderMapper.selectByExample(pickupOrderExample);
    }

    public List<PickupOrder> queryList4Between(String orderId1, String orderId2) {
        PickupOrderExample pickupOrderExample = new PickupOrderExample();
        PickupOrderExample.Criteria criteria = pickupOrderExample.createCriteria();
        criteria.andOrderIdBetween(orderId1, orderId2);
        return pickupOrderMapper.selectByExample(pickupOrderExample);
    }

    public Map<String, String> queryJoin(String orderId) {
        return pickupOrderMapper.queryJoin(orderId);
    }

    public void insert() {
        PickupOrder pickupOrder = new PickupOrder();
        pickupOrder.setCreatedTime(new Date());
        pickupOrder.setOrderId(UUID.randomUUID().toString().replaceAll("-", ""));
//        pickupOrder.setOrderId(System.currentTimeMillis()+"");
        pickupOrder.setMerchantId("test");
        pickupOrderMapper.insertSelective(pickupOrder);
    }


    public void update(PickupOrder pickupOrder) {
        pickupOrderMapper.updateByPrimaryKeySelective(pickupOrder);
    }

    public void insertBatch() {
        PickupOrder pickupOrder = new PickupOrder();
        pickupOrder.setCreatedTime(new Date());
        pickupOrder.setOrderId("900");
//        pickupOrder.setOrderId(System.currentTimeMillis()+"");
        pickupOrder.setMerchantId("test");
        PickupOrder pickupOrder2 = new PickupOrder();
        pickupOrder2.setCreatedTime(new Date());
        pickupOrder2.setOrderId("901");
        pickupOrder2.setMerchantId("test");
        PickupOrder pickupOrder3 = new PickupOrder();
        pickupOrder3.setCreatedTime(new Date());
        pickupOrder3.setOrderId("902");
        pickupOrder3.setMerchantId("test");
        PickupOrder pickupOrder4= new PickupOrder();
        pickupOrder4.setCreatedTime(new Date());
        pickupOrder4.setOrderId("903");
        pickupOrder4.setMerchantId("test");
        ArrayList<PickupOrder> pickupOrders = new ArrayList<>();
        pickupOrders.add(pickupOrder);
        pickupOrders.add(pickupOrder2);
        pickupOrders.add(pickupOrder3);
        pickupOrders.add(pickupOrder4);
        pickupOrderMapper.insertBatchSelective(pickupOrders);
    }
}
