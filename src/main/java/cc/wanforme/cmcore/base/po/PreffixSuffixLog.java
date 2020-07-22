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
 * 玩家前缀后缀变化日志记录
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
@ApiModel(value="PreffixSuffixLog对象", description="玩家前缀后缀变化日志记录")
public class PreffixSuffixLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "玩家名")
    private String name;

    @ApiModelProperty(value = "旧前缀")
    @TableField("oldPreffix")
    private String oldPreffix;

    @ApiModelProperty(value = "新前缀")
    @TableField("newPreffix")
    private String newPreffix;

    @ApiModelProperty(value = "旧后缀")
    @TableField("oldSuffiex")
    private String oldSuffiex;

    @ApiModelProperty(value = "新后缀")
    @TableField("newSuffix")
    private String newSuffix;

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
    public String getOldPreffix() {
        return oldPreffix;
    }

    public void setOldPreffix(String oldPreffix) {
        this.oldPreffix = oldPreffix;
    }
    public String getNewPreffix() {
        return newPreffix;
    }

    public void setNewPreffix(String newPreffix) {
        this.newPreffix = newPreffix;
    }
    public String getOldSuffiex() {
        return oldSuffiex;
    }

    public void setOldSuffiex(String oldSuffiex) {
        this.oldSuffiex = oldSuffiex;
    }
    public String getNewSuffix() {
        return newSuffix;
    }

    public void setNewSuffix(String newSuffix) {
        this.newSuffix = newSuffix;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "PreffixSuffixLog{" +
        "id=" + id +
        ", name=" + name +
        ", oldPreffix=" + oldPreffix +
        ", newPreffix=" + newPreffix +
        ", oldSuffiex=" + oldSuffiex +
        ", newSuffix=" + newSuffix +
        ", createTime=" + createTime +
        "}";
    }
}
