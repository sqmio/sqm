package io.sqm.app.service.impl;

import io.sqm.app.entity.Claim;
import io.sqm.app.repository.ClaimRepository;
import io.sqm.app.service.ClaimService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimServiceImpl implements ClaimService {

    private ClaimRepository claimRepository;

    public ClaimServiceImpl(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }

    @Override
    public List<Claim> getAll() {
        return claimRepository.findAll();
    }

    @Override
    public Claim getById(Long id) {
        return claimRepository.getClaimById(id);
    }

    @Override
    public void save(Claim claim) {
        claimRepository.save(claim);
    }
}
