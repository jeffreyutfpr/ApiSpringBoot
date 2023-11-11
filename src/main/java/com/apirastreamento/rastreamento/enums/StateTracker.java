package com.apirastreamento.rastreamento.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StateTracker {

    PENDING("Pending"),
    DELIVERED("Delivered");
    private final String text;
}
