package com.taiji.jilin.mapper;

import com.taiji.jilin.common.entity.Member;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 单继重
 * @since 2017/9/14 12:00
 */
@Repository
public interface MemberMapper {
    /**
     * 新添加成员
     * @param member 会员实体类
     * @throws Exception 异常
     */
    public void newMember(Member member) throws Exception;

    /**
     * 假删除
     * @param id id
     * @throws Exception 异常
     */
    public void delById(int id) throws Exception;

    /**
     * 修改会员信息
     * @param member 会员
     * @throws Exception 异常
     */
    public void update(Member member) throws Exception;

    /**
     * 登陆
     * @param member 会员
     * @return 会员实体类
     * @throws Exception 异常
     */
    public Member queryByUsnAndPsw(Member member) throws Exception;

    /**
     * 根据ID查找
     * @param id id
     * @return 会员实体类
     * @throws Exception 异常
     */
    public Member queryById(int id) throws Exception;

    /**
     * 查找全部会员
     * @return 会员表
     * @throws Exception 异常
     */
    public List<Member> queryAll() throws Exception;
}
