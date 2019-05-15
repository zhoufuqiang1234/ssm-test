package cn.fuqiang.ssmtest.bean;

import java.util.ArrayList;
import java.util.List;

public class TestBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestBeanExample() {
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

        public Criteria andTeststrIsNull() {
            addCriterion("testStr is null");
            return (Criteria) this;
        }

        public Criteria andTeststrIsNotNull() {
            addCriterion("testStr is not null");
            return (Criteria) this;
        }

        public Criteria andTeststrEqualTo(String value) {
            addCriterion("testStr =", value, "teststr");
            return (Criteria) this;
        }

        public Criteria andTeststrNotEqualTo(String value) {
            addCriterion("testStr <>", value, "teststr");
            return (Criteria) this;
        }

        public Criteria andTeststrGreaterThan(String value) {
            addCriterion("testStr >", value, "teststr");
            return (Criteria) this;
        }

        public Criteria andTeststrGreaterThanOrEqualTo(String value) {
            addCriterion("testStr >=", value, "teststr");
            return (Criteria) this;
        }

        public Criteria andTeststrLessThan(String value) {
            addCriterion("testStr <", value, "teststr");
            return (Criteria) this;
        }

        public Criteria andTeststrLessThanOrEqualTo(String value) {
            addCriterion("testStr <=", value, "teststr");
            return (Criteria) this;
        }

        public Criteria andTeststrLike(String value) {
            addCriterion("testStr like", value, "teststr");
            return (Criteria) this;
        }

        public Criteria andTeststrNotLike(String value) {
            addCriterion("testStr not like", value, "teststr");
            return (Criteria) this;
        }

        public Criteria andTeststrIn(List<String> values) {
            addCriterion("testStr in", values, "teststr");
            return (Criteria) this;
        }

        public Criteria andTeststrNotIn(List<String> values) {
            addCriterion("testStr not in", values, "teststr");
            return (Criteria) this;
        }

        public Criteria andTeststrBetween(String value1, String value2) {
            addCriterion("testStr between", value1, value2, "teststr");
            return (Criteria) this;
        }

        public Criteria andTeststrNotBetween(String value1, String value2) {
            addCriterion("testStr not between", value1, value2, "teststr");
            return (Criteria) this;
        }

        public Criteria andTestintIsNull() {
            addCriterion("testInt is null");
            return (Criteria) this;
        }

        public Criteria andTestintIsNotNull() {
            addCriterion("testInt is not null");
            return (Criteria) this;
        }

        public Criteria andTestintEqualTo(Long value) {
            addCriterion("testInt =", value, "testint");
            return (Criteria) this;
        }

        public Criteria andTestintNotEqualTo(Long value) {
            addCriterion("testInt <>", value, "testint");
            return (Criteria) this;
        }

        public Criteria andTestintGreaterThan(Long value) {
            addCriterion("testInt >", value, "testint");
            return (Criteria) this;
        }

        public Criteria andTestintGreaterThanOrEqualTo(Long value) {
            addCriterion("testInt >=", value, "testint");
            return (Criteria) this;
        }

        public Criteria andTestintLessThan(Long value) {
            addCriterion("testInt <", value, "testint");
            return (Criteria) this;
        }

        public Criteria andTestintLessThanOrEqualTo(Long value) {
            addCriterion("testInt <=", value, "testint");
            return (Criteria) this;
        }

        public Criteria andTestintIn(List<Long> values) {
            addCriterion("testInt in", values, "testint");
            return (Criteria) this;
        }

        public Criteria andTestintNotIn(List<Long> values) {
            addCriterion("testInt not in", values, "testint");
            return (Criteria) this;
        }

        public Criteria andTestintBetween(Long value1, Long value2) {
            addCriterion("testInt between", value1, value2, "testint");
            return (Criteria) this;
        }

        public Criteria andTestintNotBetween(Long value1, Long value2) {
            addCriterion("testInt not between", value1, value2, "testint");
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