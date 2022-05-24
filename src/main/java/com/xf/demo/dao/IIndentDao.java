package com.xf.demo.dao;

import com.xf.demo.bean.Indent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IIndentDao {
    public Boolean insertIndent( @Param("indentDate")String indentDate,@Param("userName")String userName,
                                @Param("id")int id,@Param("addShoppingCart_num")int addShoppingCart_num);
    public List<Indent> selectIndents(@Param("userName") String userName,@Param("state")int state);
    public Boolean updateState(@Param("userName") String userName,@Param("state")int state,@Param("id")int id);
    public Boolean deleteIndent(@Param("userName")String userName,@Param("commId")int commId);
    public Boolean updateIndentDate(@Param("commId")int commId,@Param("indentDate")String indentDate);
    public Indent selectIndent(@Param("commId")int commId);
    public Integer IndentCount(@Param("userName")String userName,@Param("obligation")int obligation);
}
