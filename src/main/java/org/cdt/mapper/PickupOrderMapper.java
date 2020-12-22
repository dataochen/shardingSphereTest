package org.cdt.mapper;


import org.cdt.DO.PickupOrder;
import org.cdt.DO.PickupOrderExample;

import java.util.List;
import java.util.Map;

/**
 * Created by Mybatis Generator
 *
 * @author Mybatis Generator
 * @date 2020-11-11
 */
public interface PickupOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PickupOrder record);

    int insertSelective(PickupOrder record);

    List<PickupOrder> selectByExample(PickupOrderExample example);
    Map<String,String> queryJoin(String orderId);

    PickupOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PickupOrder record);

    int updateByPrimaryKey(PickupOrder record);

    void insertBatchSelective(List<PickupOrder> pickupOrders);
}