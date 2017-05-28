package com.cn.bojue.pojo;

import java.util.ArrayList;
import java.util.List;

public class CanzhuoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CanzhuoExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCzNoIsNull() {
            addCriterion("cz_no is null");
            return (Criteria) this;
        }

        public Criteria andCzNoIsNotNull() {
            addCriterion("cz_no is not null");
            return (Criteria) this;
        }

        public Criteria andCzNoEqualTo(String value) {
            addCriterion("cz_no =", value, "czNo");
            return (Criteria) this;
        }

        public Criteria andCzNoNotEqualTo(String value) {
            addCriterion("cz_no <>", value, "czNo");
            return (Criteria) this;
        }

        public Criteria andCzNoGreaterThan(String value) {
            addCriterion("cz_no >", value, "czNo");
            return (Criteria) this;
        }

        public Criteria andCzNoGreaterThanOrEqualTo(String value) {
            addCriterion("cz_no >=", value, "czNo");
            return (Criteria) this;
        }

        public Criteria andCzNoLessThan(String value) {
            addCriterion("cz_no <", value, "czNo");
            return (Criteria) this;
        }

        public Criteria andCzNoLessThanOrEqualTo(String value) {
            addCriterion("cz_no <=", value, "czNo");
            return (Criteria) this;
        }

        public Criteria andCzNoLike(String value) {
            addCriterion("cz_no like", value, "czNo");
            return (Criteria) this;
        }

        public Criteria andCzNoNotLike(String value) {
            addCriterion("cz_no not like", value, "czNo");
            return (Criteria) this;
        }

        public Criteria andCzNoIn(List<String> values) {
            addCriterion("cz_no in", values, "czNo");
            return (Criteria) this;
        }

        public Criteria andCzNoNotIn(List<String> values) {
            addCriterion("cz_no not in", values, "czNo");
            return (Criteria) this;
        }

        public Criteria andCzNoBetween(String value1, String value2) {
            addCriterion("cz_no between", value1, value2, "czNo");
            return (Criteria) this;
        }

        public Criteria andCzNoNotBetween(String value1, String value2) {
            addCriterion("cz_no not between", value1, value2, "czNo");
            return (Criteria) this;
        }

        public Criteria andCzNameIsNull() {
            addCriterion("cz_name is null");
            return (Criteria) this;
        }

        public Criteria andCzNameIsNotNull() {
            addCriterion("cz_name is not null");
            return (Criteria) this;
        }

        public Criteria andCzNameEqualTo(String value) {
            addCriterion("cz_name =", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameNotEqualTo(String value) {
            addCriterion("cz_name <>", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameGreaterThan(String value) {
            addCriterion("cz_name >", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameGreaterThanOrEqualTo(String value) {
            addCriterion("cz_name >=", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameLessThan(String value) {
            addCriterion("cz_name <", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameLessThanOrEqualTo(String value) {
            addCriterion("cz_name <=", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameLike(String value) {
            addCriterion("cz_name like", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameNotLike(String value) {
            addCriterion("cz_name not like", value, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameIn(List<String> values) {
            addCriterion("cz_name in", values, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameNotIn(List<String> values) {
            addCriterion("cz_name not in", values, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameBetween(String value1, String value2) {
            addCriterion("cz_name between", value1, value2, "czName");
            return (Criteria) this;
        }

        public Criteria andCzNameNotBetween(String value1, String value2) {
            addCriterion("cz_name not between", value1, value2, "czName");
            return (Criteria) this;
        }

        public Criteria andCzResIsNull() {
            addCriterion("cz_res is null");
            return (Criteria) this;
        }

        public Criteria andCzResIsNotNull() {
            addCriterion("cz_res is not null");
            return (Criteria) this;
        }

        public Criteria andCzResEqualTo(String value) {
            addCriterion("cz_res =", value, "czRes");
            return (Criteria) this;
        }

        public Criteria andCzResNotEqualTo(String value) {
            addCriterion("cz_res <>", value, "czRes");
            return (Criteria) this;
        }

        public Criteria andCzResGreaterThan(String value) {
            addCriterion("cz_res >", value, "czRes");
            return (Criteria) this;
        }

        public Criteria andCzResGreaterThanOrEqualTo(String value) {
            addCriterion("cz_res >=", value, "czRes");
            return (Criteria) this;
        }

        public Criteria andCzResLessThan(String value) {
            addCriterion("cz_res <", value, "czRes");
            return (Criteria) this;
        }

        public Criteria andCzResLessThanOrEqualTo(String value) {
            addCriterion("cz_res <=", value, "czRes");
            return (Criteria) this;
        }

        public Criteria andCzResLike(String value) {
            addCriterion("cz_res like", value, "czRes");
            return (Criteria) this;
        }

        public Criteria andCzResNotLike(String value) {
            addCriterion("cz_res not like", value, "czRes");
            return (Criteria) this;
        }

        public Criteria andCzResIn(List<String> values) {
            addCriterion("cz_res in", values, "czRes");
            return (Criteria) this;
        }

        public Criteria andCzResNotIn(List<String> values) {
            addCriterion("cz_res not in", values, "czRes");
            return (Criteria) this;
        }

        public Criteria andCzResBetween(String value1, String value2) {
            addCriterion("cz_res between", value1, value2, "czRes");
            return (Criteria) this;
        }

        public Criteria andCzResNotBetween(String value1, String value2) {
            addCriterion("cz_res not between", value1, value2, "czRes");
            return (Criteria) this;
        }

        public Criteria andCzTypeIsNull() {
            addCriterion("cz_type is null");
            return (Criteria) this;
        }

        public Criteria andCzTypeIsNotNull() {
            addCriterion("cz_type is not null");
            return (Criteria) this;
        }

        public Criteria andCzTypeEqualTo(String value) {
            addCriterion("cz_type =", value, "czType");
            return (Criteria) this;
        }

        public Criteria andCzTypeNotEqualTo(String value) {
            addCriterion("cz_type <>", value, "czType");
            return (Criteria) this;
        }

        public Criteria andCzTypeGreaterThan(String value) {
            addCriterion("cz_type >", value, "czType");
            return (Criteria) this;
        }

        public Criteria andCzTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cz_type >=", value, "czType");
            return (Criteria) this;
        }

        public Criteria andCzTypeLessThan(String value) {
            addCriterion("cz_type <", value, "czType");
            return (Criteria) this;
        }

        public Criteria andCzTypeLessThanOrEqualTo(String value) {
            addCriterion("cz_type <=", value, "czType");
            return (Criteria) this;
        }

        public Criteria andCzTypeLike(String value) {
            addCriterion("cz_type like", value, "czType");
            return (Criteria) this;
        }

        public Criteria andCzTypeNotLike(String value) {
            addCriterion("cz_type not like", value, "czType");
            return (Criteria) this;
        }

        public Criteria andCzTypeIn(List<String> values) {
            addCriterion("cz_type in", values, "czType");
            return (Criteria) this;
        }

        public Criteria andCzTypeNotIn(List<String> values) {
            addCriterion("cz_type not in", values, "czType");
            return (Criteria) this;
        }

        public Criteria andCzTypeBetween(String value1, String value2) {
            addCriterion("cz_type between", value1, value2, "czType");
            return (Criteria) this;
        }

        public Criteria andCzTypeNotBetween(String value1, String value2) {
            addCriterion("cz_type not between", value1, value2, "czType");
            return (Criteria) this;
        }

        public Criteria andCzSpecIsNull() {
            addCriterion("cz_spec is null");
            return (Criteria) this;
        }

        public Criteria andCzSpecIsNotNull() {
            addCriterion("cz_spec is not null");
            return (Criteria) this;
        }

        public Criteria andCzSpecEqualTo(String value) {
            addCriterion("cz_spec =", value, "czSpec");
            return (Criteria) this;
        }

        public Criteria andCzSpecNotEqualTo(String value) {
            addCriterion("cz_spec <>", value, "czSpec");
            return (Criteria) this;
        }

        public Criteria andCzSpecGreaterThan(String value) {
            addCriterion("cz_spec >", value, "czSpec");
            return (Criteria) this;
        }

        public Criteria andCzSpecGreaterThanOrEqualTo(String value) {
            addCriterion("cz_spec >=", value, "czSpec");
            return (Criteria) this;
        }

        public Criteria andCzSpecLessThan(String value) {
            addCriterion("cz_spec <", value, "czSpec");
            return (Criteria) this;
        }

        public Criteria andCzSpecLessThanOrEqualTo(String value) {
            addCriterion("cz_spec <=", value, "czSpec");
            return (Criteria) this;
        }

        public Criteria andCzSpecLike(String value) {
            addCriterion("cz_spec like", value, "czSpec");
            return (Criteria) this;
        }

        public Criteria andCzSpecNotLike(String value) {
            addCriterion("cz_spec not like", value, "czSpec");
            return (Criteria) this;
        }

        public Criteria andCzSpecIn(List<String> values) {
            addCriterion("cz_spec in", values, "czSpec");
            return (Criteria) this;
        }

        public Criteria andCzSpecNotIn(List<String> values) {
            addCriterion("cz_spec not in", values, "czSpec");
            return (Criteria) this;
        }

        public Criteria andCzSpecBetween(String value1, String value2) {
            addCriterion("cz_spec between", value1, value2, "czSpec");
            return (Criteria) this;
        }

        public Criteria andCzSpecNotBetween(String value1, String value2) {
            addCriterion("cz_spec not between", value1, value2, "czSpec");
            return (Criteria) this;
        }

        public Criteria andCzNumIsNull() {
            addCriterion("cz_num is null");
            return (Criteria) this;
        }

        public Criteria andCzNumIsNotNull() {
            addCriterion("cz_num is not null");
            return (Criteria) this;
        }

        public Criteria andCzNumEqualTo(Integer value) {
            addCriterion("cz_num =", value, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumNotEqualTo(Integer value) {
            addCriterion("cz_num <>", value, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumGreaterThan(Integer value) {
            addCriterion("cz_num >", value, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cz_num >=", value, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumLessThan(Integer value) {
            addCriterion("cz_num <", value, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumLessThanOrEqualTo(Integer value) {
            addCriterion("cz_num <=", value, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumIn(List<Integer> values) {
            addCriterion("cz_num in", values, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumNotIn(List<Integer> values) {
            addCriterion("cz_num not in", values, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumBetween(Integer value1, Integer value2) {
            addCriterion("cz_num between", value1, value2, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cz_num not between", value1, value2, "czNum");
            return (Criteria) this;
        }

        public Criteria andCzColorIsNull() {
            addCriterion("cz_color is null");
            return (Criteria) this;
        }

        public Criteria andCzColorIsNotNull() {
            addCriterion("cz_color is not null");
            return (Criteria) this;
        }

        public Criteria andCzColorEqualTo(String value) {
            addCriterion("cz_color =", value, "czColor");
            return (Criteria) this;
        }

        public Criteria andCzColorNotEqualTo(String value) {
            addCriterion("cz_color <>", value, "czColor");
            return (Criteria) this;
        }

        public Criteria andCzColorGreaterThan(String value) {
            addCriterion("cz_color >", value, "czColor");
            return (Criteria) this;
        }

        public Criteria andCzColorGreaterThanOrEqualTo(String value) {
            addCriterion("cz_color >=", value, "czColor");
            return (Criteria) this;
        }

        public Criteria andCzColorLessThan(String value) {
            addCriterion("cz_color <", value, "czColor");
            return (Criteria) this;
        }

        public Criteria andCzColorLessThanOrEqualTo(String value) {
            addCriterion("cz_color <=", value, "czColor");
            return (Criteria) this;
        }

        public Criteria andCzColorLike(String value) {
            addCriterion("cz_color like", value, "czColor");
            return (Criteria) this;
        }

        public Criteria andCzColorNotLike(String value) {
            addCriterion("cz_color not like", value, "czColor");
            return (Criteria) this;
        }

        public Criteria andCzColorIn(List<String> values) {
            addCriterion("cz_color in", values, "czColor");
            return (Criteria) this;
        }

        public Criteria andCzColorNotIn(List<String> values) {
            addCriterion("cz_color not in", values, "czColor");
            return (Criteria) this;
        }

        public Criteria andCzColorBetween(String value1, String value2) {
            addCriterion("cz_color between", value1, value2, "czColor");
            return (Criteria) this;
        }

        public Criteria andCzColorNotBetween(String value1, String value2) {
            addCriterion("cz_color not between", value1, value2, "czColor");
            return (Criteria) this;
        }

        public Criteria andCzPriceIsNull() {
            addCriterion("cz_price is null");
            return (Criteria) this;
        }

        public Criteria andCzPriceIsNotNull() {
            addCriterion("cz_price is not null");
            return (Criteria) this;
        }

        public Criteria andCzPriceEqualTo(Integer value) {
            addCriterion("cz_price =", value, "czPrice");
            return (Criteria) this;
        }

        public Criteria andCzPriceNotEqualTo(Integer value) {
            addCriterion("cz_price <>", value, "czPrice");
            return (Criteria) this;
        }

        public Criteria andCzPriceGreaterThan(Integer value) {
            addCriterion("cz_price >", value, "czPrice");
            return (Criteria) this;
        }

        public Criteria andCzPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("cz_price >=", value, "czPrice");
            return (Criteria) this;
        }

        public Criteria andCzPriceLessThan(Integer value) {
            addCriterion("cz_price <", value, "czPrice");
            return (Criteria) this;
        }

        public Criteria andCzPriceLessThanOrEqualTo(Integer value) {
            addCriterion("cz_price <=", value, "czPrice");
            return (Criteria) this;
        }

        public Criteria andCzPriceIn(List<Integer> values) {
            addCriterion("cz_price in", values, "czPrice");
            return (Criteria) this;
        }

        public Criteria andCzPriceNotIn(List<Integer> values) {
            addCriterion("cz_price not in", values, "czPrice");
            return (Criteria) this;
        }

        public Criteria andCzPriceBetween(Integer value1, Integer value2) {
            addCriterion("cz_price between", value1, value2, "czPrice");
            return (Criteria) this;
        }

        public Criteria andCzPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("cz_price not between", value1, value2, "czPrice");
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