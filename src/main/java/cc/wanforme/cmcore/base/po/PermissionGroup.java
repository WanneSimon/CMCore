package cc.wanforme.cmcore.base.po;

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
@ApiModel(value="PermissionGroup对象", description="")
public class PermissionGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "权限组名")
    private String name;

    @ApiModelProperty(value = "权限，逗号分开，")
    private String permission;

    @ApiModelProperty(value = "状态， 0-失效，1-有效")
    private String status;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private LocalDateTime createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
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
        return "PermissionGroup{" +
        "name=" + name +
        ", permission=" + permission +
        ", status=" + status +
        ", createTime=" + createTime +
        "}";
    }
}
