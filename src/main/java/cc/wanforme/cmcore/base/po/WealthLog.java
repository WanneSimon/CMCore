package cc.wanforme.cmcore.base.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 财产变化记录（如果两种货币都变化了，那么就是两条记录）
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
@ApiModel(value="WealthLog对象", description="财产变化记录（如果两种货币都变化了，那么就是两条记录）")
public class WealthLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "玩家名")
    @TableField("playerName")
    private String playerName;

    @ApiModelProperty(value = "货币类别，默认和wealth中的保持一致，1-货币1，2-货币2")
    @TableField("currencyType")
    private String currencyType;

    @ApiModelProperty(value = "原始数额")
    private Double before;

    @ApiModelProperty(value = "变化后的数额")
    private Double after;

    @ApiModelProperty(value = "变化数额")
    private Double chg;

    @ApiModelProperty(value = "理由")
    private String reason;

    @ApiModelProperty(value = "备注（保留）")
    private String remark;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private LocalDateTime createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }
    public Double getBefore() {
        return before;
    }

    public void setBefore(Double before) {
        this.before = before;
    }
    public Double getAfter() {
        return after;
    }

    public void setAfter(Double after) {
        this.after = after;
    }
    public Double getChg() {
        return chg;
    }

    public void setChg(Double chg) {
        this.chg = chg;
    }
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "WealthLog{" +
        "id=" + id +
        ", playerName=" + playerName +
        ", currencyType=" + currencyType +
        ", before=" + before +
        ", after=" + after +
        ", chg=" + chg +
        ", reason=" + reason +
        ", remark=" + remark +
        ", createTime=" + createTime +
        "}";
    }
}
