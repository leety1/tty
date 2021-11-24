package com.example.demo.mapper;

import com.example.demo.vo.Member;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface MemberMapper {
	Member getMember(int id);
	List<Member> getMemberList();
	int createMember(Member member);
	int upadetMember(Member member);
	int deleteMember(int id);
}
