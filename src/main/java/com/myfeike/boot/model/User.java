package com.myfeike.boot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.myfeike.boot.model.base.BaseModel;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用户实体
 *
 * @author izerui.com
 */
@Entity
@Table(name = "SYS_USER")
public class User extends BaseModel {

    private static final long serialVersionUID = 1L;


    //登录密码
    private String password;
    //真实名称
    private String realname;

    //状态
    private Integer state = 1;


    //邮件
    private String email;

    /**
     * 生日
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDay;
    /**
     * 是否为农历
     */
    private boolean isLunarCalendar = false;

    /**
     * 入职日期
     */
    private Date entryDay;

    /**
     * 拼音
     */
    private String spell;

    /**
     * 简拼
     */
    private String shortSpell;


    /**
     * 工号
     */
    private String userNo;

    /**
     * 个人手机号
     */
    private String mobile;


    /**
     * 工作固话
     */
    private String workTel;

    /**
     * 家庭固话
     */
    private String familyTel;

    /**
     * 家庭地址
     */
    private String familyAddr;

    /**
     * 传真
     */
    private String fax;

    /**
     * 用户性别
     */
    private Integer gender = 0;

    private String genderStr;


    /**
     * 所属默认部门
     */
    private String defaultDeptId;

    /**
     * 所在部门 允许用户属于多个部门
     */
    private List<Dept> deptList = new ArrayList<Dept>();

    /**
     * 机密等级
     */
    private Integer secretLevel = 0;


    //用户头像
    private String portrait;

    //QQ号
    private String qq;

    //msn号
    private String msn;

    /**
     * 构造方法
     */
    public User() {

    }

 
    /**
     * 获取登录密码
     *
     * @return String
     */
    @Column(name = "FD_PASSWORD", nullable = false, length = 32)
    public String getPassword() {
        return password;
    }

    /**
     * 设置登录密码
     *
     * @param password 登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取真实姓名
     *
     * @return String
     */
    @Column(name = "FD_REALNAME", length = 64, nullable = false)
    public String getRealname() {
        return realname;
    }

    /**
     * 设置真实名称
     *
     * @param realname 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }


    /**
     * 获取用户状态
     *
     */
    @Column(name = "FD_STATE", nullable = false, length = 1)
    public Integer getState() {
        return state;
    }

    /**
     * 设置用户状态
     *
     * @param state 用户状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取邮件
     *
     * @return String
     */
    @Column(name = "FD_EMAIL", length = 128)
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮件
     *
     * @param email 邮件地址
     */
    public void setEmail(String email) {
        this.email = email;
    }



    /**
     * 获取用户头像
     *
     * @return String
     */
    @Column(name = "FD_PORTRAIT", length = 254)
    public String getPortrait() {
        return portrait;
    }

    /**
     * 设置用户头像
     *
     * @param portrait 头像
     */
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }


    /**
     * @return the spell
     */
    @Column(name = "FD_SPELL", length = 64)
    public String getSpell() {
        return spell;
    }

    /**
     * @param spell the spell to set
     */
    public void setSpell(String spell) {
        this.spell = spell;
    }

    /**
     * @return the shortSpell
     */
    @Column(name = "FD_SHORT_SPELL", length = 64)
    public String getShortSpell() {
        return shortSpell;
    }

    /**
     * @param shortSpell the shortSpell to set
     */
    public void setShortSpell(String shortSpell) {
        this.shortSpell = shortSpell;
    }

    /**
     * @return the userNo
     */
    @Column(name = "FD_USER_NO", length = 32)
    public String getUserNo() {
        return userNo;
    }

    /**
     * @param userNo the userNo to set
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * @return the mobile
     */
    @Column(name = "FD_MOBILE", length = 32)
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the workTel
     */
    @Column(name = "FD_WORK_TEL", length = 32)
    public String getWorkTel() {
        return workTel;
    }

    /**
     * @param workTel the workTel to set
     */
    public void setWorkTel(String workTel) {
        this.workTel = workTel;
    }

    /**
     * @return the familyTel
     */
    @Column(name = "FD_FAMILY_TEL", length = 32)
    public String getFamilyTel() {
        return familyTel;
    }

    /**
     * @param familyTel the familyTel to set
     */
    public void setFamilyTel(String familyTel) {
        this.familyTel = familyTel;
    }

    /**
     * @return the familyAddr
     */
    @Column(name = "FD_FAMILY_ADDR", length = 128)
    public String getFamilyAddr() {
        return familyAddr;
    }

    /**
     * @param familyAddr the familyAddr to set
     */
    public void setFamilyAddr(String familyAddr) {
        this.familyAddr = familyAddr;
    }

    /**
     * @return the fax
     */
    @Column(name = "FD_FAX", length = 32)
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the gender
     */
    @Column(name = "FD_GENDER")
    public Integer getGender() {
        if(null!=genderStr&&genderStr.equals("男")){
                return 1;
        }else{
                return 0;
        }
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * @return the secretLevel
     */
    @Column(name = "FD_SECRET_LEVEL")
    public Integer getSecretLevel() {
        return secretLevel;
    }

    /**
     * @param secretLevel the secretLevel to set
     */
    public void setSecretLevel(Integer secretLevel) {
        this.secretLevel = secretLevel;
    }

    /**
     * @return the deptList
     */
    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "SYS_USER_DEPT", joinColumns = {@JoinColumn(name = "FK_SYS_USER_ID")}, inverseJoinColumns = {@JoinColumn(name = "FK_SYS_ORG_DEPT_ID")})
    public List<Dept> getDeptList() {
        return deptList;
    }

    /**
     * @param deptList the deptList to set
     */
    public void setDeptList(List<Dept> deptList) {
        this.deptList = deptList;
    }


    /**
     * @return the defaultDeptId
     */
    @Column(name = "FK_DEFAULT_DEPT_ID", nullable = true)
    public String getDefaultDeptId() {
        return defaultDeptId;
    }

    /**
     * @param defaultDeptId the defaultDept to set
     */
    public void setDefaultDeptId(String defaultDeptId) {
        this.defaultDeptId = defaultDeptId;
    }

    /**
     * @return the birthDay
     */
    @Column(name = "FD_BIRTH_DAY", nullable = true)
    public Date getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @return the entryDay
     */
    @Column(name = "FD_ENTRY_DAY", nullable = true)
    public Date getEntryDay() {
        return entryDay;
    }

    /**
     * @param entryDay the entryDay to set
     */
    public void setEntryDay(Date entryDay) {
        this.entryDay = entryDay;
    }

    @Column(name = "FD_QQ")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Column(name = "FD_MSN")
    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    @Column(name = "FD_IS_LUNAR_CALENDAR")
    public boolean getIsLunarCalendar() {
        return isLunarCalendar;
    }

    public void setIsLunarCalendar(boolean isLunarCalendar) {
        this.isLunarCalendar = isLunarCalendar;
    }

    @Override
    @Transient
    public String getName() {
        return this.getRealname();
    }

    @Transient
    public String getGenderStr() {
        return genderStr;
    }

    public void setGenderStr(String genderStr) {
        this.genderStr = genderStr;
    }
}
