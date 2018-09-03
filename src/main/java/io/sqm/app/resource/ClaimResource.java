package io.sqm.app.resource;

import io.sqm.app.entity.Claim;
import io.sqm.app.resource.exception.RequestNotFoundException;
import io.sqm.app.service.ClaimService;
import io.sqm.app.service.ClaimStatusService;
import io.sqm.app.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/", produces = "application/json")
@CrossOrigin
@Api(tags = {"Claim"})
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
    @ApiOperation(value = "Operation to get all claims")
    public Iterable<Claim> claims() {
        return claimService.getAll();
    }

    @GetMapping("/claim/{id}")
    @ApiOperation(value = "Operation to get claim by id")
    public Claim claim(@PathVariable("id") Long id) {
        Claim claim = claimService.getById(id);
        if (claim == null) {
            throw new RequestNotFoundException("Claim with id " + id + " not found");
        }
        return claim;
    }

    @PostMapping(value = "/claims/add")
    @ApiOperation(value = "Operation to create claim", hidden = true)
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
