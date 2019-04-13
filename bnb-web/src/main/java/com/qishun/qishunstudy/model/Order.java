package com.qishun.qishunstudy.model;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private Integer orderId;

    private String orderName;

    private Date orderTime;

    private String orderMemo;
}