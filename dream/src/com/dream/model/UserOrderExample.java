package com.dream.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserOrderExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	protected List<Criteria> oredCriteria;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	protected int limitStart = -1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	protected int limitEnd = -1;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public UserOrderExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setLimitStart(int limitStart) {
		this.limitStart = limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public int getLimitStart() {
		return limitStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setLimitEnd(int limitEnd) {
		this.limitEnd = limitEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public int getLimitEnd() {
		return limitEnd;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andDreamNameIsNull() {
			addCriterion("dreamName is null");
			return (Criteria) this;
		}

		public Criteria andDreamNameIsNotNull() {
			addCriterion("dreamName is not null");
			return (Criteria) this;
		}

		public Criteria andDreamNameEqualTo(String value) {
			addCriterion("dreamName =", value, "dreamName");
			return (Criteria) this;
		}

		public Criteria andDreamNameNotEqualTo(String value) {
			addCriterion("dreamName <>", value, "dreamName");
			return (Criteria) this;
		}

		public Criteria andDreamNameGreaterThan(String value) {
			addCriterion("dreamName >", value, "dreamName");
			return (Criteria) this;
		}

		public Criteria andDreamNameGreaterThanOrEqualTo(String value) {
			addCriterion("dreamName >=", value, "dreamName");
			return (Criteria) this;
		}

		public Criteria andDreamNameLessThan(String value) {
			addCriterion("dreamName <", value, "dreamName");
			return (Criteria) this;
		}

		public Criteria andDreamNameLessThanOrEqualTo(String value) {
			addCriterion("dreamName <=", value, "dreamName");
			return (Criteria) this;
		}

		public Criteria andDreamNameLike(String value) {
			addCriterion("dreamName like", value, "dreamName");
			return (Criteria) this;
		}

		public Criteria andDreamNameNotLike(String value) {
			addCriterion("dreamName not like", value, "dreamName");
			return (Criteria) this;
		}

		public Criteria andDreamNameIn(List<String> values) {
			addCriterion("dreamName in", values, "dreamName");
			return (Criteria) this;
		}

		public Criteria andDreamNameNotIn(List<String> values) {
			addCriterion("dreamName not in", values, "dreamName");
			return (Criteria) this;
		}

		public Criteria andDreamNameBetween(String value1, String value2) {
			addCriterion("dreamName between", value1, value2, "dreamName");
			return (Criteria) this;
		}

		public Criteria andDreamNameNotBetween(String value1, String value2) {
			addCriterion("dreamName not between", value1, value2, "dreamName");
			return (Criteria) this;
		}

		public Criteria andDreamBreifIsNull() {
			addCriterion("dreamBreif is null");
			return (Criteria) this;
		}

		public Criteria andDreamBreifIsNotNull() {
			addCriterion("dreamBreif is not null");
			return (Criteria) this;
		}

		public Criteria andDreamBreifEqualTo(String value) {
			addCriterion("dreamBreif =", value, "dreamBreif");
			return (Criteria) this;
		}

		public Criteria andDreamBreifNotEqualTo(String value) {
			addCriterion("dreamBreif <>", value, "dreamBreif");
			return (Criteria) this;
		}

		public Criteria andDreamBreifGreaterThan(String value) {
			addCriterion("dreamBreif >", value, "dreamBreif");
			return (Criteria) this;
		}

		public Criteria andDreamBreifGreaterThanOrEqualTo(String value) {
			addCriterion("dreamBreif >=", value, "dreamBreif");
			return (Criteria) this;
		}

		public Criteria andDreamBreifLessThan(String value) {
			addCriterion("dreamBreif <", value, "dreamBreif");
			return (Criteria) this;
		}

		public Criteria andDreamBreifLessThanOrEqualTo(String value) {
			addCriterion("dreamBreif <=", value, "dreamBreif");
			return (Criteria) this;
		}

		public Criteria andDreamBreifLike(String value) {
			addCriterion("dreamBreif like", value, "dreamBreif");
			return (Criteria) this;
		}

		public Criteria andDreamBreifNotLike(String value) {
			addCriterion("dreamBreif not like", value, "dreamBreif");
			return (Criteria) this;
		}

		public Criteria andDreamBreifIn(List<String> values) {
			addCriterion("dreamBreif in", values, "dreamBreif");
			return (Criteria) this;
		}

		public Criteria andDreamBreifNotIn(List<String> values) {
			addCriterion("dreamBreif not in", values, "dreamBreif");
			return (Criteria) this;
		}

		public Criteria andDreamBreifBetween(String value1, String value2) {
			addCriterion("dreamBreif between", value1, value2, "dreamBreif");
			return (Criteria) this;
		}

		public Criteria andDreamBreifNotBetween(String value1, String value2) {
			addCriterion("dreamBreif not between", value1, value2, "dreamBreif");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("userId is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("userId is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Long value) {
			addCriterion("userId =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Long value) {
			addCriterion("userId <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Long value) {
			addCriterion("userId >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
			addCriterion("userId >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Long value) {
			addCriterion("userId <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Long value) {
			addCriterion("userId <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Long> values) {
			addCriterion("userId in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Long> values) {
			addCriterion("userId not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Long value1, Long value2) {
			addCriterion("userId between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Long value1, Long value2) {
			addCriterion("userId not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andZanIsNull() {
			addCriterion("zan is null");
			return (Criteria) this;
		}

		public Criteria andZanIsNotNull() {
			addCriterion("zan is not null");
			return (Criteria) this;
		}

		public Criteria andZanEqualTo(Integer value) {
			addCriterion("zan =", value, "zan");
			return (Criteria) this;
		}

		public Criteria andZanNotEqualTo(Integer value) {
			addCriterion("zan <>", value, "zan");
			return (Criteria) this;
		}

		public Criteria andZanGreaterThan(Integer value) {
			addCriterion("zan >", value, "zan");
			return (Criteria) this;
		}

		public Criteria andZanGreaterThanOrEqualTo(Integer value) {
			addCriterion("zan >=", value, "zan");
			return (Criteria) this;
		}

		public Criteria andZanLessThan(Integer value) {
			addCriterion("zan <", value, "zan");
			return (Criteria) this;
		}

		public Criteria andZanLessThanOrEqualTo(Integer value) {
			addCriterion("zan <=", value, "zan");
			return (Criteria) this;
		}

		public Criteria andZanIn(List<Integer> values) {
			addCriterion("zan in", values, "zan");
			return (Criteria) this;
		}

		public Criteria andZanNotIn(List<Integer> values) {
			addCriterion("zan not in", values, "zan");
			return (Criteria) this;
		}

		public Criteria andZanBetween(Integer value1, Integer value2) {
			addCriterion("zan between", value1, value2, "zan");
			return (Criteria) this;
		}

		public Criteria andZanNotBetween(Integer value1, Integer value2) {
			addCriterion("zan not between", value1, value2, "zan");
			return (Criteria) this;
		}

		public Criteria andCaiIsNull() {
			addCriterion("cai is null");
			return (Criteria) this;
		}

		public Criteria andCaiIsNotNull() {
			addCriterion("cai is not null");
			return (Criteria) this;
		}

		public Criteria andCaiEqualTo(Integer value) {
			addCriterion("cai =", value, "cai");
			return (Criteria) this;
		}

		public Criteria andCaiNotEqualTo(Integer value) {
			addCriterion("cai <>", value, "cai");
			return (Criteria) this;
		}

		public Criteria andCaiGreaterThan(Integer value) {
			addCriterion("cai >", value, "cai");
			return (Criteria) this;
		}

		public Criteria andCaiGreaterThanOrEqualTo(Integer value) {
			addCriterion("cai >=", value, "cai");
			return (Criteria) this;
		}

		public Criteria andCaiLessThan(Integer value) {
			addCriterion("cai <", value, "cai");
			return (Criteria) this;
		}

		public Criteria andCaiLessThanOrEqualTo(Integer value) {
			addCriterion("cai <=", value, "cai");
			return (Criteria) this;
		}

		public Criteria andCaiIn(List<Integer> values) {
			addCriterion("cai in", values, "cai");
			return (Criteria) this;
		}

		public Criteria andCaiNotIn(List<Integer> values) {
			addCriterion("cai not in", values, "cai");
			return (Criteria) this;
		}

		public Criteria andCaiBetween(Integer value1, Integer value2) {
			addCriterion("cai between", value1, value2, "cai");
			return (Criteria) this;
		}

		public Criteria andCaiNotBetween(Integer value1, Integer value2) {
			addCriterion("cai not between", value1, value2, "cai");
			return (Criteria) this;
		}

		public Criteria andKeepGoalIsNull() {
			addCriterion("keepGoal is null");
			return (Criteria) this;
		}

		public Criteria andKeepGoalIsNotNull() {
			addCriterion("keepGoal is not null");
			return (Criteria) this;
		}

		public Criteria andKeepGoalEqualTo(String value) {
			addCriterion("keepGoal =", value, "keepGoal");
			return (Criteria) this;
		}

		public Criteria andKeepGoalNotEqualTo(String value) {
			addCriterion("keepGoal <>", value, "keepGoal");
			return (Criteria) this;
		}

		public Criteria andKeepGoalGreaterThan(String value) {
			addCriterion("keepGoal >", value, "keepGoal");
			return (Criteria) this;
		}

		public Criteria andKeepGoalGreaterThanOrEqualTo(String value) {
			addCriterion("keepGoal >=", value, "keepGoal");
			return (Criteria) this;
		}

		public Criteria andKeepGoalLessThan(String value) {
			addCriterion("keepGoal <", value, "keepGoal");
			return (Criteria) this;
		}

		public Criteria andKeepGoalLessThanOrEqualTo(String value) {
			addCriterion("keepGoal <=", value, "keepGoal");
			return (Criteria) this;
		}

		public Criteria andKeepGoalLike(String value) {
			addCriterion("keepGoal like", value, "keepGoal");
			return (Criteria) this;
		}

		public Criteria andKeepGoalNotLike(String value) {
			addCriterion("keepGoal not like", value, "keepGoal");
			return (Criteria) this;
		}

		public Criteria andKeepGoalIn(List<String> values) {
			addCriterion("keepGoal in", values, "keepGoal");
			return (Criteria) this;
		}

		public Criteria andKeepGoalNotIn(List<String> values) {
			addCriterion("keepGoal not in", values, "keepGoal");
			return (Criteria) this;
		}

		public Criteria andKeepGoalBetween(String value1, String value2) {
			addCriterion("keepGoal between", value1, value2, "keepGoal");
			return (Criteria) this;
		}

		public Criteria andKeepGoalNotBetween(String value1, String value2) {
			addCriterion("keepGoal not between", value1, value2, "keepGoal");
			return (Criteria) this;
		}

		public Criteria andKeepDayIsNull() {
			addCriterion("keepDay is null");
			return (Criteria) this;
		}

		public Criteria andKeepDayIsNotNull() {
			addCriterion("keepDay is not null");
			return (Criteria) this;
		}

		public Criteria andKeepDayEqualTo(Integer value) {
			addCriterion("keepDay =", value, "keepDay");
			return (Criteria) this;
		}

		public Criteria andKeepDayNotEqualTo(Integer value) {
			addCriterion("keepDay <>", value, "keepDay");
			return (Criteria) this;
		}

		public Criteria andKeepDayGreaterThan(Integer value) {
			addCriterion("keepDay >", value, "keepDay");
			return (Criteria) this;
		}

		public Criteria andKeepDayGreaterThanOrEqualTo(Integer value) {
			addCriterion("keepDay >=", value, "keepDay");
			return (Criteria) this;
		}

		public Criteria andKeepDayLessThan(Integer value) {
			addCriterion("keepDay <", value, "keepDay");
			return (Criteria) this;
		}

		public Criteria andKeepDayLessThanOrEqualTo(Integer value) {
			addCriterion("keepDay <=", value, "keepDay");
			return (Criteria) this;
		}

		public Criteria andKeepDayIn(List<Integer> values) {
			addCriterion("keepDay in", values, "keepDay");
			return (Criteria) this;
		}

		public Criteria andKeepDayNotIn(List<Integer> values) {
			addCriterion("keepDay not in", values, "keepDay");
			return (Criteria) this;
		}

		public Criteria andKeepDayBetween(Integer value1, Integer value2) {
			addCriterion("keepDay between", value1, value2, "keepDay");
			return (Criteria) this;
		}

		public Criteria andKeepDayNotBetween(Integer value1, Integer value2) {
			addCriterion("keepDay not between", value1, value2, "keepDay");
			return (Criteria) this;
		}

		public Criteria andKeepStopTimeIsNull() {
			addCriterion("keepStopTime is null");
			return (Criteria) this;
		}

		public Criteria andKeepStopTimeIsNotNull() {
			addCriterion("keepStopTime is not null");
			return (Criteria) this;
		}

		public Criteria andKeepStopTimeEqualTo(Date value) {
			addCriterion("keepStopTime =", value, "keepStopTime");
			return (Criteria) this;
		}

		public Criteria andKeepStopTimeNotEqualTo(Date value) {
			addCriterion("keepStopTime <>", value, "keepStopTime");
			return (Criteria) this;
		}

		public Criteria andKeepStopTimeGreaterThan(Date value) {
			addCriterion("keepStopTime >", value, "keepStopTime");
			return (Criteria) this;
		}

		public Criteria andKeepStopTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("keepStopTime >=", value, "keepStopTime");
			return (Criteria) this;
		}

		public Criteria andKeepStopTimeLessThan(Date value) {
			addCriterion("keepStopTime <", value, "keepStopTime");
			return (Criteria) this;
		}

		public Criteria andKeepStopTimeLessThanOrEqualTo(Date value) {
			addCriterion("keepStopTime <=", value, "keepStopTime");
			return (Criteria) this;
		}

		public Criteria andKeepStopTimeIn(List<Date> values) {
			addCriterion("keepStopTime in", values, "keepStopTime");
			return (Criteria) this;
		}

		public Criteria andKeepStopTimeNotIn(List<Date> values) {
			addCriterion("keepStopTime not in", values, "keepStopTime");
			return (Criteria) this;
		}

		public Criteria andKeepStopTimeBetween(Date value1, Date value2) {
			addCriterion("keepStopTime between", value1, value2, "keepStopTime");
			return (Criteria) this;
		}

		public Criteria andKeepStopTimeNotBetween(Date value1, Date value2) {
			addCriterion("keepStopTime not between", value1, value2,
					"keepStopTime");
			return (Criteria) this;
		}

		public Criteria andDeclarationIsNull() {
			addCriterion("declaration is null");
			return (Criteria) this;
		}

		public Criteria andDeclarationIsNotNull() {
			addCriterion("declaration is not null");
			return (Criteria) this;
		}

		public Criteria andDeclarationEqualTo(String value) {
			addCriterion("declaration =", value, "declaration");
			return (Criteria) this;
		}

		public Criteria andDeclarationNotEqualTo(String value) {
			addCriterion("declaration <>", value, "declaration");
			return (Criteria) this;
		}

		public Criteria andDeclarationGreaterThan(String value) {
			addCriterion("declaration >", value, "declaration");
			return (Criteria) this;
		}

		public Criteria andDeclarationGreaterThanOrEqualTo(String value) {
			addCriterion("declaration >=", value, "declaration");
			return (Criteria) this;
		}

		public Criteria andDeclarationLessThan(String value) {
			addCriterion("declaration <", value, "declaration");
			return (Criteria) this;
		}

		public Criteria andDeclarationLessThanOrEqualTo(String value) {
			addCriterion("declaration <=", value, "declaration");
			return (Criteria) this;
		}

		public Criteria andDeclarationLike(String value) {
			addCriterion("declaration like", value, "declaration");
			return (Criteria) this;
		}

		public Criteria andDeclarationNotLike(String value) {
			addCriterion("declaration not like", value, "declaration");
			return (Criteria) this;
		}

		public Criteria andDeclarationIn(List<String> values) {
			addCriterion("declaration in", values, "declaration");
			return (Criteria) this;
		}

		public Criteria andDeclarationNotIn(List<String> values) {
			addCriterion("declaration not in", values, "declaration");
			return (Criteria) this;
		}

		public Criteria andDeclarationBetween(String value1, String value2) {
			addCriterion("declaration between", value1, value2, "declaration");
			return (Criteria) this;
		}

		public Criteria andDeclarationNotBetween(String value1, String value2) {
			addCriterion("declaration not between", value1, value2,
					"declaration");
			return (Criteria) this;
		}

		public Criteria andFailurePromiseIsNull() {
			addCriterion("failurePromise is null");
			return (Criteria) this;
		}

		public Criteria andFailurePromiseIsNotNull() {
			addCriterion("failurePromise is not null");
			return (Criteria) this;
		}

		public Criteria andFailurePromiseEqualTo(String value) {
			addCriterion("failurePromise =", value, "failurePromise");
			return (Criteria) this;
		}

		public Criteria andFailurePromiseNotEqualTo(String value) {
			addCriterion("failurePromise <>", value, "failurePromise");
			return (Criteria) this;
		}

		public Criteria andFailurePromiseGreaterThan(String value) {
			addCriterion("failurePromise >", value, "failurePromise");
			return (Criteria) this;
		}

		public Criteria andFailurePromiseGreaterThanOrEqualTo(String value) {
			addCriterion("failurePromise >=", value, "failurePromise");
			return (Criteria) this;
		}

		public Criteria andFailurePromiseLessThan(String value) {
			addCriterion("failurePromise <", value, "failurePromise");
			return (Criteria) this;
		}

		public Criteria andFailurePromiseLessThanOrEqualTo(String value) {
			addCriterion("failurePromise <=", value, "failurePromise");
			return (Criteria) this;
		}

		public Criteria andFailurePromiseLike(String value) {
			addCriterion("failurePromise like", value, "failurePromise");
			return (Criteria) this;
		}

		public Criteria andFailurePromiseNotLike(String value) {
			addCriterion("failurePromise not like", value, "failurePromise");
			return (Criteria) this;
		}

		public Criteria andFailurePromiseIn(List<String> values) {
			addCriterion("failurePromise in", values, "failurePromise");
			return (Criteria) this;
		}

		public Criteria andFailurePromiseNotIn(List<String> values) {
			addCriterion("failurePromise not in", values, "failurePromise");
			return (Criteria) this;
		}

		public Criteria andFailurePromiseBetween(String value1, String value2) {
			addCriterion("failurePromise between", value1, value2,
					"failurePromise");
			return (Criteria) this;
		}

		public Criteria andFailurePromiseNotBetween(String value1, String value2) {
			addCriterion("failurePromise not between", value1, value2,
					"failurePromise");
			return (Criteria) this;
		}

		public Criteria andSuccessPromiseIsNull() {
			addCriterion("successPromise is null");
			return (Criteria) this;
		}

		public Criteria andSuccessPromiseIsNotNull() {
			addCriterion("successPromise is not null");
			return (Criteria) this;
		}

		public Criteria andSuccessPromiseEqualTo(String value) {
			addCriterion("successPromise =", value, "successPromise");
			return (Criteria) this;
		}

		public Criteria andSuccessPromiseNotEqualTo(String value) {
			addCriterion("successPromise <>", value, "successPromise");
			return (Criteria) this;
		}

		public Criteria andSuccessPromiseGreaterThan(String value) {
			addCriterion("successPromise >", value, "successPromise");
			return (Criteria) this;
		}

		public Criteria andSuccessPromiseGreaterThanOrEqualTo(String value) {
			addCriterion("successPromise >=", value, "successPromise");
			return (Criteria) this;
		}

		public Criteria andSuccessPromiseLessThan(String value) {
			addCriterion("successPromise <", value, "successPromise");
			return (Criteria) this;
		}

		public Criteria andSuccessPromiseLessThanOrEqualTo(String value) {
			addCriterion("successPromise <=", value, "successPromise");
			return (Criteria) this;
		}

		public Criteria andSuccessPromiseLike(String value) {
			addCriterion("successPromise like", value, "successPromise");
			return (Criteria) this;
		}

		public Criteria andSuccessPromiseNotLike(String value) {
			addCriterion("successPromise not like", value, "successPromise");
			return (Criteria) this;
		}

		public Criteria andSuccessPromiseIn(List<String> values) {
			addCriterion("successPromise in", values, "successPromise");
			return (Criteria) this;
		}

		public Criteria andSuccessPromiseNotIn(List<String> values) {
			addCriterion("successPromise not in", values, "successPromise");
			return (Criteria) this;
		}

		public Criteria andSuccessPromiseBetween(String value1, String value2) {
			addCriterion("successPromise between", value1, value2,
					"successPromise");
			return (Criteria) this;
		}

		public Criteria andSuccessPromiseNotBetween(String value1, String value2) {
			addCriterion("successPromise not between", value1, value2,
					"successPromise");
			return (Criteria) this;
		}

		public Criteria andOpenStatusIsNull() {
			addCriterion("openStatus is null");
			return (Criteria) this;
		}

		public Criteria andOpenStatusIsNotNull() {
			addCriterion("openStatus is not null");
			return (Criteria) this;
		}

		public Criteria andOpenStatusEqualTo(Integer value) {
			addCriterion("openStatus =", value, "openStatus");
			return (Criteria) this;
		}

		public Criteria andOpenStatusNotEqualTo(Integer value) {
			addCriterion("openStatus <>", value, "openStatus");
			return (Criteria) this;
		}

		public Criteria andOpenStatusGreaterThan(Integer value) {
			addCriterion("openStatus >", value, "openStatus");
			return (Criteria) this;
		}

		public Criteria andOpenStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("openStatus >=", value, "openStatus");
			return (Criteria) this;
		}

		public Criteria andOpenStatusLessThan(Integer value) {
			addCriterion("openStatus <", value, "openStatus");
			return (Criteria) this;
		}

		public Criteria andOpenStatusLessThanOrEqualTo(Integer value) {
			addCriterion("openStatus <=", value, "openStatus");
			return (Criteria) this;
		}

		public Criteria andOpenStatusIn(List<Integer> values) {
			addCriterion("openStatus in", values, "openStatus");
			return (Criteria) this;
		}

		public Criteria andOpenStatusNotIn(List<Integer> values) {
			addCriterion("openStatus not in", values, "openStatus");
			return (Criteria) this;
		}

		public Criteria andOpenStatusBetween(Integer value1, Integer value2) {
			addCriterion("openStatus between", value1, value2, "openStatus");
			return (Criteria) this;
		}

		public Criteria andOpenStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("openStatus not between", value1, value2, "openStatus");
			return (Criteria) this;
		}

		public Criteria andDepositMoneyIsNull() {
			addCriterion("depositMoney is null");
			return (Criteria) this;
		}

		public Criteria andDepositMoneyIsNotNull() {
			addCriterion("depositMoney is not null");
			return (Criteria) this;
		}

		public Criteria andDepositMoneyEqualTo(Integer value) {
			addCriterion("depositMoney =", value, "depositMoney");
			return (Criteria) this;
		}

		public Criteria andDepositMoneyNotEqualTo(Integer value) {
			addCriterion("depositMoney <>", value, "depositMoney");
			return (Criteria) this;
		}

		public Criteria andDepositMoneyGreaterThan(Integer value) {
			addCriterion("depositMoney >", value, "depositMoney");
			return (Criteria) this;
		}

		public Criteria andDepositMoneyGreaterThanOrEqualTo(Integer value) {
			addCriterion("depositMoney >=", value, "depositMoney");
			return (Criteria) this;
		}

		public Criteria andDepositMoneyLessThan(Integer value) {
			addCriterion("depositMoney <", value, "depositMoney");
			return (Criteria) this;
		}

		public Criteria andDepositMoneyLessThanOrEqualTo(Integer value) {
			addCriterion("depositMoney <=", value, "depositMoney");
			return (Criteria) this;
		}

		public Criteria andDepositMoneyIn(List<Integer> values) {
			addCriterion("depositMoney in", values, "depositMoney");
			return (Criteria) this;
		}

		public Criteria andDepositMoneyNotIn(List<Integer> values) {
			addCriterion("depositMoney not in", values, "depositMoney");
			return (Criteria) this;
		}

		public Criteria andDepositMoneyBetween(Integer value1, Integer value2) {
			addCriterion("depositMoney between", value1, value2, "depositMoney");
			return (Criteria) this;
		}

		public Criteria andDepositMoneyNotBetween(Integer value1, Integer value2) {
			addCriterion("depositMoney not between", value1, value2,
					"depositMoney");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("createTime is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("createTime is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("createTime =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("createTime <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("createTime >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createTime >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("createTime <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("createTime <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("createTime in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("createTime not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("createTime between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("createTime not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("updateTime is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("updateTime is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterion("updateTime =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterion("updateTime <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterion("updateTime >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("updateTime >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterion("updateTime <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("updateTime <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterion("updateTime in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterion("updateTime not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("updateTime between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("updateTime not between", value1, value2, "updateTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_order
     *
     * @mbggenerated do_not_delete_during_merge Sat Nov 14 22:10:40 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}