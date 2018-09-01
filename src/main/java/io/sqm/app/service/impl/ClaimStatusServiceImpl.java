package io.sqm.app.service.impl;

import io.sqm.app.entity.ClaimStatus;
import io.sqm.app.repository.ClaimStatusRepository;
import io.sqm.app.service.ClaimStatusService;
import org.springframework.stereotype.Service;

@Service
public class ClaimStatusServiceImpl implements ClaimStatusService {

    private ClaimStatusRepository claimStatusRepository;

    public ClaimStatusServiceImpl(ClaimStatusRepository claimStatusRepository) {
        this.claimStatusRepository = claimStatusRepository;
    }

    @Override
    public ClaimStatus getById(Long id) {
        return claimStatusRepository.findClaimStatusById(id);
    }
}
