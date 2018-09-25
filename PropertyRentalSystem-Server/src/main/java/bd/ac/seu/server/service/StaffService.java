package bd.ac.seu.server.service;

import bd.ac.seu.server.model.Staff;
import bd.ac.seu.server.repository.StaffRepository;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
    private StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public Staff createStaff(Staff staff) {
        return staffRepository.save(staff);
    }
}
