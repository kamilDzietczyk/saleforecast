package com.example.saleforecast.model;

import lombok.Data;

@Data
public class User {

  int id;
  String name;
  String email;
  String password;
  Role role;
}
