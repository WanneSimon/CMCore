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
 * 
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
@ApiModel(value="PlayerLoginLog对象", description="")
public class PlayerLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "玩家名")
    private String name;

    @ApiModelProperty(value = "ip地址")
    private String ip;

    @ApiModelProperty(value = "登录时间")
    @TableField("loginTime")
    private LocalDateTime loginTime;

    @ApiModelProperty(value = "退出时间")
    @TableField("outTime")
    private LocalDateTime outTime;

    @ApiModelProperty(value = "是否强制退出标志，0-正常退出，1-服务器关闭，2-被踢出")
    private String force;

    @ApiModelProperty(value = "备注（备用）")
    private String remark;

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
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }
    public LocalDateTime getOutTime() {
        return outTime;
    }

    public void setOutTime(LocalDateTime outTime) {
        this.outTime = outTime;
    }
    public String getForce() {
        return force;
    }

    public void setForce(String force) {
        this.force = force;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "PlayerLoginLog{" +
        "id=" + id +
        ", name=" + name +
        ", ip=" + ip +
        ", loginTime=" + loginTime +
        ", outTime=" + outTime +
        ", force=" + force +
        ", remark=" + remark +
        "}";
    }
}
