package com.wz.service.imp;

import com.wz.dao.TermDao;
import com.wz.pojo.Term;
import com.wz.service.TermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zheng on 2017/6/13.
 */
@Service("termService")
public class TermServiceImp implements TermService{
    @Autowired
    private TermDao termDao;
    /**
     * 根据学校编号查询
     *
     * @param universityId 学校编号
     * @return
     */
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public List<Term> queryByUniversity(int universityId) {
        return termDao.queryByUniversity(universityId);
    }
}
