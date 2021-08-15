package com.csiic.springboot.model;

import java.util.ArrayList;
import java.util.List;

public class logsStatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public logsStatExample() {
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

        public Criteria andLogdateIsNull() {
            addCriterion("logdate is null");
            return (Criteria) this;
        }

        public Criteria andLogdateIsNotNull() {
            addCriterion("logdate is not null");
            return (Criteria) this;
        }

        public Criteria andLogdateEqualTo(String value) {
            addCriterion("logdate =", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotEqualTo(String value) {
            addCriterion("logdate <>", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateGreaterThan(String value) {
            addCriterion("logdate >", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateGreaterThanOrEqualTo(String value) {
            addCriterion("logdate >=", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateLessThan(String value) {
            addCriterion("logdate <", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateLessThanOrEqualTo(String value) {
            addCriterion("logdate <=", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateLike(String value) {
            addCriterion("logdate like", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotLike(String value) {
            addCriterion("logdate not like", value, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateIn(List<String> values) {
            addCriterion("logdate in", values, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotIn(List<String> values) {
            addCriterion("logdate not in", values, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateBetween(String value1, String value2) {
            addCriterion("logdate between", value1, value2, "logdate");
            return (Criteria) this;
        }

        public Criteria andLogdateNotBetween(String value1, String value2) {
            addCriterion("logdate not between", value1, value2, "logdate");
            return (Criteria) this;
        }

        public Criteria andPvIsNull() {
            addCriterion("pv is null");
            return (Criteria) this;
        }

        public Criteria andPvIsNotNull() {
            addCriterion("pv is not null");
            return (Criteria) this;
        }

        public Criteria andPvEqualTo(Integer value) {
            addCriterion("pv =", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotEqualTo(Integer value) {
            addCriterion("pv <>", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThan(Integer value) {
            addCriterion("pv >", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("pv >=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThan(Integer value) {
            addCriterion("pv <", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThanOrEqualTo(Integer value) {
            addCriterion("pv <=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvIn(List<Integer> values) {
            addCriterion("pv in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotIn(List<Integer> values) {
            addCriterion("pv not in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvBetween(Integer value1, Integer value2) {
            addCriterion("pv between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotBetween(Integer value1, Integer value2) {
            addCriterion("pv not between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andReguserIsNull() {
            addCriterion("reguser is null");
            return (Criteria) this;
        }

        public Criteria andReguserIsNotNull() {
            addCriterion("reguser is not null");
            return (Criteria) this;
        }

        public Criteria andReguserEqualTo(Integer value) {
            addCriterion("reguser =", value, "reguser");
            return (Criteria) this;
        }

        public Criteria andReguserNotEqualTo(Integer value) {
            addCriterion("reguser <>", value, "reguser");
            return (Criteria) this;
        }

        public Criteria andReguserGreaterThan(Integer value) {
            addCriterion("reguser >", value, "reguser");
            return (Criteria) this;
        }

        public Criteria andReguserGreaterThanOrEqualTo(Integer value) {
            addCriterion("reguser >=", value, "reguser");
            return (Criteria) this;
        }

        public Criteria andReguserLessThan(Integer value) {
            addCriterion("reguser <", value, "reguser");
            return (Criteria) this;
        }

        public Criteria andReguserLessThanOrEqualTo(Integer value) {
            addCriterion("reguser <=", value, "reguser");
            return (Criteria) this;
        }

        public Criteria andReguserIn(List<Integer> values) {
            addCriterion("reguser in", values, "reguser");
            return (Criteria) this;
        }

        public Criteria andReguserNotIn(List<Integer> values) {
            addCriterion("reguser not in", values, "reguser");
            return (Criteria) this;
        }

        public Criteria andReguserBetween(Integer value1, Integer value2) {
            addCriterion("reguser between", value1, value2, "reguser");
            return (Criteria) this;
        }

        public Criteria andReguserNotBetween(Integer value1, Integer value2) {
            addCriterion("reguser not between", value1, value2, "reguser");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(Integer value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(Integer value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(Integer value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(Integer value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(Integer value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(Integer value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<Integer> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<Integer> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(Integer value1, Integer value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(Integer value1, Integer value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andJumperIsNull() {
            addCriterion("jumper is null");
            return (Criteria) this;
        }

        public Criteria andJumperIsNotNull() {
            addCriterion("jumper is not null");
            return (Criteria) this;
        }

        public Criteria andJumperEqualTo(Integer value) {
            addCriterion("jumper =", value, "jumper");
            return (Criteria) this;
        }

        public Criteria andJumperNotEqualTo(Integer value) {
            addCriterion("jumper <>", value, "jumper");
            return (Criteria) this;
        }

        public Criteria andJumperGreaterThan(Integer value) {
            addCriterion("jumper >", value, "jumper");
            return (Criteria) this;
        }

        public Criteria andJumperGreaterThanOrEqualTo(Integer value) {
            addCriterion("jumper >=", value, "jumper");
            return (Criteria) this;
        }

        public Criteria andJumperLessThan(Integer value) {
            addCriterion("jumper <", value, "jumper");
            return (Criteria) this;
        }

        public Criteria andJumperLessThanOrEqualTo(Integer value) {
            addCriterion("jumper <=", value, "jumper");
            return (Criteria) this;
        }

        public Criteria andJumperIn(List<Integer> values) {
            addCriterion("jumper in", values, "jumper");
            return (Criteria) this;
        }

        public Criteria andJumperNotIn(List<Integer> values) {
            addCriterion("jumper not in", values, "jumper");
            return (Criteria) this;
        }

        public Criteria andJumperBetween(Integer value1, Integer value2) {
            addCriterion("jumper between", value1, value2, "jumper");
            return (Criteria) this;
        }

        public Criteria andJumperNotBetween(Integer value1, Integer value2) {
            addCriterion("jumper not between", value1, value2, "jumper");
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