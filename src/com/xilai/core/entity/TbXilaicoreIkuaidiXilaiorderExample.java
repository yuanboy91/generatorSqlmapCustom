package com.xilai.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbXilaicoreIkuaidiXilaiorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbXilaicoreIkuaidiXilaiorderExample() {
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

        public Criteria andServicecodeIsNull() {
            addCriterion("serviceCode is null");
            return (Criteria) this;
        }

        public Criteria andServicecodeIsNotNull() {
            addCriterion("serviceCode is not null");
            return (Criteria) this;
        }

        public Criteria andServicecodeEqualTo(String value) {
            addCriterion("serviceCode =", value, "servicecode");
            return (Criteria) this;
        }

        public Criteria andServicecodeNotEqualTo(String value) {
            addCriterion("serviceCode <>", value, "servicecode");
            return (Criteria) this;
        }

        public Criteria andServicecodeGreaterThan(String value) {
            addCriterion("serviceCode >", value, "servicecode");
            return (Criteria) this;
        }

        public Criteria andServicecodeGreaterThanOrEqualTo(String value) {
            addCriterion("serviceCode >=", value, "servicecode");
            return (Criteria) this;
        }

        public Criteria andServicecodeLessThan(String value) {
            addCriterion("serviceCode <", value, "servicecode");
            return (Criteria) this;
        }

        public Criteria andServicecodeLessThanOrEqualTo(String value) {
            addCriterion("serviceCode <=", value, "servicecode");
            return (Criteria) this;
        }

        public Criteria andServicecodeLike(String value) {
            addCriterion("serviceCode like", value, "servicecode");
            return (Criteria) this;
        }

        public Criteria andServicecodeNotLike(String value) {
            addCriterion("serviceCode not like", value, "servicecode");
            return (Criteria) this;
        }

        public Criteria andServicecodeIn(List<String> values) {
            addCriterion("serviceCode in", values, "servicecode");
            return (Criteria) this;
        }

        public Criteria andServicecodeNotIn(List<String> values) {
            addCriterion("serviceCode not in", values, "servicecode");
            return (Criteria) this;
        }

        public Criteria andServicecodeBetween(String value1, String value2) {
            addCriterion("serviceCode between", value1, value2, "servicecode");
            return (Criteria) this;
        }

        public Criteria andServicecodeNotBetween(String value1, String value2) {
            addCriterion("serviceCode not between", value1, value2, "servicecode");
            return (Criteria) this;
        }

        public Criteria andXilainoIsNull() {
            addCriterion("xilaiNO is null");
            return (Criteria) this;
        }

        public Criteria andXilainoIsNotNull() {
            addCriterion("xilaiNO is not null");
            return (Criteria) this;
        }

        public Criteria andXilainoEqualTo(String value) {
            addCriterion("xilaiNO =", value, "xilaino");
            return (Criteria) this;
        }

        public Criteria andXilainoNotEqualTo(String value) {
            addCriterion("xilaiNO <>", value, "xilaino");
            return (Criteria) this;
        }

        public Criteria andXilainoGreaterThan(String value) {
            addCriterion("xilaiNO >", value, "xilaino");
            return (Criteria) this;
        }

        public Criteria andXilainoGreaterThanOrEqualTo(String value) {
            addCriterion("xilaiNO >=", value, "xilaino");
            return (Criteria) this;
        }

        public Criteria andXilainoLessThan(String value) {
            addCriterion("xilaiNO <", value, "xilaino");
            return (Criteria) this;
        }

        public Criteria andXilainoLessThanOrEqualTo(String value) {
            addCriterion("xilaiNO <=", value, "xilaino");
            return (Criteria) this;
        }

        public Criteria andXilainoLike(String value) {
            addCriterion("xilaiNO like", value, "xilaino");
            return (Criteria) this;
        }

        public Criteria andXilainoNotLike(String value) {
            addCriterion("xilaiNO not like", value, "xilaino");
            return (Criteria) this;
        }

        public Criteria andXilainoIn(List<String> values) {
            addCriterion("xilaiNO in", values, "xilaino");
            return (Criteria) this;
        }

        public Criteria andXilainoNotIn(List<String> values) {
            addCriterion("xilaiNO not in", values, "xilaino");
            return (Criteria) this;
        }

        public Criteria andXilainoBetween(String value1, String value2) {
            addCriterion("xilaiNO between", value1, value2, "xilaino");
            return (Criteria) this;
        }

        public Criteria andXilainoNotBetween(String value1, String value2) {
            addCriterion("xilaiNO not between", value1, value2, "xilaino");
            return (Criteria) this;
        }

        public Criteria andSendnameIsNull() {
            addCriterion("sendName is null");
            return (Criteria) this;
        }

        public Criteria andSendnameIsNotNull() {
            addCriterion("sendName is not null");
            return (Criteria) this;
        }

        public Criteria andSendnameEqualTo(String value) {
            addCriterion("sendName =", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotEqualTo(String value) {
            addCriterion("sendName <>", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameGreaterThan(String value) {
            addCriterion("sendName >", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameGreaterThanOrEqualTo(String value) {
            addCriterion("sendName >=", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameLessThan(String value) {
            addCriterion("sendName <", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameLessThanOrEqualTo(String value) {
            addCriterion("sendName <=", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameLike(String value) {
            addCriterion("sendName like", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotLike(String value) {
            addCriterion("sendName not like", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameIn(List<String> values) {
            addCriterion("sendName in", values, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotIn(List<String> values) {
            addCriterion("sendName not in", values, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameBetween(String value1, String value2) {
            addCriterion("sendName between", value1, value2, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotBetween(String value1, String value2) {
            addCriterion("sendName not between", value1, value2, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendphoneIsNull() {
            addCriterion("sendPhone is null");
            return (Criteria) this;
        }

        public Criteria andSendphoneIsNotNull() {
            addCriterion("sendPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSendphoneEqualTo(String value) {
            addCriterion("sendPhone =", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotEqualTo(String value) {
            addCriterion("sendPhone <>", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneGreaterThan(String value) {
            addCriterion("sendPhone >", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneGreaterThanOrEqualTo(String value) {
            addCriterion("sendPhone >=", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLessThan(String value) {
            addCriterion("sendPhone <", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLessThanOrEqualTo(String value) {
            addCriterion("sendPhone <=", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLike(String value) {
            addCriterion("sendPhone like", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotLike(String value) {
            addCriterion("sendPhone not like", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneIn(List<String> values) {
            addCriterion("sendPhone in", values, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotIn(List<String> values) {
            addCriterion("sendPhone not in", values, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneBetween(String value1, String value2) {
            addCriterion("sendPhone between", value1, value2, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotBetween(String value1, String value2) {
            addCriterion("sendPhone not between", value1, value2, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendcitycodeIsNull() {
            addCriterion("sendCityCode is null");
            return (Criteria) this;
        }

        public Criteria andSendcitycodeIsNotNull() {
            addCriterion("sendCityCode is not null");
            return (Criteria) this;
        }

        public Criteria andSendcitycodeEqualTo(Integer value) {
            addCriterion("sendCityCode =", value, "sendcitycode");
            return (Criteria) this;
        }

        public Criteria andSendcitycodeNotEqualTo(Integer value) {
            addCriterion("sendCityCode <>", value, "sendcitycode");
            return (Criteria) this;
        }

        public Criteria andSendcitycodeGreaterThan(Integer value) {
            addCriterion("sendCityCode >", value, "sendcitycode");
            return (Criteria) this;
        }

        public Criteria andSendcitycodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendCityCode >=", value, "sendcitycode");
            return (Criteria) this;
        }

        public Criteria andSendcitycodeLessThan(Integer value) {
            addCriterion("sendCityCode <", value, "sendcitycode");
            return (Criteria) this;
        }

        public Criteria andSendcitycodeLessThanOrEqualTo(Integer value) {
            addCriterion("sendCityCode <=", value, "sendcitycode");
            return (Criteria) this;
        }

        public Criteria andSendcitycodeIn(List<Integer> values) {
            addCriterion("sendCityCode in", values, "sendcitycode");
            return (Criteria) this;
        }

        public Criteria andSendcitycodeNotIn(List<Integer> values) {
            addCriterion("sendCityCode not in", values, "sendcitycode");
            return (Criteria) this;
        }

        public Criteria andSendcitycodeBetween(Integer value1, Integer value2) {
            addCriterion("sendCityCode between", value1, value2, "sendcitycode");
            return (Criteria) this;
        }

        public Criteria andSendcitycodeNotBetween(Integer value1, Integer value2) {
            addCriterion("sendCityCode not between", value1, value2, "sendcitycode");
            return (Criteria) this;
        }

        public Criteria andSendaddressIsNull() {
            addCriterion("sendAddress is null");
            return (Criteria) this;
        }

        public Criteria andSendaddressIsNotNull() {
            addCriterion("sendAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSendaddressEqualTo(String value) {
            addCriterion("sendAddress =", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotEqualTo(String value) {
            addCriterion("sendAddress <>", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressGreaterThan(String value) {
            addCriterion("sendAddress >", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressGreaterThanOrEqualTo(String value) {
            addCriterion("sendAddress >=", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLessThan(String value) {
            addCriterion("sendAddress <", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLessThanOrEqualTo(String value) {
            addCriterion("sendAddress <=", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLike(String value) {
            addCriterion("sendAddress like", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotLike(String value) {
            addCriterion("sendAddress not like", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressIn(List<String> values) {
            addCriterion("sendAddress in", values, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotIn(List<String> values) {
            addCriterion("sendAddress not in", values, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressBetween(String value1, String value2) {
            addCriterion("sendAddress between", value1, value2, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotBetween(String value1, String value2) {
            addCriterion("sendAddress not between", value1, value2, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddlonIsNull() {
            addCriterion("sendAddLon is null");
            return (Criteria) this;
        }

        public Criteria andSendaddlonIsNotNull() {
            addCriterion("sendAddLon is not null");
            return (Criteria) this;
        }

        public Criteria andSendaddlonEqualTo(Double value) {
            addCriterion("sendAddLon =", value, "sendaddlon");
            return (Criteria) this;
        }

        public Criteria andSendaddlonNotEqualTo(Double value) {
            addCriterion("sendAddLon <>", value, "sendaddlon");
            return (Criteria) this;
        }

        public Criteria andSendaddlonGreaterThan(Double value) {
            addCriterion("sendAddLon >", value, "sendaddlon");
            return (Criteria) this;
        }

        public Criteria andSendaddlonGreaterThanOrEqualTo(Double value) {
            addCriterion("sendAddLon >=", value, "sendaddlon");
            return (Criteria) this;
        }

        public Criteria andSendaddlonLessThan(Double value) {
            addCriterion("sendAddLon <", value, "sendaddlon");
            return (Criteria) this;
        }

        public Criteria andSendaddlonLessThanOrEqualTo(Double value) {
            addCriterion("sendAddLon <=", value, "sendaddlon");
            return (Criteria) this;
        }

        public Criteria andSendaddlonIn(List<Double> values) {
            addCriterion("sendAddLon in", values, "sendaddlon");
            return (Criteria) this;
        }

        public Criteria andSendaddlonNotIn(List<Double> values) {
            addCriterion("sendAddLon not in", values, "sendaddlon");
            return (Criteria) this;
        }

        public Criteria andSendaddlonBetween(Double value1, Double value2) {
            addCriterion("sendAddLon between", value1, value2, "sendaddlon");
            return (Criteria) this;
        }

        public Criteria andSendaddlonNotBetween(Double value1, Double value2) {
            addCriterion("sendAddLon not between", value1, value2, "sendaddlon");
            return (Criteria) this;
        }

        public Criteria andSendaddlatIsNull() {
            addCriterion("sendAddLat is null");
            return (Criteria) this;
        }

        public Criteria andSendaddlatIsNotNull() {
            addCriterion("sendAddLat is not null");
            return (Criteria) this;
        }

        public Criteria andSendaddlatEqualTo(Double value) {
            addCriterion("sendAddLat =", value, "sendaddlat");
            return (Criteria) this;
        }

        public Criteria andSendaddlatNotEqualTo(Double value) {
            addCriterion("sendAddLat <>", value, "sendaddlat");
            return (Criteria) this;
        }

        public Criteria andSendaddlatGreaterThan(Double value) {
            addCriterion("sendAddLat >", value, "sendaddlat");
            return (Criteria) this;
        }

        public Criteria andSendaddlatGreaterThanOrEqualTo(Double value) {
            addCriterion("sendAddLat >=", value, "sendaddlat");
            return (Criteria) this;
        }

        public Criteria andSendaddlatLessThan(Double value) {
            addCriterion("sendAddLat <", value, "sendaddlat");
            return (Criteria) this;
        }

        public Criteria andSendaddlatLessThanOrEqualTo(Double value) {
            addCriterion("sendAddLat <=", value, "sendaddlat");
            return (Criteria) this;
        }

        public Criteria andSendaddlatIn(List<Double> values) {
            addCriterion("sendAddLat in", values, "sendaddlat");
            return (Criteria) this;
        }

        public Criteria andSendaddlatNotIn(List<Double> values) {
            addCriterion("sendAddLat not in", values, "sendaddlat");
            return (Criteria) this;
        }

        public Criteria andSendaddlatBetween(Double value1, Double value2) {
            addCriterion("sendAddLat between", value1, value2, "sendaddlat");
            return (Criteria) this;
        }

        public Criteria andSendaddlatNotBetween(Double value1, Double value2) {
            addCriterion("sendAddLat not between", value1, value2, "sendaddlat");
            return (Criteria) this;
        }

        public Criteria andSendcardidIsNull() {
            addCriterion("sendCardId is null");
            return (Criteria) this;
        }

        public Criteria andSendcardidIsNotNull() {
            addCriterion("sendCardId is not null");
            return (Criteria) this;
        }

        public Criteria andSendcardidEqualTo(String value) {
            addCriterion("sendCardId =", value, "sendcardid");
            return (Criteria) this;
        }

        public Criteria andSendcardidNotEqualTo(String value) {
            addCriterion("sendCardId <>", value, "sendcardid");
            return (Criteria) this;
        }

        public Criteria andSendcardidGreaterThan(String value) {
            addCriterion("sendCardId >", value, "sendcardid");
            return (Criteria) this;
        }

        public Criteria andSendcardidGreaterThanOrEqualTo(String value) {
            addCriterion("sendCardId >=", value, "sendcardid");
            return (Criteria) this;
        }

        public Criteria andSendcardidLessThan(String value) {
            addCriterion("sendCardId <", value, "sendcardid");
            return (Criteria) this;
        }

        public Criteria andSendcardidLessThanOrEqualTo(String value) {
            addCriterion("sendCardId <=", value, "sendcardid");
            return (Criteria) this;
        }

        public Criteria andSendcardidLike(String value) {
            addCriterion("sendCardId like", value, "sendcardid");
            return (Criteria) this;
        }

        public Criteria andSendcardidNotLike(String value) {
            addCriterion("sendCardId not like", value, "sendcardid");
            return (Criteria) this;
        }

        public Criteria andSendcardidIn(List<String> values) {
            addCriterion("sendCardId in", values, "sendcardid");
            return (Criteria) this;
        }

        public Criteria andSendcardidNotIn(List<String> values) {
            addCriterion("sendCardId not in", values, "sendcardid");
            return (Criteria) this;
        }

        public Criteria andSendcardidBetween(String value1, String value2) {
            addCriterion("sendCardId between", value1, value2, "sendcardid");
            return (Criteria) this;
        }

        public Criteria andSendcardidNotBetween(String value1, String value2) {
            addCriterion("sendCardId not between", value1, value2, "sendcardid");
            return (Criteria) this;
        }

        public Criteria andSendcompanyIsNull() {
            addCriterion("sendCompany is null");
            return (Criteria) this;
        }

        public Criteria andSendcompanyIsNotNull() {
            addCriterion("sendCompany is not null");
            return (Criteria) this;
        }

        public Criteria andSendcompanyEqualTo(String value) {
            addCriterion("sendCompany =", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyNotEqualTo(String value) {
            addCriterion("sendCompany <>", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyGreaterThan(String value) {
            addCriterion("sendCompany >", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("sendCompany >=", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyLessThan(String value) {
            addCriterion("sendCompany <", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyLessThanOrEqualTo(String value) {
            addCriterion("sendCompany <=", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyLike(String value) {
            addCriterion("sendCompany like", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyNotLike(String value) {
            addCriterion("sendCompany not like", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyIn(List<String> values) {
            addCriterion("sendCompany in", values, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyNotIn(List<String> values) {
            addCriterion("sendCompany not in", values, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyBetween(String value1, String value2) {
            addCriterion("sendCompany between", value1, value2, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyNotBetween(String value1, String value2) {
            addCriterion("sendCompany not between", value1, value2, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andTakenameIsNull() {
            addCriterion("takeName is null");
            return (Criteria) this;
        }

        public Criteria andTakenameIsNotNull() {
            addCriterion("takeName is not null");
            return (Criteria) this;
        }

        public Criteria andTakenameEqualTo(String value) {
            addCriterion("takeName =", value, "takename");
            return (Criteria) this;
        }

        public Criteria andTakenameNotEqualTo(String value) {
            addCriterion("takeName <>", value, "takename");
            return (Criteria) this;
        }

        public Criteria andTakenameGreaterThan(String value) {
            addCriterion("takeName >", value, "takename");
            return (Criteria) this;
        }

        public Criteria andTakenameGreaterThanOrEqualTo(String value) {
            addCriterion("takeName >=", value, "takename");
            return (Criteria) this;
        }

        public Criteria andTakenameLessThan(String value) {
            addCriterion("takeName <", value, "takename");
            return (Criteria) this;
        }

        public Criteria andTakenameLessThanOrEqualTo(String value) {
            addCriterion("takeName <=", value, "takename");
            return (Criteria) this;
        }

        public Criteria andTakenameLike(String value) {
            addCriterion("takeName like", value, "takename");
            return (Criteria) this;
        }

        public Criteria andTakenameNotLike(String value) {
            addCriterion("takeName not like", value, "takename");
            return (Criteria) this;
        }

        public Criteria andTakenameIn(List<String> values) {
            addCriterion("takeName in", values, "takename");
            return (Criteria) this;
        }

        public Criteria andTakenameNotIn(List<String> values) {
            addCriterion("takeName not in", values, "takename");
            return (Criteria) this;
        }

        public Criteria andTakenameBetween(String value1, String value2) {
            addCriterion("takeName between", value1, value2, "takename");
            return (Criteria) this;
        }

        public Criteria andTakenameNotBetween(String value1, String value2) {
            addCriterion("takeName not between", value1, value2, "takename");
            return (Criteria) this;
        }

        public Criteria andTakephoneIsNull() {
            addCriterion("takePhone is null");
            return (Criteria) this;
        }

        public Criteria andTakephoneIsNotNull() {
            addCriterion("takePhone is not null");
            return (Criteria) this;
        }

        public Criteria andTakephoneEqualTo(String value) {
            addCriterion("takePhone =", value, "takephone");
            return (Criteria) this;
        }

        public Criteria andTakephoneNotEqualTo(String value) {
            addCriterion("takePhone <>", value, "takephone");
            return (Criteria) this;
        }

        public Criteria andTakephoneGreaterThan(String value) {
            addCriterion("takePhone >", value, "takephone");
            return (Criteria) this;
        }

        public Criteria andTakephoneGreaterThanOrEqualTo(String value) {
            addCriterion("takePhone >=", value, "takephone");
            return (Criteria) this;
        }

        public Criteria andTakephoneLessThan(String value) {
            addCriterion("takePhone <", value, "takephone");
            return (Criteria) this;
        }

        public Criteria andTakephoneLessThanOrEqualTo(String value) {
            addCriterion("takePhone <=", value, "takephone");
            return (Criteria) this;
        }

        public Criteria andTakephoneLike(String value) {
            addCriterion("takePhone like", value, "takephone");
            return (Criteria) this;
        }

        public Criteria andTakephoneNotLike(String value) {
            addCriterion("takePhone not like", value, "takephone");
            return (Criteria) this;
        }

        public Criteria andTakephoneIn(List<String> values) {
            addCriterion("takePhone in", values, "takephone");
            return (Criteria) this;
        }

        public Criteria andTakephoneNotIn(List<String> values) {
            addCriterion("takePhone not in", values, "takephone");
            return (Criteria) this;
        }

        public Criteria andTakephoneBetween(String value1, String value2) {
            addCriterion("takePhone between", value1, value2, "takephone");
            return (Criteria) this;
        }

        public Criteria andTakephoneNotBetween(String value1, String value2) {
            addCriterion("takePhone not between", value1, value2, "takephone");
            return (Criteria) this;
        }

        public Criteria andTakecitycodeIsNull() {
            addCriterion("takeCityCode is null");
            return (Criteria) this;
        }

        public Criteria andTakecitycodeIsNotNull() {
            addCriterion("takeCityCode is not null");
            return (Criteria) this;
        }

        public Criteria andTakecitycodeEqualTo(Integer value) {
            addCriterion("takeCityCode =", value, "takecitycode");
            return (Criteria) this;
        }

        public Criteria andTakecitycodeNotEqualTo(Integer value) {
            addCriterion("takeCityCode <>", value, "takecitycode");
            return (Criteria) this;
        }

        public Criteria andTakecitycodeGreaterThan(Integer value) {
            addCriterion("takeCityCode >", value, "takecitycode");
            return (Criteria) this;
        }

        public Criteria andTakecitycodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("takeCityCode >=", value, "takecitycode");
            return (Criteria) this;
        }

        public Criteria andTakecitycodeLessThan(Integer value) {
            addCriterion("takeCityCode <", value, "takecitycode");
            return (Criteria) this;
        }

        public Criteria andTakecitycodeLessThanOrEqualTo(Integer value) {
            addCriterion("takeCityCode <=", value, "takecitycode");
            return (Criteria) this;
        }

        public Criteria andTakecitycodeIn(List<Integer> values) {
            addCriterion("takeCityCode in", values, "takecitycode");
            return (Criteria) this;
        }

        public Criteria andTakecitycodeNotIn(List<Integer> values) {
            addCriterion("takeCityCode not in", values, "takecitycode");
            return (Criteria) this;
        }

        public Criteria andTakecitycodeBetween(Integer value1, Integer value2) {
            addCriterion("takeCityCode between", value1, value2, "takecitycode");
            return (Criteria) this;
        }

        public Criteria andTakecitycodeNotBetween(Integer value1, Integer value2) {
            addCriterion("takeCityCode not between", value1, value2, "takecitycode");
            return (Criteria) this;
        }

        public Criteria andTakeaddressIsNull() {
            addCriterion("takeAddress is null");
            return (Criteria) this;
        }

        public Criteria andTakeaddressIsNotNull() {
            addCriterion("takeAddress is not null");
            return (Criteria) this;
        }

        public Criteria andTakeaddressEqualTo(String value) {
            addCriterion("takeAddress =", value, "takeaddress");
            return (Criteria) this;
        }

        public Criteria andTakeaddressNotEqualTo(String value) {
            addCriterion("takeAddress <>", value, "takeaddress");
            return (Criteria) this;
        }

        public Criteria andTakeaddressGreaterThan(String value) {
            addCriterion("takeAddress >", value, "takeaddress");
            return (Criteria) this;
        }

        public Criteria andTakeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("takeAddress >=", value, "takeaddress");
            return (Criteria) this;
        }

        public Criteria andTakeaddressLessThan(String value) {
            addCriterion("takeAddress <", value, "takeaddress");
            return (Criteria) this;
        }

        public Criteria andTakeaddressLessThanOrEqualTo(String value) {
            addCriterion("takeAddress <=", value, "takeaddress");
            return (Criteria) this;
        }

        public Criteria andTakeaddressLike(String value) {
            addCriterion("takeAddress like", value, "takeaddress");
            return (Criteria) this;
        }

        public Criteria andTakeaddressNotLike(String value) {
            addCriterion("takeAddress not like", value, "takeaddress");
            return (Criteria) this;
        }

        public Criteria andTakeaddressIn(List<String> values) {
            addCriterion("takeAddress in", values, "takeaddress");
            return (Criteria) this;
        }

        public Criteria andTakeaddressNotIn(List<String> values) {
            addCriterion("takeAddress not in", values, "takeaddress");
            return (Criteria) this;
        }

        public Criteria andTakeaddressBetween(String value1, String value2) {
            addCriterion("takeAddress between", value1, value2, "takeaddress");
            return (Criteria) this;
        }

        public Criteria andTakeaddressNotBetween(String value1, String value2) {
            addCriterion("takeAddress not between", value1, value2, "takeaddress");
            return (Criteria) this;
        }

        public Criteria andTakeaddlonIsNull() {
            addCriterion("takeAddLon is null");
            return (Criteria) this;
        }

        public Criteria andTakeaddlonIsNotNull() {
            addCriterion("takeAddLon is not null");
            return (Criteria) this;
        }

        public Criteria andTakeaddlonEqualTo(Double value) {
            addCriterion("takeAddLon =", value, "takeaddlon");
            return (Criteria) this;
        }

        public Criteria andTakeaddlonNotEqualTo(Double value) {
            addCriterion("takeAddLon <>", value, "takeaddlon");
            return (Criteria) this;
        }

        public Criteria andTakeaddlonGreaterThan(Double value) {
            addCriterion("takeAddLon >", value, "takeaddlon");
            return (Criteria) this;
        }

        public Criteria andTakeaddlonGreaterThanOrEqualTo(Double value) {
            addCriterion("takeAddLon >=", value, "takeaddlon");
            return (Criteria) this;
        }

        public Criteria andTakeaddlonLessThan(Double value) {
            addCriterion("takeAddLon <", value, "takeaddlon");
            return (Criteria) this;
        }

        public Criteria andTakeaddlonLessThanOrEqualTo(Double value) {
            addCriterion("takeAddLon <=", value, "takeaddlon");
            return (Criteria) this;
        }

        public Criteria andTakeaddlonIn(List<Double> values) {
            addCriterion("takeAddLon in", values, "takeaddlon");
            return (Criteria) this;
        }

        public Criteria andTakeaddlonNotIn(List<Double> values) {
            addCriterion("takeAddLon not in", values, "takeaddlon");
            return (Criteria) this;
        }

        public Criteria andTakeaddlonBetween(Double value1, Double value2) {
            addCriterion("takeAddLon between", value1, value2, "takeaddlon");
            return (Criteria) this;
        }

        public Criteria andTakeaddlonNotBetween(Double value1, Double value2) {
            addCriterion("takeAddLon not between", value1, value2, "takeaddlon");
            return (Criteria) this;
        }

        public Criteria andTakeaddlaIsNull() {
            addCriterion("takeAddLa is null");
            return (Criteria) this;
        }

        public Criteria andTakeaddlaIsNotNull() {
            addCriterion("takeAddLa is not null");
            return (Criteria) this;
        }

        public Criteria andTakeaddlaEqualTo(Double value) {
            addCriterion("takeAddLa =", value, "takeaddla");
            return (Criteria) this;
        }

        public Criteria andTakeaddlaNotEqualTo(Double value) {
            addCriterion("takeAddLa <>", value, "takeaddla");
            return (Criteria) this;
        }

        public Criteria andTakeaddlaGreaterThan(Double value) {
            addCriterion("takeAddLa >", value, "takeaddla");
            return (Criteria) this;
        }

        public Criteria andTakeaddlaGreaterThanOrEqualTo(Double value) {
            addCriterion("takeAddLa >=", value, "takeaddla");
            return (Criteria) this;
        }

        public Criteria andTakeaddlaLessThan(Double value) {
            addCriterion("takeAddLa <", value, "takeaddla");
            return (Criteria) this;
        }

        public Criteria andTakeaddlaLessThanOrEqualTo(Double value) {
            addCriterion("takeAddLa <=", value, "takeaddla");
            return (Criteria) this;
        }

        public Criteria andTakeaddlaIn(List<Double> values) {
            addCriterion("takeAddLa in", values, "takeaddla");
            return (Criteria) this;
        }

        public Criteria andTakeaddlaNotIn(List<Double> values) {
            addCriterion("takeAddLa not in", values, "takeaddla");
            return (Criteria) this;
        }

        public Criteria andTakeaddlaBetween(Double value1, Double value2) {
            addCriterion("takeAddLa between", value1, value2, "takeaddla");
            return (Criteria) this;
        }

        public Criteria andTakeaddlaNotBetween(Double value1, Double value2) {
            addCriterion("takeAddLa not between", value1, value2, "takeaddla");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIsNull() {
            addCriterion("activityType is null");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIsNotNull() {
            addCriterion("activityType is not null");
            return (Criteria) this;
        }

        public Criteria andActivitytypeEqualTo(Integer value) {
            addCriterion("activityType =", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotEqualTo(Integer value) {
            addCriterion("activityType <>", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeGreaterThan(Integer value) {
            addCriterion("activityType >", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("activityType >=", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLessThan(Integer value) {
            addCriterion("activityType <", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeLessThanOrEqualTo(Integer value) {
            addCriterion("activityType <=", value, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeIn(List<Integer> values) {
            addCriterion("activityType in", values, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotIn(List<Integer> values) {
            addCriterion("activityType not in", values, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeBetween(Integer value1, Integer value2) {
            addCriterion("activityType between", value1, value2, "activitytype");
            return (Criteria) this;
        }

        public Criteria andActivitytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("activityType not between", value1, value2, "activitytype");
            return (Criteria) this;
        }

        public Criteria andSenddateIsNull() {
            addCriterion("sendDate is null");
            return (Criteria) this;
        }

        public Criteria andSenddateIsNotNull() {
            addCriterion("sendDate is not null");
            return (Criteria) this;
        }

        public Criteria andSenddateEqualTo(Date value) {
            addCriterion("sendDate =", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateNotEqualTo(Date value) {
            addCriterion("sendDate <>", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateGreaterThan(Date value) {
            addCriterion("sendDate >", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("sendDate >=", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateLessThan(Date value) {
            addCriterion("sendDate <", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateLessThanOrEqualTo(Date value) {
            addCriterion("sendDate <=", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateIn(List<Date> values) {
            addCriterion("sendDate in", values, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateNotIn(List<Date> values) {
            addCriterion("sendDate not in", values, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateBetween(Date value1, Date value2) {
            addCriterion("sendDate between", value1, value2, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateNotBetween(Date value1, Date value2) {
            addCriterion("sendDate not between", value1, value2, "senddate");
            return (Criteria) this;
        }

        public Criteria andTakedateIsNull() {
            addCriterion("takeDate is null");
            return (Criteria) this;
        }

        public Criteria andTakedateIsNotNull() {
            addCriterion("takeDate is not null");
            return (Criteria) this;
        }

        public Criteria andTakedateEqualTo(Date value) {
            addCriterion("takeDate =", value, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateNotEqualTo(Date value) {
            addCriterion("takeDate <>", value, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateGreaterThan(Date value) {
            addCriterion("takeDate >", value, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateGreaterThanOrEqualTo(Date value) {
            addCriterion("takeDate >=", value, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateLessThan(Date value) {
            addCriterion("takeDate <", value, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateLessThanOrEqualTo(Date value) {
            addCriterion("takeDate <=", value, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateIn(List<Date> values) {
            addCriterion("takeDate in", values, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateNotIn(List<Date> values) {
            addCriterion("takeDate not in", values, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateBetween(Date value1, Date value2) {
            addCriterion("takeDate between", value1, value2, "takedate");
            return (Criteria) this;
        }

        public Criteria andTakedateNotBetween(Date value1, Date value2) {
            addCriterion("takeDate not between", value1, value2, "takedate");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourcecodeIsNull() {
            addCriterion("sourceCode is null");
            return (Criteria) this;
        }

        public Criteria andSourcecodeIsNotNull() {
            addCriterion("sourceCode is not null");
            return (Criteria) this;
        }

        public Criteria andSourcecodeEqualTo(String value) {
            addCriterion("sourceCode =", value, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeNotEqualTo(String value) {
            addCriterion("sourceCode <>", value, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeGreaterThan(String value) {
            addCriterion("sourceCode >", value, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeGreaterThanOrEqualTo(String value) {
            addCriterion("sourceCode >=", value, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeLessThan(String value) {
            addCriterion("sourceCode <", value, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeLessThanOrEqualTo(String value) {
            addCriterion("sourceCode <=", value, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeLike(String value) {
            addCriterion("sourceCode like", value, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeNotLike(String value) {
            addCriterion("sourceCode not like", value, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeIn(List<String> values) {
            addCriterion("sourceCode in", values, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeNotIn(List<String> values) {
            addCriterion("sourceCode not in", values, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeBetween(String value1, String value2) {
            addCriterion("sourceCode between", value1, value2, "sourcecode");
            return (Criteria) this;
        }

        public Criteria andSourcecodeNotBetween(String value1, String value2) {
            addCriterion("sourceCode not between", value1, value2, "sourcecode");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsvipIsNull() {
            addCriterion("isVIP is null");
            return (Criteria) this;
        }

        public Criteria andIsvipIsNotNull() {
            addCriterion("isVIP is not null");
            return (Criteria) this;
        }

        public Criteria andIsvipEqualTo(Integer value) {
            addCriterion("isVIP =", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotEqualTo(Integer value) {
            addCriterion("isVIP <>", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipGreaterThan(Integer value) {
            addCriterion("isVIP >", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipGreaterThanOrEqualTo(Integer value) {
            addCriterion("isVIP >=", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipLessThan(Integer value) {
            addCriterion("isVIP <", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipLessThanOrEqualTo(Integer value) {
            addCriterion("isVIP <=", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipIn(List<Integer> values) {
            addCriterion("isVIP in", values, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotIn(List<Integer> values) {
            addCriterion("isVIP not in", values, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipBetween(Integer value1, Integer value2) {
            addCriterion("isVIP between", value1, value2, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotBetween(Integer value1, Integer value2) {
            addCriterion("isVIP not between", value1, value2, "isvip");
            return (Criteria) this;
        }

        public Criteria andLoginucIsNull() {
            addCriterion("loginUC is null");
            return (Criteria) this;
        }

        public Criteria andLoginucIsNotNull() {
            addCriterion("loginUC is not null");
            return (Criteria) this;
        }

        public Criteria andLoginucEqualTo(String value) {
            addCriterion("loginUC =", value, "loginuc");
            return (Criteria) this;
        }

        public Criteria andLoginucNotEqualTo(String value) {
            addCriterion("loginUC <>", value, "loginuc");
            return (Criteria) this;
        }

        public Criteria andLoginucGreaterThan(String value) {
            addCriterion("loginUC >", value, "loginuc");
            return (Criteria) this;
        }

        public Criteria andLoginucGreaterThanOrEqualTo(String value) {
            addCriterion("loginUC >=", value, "loginuc");
            return (Criteria) this;
        }

        public Criteria andLoginucLessThan(String value) {
            addCriterion("loginUC <", value, "loginuc");
            return (Criteria) this;
        }

        public Criteria andLoginucLessThanOrEqualTo(String value) {
            addCriterion("loginUC <=", value, "loginuc");
            return (Criteria) this;
        }

        public Criteria andLoginucLike(String value) {
            addCriterion("loginUC like", value, "loginuc");
            return (Criteria) this;
        }

        public Criteria andLoginucNotLike(String value) {
            addCriterion("loginUC not like", value, "loginuc");
            return (Criteria) this;
        }

        public Criteria andLoginucIn(List<String> values) {
            addCriterion("loginUC in", values, "loginuc");
            return (Criteria) this;
        }

        public Criteria andLoginucNotIn(List<String> values) {
            addCriterion("loginUC not in", values, "loginuc");
            return (Criteria) this;
        }

        public Criteria andLoginucBetween(String value1, String value2) {
            addCriterion("loginUC between", value1, value2, "loginuc");
            return (Criteria) this;
        }

        public Criteria andLoginucNotBetween(String value1, String value2) {
            addCriterion("loginUC not between", value1, value2, "loginuc");
            return (Criteria) this;
        }

        public Criteria andSendcityIsNull() {
            addCriterion("sendCity is null");
            return (Criteria) this;
        }

        public Criteria andSendcityIsNotNull() {
            addCriterion("sendCity is not null");
            return (Criteria) this;
        }

        public Criteria andSendcityEqualTo(String value) {
            addCriterion("sendCity =", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityNotEqualTo(String value) {
            addCriterion("sendCity <>", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityGreaterThan(String value) {
            addCriterion("sendCity >", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityGreaterThanOrEqualTo(String value) {
            addCriterion("sendCity >=", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityLessThan(String value) {
            addCriterion("sendCity <", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityLessThanOrEqualTo(String value) {
            addCriterion("sendCity <=", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityLike(String value) {
            addCriterion("sendCity like", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityNotLike(String value) {
            addCriterion("sendCity not like", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityIn(List<String> values) {
            addCriterion("sendCity in", values, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityNotIn(List<String> values) {
            addCriterion("sendCity not in", values, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityBetween(String value1, String value2) {
            addCriterion("sendCity between", value1, value2, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityNotBetween(String value1, String value2) {
            addCriterion("sendCity not between", value1, value2, "sendcity");
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