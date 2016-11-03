package com.xilai.core.dao;

import com.xilai.core.entity.TbXilaicoreIkuaidiRegion;
import com.xilai.core.entity.TbXilaicoreIkuaidiRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbXilaicoreIkuaidiRegionMapper {
    int countByExample(TbXilaicoreIkuaidiRegionExample example);

    int deleteByExample(TbXilaicoreIkuaidiRegionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbXilaicoreIkuaidiRegion record);

    int insertSelective(TbXilaicoreIkuaidiRegion record);

    List<TbXilaicoreIkuaidiRegion> selectByExample(TbXilaicoreIkuaidiRegionExample example);

    TbXilaicoreIkuaidiRegion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbXilaicoreIkuaidiRegion record, @Param("example") TbXilaicoreIkuaidiRegionExample example);

    int updateByExample(@Param("record") TbXilaicoreIkuaidiRegion record, @Param("example") TbXilaicoreIkuaidiRegionExample example);

    int updateByPrimaryKeySelective(TbXilaicoreIkuaidiRegion record);

    int updateByPrimaryKey(TbXilaicoreIkuaidiRegion record);
}