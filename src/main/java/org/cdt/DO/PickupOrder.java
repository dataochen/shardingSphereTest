package org.cdt.DO;


import java.math.BigDecimal;
import java.util.Date;

/**
 * pickup订单表/pickup order base table
 *
 * @author Mybatis Generator
 * @date 2020-11-24
 */
public class PickupOrder {
    /**
     * 主键/primary key
     */
    private Long id;

    /**
     * 订单ID/order ID
     */
    private String orderId;

    /**
     * 商户ID/merchant ID
     */
    private String merchantId;

    /**
     * 商户名称/merchant name
     */
    private String merchantName;

    /**
     * 店铺ID/shop ID
     */
    private String shopId;

    /**
     * 店铺名称/shop name
     */
    private String shopName;

    /**
     * 用户ID/user ID
     */
    private String userId;

    /**
     * 支付过期时间/payment expiry time
     */
    private Date paymentExpiryTime;

    /**
     * 收银台地址/cashier URL
     */
    private String cashierUrl;

    /**
     * 支付状态/payment status(UNPAID|PAID|REFUNDING|REFUNDED|REFUND_FAIL)
     */
    private String paymentStatus;

    /**
     * 支付单号/payment number
     */
    private String paymentNo;

    /**
     * 支付完成时间/payment finished time
     */
    private Date paymentFinishedTime;

    /**
     * 退款单号/refund number
     */
    private String refundNo;

    /**
     * 退款发起时间/refund started time
     */
    private Date refundStartedTime;

    /**
     * 退款完成时间/refund finished time
     */
    private Date refundFinishedTime;

    /**
     * 退款操作员/refund operator
     */
    private String refundOperator;

    /**
     * 优惠券退款状态/coupon refund status(NONEED|REFUNDING|REFUNDED)
     */
    private String couponRefundStatus;

    /**
     * 订单状态/order status(INIT|PENDING|ACCEPTED|CANCELED|REFUSED)
     */
    private String orderStatus;

    /**
     * 订单过期时间/order expiry time
     */
    private Date orderExpiryTime;

    /**
     * 取消类型 超时未支付|用户手动取消订单 /cancel type(ORDER_EXPIRE|CANCEL_USER)
     */
    private String cancelType;

    /**
     * 取消原因/cancel reason
     */
    private String cancelRemark;

    /**
     * 退款类型/refund type
     */
    private String refundType;

    /**
     * 退款原因/refund reason
     */
    private String refundRemark;

    /**
     * 退款失败原因/refund fail message
     */
    private String refundErrorMsg;

    /**
     * 退款失败码/refund fail code
     */
    private String refundErrorCode;

    /**
     * 商户操作时间/merchant operate time
     */
    private Date merchantOperateTime;

    /**
     * 商户操作员/merchant operator
     */
    private String operator;

    /**
     * 操作类型/operation type AUTO MANUAL
     */
    private String operationType;

    /**
     * 取餐人姓名/pickup name
     */
    private String pickupName;

    /**
     * 取餐时间/pickup time
     */
    private Date pickupTime;

    /**
     * 取餐电话/pickup phone number
     */
    private String pickupPhone;

    /**
     * 取餐码/pickup code
     */
    private String pickupCode;

    /**
     * 国家编码/country code
     */
    private String countryCode;

    /**
     * 订单金额/total goods amount
     */
    private BigDecimal orderAmount;

    /**
     * 币种/currency
     */
    private String currency;

    /**
     * 折扣金额/total discount amount
     */
    private BigDecimal discountAmount;

    /**
     * 支付金额/payment amount required
     */
    private BigDecimal paymentAmount;

    /**
     * 订单备注信息/order additional info
     */
    private String orderAdditionalInfo;

    /**
     * 商户通知状态/merchant notify status
     */
    private String merchantNotifyStatus;

    /**
     * 用户通知状态/user notify status
     */
    private String userNotifyStatus;

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

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getPaymentExpiryTime() {
        return paymentExpiryTime;
    }

    public void setPaymentExpiryTime(Date paymentExpiryTime) {
        this.paymentExpiryTime = paymentExpiryTime;
    }

    public String getCashierUrl() {
        return cashierUrl;
    }

    public void setCashierUrl(String cashierUrl) {
        this.cashierUrl = cashierUrl;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public Date getPaymentFinishedTime() {
        return paymentFinishedTime;
    }

    public void setPaymentFinishedTime(Date paymentFinishedTime) {
        this.paymentFinishedTime = paymentFinishedTime;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public Date getRefundStartedTime() {
        return refundStartedTime;
    }

    public void setRefundStartedTime(Date refundStartedTime) {
        this.refundStartedTime = refundStartedTime;
    }

    public Date getRefundFinishedTime() {
        return refundFinishedTime;
    }

    public void setRefundFinishedTime(Date refundFinishedTime) {
        this.refundFinishedTime = refundFinishedTime;
    }

    public String getRefundOperator() {
        return refundOperator;
    }

    public void setRefundOperator(String refundOperator) {
        this.refundOperator = refundOperator;
    }

    public String getCouponRefundStatus() {
        return couponRefundStatus;
    }

    public void setCouponRefundStatus(String couponRefundStatus) {
        this.couponRefundStatus = couponRefundStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderExpiryTime() {
        return orderExpiryTime;
    }

    public void setOrderExpiryTime(Date orderExpiryTime) {
        this.orderExpiryTime = orderExpiryTime;
    }

    public String getCancelType() {
        return cancelType;
    }

    public void setCancelType(String cancelType) {
        this.cancelType = cancelType;
    }

    public String getCancelRemark() {
        return cancelRemark;
    }

    public void setCancelRemark(String cancelRemark) {
        this.cancelRemark = cancelRemark;
    }

    public String getRefundType() {
        return refundType;
    }

    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    public String getRefundRemark() {
        return refundRemark;
    }

    public void setRefundRemark(String refundRemark) {
        this.refundRemark = refundRemark;
    }

    public String getRefundErrorMsg() {
        return refundErrorMsg;
    }

    public void setRefundErrorMsg(String refundErrorMsg) {
        this.refundErrorMsg = refundErrorMsg;
    }

    public String getRefundErrorCode() {
        return refundErrorCode;
    }

    public void setRefundErrorCode(String refundErrorCode) {
        this.refundErrorCode = refundErrorCode;
    }

    public Date getMerchantOperateTime() {
        return merchantOperateTime;
    }

    public void setMerchantOperateTime(Date merchantOperateTime) {
        this.merchantOperateTime = merchantOperateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getPickupName() {
        return pickupName;
    }

    public void setPickupName(String pickupName) {
        this.pickupName = pickupName;
    }

    public Date getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(Date pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getPickupPhone() {
        return pickupPhone;
    }

    public void setPickupPhone(String pickupPhone) {
        this.pickupPhone = pickupPhone;
    }

    public String getPickupCode() {
        return pickupCode;
    }

    public void setPickupCode(String pickupCode) {
        this.pickupCode = pickupCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getOrderAdditionalInfo() {
        return orderAdditionalInfo;
    }

    public void setOrderAdditionalInfo(String orderAdditionalInfo) {
        this.orderAdditionalInfo = orderAdditionalInfo;
    }

    public String getMerchantNotifyStatus() {
        return merchantNotifyStatus;
    }

    public void setMerchantNotifyStatus(String merchantNotifyStatus) {
        this.merchantNotifyStatus = merchantNotifyStatus;
    }

    public String getUserNotifyStatus() {
        return userNotifyStatus;
    }

    public void setUserNotifyStatus(String userNotifyStatus) {
        this.userNotifyStatus = userNotifyStatus;
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