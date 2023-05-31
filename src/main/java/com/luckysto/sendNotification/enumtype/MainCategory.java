package com.luckysto.sendNotification.enumtype;

import java.util.Arrays;

public enum MainCategory {
    EMAIL("EMAIL"),
    SMS("SMS"),
    PUSH("PUSH"),
    EMPTY("");

    private String category;

    public String getCategory() {
        return category;
    }

    MainCategory(String mainCategory){
        this.category = mainCategory;
    }

    public static MainCategory findByCode(String code){
        return Arrays.stream(MainCategory.values())
                        .filter(provider -> provider.getCategory().equals(code))
                        .findFirst()
                        .orElse(EMPTY);
    }
}