package com.example.saleforecast.model;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Product {

  private int id;
  private Category category;
  private String name;
  private String description;
  private BigDecimal price;
  private String unitOfMeasure;
}
