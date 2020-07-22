package cc.wanforme.cmcore.base.po;

import java.time.LocalDateTime;
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
@ApiModel(value="Permission对象", description="")
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "拥有的权限组，null时表示默认")
    private String group;

    @ApiModelProperty(value = "状态， 0-失效，1-有效")
    private String status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Permission{" +
        "userName=" + userName +
        ", group=" + group +
        ", status=" + status +
        ", createTime=" + createTime +
        "}";
    }
}
