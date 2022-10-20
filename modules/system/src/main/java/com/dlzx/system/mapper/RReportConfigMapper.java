package com.dlzx.system.mapper;

import java.util.List;
import com.dlzx.system.domain.RReportConfig;

/**
 * 统计报-统计数据配置Mapper接口
 * 
 * @author dlzx
 * @date 2021-01-05
 */
public interface RReportConfigMapper 
{
    /**
     * 查询统计报-统计数据配置
     * 
     * @param id 统计报-统计数据配置ID
     * @return 统计报-统计数据配置
     */
    public RReportConfig selectRReportConfigById(String id);

    /**
     * 查询统计报-统计数据配置列表
     * 
     * @param rReportConfig 统计报-统计数据配置
     * @return 统计报-统计数据配置集合
     */
    public List<RReportConfig> selectRReportConfigList(RReportConfig rReportConfig);

    /**
     * 新增统计报-统计数据配置
     * 
     * @param rReportConfig 统计报-统计数据配置
     * @return 结果
     */
    public int insertRReportConfig(RReportConfig rReportConfig);

    /**
     * 修改统计报-统计数据配置
     * 
     * @param rReportConfig 统计报-统计数据配置
     * @return 结果
     */
    public int updateRReportConfig(RReportConfig rReportConfig);

    /**
     * 删除统计报-统计数据配置
     * 
     * @param id 统计报-统计数据配置ID
     * @return 结果
     */
    public int deleteRReportConfigById(String id);

    /**
     * 批量删除统计报-统计数据配置
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRReportConfigByIds(String[] ids);
}
