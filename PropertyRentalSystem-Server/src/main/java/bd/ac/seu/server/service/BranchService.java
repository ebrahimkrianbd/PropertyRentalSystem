package bd.ac.seu.server.service;

import bd.ac.seu.server.exception.ResourceAlreadyExistException;
import bd.ac.seu.server.model.Branch;
import bd.ac.seu.server.repository.BranchRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BranchService {
    private BranchRepository branchRepository;

    public BranchService(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    public Branch createBranch(Branch branch){
        Optional<Branch> optionalBranch = branchRepository.findById(branch.getBranchNumber());
        if(optionalBranch.isPresent()){
            throw new ResourceAlreadyExistException("branch is exist with id = " +branch.getBranchNumber());
        }
        else {
            return branchRepository.save(branch);
        }
    }

    public Iterable<Branch> getAllBranch() {
        return branchRepository.findAll();
    }

    public Branch getBranch(long id){
        return branchRepository.findById(id).get();
    }

}
