package com.gree.greemall.manage.controller;

import com.gree.greemall.common.dto.OrderDO;
import com.gree.greemall.common.vo.OrderQueryVO;
import com.gree.greemall.util.ReturnT;
import com.gree.greemall.util.SystemCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/manage/order")
public class OrderController {

    static List<OrderDO> list = new ArrayList<OrderDO>();


    @RequestMapping("/list")
    public ReturnT<List<OrderDO>> list(@RequestBody OrderQueryVO orderVo){

        return ReturnT.success(list);
    }
    @RequestMapping("/list1")
    public ReturnT<List<OrderDO>> list1(@RequestBody OrderQueryVO orderVo){

        return ReturnT.failed(SystemCode.SYSTEM_CODE_401);
    }
    @RequestMapping("/add")
    public ReturnT<List<OrderDO>> add(@RequestBody OrderDO orderVo){
        log.info("订单： {}",orderVo);
        return ReturnT.success(list);
    }



    static {

        OrderDO o1 = OrderDO.builder()
                .address("福建省泰宁县梅口乡11")
                .orderCode("TMS000222111")
                .orderTime(LocalDateTime.of(2024, 1, 1, 1, 8))
                .goodsName("变频XXX-P001111")
                .build();
        OrderDO o2 = OrderDO.builder()
                .address("福建省泰宁县梅口乡22")
                .orderCode("TMS000222122")
                .orderTime(LocalDateTime.of(2024, 2, 2, 2, 8))
                .goodsName("变频XXX-P001222")
                .build();
        OrderDO o3 = OrderDO.builder()
                .address("福建省泰宁县梅口乡33")
                .orderCode("TMS000222133")
                .orderTime(LocalDateTime.of(2024, 3, 3, 3, 8))
                .goodsName("变频XXX-P001333")
                .build();

            list.add(o1);
            list.add(o2);
            list.add(o3);
    }

}



