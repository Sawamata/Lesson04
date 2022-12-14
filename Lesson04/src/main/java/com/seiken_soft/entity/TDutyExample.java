package com.seiken_soft.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDutyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDutyExample() {
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

        public Criteria andDutyMonthIsNull() {
            addCriterion("DUTY_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andDutyMonthIsNotNull() {
            addCriterion("DUTY_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andDutyMonthEqualTo(String value) {
            addCriterion("DUTY_MONTH =", value, "dutyMonth");
            return (Criteria) this;
        }

        public Criteria andDutyMonthNotEqualTo(String value) {
            addCriterion("DUTY_MONTH <>", value, "dutyMonth");
            return (Criteria) this;
        }

        public Criteria andDutyMonthGreaterThan(String value) {
            addCriterion("DUTY_MONTH >", value, "dutyMonth");
            return (Criteria) this;
        }

        public Criteria andDutyMonthGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY_MONTH >=", value, "dutyMonth");
            return (Criteria) this;
        }

        public Criteria andDutyMonthLessThan(String value) {
            addCriterion("DUTY_MONTH <", value, "dutyMonth");
            return (Criteria) this;
        }

        public Criteria andDutyMonthLessThanOrEqualTo(String value) {
            addCriterion("DUTY_MONTH <=", value, "dutyMonth");
            return (Criteria) this;
        }

        public Criteria andDutyMonthLike(String value) {
            addCriterion("DUTY_MONTH like", value, "dutyMonth");
            return (Criteria) this;
        }

        public Criteria andDutyMonthNotLike(String value) {
            addCriterion("DUTY_MONTH not like", value, "dutyMonth");
            return (Criteria) this;
        }

        public Criteria andDutyMonthIn(List<String> values) {
            addCriterion("DUTY_MONTH in", values, "dutyMonth");
            return (Criteria) this;
        }

        public Criteria andDutyMonthNotIn(List<String> values) {
            addCriterion("DUTY_MONTH not in", values, "dutyMonth");
            return (Criteria) this;
        }

        public Criteria andDutyMonthBetween(String value1, String value2) {
            addCriterion("DUTY_MONTH between", value1, value2, "dutyMonth");
            return (Criteria) this;
        }

        public Criteria andDutyMonthNotBetween(String value1, String value2) {
            addCriterion("DUTY_MONTH not between", value1, value2, "dutyMonth");
            return (Criteria) this;
        }

        public Criteria andDutyDateIsNull() {
            addCriterion("DUTY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDutyDateIsNotNull() {
            addCriterion("DUTY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDutyDateEqualTo(String value) {
            addCriterion("DUTY_DATE =", value, "dutyDate");
            return (Criteria) this;
        }

        public Criteria andDutyDateNotEqualTo(String value) {
            addCriterion("DUTY_DATE <>", value, "dutyDate");
            return (Criteria) this;
        }

        public Criteria andDutyDateGreaterThan(String value) {
            addCriterion("DUTY_DATE >", value, "dutyDate");
            return (Criteria) this;
        }

        public Criteria andDutyDateGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY_DATE >=", value, "dutyDate");
            return (Criteria) this;
        }

        public Criteria andDutyDateLessThan(String value) {
            addCriterion("DUTY_DATE <", value, "dutyDate");
            return (Criteria) this;
        }

        public Criteria andDutyDateLessThanOrEqualTo(String value) {
            addCriterion("DUTY_DATE <=", value, "dutyDate");
            return (Criteria) this;
        }

        public Criteria andDutyDateLike(String value) {
            addCriterion("DUTY_DATE like", value, "dutyDate");
            return (Criteria) this;
        }

        public Criteria andDutyDateNotLike(String value) {
            addCriterion("DUTY_DATE not like", value, "dutyDate");
            return (Criteria) this;
        }

        public Criteria andDutyDateIn(List<String> values) {
            addCriterion("DUTY_DATE in", values, "dutyDate");
            return (Criteria) this;
        }

        public Criteria andDutyDateNotIn(List<String> values) {
            addCriterion("DUTY_DATE not in", values, "dutyDate");
            return (Criteria) this;
        }

        public Criteria andDutyDateBetween(String value1, String value2) {
            addCriterion("DUTY_DATE between", value1, value2, "dutyDate");
            return (Criteria) this;
        }

        public Criteria andDutyDateNotBetween(String value1, String value2) {
            addCriterion("DUTY_DATE not between", value1, value2, "dutyDate");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeFromIsNull() {
            addCriterion("DUTY_WORK_TIME_FROM is null");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeFromIsNotNull() {
            addCriterion("DUTY_WORK_TIME_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeFromEqualTo(Date value) {
            addCriterion("DUTY_WORK_TIME_FROM =", value, "dutyWorkTimeFrom");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeFromNotEqualTo(Date value) {
            addCriterion("DUTY_WORK_TIME_FROM <>", value, "dutyWorkTimeFrom");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeFromGreaterThan(Date value) {
            addCriterion("DUTY_WORK_TIME_FROM >", value, "dutyWorkTimeFrom");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeFromGreaterThanOrEqualTo(Date value) {
            addCriterion("DUTY_WORK_TIME_FROM >=", value, "dutyWorkTimeFrom");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeFromLessThan(Date value) {
            addCriterion("DUTY_WORK_TIME_FROM <", value, "dutyWorkTimeFrom");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeFromLessThanOrEqualTo(Date value) {
            addCriterion("DUTY_WORK_TIME_FROM <=", value, "dutyWorkTimeFrom");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeFromIn(List<Date> values) {
            addCriterion("DUTY_WORK_TIME_FROM in", values, "dutyWorkTimeFrom");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeFromNotIn(List<Date> values) {
            addCriterion("DUTY_WORK_TIME_FROM not in", values, "dutyWorkTimeFrom");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeFromBetween(Date value1, Date value2) {
            addCriterion("DUTY_WORK_TIME_FROM between", value1, value2, "dutyWorkTimeFrom");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeFromNotBetween(Date value1, Date value2) {
            addCriterion("DUTY_WORK_TIME_FROM not between", value1, value2, "dutyWorkTimeFrom");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeToIsNull() {
            addCriterion("DUTY_WORK_TIME_TO is null");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeToIsNotNull() {
            addCriterion("DUTY_WORK_TIME_TO is not null");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeToEqualTo(Date value) {
            addCriterion("DUTY_WORK_TIME_TO =", value, "dutyWorkTimeTo");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeToNotEqualTo(Date value) {
            addCriterion("DUTY_WORK_TIME_TO <>", value, "dutyWorkTimeTo");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeToGreaterThan(Date value) {
            addCriterion("DUTY_WORK_TIME_TO >", value, "dutyWorkTimeTo");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeToGreaterThanOrEqualTo(Date value) {
            addCriterion("DUTY_WORK_TIME_TO >=", value, "dutyWorkTimeTo");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeToLessThan(Date value) {
            addCriterion("DUTY_WORK_TIME_TO <", value, "dutyWorkTimeTo");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeToLessThanOrEqualTo(Date value) {
            addCriterion("DUTY_WORK_TIME_TO <=", value, "dutyWorkTimeTo");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeToIn(List<Date> values) {
            addCriterion("DUTY_WORK_TIME_TO in", values, "dutyWorkTimeTo");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeToNotIn(List<Date> values) {
            addCriterion("DUTY_WORK_TIME_TO not in", values, "dutyWorkTimeTo");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeToBetween(Date value1, Date value2) {
            addCriterion("DUTY_WORK_TIME_TO between", value1, value2, "dutyWorkTimeTo");
            return (Criteria) this;
        }

        public Criteria andDutyWorkTimeToNotBetween(Date value1, Date value2) {
            addCriterion("DUTY_WORK_TIME_TO not between", value1, value2, "dutyWorkTimeTo");
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