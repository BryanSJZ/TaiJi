package com.taiji.jilin.service.impl;

import com.taiji.jilin.common.entity.Member;
import com.taiji.jilin.mapper.MemberMapper;
import com.taiji.jilin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 单继重
 * @since 2017/9/15 19:26
 */

@Service(value = "memberService")
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public void newMember(Member member) throws Exception {
        memberMapper.newMember(member);
    }

    public Member queryById(int id) throws Exception {
        return memberMapper.queryById(id);
    }

    public void delById(int id) throws Exception {
        memberMapper.delById(id);
    }

    public void update(Member member) throws Exception{
        memberMapper.update(member);
    }

    public Member queryByUsnAndPsw(Member member) throws Exception {
        return memberMapper.queryByUsnAndPsw(member);
    }
}
