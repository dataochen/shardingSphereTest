package org.cdt.DO;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单商品表/order SPU table
 *
 * @author Mybatis Generator
 * @date 2020-12-09
 */
public class OrderSpu {
    /**
     * 主键/primary key
     */
    private Long id;

    /**
     * 订单SPU主键order SPU ID
     */
    private String orderSpuId;

    /**
     * 订单ID/order ID
     */
    private String orderId;

    /**
     * 商户ID/merchant ID
     */
    private String merchantId;

    /**
     * 店铺ID/shop ID
     */
    private String shopId;

    /**
     * 用户ID/user ID
     */
    private String userId;

    /**
     * SKU ID/SKU ID
     */
    private String skuId;

    /**
     * SKU名称/SKU name
     */
    private String skuName;

    /**
     * sku类别名称/class name
     */
    private String className;

    /**
     * sku主图url/sku logo url
     */
    private String skuLogo;

    /**
     * SPU数量/SPU count
     */
    private Integer spuCount;

    /**
     * SPU单价/SPU unit price
     */
    private BigDecimal spuUnitPrice;

    /**
     * SPU总价/SPU total price
     */
    private BigDecimal spuTotalPrice;

    /**
     * 创建时间/created time
     */
    private Date createdTime;

    /**
     * 修改时间/modified time
     */
    private Date modifiedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderSpuId() {
        return orderSpuId;
    }

    public void setOrderSpuId(String orderSpuId) {
        this.orderSpuId = orderSpuId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSkuLogo() {
        return skuLogo;
    }

    public void setSkuLogo(String skuLogo) {
        this.skuLogo = skuLogo;
    }

    public Integer getSpuCount() {
        return spuCount;
    }

    public void setSpuCount(Integer spuCount) {
        this.spuCount = spuCount;
    }

    public BigDecimal getSpuUnitPrice() {
        return spuUnitPrice;
    }

    public void setSpuUnitPrice(BigDecimal spuUnitPrice) {
        this.spuUnitPrice = spuUnitPrice;
    }

    public BigDecimal getSpuTotalPrice() {
        return spuTotalPrice;
    }

    public void setSpuTotalPrice(BigDecimal spuTotalPrice) {
        this.spuTotalPrice = spuTotalPrice;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}