package io.sqm.app.service.impl;

import io.sqm.app.entity.Claim;
import io.sqm.app.repository.ClaimRepository;
import io.sqm.app.service.ClaimService;
import org.springframework.stereotype.Service;

@Service
public class ClaimServiceImpl implements ClaimService {

    private ClaimRepository claimRepository;

    public ClaimServiceImpl(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }

    @Override
    public Iterable<Claim> claims() {
        return claimRepository.findAll();
    }

    @Override
    public void add(Claim claim) {
        claimRepository.save(claim);
    }
}
