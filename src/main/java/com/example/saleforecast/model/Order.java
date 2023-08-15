package com.example.saleforecast.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
public class Order {

  private int id;
  private User user;
  private LocalDateTime dateTime;
  private List<OrderItem> orderItemList;
  private BigDecimal totalAmount;
}
