package com.taiji.jilin.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 单继重
 * 太极管理系统 会员实体类
 * @since 2017/9/14 9:21
 */
@Entity
@Table(name = "t_member")
public class Member {
    //主键
    @Id
    private Integer id;

    //真实姓名
    private String name;

    //用户名
    private String username;

    //密码
    private String password;

    //所属单位
    private String organization;

    //是否为单位管理员
    @Column(name = "is_manager")
    private String isManager;

    //地区
    private String area;

    //工作单位
    private String company;

    //职称
    @Column(name = "job_title")
    private String jobTitle;

    //身份证号
    @Column(name = "id_number")
    private String idNumber;

    //联系手机
    private String telephone;

    //QQ号
    private String qq;

    //照片
    private String photo;

    //段位
    private String grade;

    //是否由裁判员资格
    @Column(name = "is_judge")
    private String isJudge;

    //裁判证书编号
    @Column(name = "judge_number")
    private String judgeNumber;

    //裁判证书获证日期
    @Column(name = "judge_date")
    private String judgeDate;

    //是否有教练员资格
    @Column(name = "is_coach")
    private String isCoach;

    //教练员证书编号
    @Column(name = "coach_number")
    private String coachNumber;

    //教练员资格获证日期
    @Column(name = "coach_date")
    private String coachDate;

    //是否有社会指导员资格
    @Column(name = "is_instructor")
    private String isInstructor;

    //社会指导员证书编号
    @Column(name = "instructor_number")
    private String instructorNumber;

    //社会指导员证书获证日期
    @Column(name = "instructor_date")
    private String instructorDate;

    //习练太极拳经历和获奖情况
    private String experience;

    //参加本协会活动情况
    private String activity;

    //审核状态
    private String status;

    //是否删除
    @Column(name = "is_deleted")
    private String isDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getIsManager() {
        return isManager;
    }

    public void setIsManager(String isManager) {
        this.isManager = isManager;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getIsJudge() {
        return isJudge;
    }

    public void setIsJudge(String isJudge) {
        this.isJudge = isJudge;
    }

    public String getJudgeNumber() {
        return judgeNumber;
    }

    public void setJudgeNumber(String judgeNumber) {
        this.judgeNumber = judgeNumber;
    }

    public String getJudgeDate() {
        return judgeDate;
    }

    public void setJudgeDate(String judgeDate) {
        this.judgeDate = judgeDate;
    }

    public String getIsCoach() {
        return isCoach;
    }

    public void setIsCoach(String isCoach) {
        this.isCoach = isCoach;
    }

    public String getCoachNumber() {
        return coachNumber;
    }

    public void setCoachNumber(String coachNumber) {
        this.coachNumber = coachNumber;
    }

    public String getCoachDate() {
        return coachDate;
    }

    public void setCoachDate(String coachDate) {
        this.coachDate = coachDate;
    }

    public String getIsInstructor() {
        return isInstructor;
    }

    public void setIsInstructor(String isInstructor) {
        this.isInstructor = isInstructor;
    }

    public String getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(String instructorNumber) {
        this.instructorNumber = instructorNumber;
    }

    public String getInstructorDate() {
        return instructorDate;
    }

    public void setInstructorDate(String instructorDate) {
        this.instructorDate = instructorDate;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
}
