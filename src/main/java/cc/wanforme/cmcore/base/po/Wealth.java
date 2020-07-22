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
@ApiModel(value="Wealth对象", description="")
public class Wealth implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户名player#name")
    private String name;

    @ApiModelProperty(value = "币种1")
    private Double currency1;

    @ApiModelProperty(value = "币种2")
    private Double currency2;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private LocalDateTime createTime;

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
    public Double getCurrency1() {
        return currency1;
    }

    public void setCurrency1(Double currency1) {
        this.currency1 = currency1;
    }
    public Double getCurrency2() {
        return currency2;
    }

    public void setCurrency2(Double currency2) {
        this.currency2 = currency2;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Wealth{" +
        "id=" + id +
        ", name=" + name +
        ", currency1=" + currency1 +
        ", currency2=" + currency2 +
        ", createTime=" + createTime +
        "}";
    }
}
