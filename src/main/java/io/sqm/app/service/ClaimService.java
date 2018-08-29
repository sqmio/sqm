package io.sqm.app.service;

import io.sqm.app.entity.Claim;

public interface ClaimService {

    Iterable<Claim> claims();

    void add(Claim claim);
}
