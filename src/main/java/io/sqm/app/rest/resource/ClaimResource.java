package io.sqm.app.rest.resource;

import io.sqm.app.entity.Claim;
import io.sqm.app.entity.Currency;
import io.sqm.app.entity.User;
import io.sqm.app.rest.form.ClaimForm;
import io.sqm.app.rest.resource.exception.RequestNotFoundException;
import io.sqm.app.service.ClaimService;
import io.sqm.app.service.ClaimStatusService;
import io.sqm.app.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
    public List<Claim> claims() {
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

    @PostMapping(value = "/claim/create")
    @ApiOperation(value = "Operation to create claim")
    public void createClaim(@Valid @RequestBody ClaimForm claimForm) {
        Claim claim = createClaimFromForm(claimForm);
        claim.setStatus(claimStatusService.getById(1L));
        claimService.save(claim);
    }

    private Claim createClaimFromForm(ClaimForm claimForm) {
        Claim.ClaimBuilder claimBuilder = Claim.builder();
        User customer = userService.getUserByLogin(claimForm.getCustomerLogin());
        Currency currency = Currency.find(claimForm.getReqCurrency());
        claimBuilder.description(claimForm.getDescription());
        claimBuilder.shortDescription(claimForm.getShortDescription());
        claimBuilder.customer(customer);
        claimBuilder.reqMoney(claimForm.getReqMoney());
        claimBuilder.reqCurrency(currency);
        return claimBuilder.build();
    }
}
