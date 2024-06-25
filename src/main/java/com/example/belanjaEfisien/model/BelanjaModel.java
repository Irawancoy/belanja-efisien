package com.example.belanjaEfisien.model;

import java.util.List;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BelanjaModel {
   private List<String> items;
   private int totalCost;

}