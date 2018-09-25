package bd.ac.seu.server.controller;

import bd.ac.seu.server.model.Staff;
import bd.ac.seu.server.model.Renter;
import bd.ac.seu.server.service.StaffService;
import bd.ac.seu.server.service.StaffService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value ="staff" )
public class StaffController {
    private StaffService staffService;
    @GetMapping("all")
    @ResponseBody
    public List<Staff> getAllStaff(){
        return null;
    }
    @GetMapping("{id}")
    @ResponseBody
    public ResponseEntity<Staff> getStaff(@PathVariable long staffNumber){
        return null;
    }
    @PostMapping
    @ResponseBody
    public ResponseEntity<Staff> createStaff(@RequestBody Staff staff){
        try{
            Staff createdStaff = staffService.createStaff(staff);
            ResponseEntity<Staff> StaffResponseEntity = ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(createdStaff);
            return StaffResponseEntity;
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }
    @PutMapping(value = "{id}")
    @ResponseBody
    public Staff updateStaff(@PathVariable long id,@RequestBody Staff staff){
        return null;
    }
    @DeleteMapping
    @ResponseBody
    public Staff deleteStaff(@PathVariable long id,@RequestBody Staff staff){
        return null;
    }
}
