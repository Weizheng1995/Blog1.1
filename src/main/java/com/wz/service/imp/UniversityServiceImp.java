package com.wz.service.imp;

import com.wz.dao.UniversityDao;
import com.wz.pojo.University;
import com.wz.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zheng on 2017/6/13.
 */
@Service("universityService")
public class UniversityServiceImp implements UniversityService{
    @Autowired
    private UniversityDao universityDao;
    /**
     * 根据学校编号查询学校信息
     *
     * @param universityId 学校编号
     * @return
     */
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public University queryById(int universityId) {
        return universityDao.queryById(universityId);
    }
}
