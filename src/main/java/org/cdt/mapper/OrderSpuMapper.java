package org.cdt.mapper;


import org.cdt.DO.OrderSpu;
import org.cdt.DO.OrderSpuExample;

import java.util.List;

/**
 * Created by Mybatis Generator
 *
 * @author Mybatis Generator
 * @date 2020-11-11
 */
public interface OrderSpuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderSpu record);

    int insertSelective(OrderSpu record);

    List<OrderSpu> selectByExample(OrderSpuExample example);

    OrderSpu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderSpu record);

    int updateByPrimaryKey(OrderSpu record);
}