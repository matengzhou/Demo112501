package cn.kgc.matengzhou.mapper;

import com.kgc.realEstateInformationQuery.pojo.RealEstate;
import com.kgc.realEstateInformationQuery.pojo.RealEstateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RealEstateMapper {
    int countByExample(RealEstateExample example);

    int deleteByExample(RealEstateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RealEstate record);

    int insertSelective(RealEstate record);

    List<RealEstate> selectByExample(RealEstateExample example);

    RealEstate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RealEstate record, @Param("example") RealEstateExample example);

    int updateByExample(@Param("record") RealEstate record, @Param("example") RealEstateExample example);

    int updateByPrimaryKeySelective(RealEstate record);

    int updateByPrimaryKey(RealEstate record);
}