package cn.hotel.service;

import java.util.List;

import cn.hotel.entity.ReceiveTargetPo;

public interface ReceiveTargetService {
	//ajax查询 预订所用
    public List<ReceiveTargetPo> ajaxSelect(String teamName);
}
