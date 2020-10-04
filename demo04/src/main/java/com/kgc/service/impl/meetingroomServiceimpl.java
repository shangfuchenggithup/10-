package com.kgc.service.impl;

import com.kgc.mapper.meetingroomMapper;
import com.kgc.pojo.meetingroom;
import com.kgc.service.meetingroomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("meetingroomService")
public class meetingroomServiceimpl implements meetingroomService {
    @Resource
    meetingroomMapper meetingroomMapper;
    @Override
    public List<meetingroom> selectAll() {
        return meetingroomMapper.selectByExample(null);
    }

    @Override
    public void add(meetingroom meetingroom) {
        meetingroomMapper.insertSelective(meetingroom);
    }
}
