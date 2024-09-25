package com.gree.greemall.common.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class OrderDO {

    private String orderCode;

    private String address;

    private String goodsName;

    private String username;

    private LocalDateTime orderTime;

}
