package io.sqm.app.resource;

import io.sqm.app.entity.Claim;
import io.sqm.app.service.ClaimService;
import io.sqm.app.service.ClaimStatusService;
import io.sqm.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
@CrossOrigin
public class ClaimResource {

    private ClaimService claimService;
    private UserService userService;
    private ClaimStatusService claimStatusService;

    @Autowired
    public ClaimResource(ClaimService claimService, UserService userService, ClaimStatusService claimStatusService) {
        this.claimService = claimService;
        this.userService = userService;
        this.claimStatusService = claimStatusService;
    }

    @GetMapping("/claims")
    public Iterable<Claim> claims() {
        return claimService.claims();
    }

    @PostMapping(value = "/claims/add")
    public void createClaim(@RequestParam(value = "description") String description,
                            @RequestParam(value = "customerLogin") String customerLogin,
                            @RequestParam(value = "statusId") Long statusId) {
        Claim claim = new Claim();
        claim.setDescription(description);
        claim.setCustomer(userService.getUserByLogin(customerLogin));
        claim.setStatus(claimStatusService.getById(statusId));
        claimService.save(claim);
    }
}
