package com.dream.model;

import com.dream.db.BaseBean;
import java.io.Serializable;
import java.util.Date;

public class UserOrder extends BaseBean implements Serializable {

	/**
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private Long id;
	/**
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private String dreamName;
	/**
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private String dreamBreif;
	/**
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private Long userId;
	/**
	 * 备注: 赞.
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private Integer zan;
	/**
	 * 备注: 踩.
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private Integer cai;
	/**
	 * 备注: 坚持的目标.
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private String keepGoal;
	/**
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private Integer keepDay;
	/**
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private Date keepStopTime;
	/**
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private String declaration;
	/**
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private String failurePromise;
	/**
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private String successPromise;
	/**
	 * 备注: 是否公开0=否 1=公开.
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private Integer openStatus;
	/**
	 * 备注: 押金.
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private Integer depositMoney;
	/**
	 * 备注: keep doing exercise.
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private Date createTime;
	/**
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_order
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.id
	 * @return  the value of user_order.id
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.id
	 * @param id  the value for user_order.id
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.dreamName
	 * @return  the value of user_order.dreamName
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public String getDreamName() {
		return dreamName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.dreamName
	 * @param dreamName  the value for user_order.dreamName
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setDreamName(String dreamName) {
		this.dreamName = dreamName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.dreamBreif
	 * @return  the value of user_order.dreamBreif
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public String getDreamBreif() {
		return dreamBreif;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.dreamBreif
	 * @param dreamBreif  the value for user_order.dreamBreif
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setDreamBreif(String dreamBreif) {
		this.dreamBreif = dreamBreif;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.userId
	 * @return  the value of user_order.userId
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.userId
	 * @param userId  the value for user_order.userId
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.zan
	 * @return  the value of user_order.zan
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public Integer getZan() {
		return zan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.zan
	 * @param zan  the value for user_order.zan
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setZan(Integer zan) {
		this.zan = zan;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.cai
	 * @return  the value of user_order.cai
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public Integer getCai() {
		return cai;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.cai
	 * @param cai  the value for user_order.cai
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setCai(Integer cai) {
		this.cai = cai;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.keepGoal
	 * @return  the value of user_order.keepGoal
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public String getKeepGoal() {
		return keepGoal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.keepGoal
	 * @param keepGoal  the value for user_order.keepGoal
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setKeepGoal(String keepGoal) {
		this.keepGoal = keepGoal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.keepDay
	 * @return  the value of user_order.keepDay
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public Integer getKeepDay() {
		return keepDay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.keepDay
	 * @param keepDay  the value for user_order.keepDay
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setKeepDay(Integer keepDay) {
		this.keepDay = keepDay;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.keepStopTime
	 * @return  the value of user_order.keepStopTime
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public Date getKeepStopTime() {
		return keepStopTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.keepStopTime
	 * @param keepStopTime  the value for user_order.keepStopTime
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setKeepStopTime(Date keepStopTime) {
		this.keepStopTime = keepStopTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.declaration
	 * @return  the value of user_order.declaration
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public String getDeclaration() {
		return declaration;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.declaration
	 * @param declaration  the value for user_order.declaration
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setDeclaration(String declaration) {
		this.declaration = declaration;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.failurePromise
	 * @return  the value of user_order.failurePromise
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public String getFailurePromise() {
		return failurePromise;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.failurePromise
	 * @param failurePromise  the value for user_order.failurePromise
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setFailurePromise(String failurePromise) {
		this.failurePromise = failurePromise;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.successPromise
	 * @return  the value of user_order.successPromise
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public String getSuccessPromise() {
		return successPromise;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.successPromise
	 * @param successPromise  the value for user_order.successPromise
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setSuccessPromise(String successPromise) {
		this.successPromise = successPromise;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.openStatus
	 * @return  the value of user_order.openStatus
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public Integer getOpenStatus() {
		return openStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.openStatus
	 * @param openStatus  the value for user_order.openStatus
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setOpenStatus(Integer openStatus) {
		this.openStatus = openStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.depositMoney
	 * @return  the value of user_order.depositMoney
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public Integer getDepositMoney() {
		return depositMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.depositMoney
	 * @param depositMoney  the value for user_order.depositMoney
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setDepositMoney(Integer depositMoney) {
		this.depositMoney = depositMoney;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.createTime
	 * @return  the value of user_order.createTime
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.createTime
	 * @param createTime  the value for user_order.createTime
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_order.updateTime
	 * @return  the value of user_order.updateTime
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_order.updateTime
	 * @param updateTime  the value for user_order.updateTime
	 * @mbggenerated  Sat Nov 14 22:19:40 CST 2015
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}