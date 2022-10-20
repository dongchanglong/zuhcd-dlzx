package com.dlzx.pfservercar.service;

import java.util.List;
import com.dlzx.pfservercar.domain.EtcQuota;

/**
 * ETC管理-ETC定额Service接口
 * 
 * @author dlzx
 * @date 2020-12-02
 */
public interface IEtcQuotaService 
{
    /**
     * 查询ETC管理-ETC定额
     * 
     * @param id ETC管理-ETC定额ID
     * @return ETC管理-ETC定额
     */
    public EtcQuota selectEtcQuotaById(String id);

    /**
     * 查询ETC管理-ETC定额列表
     * 
     * @param etcQuota ETC管理-ETC定额
     * @return ETC管理-ETC定额集合
     */
    public List<EtcQuota> selectEtcQuotaList(EtcQuota etcQuota);

    public List<EtcQuota> selectEtcQuotaListDingE(String routeId,String vehicleModel);
    /**
     * 新增ETC管理-ETC定额
     * 
     * @param etcQuota ETC管理-ETC定额
     * @return 结果
     */
    public int insertEtcQuota(EtcQuota etcQuota);

    /**
     * 修改ETC管理-ETC定额
     * 
     * @param etcQuota ETC管理-ETC定额
     * @return 结果
     */
    public int updateEtcQuota(EtcQuota etcQuota);

    /**
     * 批量删除ETC管理-ETC定额
     * 
     * @param ids 需要删除的ETC管理-ETC定额ID
     * @return 结果
     */
    public int deleteEtcQuotaByIds(String[] ids);

    /**
     * 删除ETC管理-ETC定额信息
     * 
     * @param id ETC管理-ETC定额ID
     * @return 结果
     */
    public int deleteEtcQuotaById(String id);
}
