package com.example.belanjaEfisien.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.belanjaEfisien.service.BelanjaService;


@RestController
@RequestMapping("/belanja")
public class BelanjaController {

   @Autowired
   private BelanjaService belanjaService;

   @GetMapping("/best-option")
   public ResponseEntity<?>getBestPurchaseOption(@RequestParam int budget) {
        return belanjaService.getBestPurchaseOption(budget);
   }
}
