package com.xf.demo.service;

import com.xf.demo.bean.Indent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IIdentService {
    public Boolean insertIndent(String indentDate,String userName, int id,int addShoppingCart_num);
    public List<Indent> selectIndents(String userName,int state);
    public Boolean updateState(String userName,int state,int id);
    public Boolean deleteIndent(String userName,int commId);
    public Boolean updateIndentDate(int commId,String indentDate);
    public Indent selectIndent(int commId);
    public Integer IndentCount(String userName,int obligation);
}
