package com.liandong.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface ICompanyMapper extends BaseMapper{

    List<Map<String,Object>> test(@Param("condition") Map<String, Object> condition);
}
