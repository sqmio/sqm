package io.sqm.app.resource;

import io.sqm.app.entity.Claim;
import io.sqm.app.service.ClaimService;
import io.sqm.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
@CrossOrigin
public class ClaimResource {

    private ClaimService claimService;
    private UserService userService;

    @Autowired
    public ClaimResource(ClaimService claimService, UserService userService) {
        this.claimService = claimService;
        this.userService = userService;
    }

    @GetMapping("/claims")
    public Iterable<Claim> claims() {
        return claimService.claims();
    }

    @PostMapping(value = "/claims/add")
    public void createClaim(@RequestParam(value = "description") String description,
                            @RequestParam(value = "customerLogin") String customerLogin) {
        Claim claim = new Claim();
        claim.setDescription(description);
        claim.setCustomer(userService.getUserByLogin(customerLogin));
        claimService.save(claim);
    }
}
