package com.codexbox.employee.hiring.users.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="status_dropdown")
public class StatusEntity {
    @Id
    @Column(name="status_id" , nullable = true)
    private Integer statusId;

    @Column(name="select_status")
    private String selectStatus;


    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getSelectStatus() {
        return selectStatus;
    }

    public void setSelectStatus(String selectStatus) {
        this.selectStatus = selectStatus;
    }

}
