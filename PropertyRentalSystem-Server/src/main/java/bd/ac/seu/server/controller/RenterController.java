package bd.ac.seu.server.controller;

import bd.ac.seu.server.model.Renter;
import bd.ac.seu.server.service.RenterService;
import bd.ac.seu.server.service.RenterService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value ="renter" )
public class RenterController {
    private RenterService renterService;
    @GetMapping("all")
    @ResponseBody
    public List<Renter> getAllRenter(){
        return null;
    }
    @GetMapping("{id}")
    @ResponseBody
    public ResponseEntity<Renter> getRenter(@PathVariable long RenterNumber){
        return null;
    }
    @PostMapping
    @ResponseBody
    public ResponseEntity<Renter> createRenter(@RequestBody Renter Renter){
        try{
            Renter createdRenter = RenterService.createRenter(Renter);
            ResponseEntity<Renter> RenterResponseEntity = ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(createdRenter);
            return RenterResponseEntity;
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }
    @PutMapping(value = "{id}")
    @ResponseBody
    public Renter updateRenter(@PathVariable long id,@RequestBody Renter Renter){
        return null;
    }
    @DeleteMapping
    @ResponseBody
    public Renter deleteRenter(@PathVariable long id,@RequestBody Renter Renter){
        return null;
    }
}
