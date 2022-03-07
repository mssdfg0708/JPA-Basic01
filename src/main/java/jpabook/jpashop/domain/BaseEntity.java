package jpabook.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {

    @Column(name = "CREATED_USER")
    private String createdBy;
    private LocalDateTime createdDateTime;
    @Column(name = "MODIFY_USER")
    private String recentModifiedBy;
    private LocalDateTime recentModifiedDateTime;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getRecentModifiedBy() {
        return recentModifiedBy;
    }

    public void setRecentModifiedBy(String recentModifiedBy) {
        this.recentModifiedBy = recentModifiedBy;
    }

    public LocalDateTime getRecentModifiedDateTime() {
        return recentModifiedDateTime;
    }

    public void setRecentModifiedDateTime(LocalDateTime recentModifiedDateTime) {
        this.recentModifiedDateTime = recentModifiedDateTime;
    }
}
