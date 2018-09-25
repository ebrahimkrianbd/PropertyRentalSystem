package bd.ac.seu.server.controller;

import bd.ac.seu.server.model.Branch;
import bd.ac.seu.server.service.BranchService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value ="branch" )
public class BranchController {
    private BranchService branchService;
    @GetMapping("all")
    @ResponseBody
    public List<Branch> getAllBranch(){
        return null;
    }
    @GetMapping("{id}")
    @ResponseBody
    public ResponseEntity<Branch> getBranch(@PathVariable long branchNumber){
        return null;
    }
    @PostMapping
    @ResponseBody
    public ResponseEntity<Branch> createBranch(@RequestBody Branch branch){
        try{
            Branch createdBranch = branchService.createBranch(branch);
            ResponseEntity<Branch> branchResponseEntity = ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(createdBranch);
            return branchResponseEntity;
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }
    @PutMapping(value = "{id}")
    @ResponseBody
    public Branch updateBranch(@PathVariable long id,@RequestBody Branch branch){
        return null;
    }
    @DeleteMapping
    @ResponseBody
    public Branch deleteBranch(@PathVariable long id,@RequestBody Branch branch){
        return null;
    }


}
