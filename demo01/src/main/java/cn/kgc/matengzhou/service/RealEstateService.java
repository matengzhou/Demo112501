package cn.kgc.matengzhou.service;

import cn.kgc.matengzhou.pojo.RealEstate;
import com.github.pagehelper.PageInfo;



/**
 * @author shkstart
 * @create 2020-11-21 14:25
 */
public interface RealEstateService {
    public PageInfo<RealEstate> selectUsers(String cardid, Integer pageNum, Integer pageSize);

}
