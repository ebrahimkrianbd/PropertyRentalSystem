package bd.ac.seu.server.service;

import bd.ac.seu.server.exception.ResourceAlreadyExistException;
import bd.ac.seu.server.model.Owner;
import bd.ac.seu.server.repository.OwnerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OwnerService {
    private OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public Owner createOwner(Owner owner){
        Optional<Owner> optionalBranch = ownerRepository.findById(owner.getOwnerNubmer());
        if(optionalBranch.isPresent()){
            throw new ResourceAlreadyExistException("branch is exist with id = " +owner.getOwnerNubmer());
        }
        else {
            return ownerRepository.save(owner);
        }
    }

    public Iterable<Owner> getAllOwner() {
        return ownerRepository.findAll();
    }

    public Owner getOwner(long id){
        return ownerRepository.findById(id).get();
    }


}
