package edu.neu.hoso.example;

import java.util.ArrayList;
import java.util.List;

public class GroupExaminationDrugsItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupExaminationDrugsItemsExample() {
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

        public Criteria andGroupExaminationDrugsItemsIdIsNull() {
            addCriterion("Group_Examination_Drugs_Items_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationDrugsItemsIdIsNotNull() {
            addCriterion("Group_Examination_Drugs_Items_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationDrugsItemsIdEqualTo(Integer value) {
            addCriterion("Group_Examination_Drugs_Items_ID =", value, "groupExaminationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationDrugsItemsIdNotEqualTo(Integer value) {
            addCriterion("Group_Examination_Drugs_Items_ID <>", value, "groupExaminationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationDrugsItemsIdGreaterThan(Integer value) {
            addCriterion("Group_Examination_Drugs_Items_ID >", value, "groupExaminationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationDrugsItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Group_Examination_Drugs_Items_ID >=", value, "groupExaminationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationDrugsItemsIdLessThan(Integer value) {
            addCriterion("Group_Examination_Drugs_Items_ID <", value, "groupExaminationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationDrugsItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Group_Examination_Drugs_Items_ID <=", value, "groupExaminationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationDrugsItemsIdIn(List<Integer> values) {
            addCriterion("Group_Examination_Drugs_Items_ID in", values, "groupExaminationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationDrugsItemsIdNotIn(List<Integer> values) {
            addCriterion("Group_Examination_Drugs_Items_ID not in", values, "groupExaminationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationDrugsItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("Group_Examination_Drugs_Items_ID between", value1, value2, "groupExaminationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationDrugsItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Group_Examination_Drugs_Items_ID not between", value1, value2, "groupExaminationDrugsItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdIsNull() {
            addCriterion("Group_Examination_Fmedical_Items_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdIsNotNull() {
            addCriterion("Group_Examination_Fmedical_Items_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdEqualTo(Integer value) {
            addCriterion("Group_Examination_Fmedical_Items_ID =", value, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdNotEqualTo(Integer value) {
            addCriterion("Group_Examination_Fmedical_Items_ID <>", value, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdGreaterThan(Integer value) {
            addCriterion("Group_Examination_Fmedical_Items_ID >", value, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Group_Examination_Fmedical_Items_ID >=", value, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdLessThan(Integer value) {
            addCriterion("Group_Examination_Fmedical_Items_ID <", value, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Group_Examination_Fmedical_Items_ID <=", value, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdIn(List<Integer> values) {
            addCriterion("Group_Examination_Fmedical_Items_ID in", values, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdNotIn(List<Integer> values) {
            addCriterion("Group_Examination_Fmedical_Items_ID not in", values, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("Group_Examination_Fmedical_Items_ID between", value1, value2, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andGroupExaminationFmedicalItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Group_Examination_Fmedical_Items_ID not between", value1, value2, "groupExaminationFmedicalItemsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdIsNull() {
            addCriterion("Drugs_ID is null");
            return (Criteria) this;
        }

        public Criteria andDrugsIdIsNotNull() {
            addCriterion("Drugs_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsIdEqualTo(Integer value) {
            addCriterion("Drugs_ID =", value, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdNotEqualTo(Integer value) {
            addCriterion("Drugs_ID <>", value, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdGreaterThan(Integer value) {
            addCriterion("Drugs_ID >", value, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Drugs_ID >=", value, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdLessThan(Integer value) {
            addCriterion("Drugs_ID <", value, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Drugs_ID <=", value, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdIn(List<Integer> values) {
            addCriterion("Drugs_ID in", values, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdNotIn(List<Integer> values) {
            addCriterion("Drugs_ID not in", values, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdBetween(Integer value1, Integer value2) {
            addCriterion("Drugs_ID between", value1, value2, "drugsId");
            return (Criteria) this;
        }

        public Criteria andDrugsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Drugs_ID not between", value1, value2, "drugsId");
            return (Criteria) this;
        }

        public Criteria andUsageIsNull() {
            addCriterion("Usage is null");
            return (Criteria) this;
        }

        public Criteria andUsageIsNotNull() {
            addCriterion("Usage is not null");
            return (Criteria) this;
        }

        public Criteria andUsageEqualTo(String value) {
            addCriterion("Usage =", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotEqualTo(String value) {
            addCriterion("Usage <>", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageGreaterThan(String value) {
            addCriterion("Usage >", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageGreaterThanOrEqualTo(String value) {
            addCriterion("Usage >=", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLessThan(String value) {
            addCriterion("Usage <", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLessThanOrEqualTo(String value) {
            addCriterion("Usage <=", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLike(String value) {
            addCriterion("Usage like", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotLike(String value) {
            addCriterion("Usage not like", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageIn(List<String> values) {
            addCriterion("Usage in", values, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotIn(List<String> values) {
            addCriterion("Usage not in", values, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageBetween(String value1, String value2) {
            addCriterion("Usage between", value1, value2, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotBetween(String value1, String value2) {
            addCriterion("Usage not between", value1, value2, "usage");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("Quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("Quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("Quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("Quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("Quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("Quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("Quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("Quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("Quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("Quantity not between", value1, value2, "quantity");
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