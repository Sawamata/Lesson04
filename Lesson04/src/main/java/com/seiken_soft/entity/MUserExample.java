package com.seiken_soft.entity;

import java.util.ArrayList;
import java.util.List;

public class MUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MUserExample() {
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("EMPLOYEE_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("EMPLOYEE_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("EMPLOYEE_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("EMPLOYEE_ID like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("EMPLOYEE_ID not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("EMPLOYEE_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("EMPLOYEE_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andHashCountIsNull() {
            addCriterion("HASH_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andHashCountIsNotNull() {
            addCriterion("HASH_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHashCountEqualTo(Integer value) {
            addCriterion("HASH_COUNT =", value, "hashCount");
            return (Criteria) this;
        }

        public Criteria andHashCountNotEqualTo(Integer value) {
            addCriterion("HASH_COUNT <>", value, "hashCount");
            return (Criteria) this;
        }

        public Criteria andHashCountGreaterThan(Integer value) {
            addCriterion("HASH_COUNT >", value, "hashCount");
            return (Criteria) this;
        }

        public Criteria andHashCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("HASH_COUNT >=", value, "hashCount");
            return (Criteria) this;
        }

        public Criteria andHashCountLessThan(Integer value) {
            addCriterion("HASH_COUNT <", value, "hashCount");
            return (Criteria) this;
        }

        public Criteria andHashCountLessThanOrEqualTo(Integer value) {
            addCriterion("HASH_COUNT <=", value, "hashCount");
            return (Criteria) this;
        }

        public Criteria andHashCountIn(List<Integer> values) {
            addCriterion("HASH_COUNT in", values, "hashCount");
            return (Criteria) this;
        }

        public Criteria andHashCountNotIn(List<Integer> values) {
            addCriterion("HASH_COUNT not in", values, "hashCount");
            return (Criteria) this;
        }

        public Criteria andHashCountBetween(Integer value1, Integer value2) {
            addCriterion("HASH_COUNT between", value1, value2, "hashCount");
            return (Criteria) this;
        }

        public Criteria andHashCountNotBetween(Integer value1, Integer value2) {
            addCriterion("HASH_COUNT not between", value1, value2, "hashCount");
            return (Criteria) this;
        }

        public Criteria andFontColorIsNull() {
            addCriterion("FONT_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andFontColorIsNotNull() {
            addCriterion("FONT_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andFontColorEqualTo(String value) {
            addCriterion("FONT_COLOR =", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorNotEqualTo(String value) {
            addCriterion("FONT_COLOR <>", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorGreaterThan(String value) {
            addCriterion("FONT_COLOR >", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorGreaterThanOrEqualTo(String value) {
            addCriterion("FONT_COLOR >=", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorLessThan(String value) {
            addCriterion("FONT_COLOR <", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorLessThanOrEqualTo(String value) {
            addCriterion("FONT_COLOR <=", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorLike(String value) {
            addCriterion("FONT_COLOR like", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorNotLike(String value) {
            addCriterion("FONT_COLOR not like", value, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorIn(List<String> values) {
            addCriterion("FONT_COLOR in", values, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorNotIn(List<String> values) {
            addCriterion("FONT_COLOR not in", values, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorBetween(String value1, String value2) {
            addCriterion("FONT_COLOR between", value1, value2, "fontColor");
            return (Criteria) this;
        }

        public Criteria andFontColorNotBetween(String value1, String value2) {
            addCriterion("FONT_COLOR not between", value1, value2, "fontColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorIsNull() {
            addCriterion("BACKGROUND_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorIsNotNull() {
            addCriterion("BACKGROUND_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorEqualTo(String value) {
            addCriterion("BACKGROUND_COLOR =", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotEqualTo(String value) {
            addCriterion("BACKGROUND_COLOR <>", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorGreaterThan(String value) {
            addCriterion("BACKGROUND_COLOR >", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorGreaterThanOrEqualTo(String value) {
            addCriterion("BACKGROUND_COLOR >=", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorLessThan(String value) {
            addCriterion("BACKGROUND_COLOR <", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorLessThanOrEqualTo(String value) {
            addCriterion("BACKGROUND_COLOR <=", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorLike(String value) {
            addCriterion("BACKGROUND_COLOR like", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotLike(String value) {
            addCriterion("BACKGROUND_COLOR not like", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorIn(List<String> values) {
            addCriterion("BACKGROUND_COLOR in", values, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotIn(List<String> values) {
            addCriterion("BACKGROUND_COLOR not in", values, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorBetween(String value1, String value2) {
            addCriterion("BACKGROUND_COLOR between", value1, value2, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotBetween(String value1, String value2) {
            addCriterion("BACKGROUND_COLOR not between", value1, value2, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andRetryCountIsNull() {
            addCriterion("RETRY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andRetryCountIsNotNull() {
            addCriterion("RETRY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRetryCountEqualTo(Integer value) {
            addCriterion("RETRY_COUNT =", value, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountNotEqualTo(Integer value) {
            addCriterion("RETRY_COUNT <>", value, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountGreaterThan(Integer value) {
            addCriterion("RETRY_COUNT >", value, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("RETRY_COUNT >=", value, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountLessThan(Integer value) {
            addCriterion("RETRY_COUNT <", value, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountLessThanOrEqualTo(Integer value) {
            addCriterion("RETRY_COUNT <=", value, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountIn(List<Integer> values) {
            addCriterion("RETRY_COUNT in", values, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountNotIn(List<Integer> values) {
            addCriterion("RETRY_COUNT not in", values, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountBetween(Integer value1, Integer value2) {
            addCriterion("RETRY_COUNT between", value1, value2, "retryCount");
            return (Criteria) this;
        }

        public Criteria andRetryCountNotBetween(Integer value1, Integer value2) {
            addCriterion("RETRY_COUNT not between", value1, value2, "retryCount");
            return (Criteria) this;
        }

        public Criteria andLockFlgIsNull() {
            addCriterion("LOCK_FLG is null");
            return (Criteria) this;
        }

        public Criteria andLockFlgIsNotNull() {
            addCriterion("LOCK_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andLockFlgEqualTo(String value) {
            addCriterion("LOCK_FLG =", value, "lockFlg");
            return (Criteria) this;
        }

        public Criteria andLockFlgNotEqualTo(String value) {
            addCriterion("LOCK_FLG <>", value, "lockFlg");
            return (Criteria) this;
        }

        public Criteria andLockFlgGreaterThan(String value) {
            addCriterion("LOCK_FLG >", value, "lockFlg");
            return (Criteria) this;
        }

        public Criteria andLockFlgGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_FLG >=", value, "lockFlg");
            return (Criteria) this;
        }

        public Criteria andLockFlgLessThan(String value) {
            addCriterion("LOCK_FLG <", value, "lockFlg");
            return (Criteria) this;
        }

        public Criteria andLockFlgLessThanOrEqualTo(String value) {
            addCriterion("LOCK_FLG <=", value, "lockFlg");
            return (Criteria) this;
        }

        public Criteria andLockFlgLike(String value) {
            addCriterion("LOCK_FLG like", value, "lockFlg");
            return (Criteria) this;
        }

        public Criteria andLockFlgNotLike(String value) {
            addCriterion("LOCK_FLG not like", value, "lockFlg");
            return (Criteria) this;
        }

        public Criteria andLockFlgIn(List<String> values) {
            addCriterion("LOCK_FLG in", values, "lockFlg");
            return (Criteria) this;
        }

        public Criteria andLockFlgNotIn(List<String> values) {
            addCriterion("LOCK_FLG not in", values, "lockFlg");
            return (Criteria) this;
        }

        public Criteria andLockFlgBetween(String value1, String value2) {
            addCriterion("LOCK_FLG between", value1, value2, "lockFlg");
            return (Criteria) this;
        }

        public Criteria andLockFlgNotBetween(String value1, String value2) {
            addCriterion("LOCK_FLG not between", value1, value2, "lockFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNull() {
            addCriterion("DELETE_FLG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNotNull() {
            addCriterion("DELETE_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgEqualTo(String value) {
            addCriterion("DELETE_FLG =", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotEqualTo(String value) {
            addCriterion("DELETE_FLG <>", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThan(String value) {
            addCriterion("DELETE_FLG >", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_FLG >=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThan(String value) {
            addCriterion("DELETE_FLG <", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThanOrEqualTo(String value) {
            addCriterion("DELETE_FLG <=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLike(String value) {
            addCriterion("DELETE_FLG like", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotLike(String value) {
            addCriterion("DELETE_FLG not like", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIn(List<String> values) {
            addCriterion("DELETE_FLG in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotIn(List<String> values) {
            addCriterion("DELETE_FLG not in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgBetween(String value1, String value2) {
            addCriterion("DELETE_FLG between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotBetween(String value1, String value2) {
            addCriterion("DELETE_FLG not between", value1, value2, "deleteFlg");
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