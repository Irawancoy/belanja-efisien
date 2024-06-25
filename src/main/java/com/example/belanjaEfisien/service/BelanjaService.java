package com.example.belanjaEfisien.service;

import com.example.belanjaEfisien.model.BelanjaModel;
import java.util.*;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BelanjaService {

    private final int[] keyboardPrices = {50000, 40000, 30000}; 
    private final int[] mousePrices = {12000, 20000, 35000};

    public ResponseEntity<?> getBestPurchaseOption(int budget) {
        List<String> bestCombination = new ArrayList<>();
        int closestSum = 0;

        // Mencari kombinasi keyboard dan mouse yang paling mendekati budget
        for (int keyboardPrice : keyboardPrices) {
            for (int mousePrice : mousePrices) {
                int total = keyboardPrice + mousePrice;
                if (total <= budget && total > closestSum) {
                    closestSum = total;
                    bestCombination.clear();
                    bestCombination.add("Keyboard: " + keyboardPrice);
                    bestCombination.add("Mouse: " + mousePrice);
                }
            }
        }

        return ResponseEntity.ok(new BelanjaModel(bestCombination, closestSum));
    }
}
