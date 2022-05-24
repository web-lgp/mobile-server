package com.xf.demo.service.impl;

import com.xf.demo.bean.Indent;
import com.xf.demo.dao.IIndentDao;
import com.xf.demo.service.IIdentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class IndentService implements IIdentService {

    @Autowired
    private IIndentDao iIndentDao;
    @Override
    public Boolean insertIndent(String indentDate, String userName, int id,int addShoppingCart_num) {
        boolean indent=iIndentDao.insertIndent(indentDate,userName,id,addShoppingCart_num);
        return indent;
    }

    @Override
    public List<Indent> selectIndents(String userName,int state) {
        List<Indent> indentList=iIndentDao.selectIndents(userName,state);
        return indentList;
    }

    @Override
    public Boolean updateState(String userName, int state,int id) {
        Boolean indent=iIndentDao.updateState(userName,state,id);
        return indent;
    }

    @Override
    public Boolean deleteIndent(String userName, int commId) {
        Boolean indent=iIndentDao.deleteIndent(userName, commId)
;        return indent;
    }

    @Override
    public Boolean updateIndentDate(int commId, String indentDate) {
        return iIndentDao.updateIndentDate(commId, indentDate);
    }

    @Override
    public Indent selectIndent(int commId) {
        Indent indent=iIndentDao.selectIndent(commId);
        return indent;
    }

    @Override
    public Integer IndentCount(String userName, int obligation) {
        Integer indent=iIndentDao.IndentCount(userName, obligation);
        return indent;
    }
}
