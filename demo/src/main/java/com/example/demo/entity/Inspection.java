package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author xxx
 * @since 2024-09-03
 */
@Getter
@Setter
public class Inspection implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "inspection_id", type = IdType.AUTO)
    private Integer inspectionId;

    private String inspector;

    private Integer projectId;

    private String projectName;

    private String projectDescription;

    private Integer standard1Status;

    private String standard1Reason;

    private Integer standard2Status;

    private String standard2Reason;

    private Integer standard3Status;

    private String standard3Reason;

    private Integer standard4Status;

    private String standard4Reason;

    private Integer standard5Status;

    private String standard5Reason;

    private Integer standard6Status;

    private String standard6Reason;

    private Integer standard7Status;

    private String standard7Reason;

    private Integer standard8Status;

    private String standard8Reason;

    private Integer standard9Status;

    private String standard9Reason;
}
