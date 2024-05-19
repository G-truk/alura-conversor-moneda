package com.kurt.moneyconverter.models;

import java.util.Map;

public record Money(Map<String, Double> conversion_rates) {
}
