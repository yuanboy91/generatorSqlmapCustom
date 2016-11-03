package com.xilai.core.dao;

import com.xilai.core.entity.TbXilaicoreIkuaidiXilaiorder;
import com.xilai.core.entity.TbXilaicoreIkuaidiXilaiorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbXilaicoreIkuaidiXilaiorderMapper {
    int countByExample(TbXilaicoreIkuaidiXilaiorderExample example);

    int deleteByExample(TbXilaicoreIkuaidiXilaiorderExample example);

    int deleteByPrimaryKey(String servicecode);

    int insert(TbXilaicoreIkuaidiXilaiorder record);

    int insertSelective(TbXilaicoreIkuaidiXilaiorder record);

    List<TbXilaicoreIkuaidiXilaiorder> selectByExample(TbXilaicoreIkuaidiXilaiorderExample example);

    TbXilaicoreIkuaidiXilaiorder selectByPrimaryKey(String servicecode);

    int updateByExampleSelective(@Param("record") TbXilaicoreIkuaidiXilaiorder record, @Param("example") TbXilaicoreIkuaidiXilaiorderExample example);

    int updateByExample(@Param("record") TbXilaicoreIkuaidiXilaiorder record, @Param("example") TbXilaicoreIkuaidiXilaiorderExample example);

    int updateByPrimaryKeySelective(TbXilaicoreIkuaidiXilaiorder record);

    int updateByPrimaryKey(TbXilaicoreIkuaidiXilaiorder record);
}