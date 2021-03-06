package com.luojay.sell.dto;

import lombok.Data;

/**
 * 购物车DTO
 */
@Data
public class CartDTO {
    //商品Id
    private String productId;
    //商品数量
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
