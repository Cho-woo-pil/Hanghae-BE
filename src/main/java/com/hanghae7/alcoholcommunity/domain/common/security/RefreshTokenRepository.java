package com.hanghae7.alcoholcommunity.domain.common.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
	@Query("SELECT r FROM RefreshToken  r WHERE r.memberEmailId = :memberEmailId")
	Optional<RefreshToken> findByMemberEmailId(@Param("memberEmailId") String memberEmailId);
}
