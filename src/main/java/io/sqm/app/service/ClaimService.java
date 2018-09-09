package io.sqm.app.service;

import io.sqm.app.entity.Claim;

import java.util.List;

public interface ClaimService {

    List<Claim> getAll();

    Claim getById(Long id);

    void save(Claim claim);
}
