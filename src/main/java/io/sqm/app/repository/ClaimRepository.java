package io.sqm.app.repository;

import io.sqm.app.entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {

    public Claim getClaimById(Long id);
}
