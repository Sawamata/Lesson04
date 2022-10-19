package com.seiken_soft.entity;

import java.util.ArrayList;
import java.util.List;

public class TRoomtalkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRoomtalkExample() {
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

        public Criteria andRoomNumberIsNull() {
            addCriterion("ROOM_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNotNull() {
            addCriterion("ROOM_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberEqualTo(String value) {
            addCriterion("ROOM_NUMBER =", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotEqualTo(String value) {
            addCriterion("ROOM_NUMBER <>", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThan(String value) {
            addCriterion("ROOM_NUMBER >", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_NUMBER >=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThan(String value) {
            addCriterion("ROOM_NUMBER <", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThanOrEqualTo(String value) {
            addCriterion("ROOM_NUMBER <=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLike(String value) {
            addCriterion("ROOM_NUMBER like", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotLike(String value) {
            addCriterion("ROOM_NUMBER not like", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIn(List<String> values) {
            addCriterion("ROOM_NUMBER in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotIn(List<String> values) {
            addCriterion("ROOM_NUMBER not in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberBetween(String value1, String value2) {
            addCriterion("ROOM_NUMBER between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotBetween(String value1, String value2) {
            addCriterion("ROOM_NUMBER not between", value1, value2, "roomNumber");
            return (Criteria) this;
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

        public Criteria andRenbanIsNull() {
            addCriterion("RENBAN is null");
            return (Criteria) this;
        }

        public Criteria andRenbanIsNotNull() {
            addCriterion("RENBAN is not null");
            return (Criteria) this;
        }

        public Criteria andRenbanEqualTo(Long value) {
            addCriterion("RENBAN =", value, "renban");
            return (Criteria) this;
        }

        public Criteria andRenbanNotEqualTo(Long value) {
            addCriterion("RENBAN <>", value, "renban");
            return (Criteria) this;
        }

        public Criteria andRenbanGreaterThan(Long value) {
            addCriterion("RENBAN >", value, "renban");
            return (Criteria) this;
        }

        public Criteria andRenbanGreaterThanOrEqualTo(Long value) {
            addCriterion("RENBAN >=", value, "renban");
            return (Criteria) this;
        }

        public Criteria andRenbanLessThan(Long value) {
            addCriterion("RENBAN <", value, "renban");
            return (Criteria) this;
        }

        public Criteria andRenbanLessThanOrEqualTo(Long value) {
            addCriterion("RENBAN <=", value, "renban");
            return (Criteria) this;
        }

        public Criteria andRenbanIn(List<Long> values) {
            addCriterion("RENBAN in", values, "renban");
            return (Criteria) this;
        }

        public Criteria andRenbanNotIn(List<Long> values) {
            addCriterion("RENBAN not in", values, "renban");
            return (Criteria) this;
        }

        public Criteria andRenbanBetween(Long value1, Long value2) {
            addCriterion("RENBAN between", value1, value2, "renban");
            return (Criteria) this;
        }

        public Criteria andRenbanNotBetween(Long value1, Long value2) {
            addCriterion("RENBAN not between", value1, value2, "renban");
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

        public Criteria andBackColorIsNull() {
            addCriterion("BACK_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andBackColorIsNotNull() {
            addCriterion("BACK_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andBackColorEqualTo(String value) {
            addCriterion("BACK_COLOR =", value, "backColor");
            return (Criteria) this;
        }

        public Criteria andBackColorNotEqualTo(String value) {
            addCriterion("BACK_COLOR <>", value, "backColor");
            return (Criteria) this;
        }

        public Criteria andBackColorGreaterThan(String value) {
            addCriterion("BACK_COLOR >", value, "backColor");
            return (Criteria) this;
        }

        public Criteria andBackColorGreaterThanOrEqualTo(String value) {
            addCriterion("BACK_COLOR >=", value, "backColor");
            return (Criteria) this;
        }

        public Criteria andBackColorLessThan(String value) {
            addCriterion("BACK_COLOR <", value, "backColor");
            return (Criteria) this;
        }

        public Criteria andBackColorLessThanOrEqualTo(String value) {
            addCriterion("BACK_COLOR <=", value, "backColor");
            return (Criteria) this;
        }

        public Criteria andBackColorLike(String value) {
            addCriterion("BACK_COLOR like", value, "backColor");
            return (Criteria) this;
        }

        public Criteria andBackColorNotLike(String value) {
            addCriterion("BACK_COLOR not like", value, "backColor");
            return (Criteria) this;
        }

        public Criteria andBackColorIn(List<String> values) {
            addCriterion("BACK_COLOR in", values, "backColor");
            return (Criteria) this;
        }

        public Criteria andBackColorNotIn(List<String> values) {
            addCriterion("BACK_COLOR not in", values, "backColor");
            return (Criteria) this;
        }

        public Criteria andBackColorBetween(String value1, String value2) {
            addCriterion("BACK_COLOR between", value1, value2, "backColor");
            return (Criteria) this;
        }

        public Criteria andBackColorNotBetween(String value1, String value2) {
            addCriterion("BACK_COLOR not between", value1, value2, "backColor");
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