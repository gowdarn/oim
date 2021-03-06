package com.dzmsoft.oim.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OimAdArticleExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
     */
    public OimAdArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andShortTitleIsNull() {
            addCriterion("short_title is null");
            return (Criteria) this;
        }

        public Criteria andShortTitleIsNotNull() {
            addCriterion("short_title is not null");
            return (Criteria) this;
        }

        public Criteria andShortTitleEqualTo(String value) {
            addCriterion("short_title =", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotEqualTo(String value) {
            addCriterion("short_title <>", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleGreaterThan(String value) {
            addCriterion("short_title >", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleGreaterThanOrEqualTo(String value) {
            addCriterion("short_title >=", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLessThan(String value) {
            addCriterion("short_title <", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLessThanOrEqualTo(String value) {
            addCriterion("short_title <=", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleLike(String value) {
            addCriterion("short_title like", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotLike(String value) {
            addCriterion("short_title not like", value, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleIn(List<String> values) {
            addCriterion("short_title in", values, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotIn(List<String> values) {
            addCriterion("short_title not in", values, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleBetween(String value1, String value2) {
            addCriterion("short_title between", value1, value2, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andShortTitleNotBetween(String value1, String value2) {
            addCriterion("short_title not between", value1, value2, "shortTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleIsNull() {
            addCriterion("long_title is null");
            return (Criteria) this;
        }

        public Criteria andLongTitleIsNotNull() {
            addCriterion("long_title is not null");
            return (Criteria) this;
        }

        public Criteria andLongTitleEqualTo(String value) {
            addCriterion("long_title =", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleNotEqualTo(String value) {
            addCriterion("long_title <>", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleGreaterThan(String value) {
            addCriterion("long_title >", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleGreaterThanOrEqualTo(String value) {
            addCriterion("long_title >=", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleLessThan(String value) {
            addCriterion("long_title <", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleLessThanOrEqualTo(String value) {
            addCriterion("long_title <=", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleLike(String value) {
            addCriterion("long_title like", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleNotLike(String value) {
            addCriterion("long_title not like", value, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleIn(List<String> values) {
            addCriterion("long_title in", values, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleNotIn(List<String> values) {
            addCriterion("long_title not in", values, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleBetween(String value1, String value2) {
            addCriterion("long_title between", value1, value2, "longTitle");
            return (Criteria) this;
        }

        public Criteria andLongTitleNotBetween(String value1, String value2) {
            addCriterion("long_title not between", value1, value2, "longTitle");
            return (Criteria) this;
        }

        public Criteria andPcTitlePicIsNull() {
            addCriterion("pc_title_pic is null");
            return (Criteria) this;
        }

        public Criteria andPcTitlePicIsNotNull() {
            addCriterion("pc_title_pic is not null");
            return (Criteria) this;
        }

        public Criteria andPcTitlePicEqualTo(String value) {
            addCriterion("pc_title_pic =", value, "pcTitlePic");
            return (Criteria) this;
        }

        public Criteria andPcTitlePicNotEqualTo(String value) {
            addCriterion("pc_title_pic <>", value, "pcTitlePic");
            return (Criteria) this;
        }

        public Criteria andPcTitlePicGreaterThan(String value) {
            addCriterion("pc_title_pic >", value, "pcTitlePic");
            return (Criteria) this;
        }

        public Criteria andPcTitlePicGreaterThanOrEqualTo(String value) {
            addCriterion("pc_title_pic >=", value, "pcTitlePic");
            return (Criteria) this;
        }

        public Criteria andPcTitlePicLessThan(String value) {
            addCriterion("pc_title_pic <", value, "pcTitlePic");
            return (Criteria) this;
        }

        public Criteria andPcTitlePicLessThanOrEqualTo(String value) {
            addCriterion("pc_title_pic <=", value, "pcTitlePic");
            return (Criteria) this;
        }

        public Criteria andPcTitlePicLike(String value) {
            addCriterion("pc_title_pic like", value, "pcTitlePic");
            return (Criteria) this;
        }

        public Criteria andPcTitlePicNotLike(String value) {
            addCriterion("pc_title_pic not like", value, "pcTitlePic");
            return (Criteria) this;
        }

        public Criteria andPcTitlePicIn(List<String> values) {
            addCriterion("pc_title_pic in", values, "pcTitlePic");
            return (Criteria) this;
        }

        public Criteria andPcTitlePicNotIn(List<String> values) {
            addCriterion("pc_title_pic not in", values, "pcTitlePic");
            return (Criteria) this;
        }

        public Criteria andPcTitlePicBetween(String value1, String value2) {
            addCriterion("pc_title_pic between", value1, value2, "pcTitlePic");
            return (Criteria) this;
        }

        public Criteria andPcTitlePicNotBetween(String value1, String value2) {
            addCriterion("pc_title_pic not between", value1, value2, "pcTitlePic");
            return (Criteria) this;
        }

        public Criteria andAppTitlePicIsNull() {
            addCriterion("app_title_pic is null");
            return (Criteria) this;
        }

        public Criteria andAppTitlePicIsNotNull() {
            addCriterion("app_title_pic is not null");
            return (Criteria) this;
        }

        public Criteria andAppTitlePicEqualTo(String value) {
            addCriterion("app_title_pic =", value, "appTitlePic");
            return (Criteria) this;
        }

        public Criteria andAppTitlePicNotEqualTo(String value) {
            addCriterion("app_title_pic <>", value, "appTitlePic");
            return (Criteria) this;
        }

        public Criteria andAppTitlePicGreaterThan(String value) {
            addCriterion("app_title_pic >", value, "appTitlePic");
            return (Criteria) this;
        }

        public Criteria andAppTitlePicGreaterThanOrEqualTo(String value) {
            addCriterion("app_title_pic >=", value, "appTitlePic");
            return (Criteria) this;
        }

        public Criteria andAppTitlePicLessThan(String value) {
            addCriterion("app_title_pic <", value, "appTitlePic");
            return (Criteria) this;
        }

        public Criteria andAppTitlePicLessThanOrEqualTo(String value) {
            addCriterion("app_title_pic <=", value, "appTitlePic");
            return (Criteria) this;
        }

        public Criteria andAppTitlePicLike(String value) {
            addCriterion("app_title_pic like", value, "appTitlePic");
            return (Criteria) this;
        }

        public Criteria andAppTitlePicNotLike(String value) {
            addCriterion("app_title_pic not like", value, "appTitlePic");
            return (Criteria) this;
        }

        public Criteria andAppTitlePicIn(List<String> values) {
            addCriterion("app_title_pic in", values, "appTitlePic");
            return (Criteria) this;
        }

        public Criteria andAppTitlePicNotIn(List<String> values) {
            addCriterion("app_title_pic not in", values, "appTitlePic");
            return (Criteria) this;
        }

        public Criteria andAppTitlePicBetween(String value1, String value2) {
            addCriterion("app_title_pic between", value1, value2, "appTitlePic");
            return (Criteria) this;
        }

        public Criteria andAppTitlePicNotBetween(String value1, String value2) {
            addCriterion("app_title_pic not between", value1, value2, "appTitlePic");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeIsNull() {
            addCriterion("deploy_time is null");
            return (Criteria) this;
        }

        public Criteria andDeployTimeIsNotNull() {
            addCriterion("deploy_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeployTimeEqualTo(Date value) {
            addCriterion("deploy_time =", value, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeNotEqualTo(Date value) {
            addCriterion("deploy_time <>", value, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeGreaterThan(Date value) {
            addCriterion("deploy_time >", value, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deploy_time >=", value, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeLessThan(Date value) {
            addCriterion("deploy_time <", value, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeLessThanOrEqualTo(Date value) {
            addCriterion("deploy_time <=", value, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeIn(List<Date> values) {
            addCriterion("deploy_time in", values, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeNotIn(List<Date> values) {
            addCriterion("deploy_time not in", values, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeBetween(Date value1, Date value2) {
            addCriterion("deploy_time between", value1, value2, "deployTime");
            return (Criteria) this;
        }

        public Criteria andDeployTimeNotBetween(Date value1, Date value2) {
            addCriterion("deploy_time not between", value1, value2, "deployTime");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNull() {
            addCriterion("updator is null");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNotNull() {
            addCriterion("updator is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatorEqualTo(String value) {
            addCriterion("updator =", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotEqualTo(String value) {
            addCriterion("updator <>", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThan(String value) {
            addCriterion("updator >", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThanOrEqualTo(String value) {
            addCriterion("updator >=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThan(String value) {
            addCriterion("updator <", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThanOrEqualTo(String value) {
            addCriterion("updator <=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLike(String value) {
            addCriterion("updator like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotLike(String value) {
            addCriterion("updator not like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorIn(List<String> values) {
            addCriterion("updator in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotIn(List<String> values) {
            addCriterion("updator not in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorBetween(String value1, String value2) {
            addCriterion("updator between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotBetween(String value1, String value2) {
            addCriterion("updator not between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table oim_ad_article
     * @mbggenerated  Wed Apr 27 13:12:04 CST 2016
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

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table oim_ad_article
     *
     * @mbggenerated do_not_delete_during_merge Tue Apr 26 13:59:10 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}