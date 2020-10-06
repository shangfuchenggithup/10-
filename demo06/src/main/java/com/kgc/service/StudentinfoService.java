package com.kgc.service;



import com.kgc.pojo.Studentinfo;

import java.util.List;

public interface StudentinfoService {
    List<Studentinfo> selectAll();

    Studentinfo selectById(Integer sid);

    int upd(Studentinfo studentinfo);

}
