package org.cdt.DO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PickupOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PickupOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(String value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(String value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(String value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(String value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLike(String value) {
            addCriterion("merchant_id like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotLike(String value) {
            addCriterion("merchant_id not like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<String> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<String> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(String value1, String value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(String value1, String value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("merchant_name like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(String value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(String value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(String value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(String value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(String value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLike(String value) {
            addCriterion("shop_id like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotLike(String value) {
            addCriterion("shop_id not like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<String> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<String> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(String value1, String value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(String value1, String value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiryTimeIsNull() {
            addCriterion("payment_expiry_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiryTimeIsNotNull() {
            addCriterion("payment_expiry_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiryTimeEqualTo(Date value) {
            addCriterion("payment_expiry_time =", value, "paymentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiryTimeNotEqualTo(Date value) {
            addCriterion("payment_expiry_time <>", value, "paymentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiryTimeGreaterThan(Date value) {
            addCriterion("payment_expiry_time >", value, "paymentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_expiry_time >=", value, "paymentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiryTimeLessThan(Date value) {
            addCriterion("payment_expiry_time <", value, "paymentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiryTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_expiry_time <=", value, "paymentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiryTimeIn(List<Date> values) {
            addCriterion("payment_expiry_time in", values, "paymentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiryTimeNotIn(List<Date> values) {
            addCriterion("payment_expiry_time not in", values, "paymentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiryTimeBetween(Date value1, Date value2) {
            addCriterion("payment_expiry_time between", value1, value2, "paymentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andPaymentExpiryTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_expiry_time not between", value1, value2, "paymentExpiryTime");
            return (Criteria) this;
        }

        public Criteria andCashierUrlIsNull() {
            addCriterion("cashier_url is null");
            return (Criteria) this;
        }

        public Criteria andCashierUrlIsNotNull() {
            addCriterion("cashier_url is not null");
            return (Criteria) this;
        }

        public Criteria andCashierUrlEqualTo(String value) {
            addCriterion("cashier_url =", value, "cashierUrl");
            return (Criteria) this;
        }

        public Criteria andCashierUrlNotEqualTo(String value) {
            addCriterion("cashier_url <>", value, "cashierUrl");
            return (Criteria) this;
        }

        public Criteria andCashierUrlGreaterThan(String value) {
            addCriterion("cashier_url >", value, "cashierUrl");
            return (Criteria) this;
        }

        public Criteria andCashierUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cashier_url >=", value, "cashierUrl");
            return (Criteria) this;
        }

        public Criteria andCashierUrlLessThan(String value) {
            addCriterion("cashier_url <", value, "cashierUrl");
            return (Criteria) this;
        }

        public Criteria andCashierUrlLessThanOrEqualTo(String value) {
            addCriterion("cashier_url <=", value, "cashierUrl");
            return (Criteria) this;
        }

        public Criteria andCashierUrlLike(String value) {
            addCriterion("cashier_url like", value, "cashierUrl");
            return (Criteria) this;
        }

        public Criteria andCashierUrlNotLike(String value) {
            addCriterion("cashier_url not like", value, "cashierUrl");
            return (Criteria) this;
        }

        public Criteria andCashierUrlIn(List<String> values) {
            addCriterion("cashier_url in", values, "cashierUrl");
            return (Criteria) this;
        }

        public Criteria andCashierUrlNotIn(List<String> values) {
            addCriterion("cashier_url not in", values, "cashierUrl");
            return (Criteria) this;
        }

        public Criteria andCashierUrlBetween(String value1, String value2) {
            addCriterion("cashier_url between", value1, value2, "cashierUrl");
            return (Criteria) this;
        }

        public Criteria andCashierUrlNotBetween(String value1, String value2) {
            addCriterion("cashier_url not between", value1, value2, "cashierUrl");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNull() {
            addCriterion("payment_status is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("payment_status is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(String value) {
            addCriterion("payment_status =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(String value) {
            addCriterion("payment_status <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(String value) {
            addCriterion("payment_status >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("payment_status >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(String value) {
            addCriterion("payment_status <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(String value) {
            addCriterion("payment_status <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLike(String value) {
            addCriterion("payment_status like", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotLike(String value) {
            addCriterion("payment_status not like", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<String> values) {
            addCriterion("payment_status in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<String> values) {
            addCriterion("payment_status not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(String value1, String value2) {
            addCriterion("payment_status between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(String value1, String value2) {
            addCriterion("payment_status not between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIsNull() {
            addCriterion("payment_no is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIsNotNull() {
            addCriterion("payment_no is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoEqualTo(String value) {
            addCriterion("payment_no =", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotEqualTo(String value) {
            addCriterion("payment_no <>", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThan(String value) {
            addCriterion("payment_no >", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThanOrEqualTo(String value) {
            addCriterion("payment_no >=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThan(String value) {
            addCriterion("payment_no <", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThanOrEqualTo(String value) {
            addCriterion("payment_no <=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLike(String value) {
            addCriterion("payment_no like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotLike(String value) {
            addCriterion("payment_no not like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIn(List<String> values) {
            addCriterion("payment_no in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotIn(List<String> values) {
            addCriterion("payment_no not in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoBetween(String value1, String value2) {
            addCriterion("payment_no between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotBetween(String value1, String value2) {
            addCriterion("payment_no not between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentFinishedTimeIsNull() {
            addCriterion("payment_finished_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentFinishedTimeIsNotNull() {
            addCriterion("payment_finished_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentFinishedTimeEqualTo(Date value) {
            addCriterion("payment_finished_time =", value, "paymentFinishedTime");
            return (Criteria) this;
        }

        public Criteria andPaymentFinishedTimeNotEqualTo(Date value) {
            addCriterion("payment_finished_time <>", value, "paymentFinishedTime");
            return (Criteria) this;
        }

        public Criteria andPaymentFinishedTimeGreaterThan(Date value) {
            addCriterion("payment_finished_time >", value, "paymentFinishedTime");
            return (Criteria) this;
        }

        public Criteria andPaymentFinishedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_finished_time >=", value, "paymentFinishedTime");
            return (Criteria) this;
        }

        public Criteria andPaymentFinishedTimeLessThan(Date value) {
            addCriterion("payment_finished_time <", value, "paymentFinishedTime");
            return (Criteria) this;
        }

        public Criteria andPaymentFinishedTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_finished_time <=", value, "paymentFinishedTime");
            return (Criteria) this;
        }

        public Criteria andPaymentFinishedTimeIn(List<Date> values) {
            addCriterion("payment_finished_time in", values, "paymentFinishedTime");
            return (Criteria) this;
        }

        public Criteria andPaymentFinishedTimeNotIn(List<Date> values) {
            addCriterion("payment_finished_time not in", values, "paymentFinishedTime");
            return (Criteria) this;
        }

        public Criteria andPaymentFinishedTimeBetween(Date value1, Date value2) {
            addCriterion("payment_finished_time between", value1, value2, "paymentFinishedTime");
            return (Criteria) this;
        }

        public Criteria andPaymentFinishedTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_finished_time not between", value1, value2, "paymentFinishedTime");
            return (Criteria) this;
        }

        public Criteria andRefundNoIsNull() {
            addCriterion("refund_no is null");
            return (Criteria) this;
        }

        public Criteria andRefundNoIsNotNull() {
            addCriterion("refund_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefundNoEqualTo(String value) {
            addCriterion("refund_no =", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotEqualTo(String value) {
            addCriterion("refund_no <>", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoGreaterThan(String value) {
            addCriterion("refund_no >", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoGreaterThanOrEqualTo(String value) {
            addCriterion("refund_no >=", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoLessThan(String value) {
            addCriterion("refund_no <", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoLessThanOrEqualTo(String value) {
            addCriterion("refund_no <=", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoLike(String value) {
            addCriterion("refund_no like", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotLike(String value) {
            addCriterion("refund_no not like", value, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoIn(List<String> values) {
            addCriterion("refund_no in", values, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotIn(List<String> values) {
            addCriterion("refund_no not in", values, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoBetween(String value1, String value2) {
            addCriterion("refund_no between", value1, value2, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundNoNotBetween(String value1, String value2) {
            addCriterion("refund_no not between", value1, value2, "refundNo");
            return (Criteria) this;
        }

        public Criteria andRefundStartedTimeIsNull() {
            addCriterion("refund_started_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundStartedTimeIsNotNull() {
            addCriterion("refund_started_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStartedTimeEqualTo(Date value) {
            addCriterion("refund_started_time =", value, "refundStartedTime");
            return (Criteria) this;
        }

        public Criteria andRefundStartedTimeNotEqualTo(Date value) {
            addCriterion("refund_started_time <>", value, "refundStartedTime");
            return (Criteria) this;
        }

        public Criteria andRefundStartedTimeGreaterThan(Date value) {
            addCriterion("refund_started_time >", value, "refundStartedTime");
            return (Criteria) this;
        }

        public Criteria andRefundStartedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_started_time >=", value, "refundStartedTime");
            return (Criteria) this;
        }

        public Criteria andRefundStartedTimeLessThan(Date value) {
            addCriterion("refund_started_time <", value, "refundStartedTime");
            return (Criteria) this;
        }

        public Criteria andRefundStartedTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_started_time <=", value, "refundStartedTime");
            return (Criteria) this;
        }

        public Criteria andRefundStartedTimeIn(List<Date> values) {
            addCriterion("refund_started_time in", values, "refundStartedTime");
            return (Criteria) this;
        }

        public Criteria andRefundStartedTimeNotIn(List<Date> values) {
            addCriterion("refund_started_time not in", values, "refundStartedTime");
            return (Criteria) this;
        }

        public Criteria andRefundStartedTimeBetween(Date value1, Date value2) {
            addCriterion("refund_started_time between", value1, value2, "refundStartedTime");
            return (Criteria) this;
        }

        public Criteria andRefundStartedTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_started_time not between", value1, value2, "refundStartedTime");
            return (Criteria) this;
        }

        public Criteria andRefundFinsihedTimeIsNull() {
            addCriterion("refund_finsihed_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundFinsihedTimeIsNotNull() {
            addCriterion("refund_finsihed_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFinsihedTimeEqualTo(Date value) {
            addCriterion("refund_finsihed_time =", value, "refundFinsihedTime");
            return (Criteria) this;
        }

        public Criteria andRefundFinsihedTimeNotEqualTo(Date value) {
            addCriterion("refund_finsihed_time <>", value, "refundFinsihedTime");
            return (Criteria) this;
        }

        public Criteria andRefundFinsihedTimeGreaterThan(Date value) {
            addCriterion("refund_finsihed_time >", value, "refundFinsihedTime");
            return (Criteria) this;
        }

        public Criteria andRefundFinsihedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_finsihed_time >=", value, "refundFinsihedTime");
            return (Criteria) this;
        }

        public Criteria andRefundFinsihedTimeLessThan(Date value) {
            addCriterion("refund_finsihed_time <", value, "refundFinsihedTime");
            return (Criteria) this;
        }

        public Criteria andRefundFinsihedTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_finsihed_time <=", value, "refundFinsihedTime");
            return (Criteria) this;
        }

        public Criteria andRefundFinsihedTimeIn(List<Date> values) {
            addCriterion("refund_finsihed_time in", values, "refundFinsihedTime");
            return (Criteria) this;
        }

        public Criteria andRefundFinsihedTimeNotIn(List<Date> values) {
            addCriterion("refund_finsihed_time not in", values, "refundFinsihedTime");
            return (Criteria) this;
        }

        public Criteria andRefundFinsihedTimeBetween(Date value1, Date value2) {
            addCriterion("refund_finsihed_time between", value1, value2, "refundFinsihedTime");
            return (Criteria) this;
        }

        public Criteria andRefundFinsihedTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_finsihed_time not between", value1, value2, "refundFinsihedTime");
            return (Criteria) this;
        }

        public Criteria andRefundOperatorIsNull() {
            addCriterion("refund_operator is null");
            return (Criteria) this;
        }

        public Criteria andRefundOperatorIsNotNull() {
            addCriterion("refund_operator is not null");
            return (Criteria) this;
        }

        public Criteria andRefundOperatorEqualTo(String value) {
            addCriterion("refund_operator =", value, "refundOperator");
            return (Criteria) this;
        }

        public Criteria andRefundOperatorNotEqualTo(String value) {
            addCriterion("refund_operator <>", value, "refundOperator");
            return (Criteria) this;
        }

        public Criteria andRefundOperatorGreaterThan(String value) {
            addCriterion("refund_operator >", value, "refundOperator");
            return (Criteria) this;
        }

        public Criteria andRefundOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("refund_operator >=", value, "refundOperator");
            return (Criteria) this;
        }

        public Criteria andRefundOperatorLessThan(String value) {
            addCriterion("refund_operator <", value, "refundOperator");
            return (Criteria) this;
        }

        public Criteria andRefundOperatorLessThanOrEqualTo(String value) {
            addCriterion("refund_operator <=", value, "refundOperator");
            return (Criteria) this;
        }

        public Criteria andRefundOperatorLike(String value) {
            addCriterion("refund_operator like", value, "refundOperator");
            return (Criteria) this;
        }

        public Criteria andRefundOperatorNotLike(String value) {
            addCriterion("refund_operator not like", value, "refundOperator");
            return (Criteria) this;
        }

        public Criteria andRefundOperatorIn(List<String> values) {
            addCriterion("refund_operator in", values, "refundOperator");
            return (Criteria) this;
        }

        public Criteria andRefundOperatorNotIn(List<String> values) {
            addCriterion("refund_operator not in", values, "refundOperator");
            return (Criteria) this;
        }

        public Criteria andRefundOperatorBetween(String value1, String value2) {
            addCriterion("refund_operator between", value1, value2, "refundOperator");
            return (Criteria) this;
        }

        public Criteria andRefundOperatorNotBetween(String value1, String value2) {
            addCriterion("refund_operator not between", value1, value2, "refundOperator");
            return (Criteria) this;
        }

        public Criteria andCouponRefundStatusIsNull() {
            addCriterion("coupon_refund_status is null");
            return (Criteria) this;
        }

        public Criteria andCouponRefundStatusIsNotNull() {
            addCriterion("coupon_refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andCouponRefundStatusEqualTo(String value) {
            addCriterion("coupon_refund_status =", value, "couponRefundStatus");
            return (Criteria) this;
        }

        public Criteria andCouponRefundStatusNotEqualTo(String value) {
            addCriterion("coupon_refund_status <>", value, "couponRefundStatus");
            return (Criteria) this;
        }

        public Criteria andCouponRefundStatusGreaterThan(String value) {
            addCriterion("coupon_refund_status >", value, "couponRefundStatus");
            return (Criteria) this;
        }

        public Criteria andCouponRefundStatusGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_refund_status >=", value, "couponRefundStatus");
            return (Criteria) this;
        }

        public Criteria andCouponRefundStatusLessThan(String value) {
            addCriterion("coupon_refund_status <", value, "couponRefundStatus");
            return (Criteria) this;
        }

        public Criteria andCouponRefundStatusLessThanOrEqualTo(String value) {
            addCriterion("coupon_refund_status <=", value, "couponRefundStatus");
            return (Criteria) this;
        }

        public Criteria andCouponRefundStatusLike(String value) {
            addCriterion("coupon_refund_status like", value, "couponRefundStatus");
            return (Criteria) this;
        }

        public Criteria andCouponRefundStatusNotLike(String value) {
            addCriterion("coupon_refund_status not like", value, "couponRefundStatus");
            return (Criteria) this;
        }

        public Criteria andCouponRefundStatusIn(List<String> values) {
            addCriterion("coupon_refund_status in", values, "couponRefundStatus");
            return (Criteria) this;
        }

        public Criteria andCouponRefundStatusNotIn(List<String> values) {
            addCriterion("coupon_refund_status not in", values, "couponRefundStatus");
            return (Criteria) this;
        }

        public Criteria andCouponRefundStatusBetween(String value1, String value2) {
            addCriterion("coupon_refund_status between", value1, value2, "couponRefundStatus");
            return (Criteria) this;
        }

        public Criteria andCouponRefundStatusNotBetween(String value1, String value2) {
            addCriterion("coupon_refund_status not between", value1, value2, "couponRefundStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderExpiryTimeIsNull() {
            addCriterion("order_expiry_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderExpiryTimeIsNotNull() {
            addCriterion("order_expiry_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderExpiryTimeEqualTo(Date value) {
            addCriterion("order_expiry_time =", value, "orderExpiryTime");
            return (Criteria) this;
        }

        public Criteria andOrderExpiryTimeNotEqualTo(Date value) {
            addCriterion("order_expiry_time <>", value, "orderExpiryTime");
            return (Criteria) this;
        }

        public Criteria andOrderExpiryTimeGreaterThan(Date value) {
            addCriterion("order_expiry_time >", value, "orderExpiryTime");
            return (Criteria) this;
        }

        public Criteria andOrderExpiryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_expiry_time >=", value, "orderExpiryTime");
            return (Criteria) this;
        }

        public Criteria andOrderExpiryTimeLessThan(Date value) {
            addCriterion("order_expiry_time <", value, "orderExpiryTime");
            return (Criteria) this;
        }

        public Criteria andOrderExpiryTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_expiry_time <=", value, "orderExpiryTime");
            return (Criteria) this;
        }

        public Criteria andOrderExpiryTimeIn(List<Date> values) {
            addCriterion("order_expiry_time in", values, "orderExpiryTime");
            return (Criteria) this;
        }

        public Criteria andOrderExpiryTimeNotIn(List<Date> values) {
            addCriterion("order_expiry_time not in", values, "orderExpiryTime");
            return (Criteria) this;
        }

        public Criteria andOrderExpiryTimeBetween(Date value1, Date value2) {
            addCriterion("order_expiry_time between", value1, value2, "orderExpiryTime");
            return (Criteria) this;
        }

        public Criteria andOrderExpiryTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_expiry_time not between", value1, value2, "orderExpiryTime");
            return (Criteria) this;
        }

        public Criteria andCancelTypeIsNull() {
            addCriterion("cancel_type is null");
            return (Criteria) this;
        }

        public Criteria andCancelTypeIsNotNull() {
            addCriterion("cancel_type is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTypeEqualTo(String value) {
            addCriterion("cancel_type =", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeNotEqualTo(String value) {
            addCriterion("cancel_type <>", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeGreaterThan(String value) {
            addCriterion("cancel_type >", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_type >=", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeLessThan(String value) {
            addCriterion("cancel_type <", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeLessThanOrEqualTo(String value) {
            addCriterion("cancel_type <=", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeLike(String value) {
            addCriterion("cancel_type like", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeNotLike(String value) {
            addCriterion("cancel_type not like", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeIn(List<String> values) {
            addCriterion("cancel_type in", values, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeNotIn(List<String> values) {
            addCriterion("cancel_type not in", values, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeBetween(String value1, String value2) {
            addCriterion("cancel_type between", value1, value2, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeNotBetween(String value1, String value2) {
            addCriterion("cancel_type not between", value1, value2, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelRemarkIsNull() {
            addCriterion("cancel_remark is null");
            return (Criteria) this;
        }

        public Criteria andCancelRemarkIsNotNull() {
            addCriterion("cancel_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCancelRemarkEqualTo(String value) {
            addCriterion("cancel_remark =", value, "cancelRemark");
            return (Criteria) this;
        }

        public Criteria andCancelRemarkNotEqualTo(String value) {
            addCriterion("cancel_remark <>", value, "cancelRemark");
            return (Criteria) this;
        }

        public Criteria andCancelRemarkGreaterThan(String value) {
            addCriterion("cancel_remark >", value, "cancelRemark");
            return (Criteria) this;
        }

        public Criteria andCancelRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_remark >=", value, "cancelRemark");
            return (Criteria) this;
        }

        public Criteria andCancelRemarkLessThan(String value) {
            addCriterion("cancel_remark <", value, "cancelRemark");
            return (Criteria) this;
        }

        public Criteria andCancelRemarkLessThanOrEqualTo(String value) {
            addCriterion("cancel_remark <=", value, "cancelRemark");
            return (Criteria) this;
        }

        public Criteria andCancelRemarkLike(String value) {
            addCriterion("cancel_remark like", value, "cancelRemark");
            return (Criteria) this;
        }

        public Criteria andCancelRemarkNotLike(String value) {
            addCriterion("cancel_remark not like", value, "cancelRemark");
            return (Criteria) this;
        }

        public Criteria andCancelRemarkIn(List<String> values) {
            addCriterion("cancel_remark in", values, "cancelRemark");
            return (Criteria) this;
        }

        public Criteria andCancelRemarkNotIn(List<String> values) {
            addCriterion("cancel_remark not in", values, "cancelRemark");
            return (Criteria) this;
        }

        public Criteria andCancelRemarkBetween(String value1, String value2) {
            addCriterion("cancel_remark between", value1, value2, "cancelRemark");
            return (Criteria) this;
        }

        public Criteria andCancelRemarkNotBetween(String value1, String value2) {
            addCriterion("cancel_remark not between", value1, value2, "cancelRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkIsNull() {
            addCriterion("refund_remark is null");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkIsNotNull() {
            addCriterion("refund_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkEqualTo(String value) {
            addCriterion("refund_remark =", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkNotEqualTo(String value) {
            addCriterion("refund_remark <>", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkGreaterThan(String value) {
            addCriterion("refund_remark >", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("refund_remark >=", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkLessThan(String value) {
            addCriterion("refund_remark <", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkLessThanOrEqualTo(String value) {
            addCriterion("refund_remark <=", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkLike(String value) {
            addCriterion("refund_remark like", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkNotLike(String value) {
            addCriterion("refund_remark not like", value, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkIn(List<String> values) {
            addCriterion("refund_remark in", values, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkNotIn(List<String> values) {
            addCriterion("refund_remark not in", values, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkBetween(String value1, String value2) {
            addCriterion("refund_remark between", value1, value2, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andRefundRemarkNotBetween(String value1, String value2) {
            addCriterion("refund_remark not between", value1, value2, "refundRemark");
            return (Criteria) this;
        }

        public Criteria andMerchantOperateTimeIsNull() {
            addCriterion("merchant_operate_time is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOperateTimeIsNotNull() {
            addCriterion("merchant_operate_time is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOperateTimeEqualTo(Date value) {
            addCriterion("merchant_operate_time =", value, "merchantOperateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOperateTimeNotEqualTo(Date value) {
            addCriterion("merchant_operate_time <>", value, "merchantOperateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOperateTimeGreaterThan(Date value) {
            addCriterion("merchant_operate_time >", value, "merchantOperateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("merchant_operate_time >=", value, "merchantOperateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOperateTimeLessThan(Date value) {
            addCriterion("merchant_operate_time <", value, "merchantOperateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("merchant_operate_time <=", value, "merchantOperateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOperateTimeIn(List<Date> values) {
            addCriterion("merchant_operate_time in", values, "merchantOperateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOperateTimeNotIn(List<Date> values) {
            addCriterion("merchant_operate_time not in", values, "merchantOperateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOperateTimeBetween(Date value1, Date value2) {
            addCriterion("merchant_operate_time between", value1, value2, "merchantOperateTime");
            return (Criteria) this;
        }

        public Criteria andMerchantOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("merchant_operate_time not between", value1, value2, "merchantOperateTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andPickupNameIsNull() {
            addCriterion("pickup_name is null");
            return (Criteria) this;
        }

        public Criteria andPickupNameIsNotNull() {
            addCriterion("pickup_name is not null");
            return (Criteria) this;
        }

        public Criteria andPickupNameEqualTo(String value) {
            addCriterion("pickup_name =", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameNotEqualTo(String value) {
            addCriterion("pickup_name <>", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameGreaterThan(String value) {
            addCriterion("pickup_name >", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_name >=", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameLessThan(String value) {
            addCriterion("pickup_name <", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameLessThanOrEqualTo(String value) {
            addCriterion("pickup_name <=", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameLike(String value) {
            addCriterion("pickup_name like", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameNotLike(String value) {
            addCriterion("pickup_name not like", value, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameIn(List<String> values) {
            addCriterion("pickup_name in", values, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameNotIn(List<String> values) {
            addCriterion("pickup_name not in", values, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameBetween(String value1, String value2) {
            addCriterion("pickup_name between", value1, value2, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupNameNotBetween(String value1, String value2) {
            addCriterion("pickup_name not between", value1, value2, "pickupName");
            return (Criteria) this;
        }

        public Criteria andPickupTimeIsNull() {
            addCriterion("pickup_time is null");
            return (Criteria) this;
        }

        public Criteria andPickupTimeIsNotNull() {
            addCriterion("pickup_time is not null");
            return (Criteria) this;
        }

        public Criteria andPickupTimeEqualTo(Date value) {
            addCriterion("pickup_time =", value, "pickupTime");
            return (Criteria) this;
        }

        public Criteria andPickupTimeNotEqualTo(Date value) {
            addCriterion("pickup_time <>", value, "pickupTime");
            return (Criteria) this;
        }

        public Criteria andPickupTimeGreaterThan(Date value) {
            addCriterion("pickup_time >", value, "pickupTime");
            return (Criteria) this;
        }

        public Criteria andPickupTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pickup_time >=", value, "pickupTime");
            return (Criteria) this;
        }

        public Criteria andPickupTimeLessThan(Date value) {
            addCriterion("pickup_time <", value, "pickupTime");
            return (Criteria) this;
        }

        public Criteria andPickupTimeLessThanOrEqualTo(Date value) {
            addCriterion("pickup_time <=", value, "pickupTime");
            return (Criteria) this;
        }

        public Criteria andPickupTimeIn(List<Date> values) {
            addCriterion("pickup_time in", values, "pickupTime");
            return (Criteria) this;
        }

        public Criteria andPickupTimeNotIn(List<Date> values) {
            addCriterion("pickup_time not in", values, "pickupTime");
            return (Criteria) this;
        }

        public Criteria andPickupTimeBetween(Date value1, Date value2) {
            addCriterion("pickup_time between", value1, value2, "pickupTime");
            return (Criteria) this;
        }

        public Criteria andPickupTimeNotBetween(Date value1, Date value2) {
            addCriterion("pickup_time not between", value1, value2, "pickupTime");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneIsNull() {
            addCriterion("pickup_phone is null");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneIsNotNull() {
            addCriterion("pickup_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneEqualTo(String value) {
            addCriterion("pickup_phone =", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneNotEqualTo(String value) {
            addCriterion("pickup_phone <>", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneGreaterThan(String value) {
            addCriterion("pickup_phone >", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_phone >=", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneLessThan(String value) {
            addCriterion("pickup_phone <", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneLessThanOrEqualTo(String value) {
            addCriterion("pickup_phone <=", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneLike(String value) {
            addCriterion("pickup_phone like", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneNotLike(String value) {
            addCriterion("pickup_phone not like", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneIn(List<String> values) {
            addCriterion("pickup_phone in", values, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneNotIn(List<String> values) {
            addCriterion("pickup_phone not in", values, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneBetween(String value1, String value2) {
            addCriterion("pickup_phone between", value1, value2, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneNotBetween(String value1, String value2) {
            addCriterion("pickup_phone not between", value1, value2, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupCodeIsNull() {
            addCriterion("pickup_code is null");
            return (Criteria) this;
        }

        public Criteria andPickupCodeIsNotNull() {
            addCriterion("pickup_code is not null");
            return (Criteria) this;
        }

        public Criteria andPickupCodeEqualTo(String value) {
            addCriterion("pickup_code =", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeNotEqualTo(String value) {
            addCriterion("pickup_code <>", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeGreaterThan(String value) {
            addCriterion("pickup_code >", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_code >=", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeLessThan(String value) {
            addCriterion("pickup_code <", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeLessThanOrEqualTo(String value) {
            addCriterion("pickup_code <=", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeLike(String value) {
            addCriterion("pickup_code like", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeNotLike(String value) {
            addCriterion("pickup_code not like", value, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeIn(List<String> values) {
            addCriterion("pickup_code in", values, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeNotIn(List<String> values) {
            addCriterion("pickup_code not in", values, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeBetween(String value1, String value2) {
            addCriterion("pickup_code between", value1, value2, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andPickupCodeNotBetween(String value1, String value2) {
            addCriterion("pickup_code not between", value1, value2, "pickupCode");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNull() {
            addCriterion("payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNotNull() {
            addCriterion("payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountEqualTo(BigDecimal value) {
            addCriterion("payment_amount =", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotEqualTo(BigDecimal value) {
            addCriterion("payment_amount <>", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThan(BigDecimal value) {
            addCriterion("payment_amount >", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_amount >=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThan(BigDecimal value) {
            addCriterion("payment_amount <", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_amount <=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIn(List<BigDecimal> values) {
            addCriterion("payment_amount in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotIn(List<BigDecimal> values) {
            addCriterion("payment_amount not in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_amount between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_amount not between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAdditionalInfoIsNull() {
            addCriterion("order_additional_info is null");
            return (Criteria) this;
        }

        public Criteria andOrderAdditionalInfoIsNotNull() {
            addCriterion("order_additional_info is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAdditionalInfoEqualTo(String value) {
            addCriterion("order_additional_info =", value, "orderAdditionalInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAdditionalInfoNotEqualTo(String value) {
            addCriterion("order_additional_info <>", value, "orderAdditionalInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAdditionalInfoGreaterThan(String value) {
            addCriterion("order_additional_info >", value, "orderAdditionalInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAdditionalInfoGreaterThanOrEqualTo(String value) {
            addCriterion("order_additional_info >=", value, "orderAdditionalInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAdditionalInfoLessThan(String value) {
            addCriterion("order_additional_info <", value, "orderAdditionalInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAdditionalInfoLessThanOrEqualTo(String value) {
            addCriterion("order_additional_info <=", value, "orderAdditionalInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAdditionalInfoLike(String value) {
            addCriterion("order_additional_info like", value, "orderAdditionalInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAdditionalInfoNotLike(String value) {
            addCriterion("order_additional_info not like", value, "orderAdditionalInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAdditionalInfoIn(List<String> values) {
            addCriterion("order_additional_info in", values, "orderAdditionalInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAdditionalInfoNotIn(List<String> values) {
            addCriterion("order_additional_info not in", values, "orderAdditionalInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAdditionalInfoBetween(String value1, String value2) {
            addCriterion("order_additional_info between", value1, value2, "orderAdditionalInfo");
            return (Criteria) this;
        }

        public Criteria andOrderAdditionalInfoNotBetween(String value1, String value2) {
            addCriterion("order_additional_info not between", value1, value2, "orderAdditionalInfo");
            return (Criteria) this;
        }

        public Criteria andMerchantNotifyStatusIsNull() {
            addCriterion("merchant_notify_status is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNotifyStatusIsNotNull() {
            addCriterion("merchant_notify_status is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNotifyStatusEqualTo(String value) {
            addCriterion("merchant_notify_status =", value, "merchantNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantNotifyStatusNotEqualTo(String value) {
            addCriterion("merchant_notify_status <>", value, "merchantNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantNotifyStatusGreaterThan(String value) {
            addCriterion("merchant_notify_status >", value, "merchantNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantNotifyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_notify_status >=", value, "merchantNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantNotifyStatusLessThan(String value) {
            addCriterion("merchant_notify_status <", value, "merchantNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantNotifyStatusLessThanOrEqualTo(String value) {
            addCriterion("merchant_notify_status <=", value, "merchantNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantNotifyStatusLike(String value) {
            addCriterion("merchant_notify_status like", value, "merchantNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantNotifyStatusNotLike(String value) {
            addCriterion("merchant_notify_status not like", value, "merchantNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantNotifyStatusIn(List<String> values) {
            addCriterion("merchant_notify_status in", values, "merchantNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantNotifyStatusNotIn(List<String> values) {
            addCriterion("merchant_notify_status not in", values, "merchantNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantNotifyStatusBetween(String value1, String value2) {
            addCriterion("merchant_notify_status between", value1, value2, "merchantNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andMerchantNotifyStatusNotBetween(String value1, String value2) {
            addCriterion("merchant_notify_status not between", value1, value2, "merchantNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andUserNotifyStatusIsNull() {
            addCriterion("user_notify_status is null");
            return (Criteria) this;
        }

        public Criteria andUserNotifyStatusIsNotNull() {
            addCriterion("user_notify_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserNotifyStatusEqualTo(String value) {
            addCriterion("user_notify_status =", value, "userNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andUserNotifyStatusNotEqualTo(String value) {
            addCriterion("user_notify_status <>", value, "userNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andUserNotifyStatusGreaterThan(String value) {
            addCriterion("user_notify_status >", value, "userNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andUserNotifyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("user_notify_status >=", value, "userNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andUserNotifyStatusLessThan(String value) {
            addCriterion("user_notify_status <", value, "userNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andUserNotifyStatusLessThanOrEqualTo(String value) {
            addCriterion("user_notify_status <=", value, "userNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andUserNotifyStatusLike(String value) {
            addCriterion("user_notify_status like", value, "userNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andUserNotifyStatusNotLike(String value) {
            addCriterion("user_notify_status not like", value, "userNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andUserNotifyStatusIn(List<String> values) {
            addCriterion("user_notify_status in", values, "userNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andUserNotifyStatusNotIn(List<String> values) {
            addCriterion("user_notify_status not in", values, "userNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andUserNotifyStatusBetween(String value1, String value2) {
            addCriterion("user_notify_status between", value1, value2, "userNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andUserNotifyStatusNotBetween(String value1, String value2) {
            addCriterion("user_notify_status not between", value1, value2, "userNotifyStatus");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("modified_time =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("modified_time <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("modified_time >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_time >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("modified_time <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("modified_time <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("modified_time in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("modified_time not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("modified_time between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("modified_time not between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}