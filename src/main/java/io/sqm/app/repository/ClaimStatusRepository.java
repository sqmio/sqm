package io.sqm.app.repository;

import io.sqm.app.entity.ClaimStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimStatusRepository extends CrudRepository<ClaimStatus, Long> {

    public ClaimStatus findClaimStatusById(Long id);
}
