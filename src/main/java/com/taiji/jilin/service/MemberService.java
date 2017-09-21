package com.taiji.jilin.service;

import com.taiji.jilin.common.entity.Member;
import org.springframework.stereotype.Service;

/**
 * @author 单继重
 * @since 2017/9/15 19:22
 */
public interface MemberService {

    /**
     * 添加一个会员信息
     * @param member 会员实体类
     * @throws Exception 异常
     */
    public void newMember(Member member) throws Exception;

    /**
     * 根据ID查找会员信息
     * @param id ID
     * @return 会员实体类
     * @throws Exception 异常
     */
    public Member queryById(int id) throws Exception;

    /**
     * 根据ID删除会员信息
     * @param id ID
     * @throws Exception 异常
     */
    public void delById(int id) throws Exception;

    /**
     * 修改用户信息
     * @param member 会员信息
     * @throws Exception 异常
     */
    public void update(Member member) throws Exception;

    /**
     * 通过用户名和密码查找用户
     * @param member 会员信息
     * @return 会员完整信息
     * @throws Exception 异常
     */
    public Member queryByUsnAndPsw(Member member) throws Exception;
}
