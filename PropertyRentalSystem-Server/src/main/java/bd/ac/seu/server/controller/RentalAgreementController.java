package bd.ac.seu.server.controller;

import bd.ac.seu.server.model.RentalAgreement;
import bd.ac.seu.server.model.RentalAgreement;
import bd.ac.seu.server.model.Renter;
import bd.ac.seu.server.service.RentalAgreementService;
import bd.ac.seu.server.service.RentalAgreementService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value ="rentalagreement" )
public class RentalAgreementController {
    private RentalAgreementService rentalAgreementService;
    @GetMapping("all")
    @ResponseBody
    public List<RentalAgreement> getAllRentalAgreement(){
        return null;
    }
    @GetMapping("{id}")
    @ResponseBody
    public ResponseEntity<RentalAgreement> getRentalAgreement(@PathVariable long RentalAgreementNumber){
        return null;
    }
    @PostMapping
    @ResponseBody
    public ResponseEntity<RentalAgreement> createRentalAgreement(@RequestBody RentalAgreement rentalAgreement){
        try{
            RentalAgreement createdRentalAgreement = rentalAgreementService.createRentalAgreement(rentalAgreement);
            ResponseEntity<RentalAgreement> RentalAgreementResponseEntity = ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(createdRentalAgreement);
            return RentalAgreementResponseEntity;
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }
    @PutMapping(value = "{id}")
    @ResponseBody
    public RentalAgreement updateRentalAgreement(@PathVariable long id,@RequestBody Renter renter){
        return null;
    }
    @DeleteMapping
    @ResponseBody
    public RentalAgreement deleteRentalAgreement(@PathVariable long id,@RequestBody Renter renter){
        return null;
    }
}
