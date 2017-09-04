package com.graduation.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CheckableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckableExample() {
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

        public Criteria andCheckidIsNull() {
            addCriterion("checkid is null");
            return (Criteria) this;
        }

        public Criteria andCheckidIsNotNull() {
            addCriterion("checkid is not null");
            return (Criteria) this;
        }

        public Criteria andCheckidEqualTo(Integer value) {
            addCriterion("checkid =", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotEqualTo(Integer value) {
            addCriterion("checkid <>", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidGreaterThan(Integer value) {
            addCriterion("checkid >", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkid >=", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLessThan(Integer value) {
            addCriterion("checkid <", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLessThanOrEqualTo(Integer value) {
            addCriterion("checkid <=", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidIn(List<Integer> values) {
            addCriterion("checkid in", values, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotIn(List<Integer> values) {
            addCriterion("checkid not in", values, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidBetween(Integer value1, Integer value2) {
            addCriterion("checkid between", value1, value2, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotBetween(Integer value1, Integer value2) {
            addCriterion("checkid not between", value1, value2, "checkid");
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

        public Criteria andMembernameIsNull() {
            addCriterion("membername is null");
            return (Criteria) this;
        }

        public Criteria andMembernameIsNotNull() {
            addCriterion("membername is not null");
            return (Criteria) this;
        }

        public Criteria andMembernameEqualTo(String value) {
            addCriterion("membername =", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotEqualTo(String value) {
            addCriterion("membername <>", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameGreaterThan(String value) {
            addCriterion("membername >", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameGreaterThanOrEqualTo(String value) {
            addCriterion("membername >=", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLessThan(String value) {
            addCriterion("membername <", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLessThanOrEqualTo(String value) {
            addCriterion("membername <=", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameLike(String value) {
            addCriterion("membername like", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotLike(String value) {
            addCriterion("membername not like", value, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameIn(List<String> values) {
            addCriterion("membername in", values, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotIn(List<String> values) {
            addCriterion("membername not in", values, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameBetween(String value1, String value2) {
            addCriterion("membername between", value1, value2, "membername");
            return (Criteria) this;
        }

        public Criteria andMembernameNotBetween(String value1, String value2) {
            addCriterion("membername not between", value1, value2, "membername");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checktime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checktime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(Date value) {
            addCriterionForJDBCDate("checktime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("checktime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterionForJDBCDate("checktime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checktime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterionForJDBCDate("checktime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checktime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterionForJDBCDate("checktime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("checktime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checktime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checktime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andOntimeIsNull() {
            addCriterion("ontime is null");
            return (Criteria) this;
        }

        public Criteria andOntimeIsNotNull() {
            addCriterion("ontime is not null");
            return (Criteria) this;
        }

        public Criteria andOntimeEqualTo(Integer value) {
            addCriterion("ontime =", value, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeNotEqualTo(Integer value) {
            addCriterion("ontime <>", value, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeGreaterThan(Integer value) {
            addCriterion("ontime >", value, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ontime >=", value, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeLessThan(Integer value) {
            addCriterion("ontime <", value, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeLessThanOrEqualTo(Integer value) {
            addCriterion("ontime <=", value, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeIn(List<Integer> values) {
            addCriterion("ontime in", values, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeNotIn(List<Integer> values) {
            addCriterion("ontime not in", values, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeBetween(Integer value1, Integer value2) {
            addCriterion("ontime between", value1, value2, "ontime");
            return (Criteria) this;
        }

        public Criteria andOntimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ontime not between", value1, value2, "ontime");
            return (Criteria) this;
        }

        public Criteria andAleaveIsNull() {
            addCriterion("aleave is null");
            return (Criteria) this;
        }

        public Criteria andAleaveIsNotNull() {
            addCriterion("aleave is not null");
            return (Criteria) this;
        }

        public Criteria andAleaveEqualTo(Integer value) {
            addCriterion("aleave =", value, "aleave");
            return (Criteria) this;
        }

        public Criteria andAleaveNotEqualTo(Integer value) {
            addCriterion("aleave <>", value, "aleave");
            return (Criteria) this;
        }

        public Criteria andAleaveGreaterThan(Integer value) {
            addCriterion("aleave >", value, "aleave");
            return (Criteria) this;
        }

        public Criteria andAleaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("aleave >=", value, "aleave");
            return (Criteria) this;
        }

        public Criteria andAleaveLessThan(Integer value) {
            addCriterion("aleave <", value, "aleave");
            return (Criteria) this;
        }

        public Criteria andAleaveLessThanOrEqualTo(Integer value) {
            addCriterion("aleave <=", value, "aleave");
            return (Criteria) this;
        }

        public Criteria andAleaveIn(List<Integer> values) {
            addCriterion("aleave in", values, "aleave");
            return (Criteria) this;
        }

        public Criteria andAleaveNotIn(List<Integer> values) {
            addCriterion("aleave not in", values, "aleave");
            return (Criteria) this;
        }

        public Criteria andAleaveBetween(Integer value1, Integer value2) {
            addCriterion("aleave between", value1, value2, "aleave");
            return (Criteria) this;
        }

        public Criteria andAleaveNotBetween(Integer value1, Integer value2) {
            addCriterion("aleave not between", value1, value2, "aleave");
            return (Criteria) this;
        }

        public Criteria andMissingIsNull() {
            addCriterion("missing is null");
            return (Criteria) this;
        }

        public Criteria andMissingIsNotNull() {
            addCriterion("missing is not null");
            return (Criteria) this;
        }

        public Criteria andMissingEqualTo(Integer value) {
            addCriterion("missing =", value, "missing");
            return (Criteria) this;
        }

        public Criteria andMissingNotEqualTo(Integer value) {
            addCriterion("missing <>", value, "missing");
            return (Criteria) this;
        }

        public Criteria andMissingGreaterThan(Integer value) {
            addCriterion("missing >", value, "missing");
            return (Criteria) this;
        }

        public Criteria andMissingGreaterThanOrEqualTo(Integer value) {
            addCriterion("missing >=", value, "missing");
            return (Criteria) this;
        }

        public Criteria andMissingLessThan(Integer value) {
            addCriterion("missing <", value, "missing");
            return (Criteria) this;
        }

        public Criteria andMissingLessThanOrEqualTo(Integer value) {
            addCriterion("missing <=", value, "missing");
            return (Criteria) this;
        }

        public Criteria andMissingIn(List<Integer> values) {
            addCriterion("missing in", values, "missing");
            return (Criteria) this;
        }

        public Criteria andMissingNotIn(List<Integer> values) {
            addCriterion("missing not in", values, "missing");
            return (Criteria) this;
        }

        public Criteria andMissingBetween(Integer value1, Integer value2) {
            addCriterion("missing between", value1, value2, "missing");
            return (Criteria) this;
        }

        public Criteria andMissingNotBetween(Integer value1, Integer value2) {
            addCriterion("missing not between", value1, value2, "missing");
            return (Criteria) this;
        }

        public Criteria andLateIsNull() {
            addCriterion("late is null");
            return (Criteria) this;
        }

        public Criteria andLateIsNotNull() {
            addCriterion("late is not null");
            return (Criteria) this;
        }

        public Criteria andLateEqualTo(Integer value) {
            addCriterion("late =", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotEqualTo(Integer value) {
            addCriterion("late <>", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateGreaterThan(Integer value) {
            addCriterion("late >", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateGreaterThanOrEqualTo(Integer value) {
            addCriterion("late >=", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLessThan(Integer value) {
            addCriterion("late <", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLessThanOrEqualTo(Integer value) {
            addCriterion("late <=", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateIn(List<Integer> values) {
            addCriterion("late in", values, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotIn(List<Integer> values) {
            addCriterion("late not in", values, "late");
            return (Criteria) this;
        }

        public Criteria andLateBetween(Integer value1, Integer value2) {
            addCriterion("late between", value1, value2, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotBetween(Integer value1, Integer value2) {
            addCriterion("late not between", value1, value2, "late");
            return (Criteria) this;
        }

        public Criteria andVacationIsNull() {
            addCriterion("vacation is null");
            return (Criteria) this;
        }

        public Criteria andVacationIsNotNull() {
            addCriterion("vacation is not null");
            return (Criteria) this;
        }

        public Criteria andVacationEqualTo(Integer value) {
            addCriterion("vacation =", value, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationNotEqualTo(Integer value) {
            addCriterion("vacation <>", value, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationGreaterThan(Integer value) {
            addCriterion("vacation >", value, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationGreaterThanOrEqualTo(Integer value) {
            addCriterion("vacation >=", value, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationLessThan(Integer value) {
            addCriterion("vacation <", value, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationLessThanOrEqualTo(Integer value) {
            addCriterion("vacation <=", value, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationIn(List<Integer> values) {
            addCriterion("vacation in", values, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationNotIn(List<Integer> values) {
            addCriterion("vacation not in", values, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationBetween(Integer value1, Integer value2) {
            addCriterion("vacation between", value1, value2, "vacation");
            return (Criteria) this;
        }

        public Criteria andVacationNotBetween(Integer value1, Integer value2) {
            addCriterion("vacation not between", value1, value2, "vacation");
            return (Criteria) this;
        }

        public Criteria andGooutIsNull() {
            addCriterion("goout is null");
            return (Criteria) this;
        }

        public Criteria andGooutIsNotNull() {
            addCriterion("goout is not null");
            return (Criteria) this;
        }

        public Criteria andGooutEqualTo(Integer value) {
            addCriterion("goout =", value, "goout");
            return (Criteria) this;
        }

        public Criteria andGooutNotEqualTo(Integer value) {
            addCriterion("goout <>", value, "goout");
            return (Criteria) this;
        }

        public Criteria andGooutGreaterThan(Integer value) {
            addCriterion("goout >", value, "goout");
            return (Criteria) this;
        }

        public Criteria andGooutGreaterThanOrEqualTo(Integer value) {
            addCriterion("goout >=", value, "goout");
            return (Criteria) this;
        }

        public Criteria andGooutLessThan(Integer value) {
            addCriterion("goout <", value, "goout");
            return (Criteria) this;
        }

        public Criteria andGooutLessThanOrEqualTo(Integer value) {
            addCriterion("goout <=", value, "goout");
            return (Criteria) this;
        }

        public Criteria andGooutIn(List<Integer> values) {
            addCriterion("goout in", values, "goout");
            return (Criteria) this;
        }

        public Criteria andGooutNotIn(List<Integer> values) {
            addCriterion("goout not in", values, "goout");
            return (Criteria) this;
        }

        public Criteria andGooutBetween(Integer value1, Integer value2) {
            addCriterion("goout between", value1, value2, "goout");
            return (Criteria) this;
        }

        public Criteria andGooutNotBetween(Integer value1, Integer value2) {
            addCriterion("goout not between", value1, value2, "goout");
            return (Criteria) this;
        }

        public Criteria andPlusIsNull() {
            addCriterion("plus is null");
            return (Criteria) this;
        }

        public Criteria andPlusIsNotNull() {
            addCriterion("plus is not null");
            return (Criteria) this;
        }

        public Criteria andPlusEqualTo(Integer value) {
            addCriterion("plus =", value, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusNotEqualTo(Integer value) {
            addCriterion("plus <>", value, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusGreaterThan(Integer value) {
            addCriterion("plus >", value, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusGreaterThanOrEqualTo(Integer value) {
            addCriterion("plus >=", value, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusLessThan(Integer value) {
            addCriterion("plus <", value, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusLessThanOrEqualTo(Integer value) {
            addCriterion("plus <=", value, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusIn(List<Integer> values) {
            addCriterion("plus in", values, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusNotIn(List<Integer> values) {
            addCriterion("plus not in", values, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusBetween(Integer value1, Integer value2) {
            addCriterion("plus between", value1, value2, "plus");
            return (Criteria) this;
        }

        public Criteria andPlusNotBetween(Integer value1, Integer value2) {
            addCriterion("plus not between", value1, value2, "plus");
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