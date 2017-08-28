package com.graduation.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanExample() {
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

        public Criteria andPlanidIsNull() {
            addCriterion("planid is null");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNotNull() {
            addCriterion("planid is not null");
            return (Criteria) this;
        }

        public Criteria andPlanidEqualTo(Integer value) {
            addCriterion("planid =", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotEqualTo(Integer value) {
            addCriterion("planid <>", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThan(Integer value) {
            addCriterion("planid >", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("planid >=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThan(Integer value) {
            addCriterion("planid <", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThanOrEqualTo(Integer value) {
            addCriterion("planid <=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidIn(List<Integer> values) {
            addCriterion("planid in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotIn(List<Integer> values) {
            addCriterion("planid not in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidBetween(Integer value1, Integer value2) {
            addCriterion("planid between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotBetween(Integer value1, Integer value2) {
            addCriterion("planid not between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlannameIsNull() {
            addCriterion("planname is null");
            return (Criteria) this;
        }

        public Criteria andPlannameIsNotNull() {
            addCriterion("planname is not null");
            return (Criteria) this;
        }

        public Criteria andPlannameEqualTo(String value) {
            addCriterion("planname =", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotEqualTo(String value) {
            addCriterion("planname <>", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameGreaterThan(String value) {
            addCriterion("planname >", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameGreaterThanOrEqualTo(String value) {
            addCriterion("planname >=", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameLessThan(String value) {
            addCriterion("planname <", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameLessThanOrEqualTo(String value) {
            addCriterion("planname <=", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameLike(String value) {
            addCriterion("planname like", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotLike(String value) {
            addCriterion("planname not like", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameIn(List<String> values) {
            addCriterion("planname in", values, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotIn(List<String> values) {
            addCriterion("planname not in", values, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameBetween(String value1, String value2) {
            addCriterion("planname between", value1, value2, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotBetween(String value1, String value2) {
            addCriterion("planname not between", value1, value2, "planname");
            return (Criteria) this;
        }

        public Criteria andPlancontentIsNull() {
            addCriterion("plancontent is null");
            return (Criteria) this;
        }

        public Criteria andPlancontentIsNotNull() {
            addCriterion("plancontent is not null");
            return (Criteria) this;
        }

        public Criteria andPlancontentEqualTo(String value) {
            addCriterion("plancontent =", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentNotEqualTo(String value) {
            addCriterion("plancontent <>", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentGreaterThan(String value) {
            addCriterion("plancontent >", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentGreaterThanOrEqualTo(String value) {
            addCriterion("plancontent >=", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentLessThan(String value) {
            addCriterion("plancontent <", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentLessThanOrEqualTo(String value) {
            addCriterion("plancontent <=", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentLike(String value) {
            addCriterion("plancontent like", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentNotLike(String value) {
            addCriterion("plancontent not like", value, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentIn(List<String> values) {
            addCriterion("plancontent in", values, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentNotIn(List<String> values) {
            addCriterion("plancontent not in", values, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentBetween(String value1, String value2) {
            addCriterion("plancontent between", value1, value2, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlancontentNotBetween(String value1, String value2) {
            addCriterion("plancontent not between", value1, value2, "plancontent");
            return (Criteria) this;
        }

        public Criteria andPlanmotiveIsNull() {
            addCriterion("planmotive is null");
            return (Criteria) this;
        }

        public Criteria andPlanmotiveIsNotNull() {
            addCriterion("planmotive is not null");
            return (Criteria) this;
        }

        public Criteria andPlanmotiveEqualTo(String value) {
            addCriterion("planmotive =", value, "planmotive");
            return (Criteria) this;
        }

        public Criteria andPlanmotiveNotEqualTo(String value) {
            addCriterion("planmotive <>", value, "planmotive");
            return (Criteria) this;
        }

        public Criteria andPlanmotiveGreaterThan(String value) {
            addCriterion("planmotive >", value, "planmotive");
            return (Criteria) this;
        }

        public Criteria andPlanmotiveGreaterThanOrEqualTo(String value) {
            addCriterion("planmotive >=", value, "planmotive");
            return (Criteria) this;
        }

        public Criteria andPlanmotiveLessThan(String value) {
            addCriterion("planmotive <", value, "planmotive");
            return (Criteria) this;
        }

        public Criteria andPlanmotiveLessThanOrEqualTo(String value) {
            addCriterion("planmotive <=", value, "planmotive");
            return (Criteria) this;
        }

        public Criteria andPlanmotiveLike(String value) {
            addCriterion("planmotive like", value, "planmotive");
            return (Criteria) this;
        }

        public Criteria andPlanmotiveNotLike(String value) {
            addCriterion("planmotive not like", value, "planmotive");
            return (Criteria) this;
        }

        public Criteria andPlanmotiveIn(List<String> values) {
            addCriterion("planmotive in", values, "planmotive");
            return (Criteria) this;
        }

        public Criteria andPlanmotiveNotIn(List<String> values) {
            addCriterion("planmotive not in", values, "planmotive");
            return (Criteria) this;
        }

        public Criteria andPlanmotiveBetween(String value1, String value2) {
            addCriterion("planmotive between", value1, value2, "planmotive");
            return (Criteria) this;
        }

        public Criteria andPlanmotiveNotBetween(String value1, String value2) {
            addCriterion("planmotive not between", value1, value2, "planmotive");
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

        public Criteria andBeforetimeIsNull() {
            addCriterion("beforetime is null");
            return (Criteria) this;
        }

        public Criteria andBeforetimeIsNotNull() {
            addCriterion("beforetime is not null");
            return (Criteria) this;
        }

        public Criteria andBeforetimeEqualTo(String value) {
            addCriterion("beforetime =", value, "beforetime");
            return (Criteria) this;
        }

        public Criteria andBeforetimeNotEqualTo(String value) {
            addCriterion("beforetime <>", value, "beforetime");
            return (Criteria) this;
        }

        public Criteria andBeforetimeGreaterThan(String value) {
            addCriterion("beforetime >", value, "beforetime");
            return (Criteria) this;
        }

        public Criteria andBeforetimeGreaterThanOrEqualTo(String value) {
            addCriterion("beforetime >=", value, "beforetime");
            return (Criteria) this;
        }

        public Criteria andBeforetimeLessThan(String value) {
            addCriterion("beforetime <", value, "beforetime");
            return (Criteria) this;
        }

        public Criteria andBeforetimeLessThanOrEqualTo(String value) {
            addCriterion("beforetime <=", value, "beforetime");
            return (Criteria) this;
        }

        public Criteria andBeforetimeLike(String value) {
            addCriterion("beforetime like", value, "beforetime");
            return (Criteria) this;
        }

        public Criteria andBeforetimeNotLike(String value) {
            addCriterion("beforetime not like", value, "beforetime");
            return (Criteria) this;
        }

        public Criteria andBeforetimeIn(List<String> values) {
            addCriterion("beforetime in", values, "beforetime");
            return (Criteria) this;
        }

        public Criteria andBeforetimeNotIn(List<String> values) {
            addCriterion("beforetime not in", values, "beforetime");
            return (Criteria) this;
        }

        public Criteria andBeforetimeBetween(String value1, String value2) {
            addCriterion("beforetime between", value1, value2, "beforetime");
            return (Criteria) this;
        }

        public Criteria andBeforetimeNotBetween(String value1, String value2) {
            addCriterion("beforetime not between", value1, value2, "beforetime");
            return (Criteria) this;
        }

        public Criteria andAftertimeIsNull() {
            addCriterion("aftertime is null");
            return (Criteria) this;
        }

        public Criteria andAftertimeIsNotNull() {
            addCriterion("aftertime is not null");
            return (Criteria) this;
        }

        public Criteria andAftertimeEqualTo(String value) {
            addCriterion("aftertime =", value, "aftertime");
            return (Criteria) this;
        }

        public Criteria andAftertimeNotEqualTo(String value) {
            addCriterion("aftertime <>", value, "aftertime");
            return (Criteria) this;
        }

        public Criteria andAftertimeGreaterThan(String value) {
            addCriterion("aftertime >", value, "aftertime");
            return (Criteria) this;
        }

        public Criteria andAftertimeGreaterThanOrEqualTo(String value) {
            addCriterion("aftertime >=", value, "aftertime");
            return (Criteria) this;
        }

        public Criteria andAftertimeLessThan(String value) {
            addCriterion("aftertime <", value, "aftertime");
            return (Criteria) this;
        }

        public Criteria andAftertimeLessThanOrEqualTo(String value) {
            addCriterion("aftertime <=", value, "aftertime");
            return (Criteria) this;
        }

        public Criteria andAftertimeLike(String value) {
            addCriterion("aftertime like", value, "aftertime");
            return (Criteria) this;
        }

        public Criteria andAftertimeNotLike(String value) {
            addCriterion("aftertime not like", value, "aftertime");
            return (Criteria) this;
        }

        public Criteria andAftertimeIn(List<String> values) {
            addCriterion("aftertime in", values, "aftertime");
            return (Criteria) this;
        }

        public Criteria andAftertimeNotIn(List<String> values) {
            addCriterion("aftertime not in", values, "aftertime");
            return (Criteria) this;
        }

        public Criteria andAftertimeBetween(String value1, String value2) {
            addCriterion("aftertime between", value1, value2, "aftertime");
            return (Criteria) this;
        }

        public Criteria andAftertimeNotBetween(String value1, String value2) {
            addCriterion("aftertime not between", value1, value2, "aftertime");
            return (Criteria) this;
        }

        public Criteria andWhereplaceIsNull() {
            addCriterion("whereplace is null");
            return (Criteria) this;
        }

        public Criteria andWhereplaceIsNotNull() {
            addCriterion("whereplace is not null");
            return (Criteria) this;
        }

        public Criteria andWhereplaceEqualTo(String value) {
            addCriterion("whereplace =", value, "whereplace");
            return (Criteria) this;
        }

        public Criteria andWhereplaceNotEqualTo(String value) {
            addCriterion("whereplace <>", value, "whereplace");
            return (Criteria) this;
        }

        public Criteria andWhereplaceGreaterThan(String value) {
            addCriterion("whereplace >", value, "whereplace");
            return (Criteria) this;
        }

        public Criteria andWhereplaceGreaterThanOrEqualTo(String value) {
            addCriterion("whereplace >=", value, "whereplace");
            return (Criteria) this;
        }

        public Criteria andWhereplaceLessThan(String value) {
            addCriterion("whereplace <", value, "whereplace");
            return (Criteria) this;
        }

        public Criteria andWhereplaceLessThanOrEqualTo(String value) {
            addCriterion("whereplace <=", value, "whereplace");
            return (Criteria) this;
        }

        public Criteria andWhereplaceLike(String value) {
            addCriterion("whereplace like", value, "whereplace");
            return (Criteria) this;
        }

        public Criteria andWhereplaceNotLike(String value) {
            addCriterion("whereplace not like", value, "whereplace");
            return (Criteria) this;
        }

        public Criteria andWhereplaceIn(List<String> values) {
            addCriterion("whereplace in", values, "whereplace");
            return (Criteria) this;
        }

        public Criteria andWhereplaceNotIn(List<String> values) {
            addCriterion("whereplace not in", values, "whereplace");
            return (Criteria) this;
        }

        public Criteria andWhereplaceBetween(String value1, String value2) {
            addCriterion("whereplace between", value1, value2, "whereplace");
            return (Criteria) this;
        }

        public Criteria andWhereplaceNotBetween(String value1, String value2) {
            addCriterion("whereplace not between", value1, value2, "whereplace");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNull() {
            addCriterion("teacher is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNotNull() {
            addCriterion("teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEqualTo(String value) {
            addCriterion("teacher =", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotEqualTo(String value) {
            addCriterion("teacher <>", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThan(String value) {
            addCriterion("teacher >", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("teacher >=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThan(String value) {
            addCriterion("teacher <", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThanOrEqualTo(String value) {
            addCriterion("teacher <=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLike(String value) {
            addCriterion("teacher like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotLike(String value) {
            addCriterion("teacher not like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherIn(List<String> values) {
            addCriterion("teacher in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotIn(List<String> values) {
            addCriterion("teacher not in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherBetween(String value1, String value2) {
            addCriterion("teacher between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotBetween(String value1, String value2) {
            addCriterion("teacher not between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andDataIsNull() {
            addCriterion("data is null");
            return (Criteria) this;
        }

        public Criteria andDataIsNotNull() {
            addCriterion("data is not null");
            return (Criteria) this;
        }

        public Criteria andDataEqualTo(String value) {
            addCriterion("data =", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotEqualTo(String value) {
            addCriterion("data <>", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThan(String value) {
            addCriterion("data >", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThanOrEqualTo(String value) {
            addCriterion("data >=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThan(String value) {
            addCriterion("data <", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThanOrEqualTo(String value) {
            addCriterion("data <=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLike(String value) {
            addCriterion("data like", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotLike(String value) {
            addCriterion("data not like", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataIn(List<String> values) {
            addCriterion("data in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotIn(List<String> values) {
            addCriterion("data not in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataBetween(String value1, String value2) {
            addCriterion("data between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotBetween(String value1, String value2) {
            addCriterion("data not between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("people is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("people is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(String value) {
            addCriterion("people =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(String value) {
            addCriterion("people <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(String value) {
            addCriterion("people >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("people >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(String value) {
            addCriterion("people <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(String value) {
            addCriterion("people <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLike(String value) {
            addCriterion("people like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotLike(String value) {
            addCriterion("people not like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<String> values) {
            addCriterion("people in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<String> values) {
            addCriterion("people not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(String value1, String value2) {
            addCriterion("people between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(String value1, String value2) {
            addCriterion("people not between", value1, value2, "people");
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