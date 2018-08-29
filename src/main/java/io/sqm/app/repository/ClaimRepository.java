package io.sqm.app.repository;

import io.sqm.app.entity.Claim;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends CrudRepository<Claim, Long> {
}
