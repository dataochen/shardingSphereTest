package org.cdt.DO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSpuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderSpuExample() {
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

        public Criteria andOrderSpuIdIsNull() {
            addCriterion("order_spu_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderSpuIdIsNotNull() {
            addCriterion("order_spu_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSpuIdEqualTo(String value) {
            addCriterion("order_spu_id =", value, "orderSpuId");
            return (Criteria) this;
        }

        public Criteria andOrderSpuIdNotEqualTo(String value) {
            addCriterion("order_spu_id <>", value, "orderSpuId");
            return (Criteria) this;
        }

        public Criteria andOrderSpuIdGreaterThan(String value) {
            addCriterion("order_spu_id >", value, "orderSpuId");
            return (Criteria) this;
        }

        public Criteria andOrderSpuIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_spu_id >=", value, "orderSpuId");
            return (Criteria) this;
        }

        public Criteria andOrderSpuIdLessThan(String value) {
            addCriterion("order_spu_id <", value, "orderSpuId");
            return (Criteria) this;
        }

        public Criteria andOrderSpuIdLessThanOrEqualTo(String value) {
            addCriterion("order_spu_id <=", value, "orderSpuId");
            return (Criteria) this;
        }

        public Criteria andOrderSpuIdLike(String value) {
            addCriterion("order_spu_id like", value, "orderSpuId");
            return (Criteria) this;
        }

        public Criteria andOrderSpuIdNotLike(String value) {
            addCriterion("order_spu_id not like", value, "orderSpuId");
            return (Criteria) this;
        }

        public Criteria andOrderSpuIdIn(List<String> values) {
            addCriterion("order_spu_id in", values, "orderSpuId");
            return (Criteria) this;
        }

        public Criteria andOrderSpuIdNotIn(List<String> values) {
            addCriterion("order_spu_id not in", values, "orderSpuId");
            return (Criteria) this;
        }

        public Criteria andOrderSpuIdBetween(String value1, String value2) {
            addCriterion("order_spu_id between", value1, value2, "orderSpuId");
            return (Criteria) this;
        }

        public Criteria andOrderSpuIdNotBetween(String value1, String value2) {
            addCriterion("order_spu_id not between", value1, value2, "orderSpuId");
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

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(String value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(String value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(String value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(String value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(String value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLike(String value) {
            addCriterion("sku_id like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotLike(String value) {
            addCriterion("sku_id not like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<String> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<String> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(String value1, String value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(String value1, String value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNull() {
            addCriterion("sku_name is null");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNotNull() {
            addCriterion("sku_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualTo(String value) {
            addCriterion("sku_name =", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("sku_name <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("sku_name >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_name >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("sku_name <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("sku_name <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLike(String value) {
            addCriterion("sku_name like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotLike(String value) {
            addCriterion("sku_name not like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameIn(List<String> values) {
            addCriterion("sku_name in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotIn(List<String> values) {
            addCriterion("sku_name not in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameBetween(String value1, String value2) {
            addCriterion("sku_name between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotBetween(String value1, String value2) {
            addCriterion("sku_name not between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andSkuLogoIsNull() {
            addCriterion("sku_logo is null");
            return (Criteria) this;
        }

        public Criteria andSkuLogoIsNotNull() {
            addCriterion("sku_logo is not null");
            return (Criteria) this;
        }

        public Criteria andSkuLogoEqualTo(String value) {
            addCriterion("sku_logo =", value, "skuLogo");
            return (Criteria) this;
        }

        public Criteria andSkuLogoNotEqualTo(String value) {
            addCriterion("sku_logo <>", value, "skuLogo");
            return (Criteria) this;
        }

        public Criteria andSkuLogoGreaterThan(String value) {
            addCriterion("sku_logo >", value, "skuLogo");
            return (Criteria) this;
        }

        public Criteria andSkuLogoGreaterThanOrEqualTo(String value) {
            addCriterion("sku_logo >=", value, "skuLogo");
            return (Criteria) this;
        }

        public Criteria andSkuLogoLessThan(String value) {
            addCriterion("sku_logo <", value, "skuLogo");
            return (Criteria) this;
        }

        public Criteria andSkuLogoLessThanOrEqualTo(String value) {
            addCriterion("sku_logo <=", value, "skuLogo");
            return (Criteria) this;
        }

        public Criteria andSkuLogoLike(String value) {
            addCriterion("sku_logo like", value, "skuLogo");
            return (Criteria) this;
        }

        public Criteria andSkuLogoNotLike(String value) {
            addCriterion("sku_logo not like", value, "skuLogo");
            return (Criteria) this;
        }

        public Criteria andSkuLogoIn(List<String> values) {
            addCriterion("sku_logo in", values, "skuLogo");
            return (Criteria) this;
        }

        public Criteria andSkuLogoNotIn(List<String> values) {
            addCriterion("sku_logo not in", values, "skuLogo");
            return (Criteria) this;
        }

        public Criteria andSkuLogoBetween(String value1, String value2) {
            addCriterion("sku_logo between", value1, value2, "skuLogo");
            return (Criteria) this;
        }

        public Criteria andSkuLogoNotBetween(String value1, String value2) {
            addCriterion("sku_logo not between", value1, value2, "skuLogo");
            return (Criteria) this;
        }

        public Criteria andSpuCountIsNull() {
            addCriterion("spu_count is null");
            return (Criteria) this;
        }

        public Criteria andSpuCountIsNotNull() {
            addCriterion("spu_count is not null");
            return (Criteria) this;
        }

        public Criteria andSpuCountEqualTo(Integer value) {
            addCriterion("spu_count =", value, "spuCount");
            return (Criteria) this;
        }

        public Criteria andSpuCountNotEqualTo(Integer value) {
            addCriterion("spu_count <>", value, "spuCount");
            return (Criteria) this;
        }

        public Criteria andSpuCountGreaterThan(Integer value) {
            addCriterion("spu_count >", value, "spuCount");
            return (Criteria) this;
        }

        public Criteria andSpuCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("spu_count >=", value, "spuCount");
            return (Criteria) this;
        }

        public Criteria andSpuCountLessThan(Integer value) {
            addCriterion("spu_count <", value, "spuCount");
            return (Criteria) this;
        }

        public Criteria andSpuCountLessThanOrEqualTo(Integer value) {
            addCriterion("spu_count <=", value, "spuCount");
            return (Criteria) this;
        }

        public Criteria andSpuCountIn(List<Integer> values) {
            addCriterion("spu_count in", values, "spuCount");
            return (Criteria) this;
        }

        public Criteria andSpuCountNotIn(List<Integer> values) {
            addCriterion("spu_count not in", values, "spuCount");
            return (Criteria) this;
        }

        public Criteria andSpuCountBetween(Integer value1, Integer value2) {
            addCriterion("spu_count between", value1, value2, "spuCount");
            return (Criteria) this;
        }

        public Criteria andSpuCountNotBetween(Integer value1, Integer value2) {
            addCriterion("spu_count not between", value1, value2, "spuCount");
            return (Criteria) this;
        }

        public Criteria andSpuUnitPriceIsNull() {
            addCriterion("spu_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andSpuUnitPriceIsNotNull() {
            addCriterion("spu_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andSpuUnitPriceEqualTo(BigDecimal value) {
            addCriterion("spu_unit_price =", value, "spuUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSpuUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("spu_unit_price <>", value, "spuUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSpuUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("spu_unit_price >", value, "spuUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSpuUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("spu_unit_price >=", value, "spuUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSpuUnitPriceLessThan(BigDecimal value) {
            addCriterion("spu_unit_price <", value, "spuUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSpuUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("spu_unit_price <=", value, "spuUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSpuUnitPriceIn(List<BigDecimal> values) {
            addCriterion("spu_unit_price in", values, "spuUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSpuUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("spu_unit_price not in", values, "spuUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSpuUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spu_unit_price between", value1, value2, "spuUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSpuUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spu_unit_price not between", value1, value2, "spuUnitPrice");
            return (Criteria) this;
        }

        public Criteria andSpuTotalPriceIsNull() {
            addCriterion("spu_total_price is null");
            return (Criteria) this;
        }

        public Criteria andSpuTotalPriceIsNotNull() {
            addCriterion("spu_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andSpuTotalPriceEqualTo(BigDecimal value) {
            addCriterion("spu_total_price =", value, "spuTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSpuTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("spu_total_price <>", value, "spuTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSpuTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("spu_total_price >", value, "spuTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSpuTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("spu_total_price >=", value, "spuTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSpuTotalPriceLessThan(BigDecimal value) {
            addCriterion("spu_total_price <", value, "spuTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSpuTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("spu_total_price <=", value, "spuTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSpuTotalPriceIn(List<BigDecimal> values) {
            addCriterion("spu_total_price in", values, "spuTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSpuTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("spu_total_price not in", values, "spuTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSpuTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spu_total_price between", value1, value2, "spuTotalPrice");
            return (Criteria) this;
        }

        public Criteria andSpuTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spu_total_price not between", value1, value2, "spuTotalPrice");
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