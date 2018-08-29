package io.sqm.app.resource;

import io.sqm.app.entity.Claim;
import io.sqm.app.service.ClaimService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class ClaimResource {

    private ClaimService claimService;

    public ClaimResource(ClaimService claimService) {
        this.claimService = claimService;
    }

    @GetMapping("/claims")
    public Iterable<Claim> claims() {
        Claim claim = new Claim();
        claim.setDescription("ololo");
        claimService.add(claim);
        return claimService.claims();
    }
}
