package com.taiji.jilin;

import com.taiji.jilin.common.entity.Member;
import com.taiji.jilin.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 单继重
 * @since 2017/9/15 19:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring-mybatis.xml"})
public class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    public void testNewMember() throws Exception {
        Member member = new Member();
        memberService.newMember(member);
    }

    @Test
    public void testQueryById() throws Exception {
        System.out.println(memberService.queryById(1));
    }
}
