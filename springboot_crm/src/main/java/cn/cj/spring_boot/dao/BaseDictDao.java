package cn.cj.spring_boot.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.cj.spring_boot.domain.BaseDict;

@Component
public interface BaseDictDao {

    List<BaseDict> getDictListByTypeCode(String typeCode);
}
