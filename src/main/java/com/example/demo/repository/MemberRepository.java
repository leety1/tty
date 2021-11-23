package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.vo.MemberVo;

public interface MemberRepository extends JpaRepository<MemberVo, Long> {
	public List<MemberVo> findById(String id);
	public List<MemberVo> findByName(String name);

	public List<MemberVo> findByNameLike(String keyword);

}
