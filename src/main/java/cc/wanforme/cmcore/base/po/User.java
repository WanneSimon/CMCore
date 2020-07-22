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
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户名(通常是唯一的)")
    @TableField("userName")
    private String userName;

    @ApiModelProperty(value = "密码")
    private String pwd;

    @ApiModelProperty(value = "展示名")
    @TableField("tagName")
    private String tagName;

    @ApiModelProperty(value = "注册时间")
    @TableField("registerTime")
    private LocalDateTime registerTime;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "qq")
    private String qq;

    @ApiModelProperty(value = "联系电话")
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public LocalDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(LocalDateTime registerTime) {
        this.registerTime = registerTime;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", userName=" + userName +
        ", pwd=" + pwd +
        ", tagName=" + tagName +
        ", registerTime=" + registerTime +
        ", gender=" + gender +
        ", email=" + email +
        ", qq=" + qq +
        ", phone=" + phone +
        "}";
    }
}
