package com.codexbox.employeeIdcreation.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "project_billing_status")
public class BillingStatusEntity {
    @Id
    @Column(name ="project_id ")
    private Integer projectId;
    @Column(name ="project_status")
    private String projectStatus;
    public Integer getProjectId() {
        return projectId;
    }
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
    public String getProjectStatus() {
        return projectStatus;
    }
    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }
}
