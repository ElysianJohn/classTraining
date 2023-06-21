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
 * @TableName trade
 */
@TableName(value ="trade")
@Data
public class Trade implements Serializable {
    /**
     * 
     */
    @TableId(value = "tradeId", type = IdType.AUTO)
    private Integer tradeId;

    /**
     * 
     */
    @TableField(value = "ClientName")
    private String clientName;

    /**
     * 
     */
    @TableField(value = "Ticker")
    private String ticker;

    /**
     * 
     */
    @TableField(value = "RIC")
    private String RIC;

    /**
     * 
     */
    @TableField(value = "productId")
    private Integer productId;

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
        Trade other = (Trade) that;
        return (this.getTradeId() == null ? other.getTradeId() == null : this.getTradeId().equals(other.getTradeId()))
            && (this.getClientName() == null ? other.getClientName() == null : this.getClientName().equals(other.getClientName()))
            && (this.getTicker() == null ? other.getTicker() == null : this.getTicker().equals(other.getTicker()))
            && (this.getRIC() == null ? other.getRIC() == null : this.getRIC().equals(other.getRIC()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getInsert_id() == null ? other.getInsert_id() == null : this.getInsert_id().equals(other.getInsert_id()))
            && (this.getInsert_ts() == null ? other.getInsert_ts() == null : this.getInsert_ts().equals(other.getInsert_ts()))
            && (this.getUpdate_id() == null ? other.getUpdate_id() == null : this.getUpdate_id().equals(other.getUpdate_id()))
            && (this.getUpdate_ts() == null ? other.getUpdate_ts() == null : this.getUpdate_ts().equals(other.getUpdate_ts()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTradeId() == null) ? 0 : getTradeId().hashCode());
        result = prime * result + ((getClientName() == null) ? 0 : getClientName().hashCode());
        result = prime * result + ((getTicker() == null) ? 0 : getTicker().hashCode());
        result = prime * result + ((getRIC() == null) ? 0 : getRIC().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
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
        sb.append(", tradeId=").append(tradeId);
        sb.append(", clientName=").append(clientName);
        sb.append(", ticker=").append(ticker);
        sb.append(", RIC=").append(RIC);
        sb.append(", productId=").append(productId);
        sb.append(", insert_id=").append(insert_id);
        sb.append(", insert_ts=").append(insert_ts);
        sb.append(", update_id=").append(update_id);
        sb.append(", update_ts=").append(update_ts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}