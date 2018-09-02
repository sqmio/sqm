package io.sqm.app.service;

import io.sqm.app.entity.Claim;

public interface ClaimService {

    Iterable<Claim> getAll();

    Claim getById(Long id);

    void save(Claim claim);
}
