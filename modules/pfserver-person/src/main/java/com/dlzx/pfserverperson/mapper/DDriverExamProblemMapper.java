package com.dlzx.pfserverperson.mapper;

import java.util.List;
import com.dlzx.pfserverperson.domain.DDriverExamProblem;

/**
 * 驾驶员-司机试卷问题Mapper接口
 * 
 * @author yangluhe
 * @date 2020-11-18
 */
public interface DDriverExamProblemMapper 
{
    /**
     * 查询驾驶员-司机试卷问题
     * 
     * @param id 驾驶员-司机试卷问题ID
     * @return 驾驶员-司机试卷问题
     */
    public DDriverExamProblem selectDDriverExamProblemById(String id);

    /**
     * 查询驾驶员-司机试卷问题列表
     * 
     * @param dDriverExamProblem 驾驶员-司机试卷问题
     * @return 驾驶员-司机试卷问题集合
     */
    public List<DDriverExamProblem> selectDDriverExamProblemList(DDriverExamProblem dDriverExamProblem);

    /**
     * 新增驾驶员-司机试卷问题
     * 
     * @param dDriverExamProblem 驾驶员-司机试卷问题
     * @return 结果
     */
    public int insertDDriverExamProblem(DDriverExamProblem dDriverExamProblem);

    /**
     * 新增驾驶员-司机试卷问题
     *
     * @param listExam 驾驶员-司机试卷问题集合
     * @return 结果
     */
    public int insertDDriverExamProblemList(List<DDriverExamProblem> listExam);
    /**
     * 修改驾驶员-司机试卷问题
     * 
     * @param dDriverExamProblem 驾驶员-司机试卷问题
     * @return 结果
     */
    public int updateDDriverExamProblem(DDriverExamProblem dDriverExamProblem);

    /**
     * 删除驾驶员-司机试卷问题
     * 
     * @param id 驾驶员-司机试卷问题ID
     * @return 结果
     */
    public int deleteDDriverExamProblemById(String id);

    /**
     * 批量删除驾驶员-司机试卷问题
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDDriverExamProblemByIds(String[] ids);

    /**
     * 查看笔试试题
     */
    public List<DDriverExamProblem> selectDDriverExamProblemByExamId(String id);
}
