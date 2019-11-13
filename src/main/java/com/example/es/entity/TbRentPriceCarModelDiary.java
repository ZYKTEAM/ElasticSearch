package com.example.es.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author zyk
 * @since 2019-11-11
 */
@Data
//@Document(indexName = "rent",type = "TbRentPriceCarModelDiary")
//,type="TbRentPriceCarModelDiary",shards=3,
//        replicas = 2,refreshInterval = "5s"
public class TbRentPriceCarModelDiary {

    private static final long serialVersionUID = 1L;

//    @Id
    private Long id;

    /**
     * 数据
     */
    private BigDecimal value;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 车型费用项中间表
     */
    private Long carModelFeeOptionId;

    /**
     * 业务类型code
     */
    private String bizType;

    /**
     * 车型id
     */
    private String carModelId;

    /**
     * 租赁公司或门店id
     */
    private String companyId;

    /**
     * 费用项code
     */
    private String feeOptionCode;

    /**
     * 租赁公司或门店名称
     */
    private String companyName;

    /**
     * 模板id
     */
    private Long tplId;


}
