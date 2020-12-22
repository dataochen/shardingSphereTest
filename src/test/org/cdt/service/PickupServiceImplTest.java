package org.cdt.service;

import com.alibaba.fastjson.JSONObject;
import org.cdt.BaseTest;
import org.cdt.DO.PickupOrder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author dataochen
 * @Description
 * @date: 2020/12/21 15:39
 */

public class PickupServiceImplTest extends BaseTest{
    @Autowired
    private PickupServiceImpl pickupService;

    @Test
    public void queryList() throws Exception {
        List<PickupOrder> pickupOrders =
                pickupService.queryList("1608602448495");
        System.out.println(JSONObject.toJSONString(pickupOrders));
    }
    @Test
    public void queryList4Id() throws Exception {
        List<PickupOrder> pickupOrders =
                pickupService.queryList4Id(6L);
        System.out.println(JSONObject.toJSONString(pickupOrders));
    }
    @Test
    public void queryList4ShopId() throws Exception {
        List<PickupOrder> pickupOrders =
                pickupService.queryList4ShopId("test001");
        System.out.println(JSONObject.toJSONString(pickupOrders));
    }

    @Test
    public void queryList4In() throws Exception {
        List<PickupOrder> pickupOrders = pickupService.queryList4In(Arrays.asList("1608602448495", "1608602227039", "123", "124", "125"));
//        List<PickupOrder> pickupOrders = pickupService.queryList4In(Arrays.asList("1608602448495"));
        System.out.println(JSONObject.toJSONString(pickupOrders));
    }

    @Test
    public void queryList4Between() throws Exception {
        List<PickupOrder> pickupOrders = pickupService.queryList4Between("123", "125");
        System.out.println(JSONObject.toJSONString(pickupOrders));
    }

    @Test
    public void queryJoin() {
        Map<String, String> stringStringMap = pickupService.queryJoin("1608602448495");
        System.out.println(JSONObject.toJSONString(stringStringMap));

    }
    @Test
    public void insert() throws Exception {
        for (int i = 0; i < 100; i++) {
            pickupService.insert();
        }
    }

    @Test
    public void update() {
        PickupOrder pickupOrder = new PickupOrder();
//        pickupOrder.setOrderId("1608602448495");
        pickupOrder.setId(548096618604269568L);
        pickupOrder.setCashierUrl("testtt1");
        pickupService.update(pickupOrder);
    }

    @Test
    public void insertBatch() throws Exception {
        pickupService.insertBatch();
    }

}