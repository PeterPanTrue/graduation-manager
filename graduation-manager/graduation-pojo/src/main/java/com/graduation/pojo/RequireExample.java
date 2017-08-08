package com.graduation.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RequireExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RequireExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRequireidIsNull() {
            addCriterion("requireid is null");
            return (Criteria) this;
        }

        public Criteria andRequireidIsNotNull() {
            addCriterion("requireid is not null");
            return (Criteria) this;
        }

        public Criteria andRequireidEqualTo(Integer value) {
            addCriterion("requireid =", value, "requireid");
            return (Criteria) this;
        }

        public Criteria andRequireidNotEqualTo(Integer value) {
            addCriterion("requireid <>", value, "requireid");
            return (Criteria) this;
        }

        public Criteria andRequireidGreaterThan(Integer value) {
            addCriterion("requireid >", value, "requireid");
            return (Criteria) this;
        }

        public Criteria andRequireidGreaterThanOrEqualTo(Integer value) {
            addCriterion("requireid >=", value, "requireid");
            return (Criteria) this;
        }

        public Criteria andRequireidLessThan(Integer value) {
            addCriterion("requireid <", value, "requireid");
            return (Criteria) this;
        }

        public Criteria andRequireidLessThanOrEqualTo(Integer value) {
            addCriterion("requireid <=", value, "requireid");
            return (Criteria) this;
        }

        public Criteria andRequireidIn(List<Integer> values) {
            addCriterion("requireid in", values, "requireid");
            return (Criteria) this;
        }

        public Criteria andRequireidNotIn(List<Integer> values) {
            addCriterion("requireid not in", values, "requireid");
            return (Criteria) this;
        }

        public Criteria andRequireidBetween(Integer value1, Integer value2) {
            addCriterion("requireid between", value1, value2, "requireid");
            return (Criteria) this;
        }

        public Criteria andRequireidNotBetween(Integer value1, Integer value2) {
            addCriterion("requireid not between", value1, value2, "requireid");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andNeedIsNull() {
            addCriterion("need is null");
            return (Criteria) this;
        }

        public Criteria andNeedIsNotNull() {
            addCriterion("need is not null");
            return (Criteria) this;
        }

        public Criteria andNeedEqualTo(String value) {
            addCriterion("need =", value, "need");
            return (Criteria) this;
        }

        public Criteria andNeedNotEqualTo(String value) {
            addCriterion("need <>", value, "need");
            return (Criteria) this;
        }

        public Criteria andNeedGreaterThan(String value) {
            addCriterion("need >", value, "need");
            return (Criteria) this;
        }

        public Criteria andNeedGreaterThanOrEqualTo(String value) {
            addCriterion("need >=", value, "need");
            return (Criteria) this;
        }

        public Criteria andNeedLessThan(String value) {
            addCriterion("need <", value, "need");
            return (Criteria) this;
        }

        public Criteria andNeedLessThanOrEqualTo(String value) {
            addCriterion("need <=", value, "need");
            return (Criteria) this;
        }

        public Criteria andNeedLike(String value) {
            addCriterion("need like", value, "need");
            return (Criteria) this;
        }

        public Criteria andNeedNotLike(String value) {
            addCriterion("need not like", value, "need");
            return (Criteria) this;
        }

        public Criteria andNeedIn(List<String> values) {
            addCriterion("need in", values, "need");
            return (Criteria) this;
        }

        public Criteria andNeedNotIn(List<String> values) {
            addCriterion("need not in", values, "need");
            return (Criteria) this;
        }

        public Criteria andNeedBetween(String value1, String value2) {
            addCriterion("need between", value1, value2, "need");
            return (Criteria) this;
        }

        public Criteria andNeedNotBetween(String value1, String value2) {
            addCriterion("need not between", value1, value2, "need");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andSubmitIsNull() {
            addCriterion("submit is null");
            return (Criteria) this;
        }

        public Criteria andSubmitIsNotNull() {
            addCriterion("submit is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitEqualTo(Integer value) {
            addCriterion("submit =", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitNotEqualTo(Integer value) {
            addCriterion("submit <>", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitGreaterThan(Integer value) {
            addCriterion("submit >", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitGreaterThanOrEqualTo(Integer value) {
            addCriterion("submit >=", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitLessThan(Integer value) {
            addCriterion("submit <", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitLessThanOrEqualTo(Integer value) {
            addCriterion("submit <=", value, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitIn(List<Integer> values) {
            addCriterion("submit in", values, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitNotIn(List<Integer> values) {
            addCriterion("submit not in", values, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitBetween(Integer value1, Integer value2) {
            addCriterion("submit between", value1, value2, "submit");
            return (Criteria) this;
        }

        public Criteria andSubmitNotBetween(Integer value1, Integer value2) {
            addCriterion("submit not between", value1, value2, "submit");
            return (Criteria) this;
        }

        public Criteria andAgreeIsNull() {
            addCriterion("agree is null");
            return (Criteria) this;
        }

        public Criteria andAgreeIsNotNull() {
            addCriterion("agree is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeEqualTo(Integer value) {
            addCriterion("agree =", value, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeNotEqualTo(Integer value) {
            addCriterion("agree <>", value, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeGreaterThan(Integer value) {
            addCriterion("agree >", value, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("agree >=", value, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeLessThan(Integer value) {
            addCriterion("agree <", value, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeLessThanOrEqualTo(Integer value) {
            addCriterion("agree <=", value, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeIn(List<Integer> values) {
            addCriterion("agree in", values, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeNotIn(List<Integer> values) {
            addCriterion("agree not in", values, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeBetween(Integer value1, Integer value2) {
            addCriterion("agree between", value1, value2, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeNotBetween(Integer value1, Integer value2) {
            addCriterion("agree not between", value1, value2, "agree");
            return (Criteria) this;
        }

        public Criteria andPunishIsNull() {
            addCriterion("punish is null");
            return (Criteria) this;
        }

        public Criteria andPunishIsNotNull() {
            addCriterion("punish is not null");
            return (Criteria) this;
        }

        public Criteria andPunishEqualTo(Integer value) {
            addCriterion("punish =", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishNotEqualTo(Integer value) {
            addCriterion("punish <>", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishGreaterThan(Integer value) {
            addCriterion("punish >", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishGreaterThanOrEqualTo(Integer value) {
            addCriterion("punish >=", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishLessThan(Integer value) {
            addCriterion("punish <", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishLessThanOrEqualTo(Integer value) {
            addCriterion("punish <=", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishIn(List<Integer> values) {
            addCriterion("punish in", values, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishNotIn(List<Integer> values) {
            addCriterion("punish not in", values, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishBetween(Integer value1, Integer value2) {
            addCriterion("punish between", value1, value2, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishNotBetween(Integer value1, Integer value2) {
            addCriterion("punish not between", value1, value2, "punish");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("isdeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("isdeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Integer value) {
            addCriterion("isdeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Integer value) {
            addCriterion("isdeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Integer value) {
            addCriterion("isdeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Integer value) {
            addCriterion("isdeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Integer value) {
            addCriterion("isdeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Integer> values) {
            addCriterion("isdeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Integer> values) {
            addCriterion("isdeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Integer value1, Integer value2) {
            addCriterion("isdeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("isdeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatepersomIsNull() {
            addCriterion("createpersom is null");
            return (Criteria) this;
        }

        public Criteria andCreatepersomIsNotNull() {
            addCriterion("createpersom is not null");
            return (Criteria) this;
        }

        public Criteria andCreatepersomEqualTo(String value) {
            addCriterion("createpersom =", value, "createpersom");
            return (Criteria) this;
        }

        public Criteria andCreatepersomNotEqualTo(String value) {
            addCriterion("createpersom <>", value, "createpersom");
            return (Criteria) this;
        }

        public Criteria andCreatepersomGreaterThan(String value) {
            addCriterion("createpersom >", value, "createpersom");
            return (Criteria) this;
        }

        public Criteria andCreatepersomGreaterThanOrEqualTo(String value) {
            addCriterion("createpersom >=", value, "createpersom");
            return (Criteria) this;
        }

        public Criteria andCreatepersomLessThan(String value) {
            addCriterion("createpersom <", value, "createpersom");
            return (Criteria) this;
        }

        public Criteria andCreatepersomLessThanOrEqualTo(String value) {
            addCriterion("createpersom <=", value, "createpersom");
            return (Criteria) this;
        }

        public Criteria andCreatepersomLike(String value) {
            addCriterion("createpersom like", value, "createpersom");
            return (Criteria) this;
        }

        public Criteria andCreatepersomNotLike(String value) {
            addCriterion("createpersom not like", value, "createpersom");
            return (Criteria) this;
        }

        public Criteria andCreatepersomIn(List<String> values) {
            addCriterion("createpersom in", values, "createpersom");
            return (Criteria) this;
        }

        public Criteria andCreatepersomNotIn(List<String> values) {
            addCriterion("createpersom not in", values, "createpersom");
            return (Criteria) this;
        }

        public Criteria andCreatepersomBetween(String value1, String value2) {
            addCriterion("createpersom between", value1, value2, "createpersom");
            return (Criteria) this;
        }

        public Criteria andCreatepersomNotBetween(String value1, String value2) {
            addCriterion("createpersom not between", value1, value2, "createpersom");
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