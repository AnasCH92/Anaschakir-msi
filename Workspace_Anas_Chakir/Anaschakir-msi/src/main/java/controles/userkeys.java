package controles;

import anas.msi.userapi.entities.User;
import anas.msi.userapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Anas_MSI/V1")
public class UserRestController {

    @Autowired
    private UserService service;

    @GetMapping("/Anas_MSI")
    public Page<User> getAUsers(Pageable pageable) {
        return service.selectAll(pageable);
    }

    @PostMapping("/Anas_MSI")
    public getAusers insert(@RequestBody User U) {
        return service.insert(U);
    }

}

