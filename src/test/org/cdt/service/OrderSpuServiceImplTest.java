package org.cdt.service;

import org.cdt.BaseTest;
import org.cdt.DO.OrderSpu;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author dataochen
 * @Description
 * @date: 2020/12/22 11:21
 */
public class OrderSpuServiceImplTest extends BaseTest {
    @Autowired
    private OrderSpuServiceImpl orderSpuService;

    @Test
    public void queryList() throws Exception {
        List<OrderSpu> orderSpus = orderSpuService.queryList("");
    }

    @Test
    public void insert() {
        for (int i = 0; i < 100; i++) {
            orderSpuService.insert();
        }
    }

}