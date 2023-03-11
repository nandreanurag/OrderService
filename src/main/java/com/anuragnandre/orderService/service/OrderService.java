package com.anuragnandre.orderService.service;

import com.anuragnandre.orderService.model.OrderRequest;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);
}