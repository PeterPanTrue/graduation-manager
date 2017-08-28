package com.graduation.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyExample() {
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

        public Criteria andEmployidIsNull() {
            addCriterion("employid is null");
            return (Criteria) this;
        }

        public Criteria andEmployidIsNotNull() {
            addCriterion("employid is not null");
            return (Criteria) this;
        }

        public Criteria andEmployidEqualTo(Integer value) {
            addCriterion("employid =", value, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidNotEqualTo(Integer value) {
            addCriterion("employid <>", value, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidGreaterThan(Integer value) {
            addCriterion("employid >", value, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidGreaterThanOrEqualTo(Integer value) {
            addCriterion("employid >=", value, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidLessThan(Integer value) {
            addCriterion("employid <", value, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidLessThanOrEqualTo(Integer value) {
            addCriterion("employid <=", value, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidIn(List<Integer> values) {
            addCriterion("employid in", values, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidNotIn(List<Integer> values) {
            addCriterion("employid not in", values, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidBetween(Integer value1, Integer value2) {
            addCriterion("employid between", value1, value2, "employid");
            return (Criteria) this;
        }

        public Criteria andEmployidNotBetween(Integer value1, Integer value2) {
            addCriterion("employid not between", value1, value2, "employid");
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
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

        public Criteria andPositionidIsNull() {
            addCriterion("positionid is null");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNotNull() {
            addCriterion("positionid is not null");
            return (Criteria) this;
        }

        public Criteria andPositionidEqualTo(Integer value) {
            addCriterion("positionid =", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotEqualTo(Integer value) {
            addCriterion("positionid <>", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThan(Integer value) {
            addCriterion("positionid >", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("positionid >=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThan(Integer value) {
            addCriterion("positionid <", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThanOrEqualTo(Integer value) {
            addCriterion("positionid <=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidIn(List<Integer> values) {
            addCriterion("positionid in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotIn(List<Integer> values) {
            addCriterion("positionid not in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidBetween(Integer value1, Integer value2) {
            addCriterion("positionid between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotBetween(Integer value1, Integer value2) {
            addCriterion("positionid not between", value1, value2, "positionid");
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

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentid is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentid is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentid =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentid <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentid >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentid >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentid <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentid <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentid in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentid not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentid between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentid not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Integer value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Integer value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Integer value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Integer value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Integer value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Integer> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Integer> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Integer value1, Integer value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andExprementIsNull() {
            addCriterion("exprement is null");
            return (Criteria) this;
        }

        public Criteria andExprementIsNotNull() {
            addCriterion("exprement is not null");
            return (Criteria) this;
        }

        public Criteria andExprementEqualTo(String value) {
            addCriterion("exprement =", value, "exprement");
            return (Criteria) this;
        }

        public Criteria andExprementNotEqualTo(String value) {
            addCriterion("exprement <>", value, "exprement");
            return (Criteria) this;
        }

        public Criteria andExprementGreaterThan(String value) {
            addCriterion("exprement >", value, "exprement");
            return (Criteria) this;
        }

        public Criteria andExprementGreaterThanOrEqualTo(String value) {
            addCriterion("exprement >=", value, "exprement");
            return (Criteria) this;
        }

        public Criteria andExprementLessThan(String value) {
            addCriterion("exprement <", value, "exprement");
            return (Criteria) this;
        }

        public Criteria andExprementLessThanOrEqualTo(String value) {
            addCriterion("exprement <=", value, "exprement");
            return (Criteria) this;
        }

        public Criteria andExprementLike(String value) {
            addCriterion("exprement like", value, "exprement");
            return (Criteria) this;
        }

        public Criteria andExprementNotLike(String value) {
            addCriterion("exprement not like", value, "exprement");
            return (Criteria) this;
        }

        public Criteria andExprementIn(List<String> values) {
            addCriterion("exprement in", values, "exprement");
            return (Criteria) this;
        }

        public Criteria andExprementNotIn(List<String> values) {
            addCriterion("exprement not in", values, "exprement");
            return (Criteria) this;
        }

        public Criteria andExprementBetween(String value1, String value2) {
            addCriterion("exprement between", value1, value2, "exprement");
            return (Criteria) this;
        }

        public Criteria andExprementNotBetween(String value1, String value2) {
            addCriterion("exprement not between", value1, value2, "exprement");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("applytime is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("applytime is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(Date value) {
            addCriterionForJDBCDate("applytime =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("applytime <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("applytime >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applytime >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(Date value) {
            addCriterionForJDBCDate("applytime <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("applytime <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<Date> values) {
            addCriterionForJDBCDate("applytime in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("applytime not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applytime between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("applytime not between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andFirstpassIsNull() {
            addCriterion("firstpass is null");
            return (Criteria) this;
        }

        public Criteria andFirstpassIsNotNull() {
            addCriterion("firstpass is not null");
            return (Criteria) this;
        }

        public Criteria andFirstpassEqualTo(Integer value) {
            addCriterion("firstpass =", value, "firstpass");
            return (Criteria) this;
        }

        public Criteria andFirstpassNotEqualTo(Integer value) {
            addCriterion("firstpass <>", value, "firstpass");
            return (Criteria) this;
        }

        public Criteria andFirstpassGreaterThan(Integer value) {
            addCriterion("firstpass >", value, "firstpass");
            return (Criteria) this;
        }

        public Criteria andFirstpassGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstpass >=", value, "firstpass");
            return (Criteria) this;
        }

        public Criteria andFirstpassLessThan(Integer value) {
            addCriterion("firstpass <", value, "firstpass");
            return (Criteria) this;
        }

        public Criteria andFirstpassLessThanOrEqualTo(Integer value) {
            addCriterion("firstpass <=", value, "firstpass");
            return (Criteria) this;
        }

        public Criteria andFirstpassIn(List<Integer> values) {
            addCriterion("firstpass in", values, "firstpass");
            return (Criteria) this;
        }

        public Criteria andFirstpassNotIn(List<Integer> values) {
            addCriterion("firstpass not in", values, "firstpass");
            return (Criteria) this;
        }

        public Criteria andFirstpassBetween(Integer value1, Integer value2) {
            addCriterion("firstpass between", value1, value2, "firstpass");
            return (Criteria) this;
        }

        public Criteria andFirstpassNotBetween(Integer value1, Integer value2) {
            addCriterion("firstpass not between", value1, value2, "firstpass");
            return (Criteria) this;
        }

        public Criteria andFirstcreatetimeIsNull() {
            addCriterion("firstcreatetime is null");
            return (Criteria) this;
        }

        public Criteria andFirstcreatetimeIsNotNull() {
            addCriterion("firstcreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andFirstcreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("firstcreatetime =", value, "firstcreatetime");
            return (Criteria) this;
        }

        public Criteria andFirstcreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("firstcreatetime <>", value, "firstcreatetime");
            return (Criteria) this;
        }

        public Criteria andFirstcreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("firstcreatetime >", value, "firstcreatetime");
            return (Criteria) this;
        }

        public Criteria andFirstcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstcreatetime >=", value, "firstcreatetime");
            return (Criteria) this;
        }

        public Criteria andFirstcreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("firstcreatetime <", value, "firstcreatetime");
            return (Criteria) this;
        }

        public Criteria andFirstcreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstcreatetime <=", value, "firstcreatetime");
            return (Criteria) this;
        }

        public Criteria andFirstcreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("firstcreatetime in", values, "firstcreatetime");
            return (Criteria) this;
        }

        public Criteria andFirstcreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("firstcreatetime not in", values, "firstcreatetime");
            return (Criteria) this;
        }

        public Criteria andFirstcreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstcreatetime between", value1, value2, "firstcreatetime");
            return (Criteria) this;
        }

        public Criteria andFirstcreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstcreatetime not between", value1, value2, "firstcreatetime");
            return (Criteria) this;
        }

        public Criteria andFirstcreatepersonIsNull() {
            addCriterion("firstcreateperson is null");
            return (Criteria) this;
        }

        public Criteria andFirstcreatepersonIsNotNull() {
            addCriterion("firstcreateperson is not null");
            return (Criteria) this;
        }

        public Criteria andFirstcreatepersonEqualTo(String value) {
            addCriterion("firstcreateperson =", value, "firstcreateperson");
            return (Criteria) this;
        }

        public Criteria andFirstcreatepersonNotEqualTo(String value) {
            addCriterion("firstcreateperson <>", value, "firstcreateperson");
            return (Criteria) this;
        }

        public Criteria andFirstcreatepersonGreaterThan(String value) {
            addCriterion("firstcreateperson >", value, "firstcreateperson");
            return (Criteria) this;
        }

        public Criteria andFirstcreatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("firstcreateperson >=", value, "firstcreateperson");
            return (Criteria) this;
        }

        public Criteria andFirstcreatepersonLessThan(String value) {
            addCriterion("firstcreateperson <", value, "firstcreateperson");
            return (Criteria) this;
        }

        public Criteria andFirstcreatepersonLessThanOrEqualTo(String value) {
            addCriterion("firstcreateperson <=", value, "firstcreateperson");
            return (Criteria) this;
        }

        public Criteria andFirstcreatepersonLike(String value) {
            addCriterion("firstcreateperson like", value, "firstcreateperson");
            return (Criteria) this;
        }

        public Criteria andFirstcreatepersonNotLike(String value) {
            addCriterion("firstcreateperson not like", value, "firstcreateperson");
            return (Criteria) this;
        }

        public Criteria andFirstcreatepersonIn(List<String> values) {
            addCriterion("firstcreateperson in", values, "firstcreateperson");
            return (Criteria) this;
        }

        public Criteria andFirstcreatepersonNotIn(List<String> values) {
            addCriterion("firstcreateperson not in", values, "firstcreateperson");
            return (Criteria) this;
        }

        public Criteria andFirstcreatepersonBetween(String value1, String value2) {
            addCriterion("firstcreateperson between", value1, value2, "firstcreateperson");
            return (Criteria) this;
        }

        public Criteria andFirstcreatepersonNotBetween(String value1, String value2) {
            addCriterion("firstcreateperson not between", value1, value2, "firstcreateperson");
            return (Criteria) this;
        }

        public Criteria andSecondpassIsNull() {
            addCriterion("secondpass is null");
            return (Criteria) this;
        }

        public Criteria andSecondpassIsNotNull() {
            addCriterion("secondpass is not null");
            return (Criteria) this;
        }

        public Criteria andSecondpassEqualTo(Integer value) {
            addCriterion("secondpass =", value, "secondpass");
            return (Criteria) this;
        }

        public Criteria andSecondpassNotEqualTo(Integer value) {
            addCriterion("secondpass <>", value, "secondpass");
            return (Criteria) this;
        }

        public Criteria andSecondpassGreaterThan(Integer value) {
            addCriterion("secondpass >", value, "secondpass");
            return (Criteria) this;
        }

        public Criteria andSecondpassGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondpass >=", value, "secondpass");
            return (Criteria) this;
        }

        public Criteria andSecondpassLessThan(Integer value) {
            addCriterion("secondpass <", value, "secondpass");
            return (Criteria) this;
        }

        public Criteria andSecondpassLessThanOrEqualTo(Integer value) {
            addCriterion("secondpass <=", value, "secondpass");
            return (Criteria) this;
        }

        public Criteria andSecondpassIn(List<Integer> values) {
            addCriterion("secondpass in", values, "secondpass");
            return (Criteria) this;
        }

        public Criteria andSecondpassNotIn(List<Integer> values) {
            addCriterion("secondpass not in", values, "secondpass");
            return (Criteria) this;
        }

        public Criteria andSecondpassBetween(Integer value1, Integer value2) {
            addCriterion("secondpass between", value1, value2, "secondpass");
            return (Criteria) this;
        }

        public Criteria andSecondpassNotBetween(Integer value1, Integer value2) {
            addCriterion("secondpass not between", value1, value2, "secondpass");
            return (Criteria) this;
        }

        public Criteria andSecondcreatetiemIsNull() {
            addCriterion("secondcreatetiem is null");
            return (Criteria) this;
        }

        public Criteria andSecondcreatetiemIsNotNull() {
            addCriterion("secondcreatetiem is not null");
            return (Criteria) this;
        }

        public Criteria andSecondcreatetiemEqualTo(Date value) {
            addCriterionForJDBCDate("secondcreatetiem =", value, "secondcreatetiem");
            return (Criteria) this;
        }

        public Criteria andSecondcreatetiemNotEqualTo(Date value) {
            addCriterionForJDBCDate("secondcreatetiem <>", value, "secondcreatetiem");
            return (Criteria) this;
        }

        public Criteria andSecondcreatetiemGreaterThan(Date value) {
            addCriterionForJDBCDate("secondcreatetiem >", value, "secondcreatetiem");
            return (Criteria) this;
        }

        public Criteria andSecondcreatetiemGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("secondcreatetiem >=", value, "secondcreatetiem");
            return (Criteria) this;
        }

        public Criteria andSecondcreatetiemLessThan(Date value) {
            addCriterionForJDBCDate("secondcreatetiem <", value, "secondcreatetiem");
            return (Criteria) this;
        }

        public Criteria andSecondcreatetiemLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("secondcreatetiem <=", value, "secondcreatetiem");
            return (Criteria) this;
        }

        public Criteria andSecondcreatetiemIn(List<Date> values) {
            addCriterionForJDBCDate("secondcreatetiem in", values, "secondcreatetiem");
            return (Criteria) this;
        }

        public Criteria andSecondcreatetiemNotIn(List<Date> values) {
            addCriterionForJDBCDate("secondcreatetiem not in", values, "secondcreatetiem");
            return (Criteria) this;
        }

        public Criteria andSecondcreatetiemBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("secondcreatetiem between", value1, value2, "secondcreatetiem");
            return (Criteria) this;
        }

        public Criteria andSecondcreatetiemNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("secondcreatetiem not between", value1, value2, "secondcreatetiem");
            return (Criteria) this;
        }

        public Criteria andSecondcreatepersonIsNull() {
            addCriterion("secondcreateperson is null");
            return (Criteria) this;
        }

        public Criteria andSecondcreatepersonIsNotNull() {
            addCriterion("secondcreateperson is not null");
            return (Criteria) this;
        }

        public Criteria andSecondcreatepersonEqualTo(String value) {
            addCriterion("secondcreateperson =", value, "secondcreateperson");
            return (Criteria) this;
        }

        public Criteria andSecondcreatepersonNotEqualTo(String value) {
            addCriterion("secondcreateperson <>", value, "secondcreateperson");
            return (Criteria) this;
        }

        public Criteria andSecondcreatepersonGreaterThan(String value) {
            addCriterion("secondcreateperson >", value, "secondcreateperson");
            return (Criteria) this;
        }

        public Criteria andSecondcreatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("secondcreateperson >=", value, "secondcreateperson");
            return (Criteria) this;
        }

        public Criteria andSecondcreatepersonLessThan(String value) {
            addCriterion("secondcreateperson <", value, "secondcreateperson");
            return (Criteria) this;
        }

        public Criteria andSecondcreatepersonLessThanOrEqualTo(String value) {
            addCriterion("secondcreateperson <=", value, "secondcreateperson");
            return (Criteria) this;
        }

        public Criteria andSecondcreatepersonLike(String value) {
            addCriterion("secondcreateperson like", value, "secondcreateperson");
            return (Criteria) this;
        }

        public Criteria andSecondcreatepersonNotLike(String value) {
            addCriterion("secondcreateperson not like", value, "secondcreateperson");
            return (Criteria) this;
        }

        public Criteria andSecondcreatepersonIn(List<String> values) {
            addCriterion("secondcreateperson in", values, "secondcreateperson");
            return (Criteria) this;
        }

        public Criteria andSecondcreatepersonNotIn(List<String> values) {
            addCriterion("secondcreateperson not in", values, "secondcreateperson");
            return (Criteria) this;
        }

        public Criteria andSecondcreatepersonBetween(String value1, String value2) {
            addCriterion("secondcreateperson between", value1, value2, "secondcreateperson");
            return (Criteria) this;
        }

        public Criteria andSecondcreatepersonNotBetween(String value1, String value2) {
            addCriterion("secondcreateperson not between", value1, value2, "secondcreateperson");
            return (Criteria) this;
        }

        public Criteria andAdmittedIsNull() {
            addCriterion("admitted is null");
            return (Criteria) this;
        }

        public Criteria andAdmittedIsNotNull() {
            addCriterion("admitted is not null");
            return (Criteria) this;
        }

        public Criteria andAdmittedEqualTo(Integer value) {
            addCriterion("admitted =", value, "admitted");
            return (Criteria) this;
        }

        public Criteria andAdmittedNotEqualTo(Integer value) {
            addCriterion("admitted <>", value, "admitted");
            return (Criteria) this;
        }

        public Criteria andAdmittedGreaterThan(Integer value) {
            addCriterion("admitted >", value, "admitted");
            return (Criteria) this;
        }

        public Criteria andAdmittedGreaterThanOrEqualTo(Integer value) {
            addCriterion("admitted >=", value, "admitted");
            return (Criteria) this;
        }

        public Criteria andAdmittedLessThan(Integer value) {
            addCriterion("admitted <", value, "admitted");
            return (Criteria) this;
        }

        public Criteria andAdmittedLessThanOrEqualTo(Integer value) {
            addCriterion("admitted <=", value, "admitted");
            return (Criteria) this;
        }

        public Criteria andAdmittedIn(List<Integer> values) {
            addCriterion("admitted in", values, "admitted");
            return (Criteria) this;
        }

        public Criteria andAdmittedNotIn(List<Integer> values) {
            addCriterion("admitted not in", values, "admitted");
            return (Criteria) this;
        }

        public Criteria andAdmittedBetween(Integer value1, Integer value2) {
            addCriterion("admitted between", value1, value2, "admitted");
            return (Criteria) this;
        }

        public Criteria andAdmittedNotBetween(Integer value1, Integer value2) {
            addCriterion("admitted not between", value1, value2, "admitted");
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