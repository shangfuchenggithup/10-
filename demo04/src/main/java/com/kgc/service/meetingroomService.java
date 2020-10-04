package com.kgc.service;

import com.kgc.pojo.meetingroom;

import java.util.List;

public interface meetingroomService {
    List<meetingroom> selectAll();

    void add(meetingroom meetingroom);

}
