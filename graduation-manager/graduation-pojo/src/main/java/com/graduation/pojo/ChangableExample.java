package com.graduation.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChangableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChangableExample() {
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

        public Criteria andChangeidIsNull() {
            addCriterion("changeid is null");
            return (Criteria) this;
        }

        public Criteria andChangeidIsNotNull() {
            addCriterion("changeid is not null");
            return (Criteria) this;
        }

        public Criteria andChangeidEqualTo(Integer value) {
            addCriterion("changeid =", value, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidNotEqualTo(Integer value) {
            addCriterion("changeid <>", value, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidGreaterThan(Integer value) {
            addCriterion("changeid >", value, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("changeid >=", value, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidLessThan(Integer value) {
            addCriterion("changeid <", value, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidLessThanOrEqualTo(Integer value) {
            addCriterion("changeid <=", value, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidIn(List<Integer> values) {
            addCriterion("changeid in", values, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidNotIn(List<Integer> values) {
            addCriterion("changeid not in", values, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidBetween(Integer value1, Integer value2) {
            addCriterion("changeid between", value1, value2, "changeid");
            return (Criteria) this;
        }

        public Criteria andChangeidNotBetween(Integer value1, Integer value2) {
            addCriterion("changeid not between", value1, value2, "changeid");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNull() {
            addCriterion("memberid is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(Integer value) {
            addCriterion("memberid =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(Integer value) {
            addCriterion("memberid <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(Integer value) {
            addCriterion("memberid >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("memberid >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(Integer value) {
            addCriterion("memberid <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("memberid <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<Integer> values) {
            addCriterion("memberid in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<Integer> values) {
            addCriterion("memberid not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(Integer value1, Integer value2) {
            addCriterion("memberid between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("memberid not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOlddeptIsNull() {
            addCriterion("olddept is null");
            return (Criteria) this;
        }

        public Criteria andOlddeptIsNotNull() {
            addCriterion("olddept is not null");
            return (Criteria) this;
        }

        public Criteria andOlddeptEqualTo(String value) {
            addCriterion("olddept =", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotEqualTo(String value) {
            addCriterion("olddept <>", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptGreaterThan(String value) {
            addCriterion("olddept >", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptGreaterThanOrEqualTo(String value) {
            addCriterion("olddept >=", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptLessThan(String value) {
            addCriterion("olddept <", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptLessThanOrEqualTo(String value) {
            addCriterion("olddept <=", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptLike(String value) {
            addCriterion("olddept like", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotLike(String value) {
            addCriterion("olddept not like", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptIn(List<String> values) {
            addCriterion("olddept in", values, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotIn(List<String> values) {
            addCriterion("olddept not in", values, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptBetween(String value1, String value2) {
            addCriterion("olddept between", value1, value2, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotBetween(String value1, String value2) {
            addCriterion("olddept not between", value1, value2, "olddept");
            return (Criteria) this;
        }

        public Criteria andNewdeptIsNull() {
            addCriterion("newdept is null");
            return (Criteria) this;
        }

        public Criteria andNewdeptIsNotNull() {
            addCriterion("newdept is not null");
            return (Criteria) this;
        }

        public Criteria andNewdeptEqualTo(String value) {
            addCriterion("newdept =", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptNotEqualTo(String value) {
            addCriterion("newdept <>", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptGreaterThan(String value) {
            addCriterion("newdept >", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptGreaterThanOrEqualTo(String value) {
            addCriterion("newdept >=", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptLessThan(String value) {
            addCriterion("newdept <", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptLessThanOrEqualTo(String value) {
            addCriterion("newdept <=", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptLike(String value) {
            addCriterion("newdept like", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptNotLike(String value) {
            addCriterion("newdept not like", value, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptIn(List<String> values) {
            addCriterion("newdept in", values, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptNotIn(List<String> values) {
            addCriterion("newdept not in", values, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptBetween(String value1, String value2) {
            addCriterion("newdept between", value1, value2, "newdept");
            return (Criteria) this;
        }

        public Criteria andNewdeptNotBetween(String value1, String value2) {
            addCriterion("newdept not between", value1, value2, "newdept");
            return (Criteria) this;
        }

        public Criteria andOldpositionIsNull() {
            addCriterion("oldposition is null");
            return (Criteria) this;
        }

        public Criteria andOldpositionIsNotNull() {
            addCriterion("oldposition is not null");
            return (Criteria) this;
        }

        public Criteria andOldpositionEqualTo(String value) {
            addCriterion("oldposition =", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionNotEqualTo(String value) {
            addCriterion("oldposition <>", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionGreaterThan(String value) {
            addCriterion("oldposition >", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionGreaterThanOrEqualTo(String value) {
            addCriterion("oldposition >=", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionLessThan(String value) {
            addCriterion("oldposition <", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionLessThanOrEqualTo(String value) {
            addCriterion("oldposition <=", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionLike(String value) {
            addCriterion("oldposition like", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionNotLike(String value) {
            addCriterion("oldposition not like", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionIn(List<String> values) {
            addCriterion("oldposition in", values, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionNotIn(List<String> values) {
            addCriterion("oldposition not in", values, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionBetween(String value1, String value2) {
            addCriterion("oldposition between", value1, value2, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionNotBetween(String value1, String value2) {
            addCriterion("oldposition not between", value1, value2, "oldposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionIsNull() {
            addCriterion("newposition is null");
            return (Criteria) this;
        }

        public Criteria andNewpositionIsNotNull() {
            addCriterion("newposition is not null");
            return (Criteria) this;
        }

        public Criteria andNewpositionEqualTo(String value) {
            addCriterion("newposition =", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionNotEqualTo(String value) {
            addCriterion("newposition <>", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionGreaterThan(String value) {
            addCriterion("newposition >", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionGreaterThanOrEqualTo(String value) {
            addCriterion("newposition >=", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionLessThan(String value) {
            addCriterion("newposition <", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionLessThanOrEqualTo(String value) {
            addCriterion("newposition <=", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionLike(String value) {
            addCriterion("newposition like", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionNotLike(String value) {
            addCriterion("newposition not like", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionIn(List<String> values) {
            addCriterion("newposition in", values, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionNotIn(List<String> values) {
            addCriterion("newposition not in", values, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionBetween(String value1, String value2) {
            addCriterion("newposition between", value1, value2, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionNotBetween(String value1, String value2) {
            addCriterion("newposition not between", value1, value2, "newposition");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNull() {
            addCriterion("changetime is null");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNotNull() {
            addCriterion("changetime is not null");
            return (Criteria) this;
        }

        public Criteria andChangetimeEqualTo(Date value) {
            addCriterionForJDBCDate("changetime =", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("changetime <>", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("changetime >", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("changetime >=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThan(Date value) {
            addCriterionForJDBCDate("changetime <", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("changetime <=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeIn(List<Date> values) {
            addCriterionForJDBCDate("changetime in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("changetime not in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("changetime between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("changetime not between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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

        public Criteria andCreatepersonIsNull() {
            addCriterion("createperson is null");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIsNotNull() {
            addCriterion("createperson is not null");
            return (Criteria) this;
        }

        public Criteria andCreatepersonEqualTo(String value) {
            addCriterion("createperson =", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotEqualTo(String value) {
            addCriterion("createperson <>", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonGreaterThan(String value) {
            addCriterion("createperson >", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("createperson >=", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLessThan(String value) {
            addCriterion("createperson <", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLessThanOrEqualTo(String value) {
            addCriterion("createperson <=", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLike(String value) {
            addCriterion("createperson like", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotLike(String value) {
            addCriterion("createperson not like", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIn(List<String> values) {
            addCriterion("createperson in", values, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotIn(List<String> values) {
            addCriterion("createperson not in", values, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonBetween(String value1, String value2) {
            addCriterion("createperson between", value1, value2, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotBetween(String value1, String value2) {
            addCriterion("createperson not between", value1, value2, "createperson");
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