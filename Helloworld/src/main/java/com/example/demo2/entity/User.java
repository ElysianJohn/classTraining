package com.example.demo2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 
     */
    @TableId(value = "userId", type = IdType.AUTO)
    private Integer userId;

    /**
     * 
     */
    @TableField(value = "name")
    private String name;

    /**
     * 
     */
    @TableField(value = "email")
    private String email;

    /**
     * 
     */
    @TableField(value = "institute")
    private String institute;

    /**
     * 
     */
    @TableField(value = "insert_id")
    private String insert_id;

    /**
     * 
     */
    @TableField(value = "insert_ts")
    private Date insert_ts;

    /**
     * 
     */
    @TableField(value = "update_id")
    private String update_id;

    /**
     * 
     */
    @TableField(value = "update_ts")
    private Date update_ts;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getInstitute() == null ? other.getInstitute() == null : this.getInstitute().equals(other.getInstitute()))
            && (this.getInsert_id() == null ? other.getInsert_id() == null : this.getInsert_id().equals(other.getInsert_id()))
            && (this.getInsert_ts() == null ? other.getInsert_ts() == null : this.getInsert_ts().equals(other.getInsert_ts()))
            && (this.getUpdate_id() == null ? other.getUpdate_id() == null : this.getUpdate_id().equals(other.getUpdate_id()))
            && (this.getUpdate_ts() == null ? other.getUpdate_ts() == null : this.getUpdate_ts().equals(other.getUpdate_ts()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getInstitute() == null) ? 0 : getInstitute().hashCode());
        result = prime * result + ((getInsert_id() == null) ? 0 : getInsert_id().hashCode());
        result = prime * result + ((getInsert_ts() == null) ? 0 : getInsert_ts().hashCode());
        result = prime * result + ((getUpdate_id() == null) ? 0 : getUpdate_id().hashCode());
        result = prime * result + ((getUpdate_ts() == null) ? 0 : getUpdate_ts().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", institute=").append(institute);
        sb.append(", insert_id=").append(insert_id);
        sb.append(", insert_ts=").append(insert_ts);
        sb.append(", update_id=").append(update_id);
        sb.append(", update_ts=").append(update_ts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}