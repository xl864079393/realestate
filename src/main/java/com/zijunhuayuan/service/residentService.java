package com.zijunhuayuan.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zijunhuayuan.bean.resident;
import com.zijunhuayuan.dao.residentRepository;
import java.util.List;

@Service
public class residentService {

    @Autowired
    private residentRepository residentRepository;

    public List<resident> getResidents() {
        return residentRepository.findAll();
    }
}