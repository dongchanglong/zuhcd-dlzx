package com.dlzx.pfserverperson.mapper;

import java.util.List;

import com.dlzx.pfserverperson.domain.DPerformance;
import com.dlzx.pfserverperson.domain.DPerformanceChang;
import com.dlzx.pfserverperson.domain.DPerformanceDuan;
import org.apache.ibatis.annotations.Param;

/**
 * 驾驶员-绩效Mapper接口
 *
 * @author dlzx
 * @date 2020-11-30
 */
public interface DPerformanceMapper {
    /**
     * 查询驾驶员-绩效
     *
     * @param id 驾驶员-绩效ID
     * @return 驾驶员-绩效
     */
    public DPerformance selectDPerformanceById(String id);

    public DPerformance selectDPerformanceByName(String name);

    /**
     * 查询驾驶员-绩效列表
     *
     * @param dPerformance 驾驶员-绩效
     * @return 驾驶员-绩效集合
     */
    public List<DPerformance> selectDPerformanceList(DPerformance dPerformance);

    //    长途绩效下拉选
    public List<DPerformance> selectDPerformanceListJiXiao(DPerformance dPerformance);

    /**
     * 新增驾驶员-绩效
     *
     * @param dPerformance 驾驶员-绩效
     * @return 结果
     */
    public int insertDPerformance(DPerformance dPerformance);

    public int insertDPerformanceC(DPerformanceChang dPerformanceChang);

    public int insertDPerformanceD(DPerformanceDuan dPerformanceDuan);

    /**
     * 修改驾驶员-绩效
     *
     * @param dPerformance 驾驶员-绩效
     * @return 结果
     */
    public int updateDPerformance(DPerformance dPerformance);

    public int updateDPerformanceC(DPerformanceChang dPerformanceChang);

    public int updateDPerformanceD(DPerformanceDuan dPerformanceDuan);

    /**
     * 删除驾驶员-绩效
     *
     * @param id 驾驶员-绩效ID
     * @return 结果
     */
    public int deleteDPerformanceById(String id);

    /**
     * 批量删除驾驶员-绩效
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDPerformanceByIds(String[] ids);


    /**
     * @describe car服务调用 - 获取绩效信息
     * @author DongCL
     * @date 2021-01-08 10:25
     * @param vehicleType 车型
     * @param routeId 线路ID
     * @param isVice 是否有对班
     * @return
     */
    List<DPerformance> queryPerformance(@Param("vehicleType") String vehicleType, @Param("routeId") String routeId, @Param("isVice") Long isVice);
}
