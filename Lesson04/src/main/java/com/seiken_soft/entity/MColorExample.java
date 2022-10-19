package com.seiken_soft.entity;

import java.util.ArrayList;
import java.util.List;

public class MColorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MColorExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andColorCdIsNull() {
            addCriterion("COLOR_CD is null");
            return (Criteria) this;
        }

        public Criteria andColorCdIsNotNull() {
            addCriterion("COLOR_CD is not null");
            return (Criteria) this;
        }

        public Criteria andColorCdEqualTo(String value) {
            addCriterion("COLOR_CD =", value, "colorCd");
            return (Criteria) this;
        }

        public Criteria andColorCdNotEqualTo(String value) {
            addCriterion("COLOR_CD <>", value, "colorCd");
            return (Criteria) this;
        }

        public Criteria andColorCdGreaterThan(String value) {
            addCriterion("COLOR_CD >", value, "colorCd");
            return (Criteria) this;
        }

        public Criteria andColorCdGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR_CD >=", value, "colorCd");
            return (Criteria) this;
        }

        public Criteria andColorCdLessThan(String value) {
            addCriterion("COLOR_CD <", value, "colorCd");
            return (Criteria) this;
        }

        public Criteria andColorCdLessThanOrEqualTo(String value) {
            addCriterion("COLOR_CD <=", value, "colorCd");
            return (Criteria) this;
        }

        public Criteria andColorCdLike(String value) {
            addCriterion("COLOR_CD like", value, "colorCd");
            return (Criteria) this;
        }

        public Criteria andColorCdNotLike(String value) {
            addCriterion("COLOR_CD not like", value, "colorCd");
            return (Criteria) this;
        }

        public Criteria andColorCdIn(List<String> values) {
            addCriterion("COLOR_CD in", values, "colorCd");
            return (Criteria) this;
        }

        public Criteria andColorCdNotIn(List<String> values) {
            addCriterion("COLOR_CD not in", values, "colorCd");
            return (Criteria) this;
        }

        public Criteria andColorCdBetween(String value1, String value2) {
            addCriterion("COLOR_CD between", value1, value2, "colorCd");
            return (Criteria) this;
        }

        public Criteria andColorCdNotBetween(String value1, String value2) {
            addCriterion("COLOR_CD not between", value1, value2, "colorCd");
            return (Criteria) this;
        }

        public Criteria andColorNameIsNull() {
            addCriterion("COLOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andColorNameIsNotNull() {
            addCriterion("COLOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andColorNameEqualTo(String value) {
            addCriterion("COLOR_NAME =", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotEqualTo(String value) {
            addCriterion("COLOR_NAME <>", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameGreaterThan(String value) {
            addCriterion("COLOR_NAME >", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR_NAME >=", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLessThan(String value) {
            addCriterion("COLOR_NAME <", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLessThanOrEqualTo(String value) {
            addCriterion("COLOR_NAME <=", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLike(String value) {
            addCriterion("COLOR_NAME like", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotLike(String value) {
            addCriterion("COLOR_NAME not like", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameIn(List<String> values) {
            addCriterion("COLOR_NAME in", values, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotIn(List<String> values) {
            addCriterion("COLOR_NAME not in", values, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameBetween(String value1, String value2) {
            addCriterion("COLOR_NAME between", value1, value2, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotBetween(String value1, String value2) {
            addCriterion("COLOR_NAME not between", value1, value2, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorValueIsNull() {
            addCriterion("COLOR_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andColorValueIsNotNull() {
            addCriterion("COLOR_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andColorValueEqualTo(String value) {
            addCriterion("COLOR_VALUE =", value, "colorValue");
            return (Criteria) this;
        }

        public Criteria andColorValueNotEqualTo(String value) {
            addCriterion("COLOR_VALUE <>", value, "colorValue");
            return (Criteria) this;
        }

        public Criteria andColorValueGreaterThan(String value) {
            addCriterion("COLOR_VALUE >", value, "colorValue");
            return (Criteria) this;
        }

        public Criteria andColorValueGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR_VALUE >=", value, "colorValue");
            return (Criteria) this;
        }

        public Criteria andColorValueLessThan(String value) {
            addCriterion("COLOR_VALUE <", value, "colorValue");
            return (Criteria) this;
        }

        public Criteria andColorValueLessThanOrEqualTo(String value) {
            addCriterion("COLOR_VALUE <=", value, "colorValue");
            return (Criteria) this;
        }

        public Criteria andColorValueLike(String value) {
            addCriterion("COLOR_VALUE like", value, "colorValue");
            return (Criteria) this;
        }

        public Criteria andColorValueNotLike(String value) {
            addCriterion("COLOR_VALUE not like", value, "colorValue");
            return (Criteria) this;
        }

        public Criteria andColorValueIn(List<String> values) {
            addCriterion("COLOR_VALUE in", values, "colorValue");
            return (Criteria) this;
        }

        public Criteria andColorValueNotIn(List<String> values) {
            addCriterion("COLOR_VALUE not in", values, "colorValue");
            return (Criteria) this;
        }

        public Criteria andColorValueBetween(String value1, String value2) {
            addCriterion("COLOR_VALUE between", value1, value2, "colorValue");
            return (Criteria) this;
        }

        public Criteria andColorValueNotBetween(String value1, String value2) {
            addCriterion("COLOR_VALUE not between", value1, value2, "colorValue");
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