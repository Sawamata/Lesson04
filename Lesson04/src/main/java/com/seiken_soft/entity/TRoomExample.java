package com.seiken_soft.entity;

import java.util.ArrayList;
import java.util.List;

public class TRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TRoomExample() {
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

        public Criteria andRoomNameIsNull() {
            addCriterion("ROOM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNotNull() {
            addCriterion("ROOM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNameEqualTo(String value) {
            addCriterion("ROOM_NAME =", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotEqualTo(String value) {
            addCriterion("ROOM_NAME <>", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThan(String value) {
            addCriterion("ROOM_NAME >", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_NAME >=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThan(String value) {
            addCriterion("ROOM_NAME <", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThanOrEqualTo(String value) {
            addCriterion("ROOM_NAME <=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLike(String value) {
            addCriterion("ROOM_NAME like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotLike(String value) {
            addCriterion("ROOM_NAME not like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameIn(List<String> values) {
            addCriterion("ROOM_NAME in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotIn(List<String> values) {
            addCriterion("ROOM_NAME not in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameBetween(String value1, String value2) {
            addCriterion("ROOM_NAME between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotBetween(String value1, String value2) {
            addCriterion("ROOM_NAME not between", value1, value2, "roomName");
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