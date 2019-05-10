package com.cleancode.demo.dto;

import java.util.List;

public class Speaker {
    private String name;
    private String lastName;
    private String emailAddress;
    private Integer yearsOfExperience;
    private String employeer;
    private Boolean hasBlog;
    private String blogUrl;
    private List<String> certifications;
    private List<String> sessions;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getEmployeer() {
        return employeer;
    }

    public void setEmployeer(String employeer) {
        this.employeer = employeer;
    }

    public Boolean getHasBlog() {
        return hasBlog;
    }

    public void setHasBlog(Boolean hasBlog) {
        this.hasBlog = hasBlog;
    }

    public String getBlogUrl() {
        return blogUrl;
    }

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl;
    }

    public List<String> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<String> certifications) {
        this.certifications = certifications;
    }

    public List<String> getSessions() {
        return sessions;
    }

    public void setSessions(List<String> sessions) {
        this.sessions = sessions;
    }
}
