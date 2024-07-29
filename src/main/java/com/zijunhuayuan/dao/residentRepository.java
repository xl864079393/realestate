package com.zijunhuayuan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zijunhuayuan.bean.resident;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface residentRepository extends JpaRepository<resident, Long>{
    List<resident> findByName(String name);

    List<resident> findALl();
}
