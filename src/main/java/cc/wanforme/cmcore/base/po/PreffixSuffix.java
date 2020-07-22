package cc.wanforme.cmcore.base.po;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 玩家展示名字的前缀和后缀。默认不会保存，仅当第一次设置的时候才有
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
@ApiModel(value="PreffixSuffix对象", description="玩家展示名字的前缀和后缀。默认不会保存，仅当第一次设置的时候才有")
public class PreffixSuffix implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Integer id;

    @ApiModelProperty(value = "玩家名")
    private String name;

    @ApiModelProperty(value = "前缀")
    private String preffix;

    @ApiModelProperty(value = "后缀")
    private String suffix;

    @ApiModelProperty(value = "更新时间")
    @TableField("updateTime")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "创建时间")
    @TableField("creatTime")
    private LocalDateTime creatTime;

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
    public String getPreffix() {
        return preffix;
    }

    public void setPreffix(String preffix) {
        this.preffix = preffix;
    }
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
    public LocalDateTime getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(LocalDateTime creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        return "PreffixSuffix{" +
        "id=" + id +
        ", name=" + name +
        ", preffix=" + preffix +
        ", suffix=" + suffix +
        ", updateTime=" + updateTime +
        ", creatTime=" + creatTime +
        "}";
    }
}
