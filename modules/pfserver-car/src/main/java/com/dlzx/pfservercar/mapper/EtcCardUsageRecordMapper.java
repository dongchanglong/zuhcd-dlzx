package com.dlzx.pfservercar.mapper;

import java.math.BigDecimal;
import java.util.List;
import com.dlzx.pfservercar.domain.EtcCardUsageRecord;


/**
 * ETC管理-ETC卡使用记录Mapper接口
 * 
 * @author dlzx
 * @date 2020-12-02
 */
public interface EtcCardUsageRecordMapper 
{
    /**
     * 查询ETC管理-ETC卡使用记录
     * 
     * @param id ETC管理-ETC卡使用记录ID
     * @return ETC管理-ETC卡使用记录
     */
    public EtcCardUsageRecord selectEtcCardUsageRecordById(String id);

    /**
     * 查询ETC管理-ETC卡使用记录列表
     * 
     * @param etcCardUsageRecord ETC管理-ETC卡使用记录
     * @return ETC管理-ETC卡使用记录集合
     */
    public List<EtcCardUsageRecord> selectEtcCardUsageRecordList(EtcCardUsageRecord etcCardUsageRecord);

    public List<EtcCardUsageRecord> selectEtcCardUsageRecordListTime(EtcCardUsageRecord etcCardUsageRecord);

    public List<EtcCardUsageRecord> selectEtcCardUsageRecordListAll();
    /**
     * 新增ETC管理-ETC卡使用记录
     * 
     * @param etcCardUsageRecord ETC管理-ETC卡使用记录
     * @return 结果
     */
    public int insertEtcCardUsageRecord(EtcCardUsageRecord etcCardUsageRecord);

    /**
     * 修改ETC管理-ETC卡使用记录
     * 
     * @param etcCardUsageRecord ETC管理-ETC卡使用记录
     * @return 结果
     */
    public int updateEtcCardUsageRecord(EtcCardUsageRecord etcCardUsageRecord);

    /**
     * 删除ETC管理-ETC卡使用记录
     * 
     * @param id ETC管理-ETC卡使用记录ID
     * @return 结果
     */
    public int deleteEtcCardUsageRecordById(String id);

    /**
     * 批量删除ETC管理-ETC卡使用记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteEtcCardUsageRecordByIds(String[] ids);

    /**
     * Etc金额总计
     * @param id
     * @return
     */
    public BigDecimal selectEtcRecordCost(String id);
}
