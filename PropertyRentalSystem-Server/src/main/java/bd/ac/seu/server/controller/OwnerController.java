package bd.ac.seu.server.controller;

import bd.ac.seu.server.model.Owner;
import bd.ac.seu.server.service.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping(value ="owner" )
public class OwnerController {
    private OwnerService ownerService;
    @GetMapping("all")
    @ResponseBody
    public List<Owner> getAllOwner(){
        return null;
    }
    @GetMapping("{id}")
    @ResponseBody
    public ResponseEntity<Owner> getOwner(@PathVariable long OwnerNumber){
        return null;
    }
    @PostMapping
    @ResponseBody
    public ResponseEntity<Owner> createOwner(@RequestBody Owner Owner){
        try{
            Owner createdOwner = ownerService.createOwner(Owner);
            ResponseEntity<Owner> ownerResponseEntity = ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(createdOwner);
            return ownerResponseEntity;
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }
    @PutMapping(value = "{id}")
    @ResponseBody
    public Owner updateOwner(@PathVariable long id,@RequestBody Owner owner){
        return null;
    }
    @DeleteMapping
    @ResponseBody
    public Owner deleteOwner(@PathVariable long id,@RequestBody Owner owner){
        return null;
    }

}
