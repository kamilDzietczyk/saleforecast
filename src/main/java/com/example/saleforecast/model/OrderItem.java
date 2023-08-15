package com.example.saleforecast.model;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class OrderItem {

  private int orderId;
  private Product product;
  private int quantity;
  private BigDecimal unitPrice;
}
