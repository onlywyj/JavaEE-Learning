package com.wyj.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("EmployeeExample")
public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpGenderIsNull() {
            addCriterion("emp_gender is null");
            return (Criteria) this;
        }

        public Criteria andEmpGenderIsNotNull() {
            addCriterion("emp_gender is not null");
            return (Criteria) this;
        }

        public Criteria andEmpGenderEqualTo(String value) {
            addCriterion("emp_gender =", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderNotEqualTo(String value) {
            addCriterion("emp_gender <>", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderGreaterThan(String value) {
            addCriterion("emp_gender >", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderGreaterThanOrEqualTo(String value) {
            addCriterion("emp_gender >=", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderLessThan(String value) {
            addCriterion("emp_gender <", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderLessThanOrEqualTo(String value) {
            addCriterion("emp_gender <=", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderLike(String value) {
            addCriterion("emp_gender like", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderNotLike(String value) {
            addCriterion("emp_gender not like", value, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderIn(List<String> values) {
            addCriterion("emp_gender in", values, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderNotIn(List<String> values) {
            addCriterion("emp_gender not in", values, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderBetween(String value1, String value2) {
            addCriterion("emp_gender between", value1, value2, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpGenderNotBetween(String value1, String value2) {
            addCriterion("emp_gender not between", value1, value2, "empGender");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIsNull() {
            addCriterion("emp_password is null");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIsNotNull() {
            addCriterion("emp_password is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordEqualTo(String value) {
            addCriterion("emp_password =", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotEqualTo(String value) {
            addCriterion("emp_password <>", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordGreaterThan(String value) {
            addCriterion("emp_password >", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("emp_password >=", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLessThan(String value) {
            addCriterion("emp_password <", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLessThanOrEqualTo(String value) {
            addCriterion("emp_password <=", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLike(String value) {
            addCriterion("emp_password like", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotLike(String value) {
            addCriterion("emp_password not like", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIn(List<String> values) {
            addCriterion("emp_password in", values, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotIn(List<String> values) {
            addCriterion("emp_password not in", values, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordBetween(String value1, String value2) {
            addCriterion("emp_password between", value1, value2, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotBetween(String value1, String value2) {
            addCriterion("emp_password not between", value1, value2, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpGradeIsNull() {
            addCriterion("emp_grade is null");
            return (Criteria) this;
        }

        public Criteria andEmpGradeIsNotNull() {
            addCriterion("emp_grade is not null");
            return (Criteria) this;
        }

        public Criteria andEmpGradeEqualTo(String value) {
            addCriterion("emp_grade =", value, "empGrade");
            return (Criteria) this;
        }

        public Criteria andEmpGradeNotEqualTo(String value) {
            addCriterion("emp_grade <>", value, "empGrade");
            return (Criteria) this;
        }

        public Criteria andEmpGradeGreaterThan(String value) {
            addCriterion("emp_grade >", value, "empGrade");
            return (Criteria) this;
        }

        public Criteria andEmpGradeGreaterThanOrEqualTo(String value) {
            addCriterion("emp_grade >=", value, "empGrade");
            return (Criteria) this;
        }

        public Criteria andEmpGradeLessThan(String value) {
            addCriterion("emp_grade <", value, "empGrade");
            return (Criteria) this;
        }

        public Criteria andEmpGradeLessThanOrEqualTo(String value) {
            addCriterion("emp_grade <=", value, "empGrade");
            return (Criteria) this;
        }

        public Criteria andEmpGradeLike(String value) {
            addCriterion("emp_grade like", value, "empGrade");
            return (Criteria) this;
        }

        public Criteria andEmpGradeNotLike(String value) {
            addCriterion("emp_grade not like", value, "empGrade");
            return (Criteria) this;
        }

        public Criteria andEmpGradeIn(List<String> values) {
            addCriterion("emp_grade in", values, "empGrade");
            return (Criteria) this;
        }

        public Criteria andEmpGradeNotIn(List<String> values) {
            addCriterion("emp_grade not in", values, "empGrade");
            return (Criteria) this;
        }

        public Criteria andEmpGradeBetween(String value1, String value2) {
            addCriterion("emp_grade between", value1, value2, "empGrade");
            return (Criteria) this;
        }

        public Criteria andEmpGradeNotBetween(String value1, String value2) {
            addCriterion("emp_grade not between", value1, value2, "empGrade");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIsNull() {
            addCriterion("emp_email is null");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIsNotNull() {
            addCriterion("emp_email is not null");
            return (Criteria) this;
        }

        public Criteria andEmpEmailEqualTo(String value) {
            addCriterion("emp_email =", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotEqualTo(String value) {
            addCriterion("emp_email <>", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailGreaterThan(String value) {
            addCriterion("emp_email >", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailGreaterThanOrEqualTo(String value) {
            addCriterion("emp_email >=", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLessThan(String value) {
            addCriterion("emp_email <", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLessThanOrEqualTo(String value) {
            addCriterion("emp_email <=", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLike(String value) {
            addCriterion("emp_email like", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotLike(String value) {
            addCriterion("emp_email not like", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIn(List<String> values) {
            addCriterion("emp_email in", values, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotIn(List<String> values) {
            addCriterion("emp_email not in", values, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailBetween(String value1, String value2) {
            addCriterion("emp_email between", value1, value2, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotBetween(String value1, String value2) {
            addCriterion("emp_email not between", value1, value2, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIdIsNull() {
            addCriterion("emp_department_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIdIsNotNull() {
            addCriterion("emp_department_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIdEqualTo(Integer value) {
            addCriterion("emp_department_id =", value, "empDepartmentId");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIdNotEqualTo(Integer value) {
            addCriterion("emp_department_id <>", value, "empDepartmentId");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIdGreaterThan(Integer value) {
            addCriterion("emp_department_id >", value, "empDepartmentId");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_department_id >=", value, "empDepartmentId");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIdLessThan(Integer value) {
            addCriterion("emp_department_id <", value, "empDepartmentId");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_department_id <=", value, "empDepartmentId");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIdIn(List<Integer> values) {
            addCriterion("emp_department_id in", values, "empDepartmentId");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIdNotIn(List<Integer> values) {
            addCriterion("emp_department_id not in", values, "empDepartmentId");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_department_id between", value1, value2, "empDepartmentId");
            return (Criteria) this;
        }

        public Criteria andEmpDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_department_id not between", value1, value2, "empDepartmentId");
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