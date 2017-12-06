package cn.cj.spring_boot.service;

import java.util.List;

import cn.cj.spring_boot.domain.BaseDict;

public interface BaseDictService {

    List<BaseDict> getDictListByTypeCode(String typeCode);
}
