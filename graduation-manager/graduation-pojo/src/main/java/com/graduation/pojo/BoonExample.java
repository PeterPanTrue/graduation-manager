package com.graduation.pojo;

import java.util.ArrayList;
import java.util.List;

public class BoonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoonExample() {
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

        public Criteria andBoonidIsNull() {
            addCriterion("boonid is null");
            return (Criteria) this;
        }

        public Criteria andBoonidIsNotNull() {
            addCriterion("boonid is not null");
            return (Criteria) this;
        }

        public Criteria andBoonidEqualTo(Integer value) {
            addCriterion("boonid =", value, "boonid");
            return (Criteria) this;
        }

        public Criteria andBoonidNotEqualTo(Integer value) {
            addCriterion("boonid <>", value, "boonid");
            return (Criteria) this;
        }

        public Criteria andBoonidGreaterThan(Integer value) {
            addCriterion("boonid >", value, "boonid");
            return (Criteria) this;
        }

        public Criteria andBoonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("boonid >=", value, "boonid");
            return (Criteria) this;
        }

        public Criteria andBoonidLessThan(Integer value) {
            addCriterion("boonid <", value, "boonid");
            return (Criteria) this;
        }

        public Criteria andBoonidLessThanOrEqualTo(Integer value) {
            addCriterion("boonid <=", value, "boonid");
            return (Criteria) this;
        }

        public Criteria andBoonidIn(List<Integer> values) {
            addCriterion("boonid in", values, "boonid");
            return (Criteria) this;
        }

        public Criteria andBoonidNotIn(List<Integer> values) {
            addCriterion("boonid not in", values, "boonid");
            return (Criteria) this;
        }

        public Criteria andBoonidBetween(Integer value1, Integer value2) {
            addCriterion("boonid between", value1, value2, "boonid");
            return (Criteria) this;
        }

        public Criteria andBoonidNotBetween(Integer value1, Integer value2) {
            addCriterion("boonid not between", value1, value2, "boonid");
            return (Criteria) this;
        }

        public Criteria andBoonnameIsNull() {
            addCriterion("boonname is null");
            return (Criteria) this;
        }

        public Criteria andBoonnameIsNotNull() {
            addCriterion("boonname is not null");
            return (Criteria) this;
        }

        public Criteria andBoonnameEqualTo(String value) {
            addCriterion("boonname =", value, "boonname");
            return (Criteria) this;
        }

        public Criteria andBoonnameNotEqualTo(String value) {
            addCriterion("boonname <>", value, "boonname");
            return (Criteria) this;
        }

        public Criteria andBoonnameGreaterThan(String value) {
            addCriterion("boonname >", value, "boonname");
            return (Criteria) this;
        }

        public Criteria andBoonnameGreaterThanOrEqualTo(String value) {
            addCriterion("boonname >=", value, "boonname");
            return (Criteria) this;
        }

        public Criteria andBoonnameLessThan(String value) {
            addCriterion("boonname <", value, "boonname");
            return (Criteria) this;
        }

        public Criteria andBoonnameLessThanOrEqualTo(String value) {
            addCriterion("boonname <=", value, "boonname");
            return (Criteria) this;
        }

        public Criteria andBoonnameLike(String value) {
            addCriterion("boonname like", value, "boonname");
            return (Criteria) this;
        }

        public Criteria andBoonnameNotLike(String value) {
            addCriterion("boonname not like", value, "boonname");
            return (Criteria) this;
        }

        public Criteria andBoonnameIn(List<String> values) {
            addCriterion("boonname in", values, "boonname");
            return (Criteria) this;
        }

        public Criteria andBoonnameNotIn(List<String> values) {
            addCriterion("boonname not in", values, "boonname");
            return (Criteria) this;
        }

        public Criteria andBoonnameBetween(String value1, String value2) {
            addCriterion("boonname between", value1, value2, "boonname");
            return (Criteria) this;
        }

        public Criteria andBoonnameNotBetween(String value1, String value2) {
            addCriterion("boonname not between", value1, value2, "boonname");
            return (Criteria) this;
        }

        public Criteria andBoonmoneyIsNull() {
            addCriterion("boonmoney is null");
            return (Criteria) this;
        }

        public Criteria andBoonmoneyIsNotNull() {
            addCriterion("boonmoney is not null");
            return (Criteria) this;
        }

        public Criteria andBoonmoneyEqualTo(String value) {
            addCriterion("boonmoney =", value, "boonmoney");
            return (Criteria) this;
        }

        public Criteria andBoonmoneyNotEqualTo(String value) {
            addCriterion("boonmoney <>", value, "boonmoney");
            return (Criteria) this;
        }

        public Criteria andBoonmoneyGreaterThan(String value) {
            addCriterion("boonmoney >", value, "boonmoney");
            return (Criteria) this;
        }

        public Criteria andBoonmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("boonmoney >=", value, "boonmoney");
            return (Criteria) this;
        }

        public Criteria andBoonmoneyLessThan(String value) {
            addCriterion("boonmoney <", value, "boonmoney");
            return (Criteria) this;
        }

        public Criteria andBoonmoneyLessThanOrEqualTo(String value) {
            addCriterion("boonmoney <=", value, "boonmoney");
            return (Criteria) this;
        }

        public Criteria andBoonmoneyLike(String value) {
            addCriterion("boonmoney like", value, "boonmoney");
            return (Criteria) this;
        }

        public Criteria andBoonmoneyNotLike(String value) {
            addCriterion("boonmoney not like", value, "boonmoney");
            return (Criteria) this;
        }

        public Criteria andBoonmoneyIn(List<String> values) {
            addCriterion("boonmoney in", values, "boonmoney");
            return (Criteria) this;
        }

        public Criteria andBoonmoneyNotIn(List<String> values) {
            addCriterion("boonmoney not in", values, "boonmoney");
            return (Criteria) this;
        }

        public Criteria andBoonmoneyBetween(String value1, String value2) {
            addCriterion("boonmoney between", value1, value2, "boonmoney");
            return (Criteria) this;
        }

        public Criteria andBoonmoneyNotBetween(String value1, String value2) {
            addCriterion("boonmoney not between", value1, value2, "boonmoney");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTemp1IsNull() {
            addCriterion("temp1 is null");
            return (Criteria) this;
        }

        public Criteria andTemp1IsNotNull() {
            addCriterion("temp1 is not null");
            return (Criteria) this;
        }

        public Criteria andTemp1EqualTo(String value) {
            addCriterion("temp1 =", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotEqualTo(String value) {
            addCriterion("temp1 <>", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1GreaterThan(String value) {
            addCriterion("temp1 >", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1GreaterThanOrEqualTo(String value) {
            addCriterion("temp1 >=", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1LessThan(String value) {
            addCriterion("temp1 <", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1LessThanOrEqualTo(String value) {
            addCriterion("temp1 <=", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1Like(String value) {
            addCriterion("temp1 like", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotLike(String value) {
            addCriterion("temp1 not like", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1In(List<String> values) {
            addCriterion("temp1 in", values, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotIn(List<String> values) {
            addCriterion("temp1 not in", values, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1Between(String value1, String value2) {
            addCriterion("temp1 between", value1, value2, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotBetween(String value1, String value2) {
            addCriterion("temp1 not between", value1, value2, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp2IsNull() {
            addCriterion("temp2 is null");
            return (Criteria) this;
        }

        public Criteria andTemp2IsNotNull() {
            addCriterion("temp2 is not null");
            return (Criteria) this;
        }

        public Criteria andTemp2EqualTo(String value) {
            addCriterion("temp2 =", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotEqualTo(String value) {
            addCriterion("temp2 <>", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2GreaterThan(String value) {
            addCriterion("temp2 >", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2GreaterThanOrEqualTo(String value) {
            addCriterion("temp2 >=", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2LessThan(String value) {
            addCriterion("temp2 <", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2LessThanOrEqualTo(String value) {
            addCriterion("temp2 <=", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2Like(String value) {
            addCriterion("temp2 like", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotLike(String value) {
            addCriterion("temp2 not like", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2In(List<String> values) {
            addCriterion("temp2 in", values, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotIn(List<String> values) {
            addCriterion("temp2 not in", values, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2Between(String value1, String value2) {
            addCriterion("temp2 between", value1, value2, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotBetween(String value1, String value2) {
            addCriterion("temp2 not between", value1, value2, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp3IsNull() {
            addCriterion("temp3 is null");
            return (Criteria) this;
        }

        public Criteria andTemp3IsNotNull() {
            addCriterion("temp3 is not null");
            return (Criteria) this;
        }

        public Criteria andTemp3EqualTo(String value) {
            addCriterion("temp3 =", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3NotEqualTo(String value) {
            addCriterion("temp3 <>", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3GreaterThan(String value) {
            addCriterion("temp3 >", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3GreaterThanOrEqualTo(String value) {
            addCriterion("temp3 >=", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3LessThan(String value) {
            addCriterion("temp3 <", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3LessThanOrEqualTo(String value) {
            addCriterion("temp3 <=", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3Like(String value) {
            addCriterion("temp3 like", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3NotLike(String value) {
            addCriterion("temp3 not like", value, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3In(List<String> values) {
            addCriterion("temp3 in", values, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3NotIn(List<String> values) {
            addCriterion("temp3 not in", values, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3Between(String value1, String value2) {
            addCriterion("temp3 between", value1, value2, "temp3");
            return (Criteria) this;
        }

        public Criteria andTemp3NotBetween(String value1, String value2) {
            addCriterion("temp3 not between", value1, value2, "temp3");
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