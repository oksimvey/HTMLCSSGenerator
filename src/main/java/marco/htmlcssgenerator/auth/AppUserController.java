package marco.htmlcssgenerator.auth;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class AppUserController {

    private final AppUserRepository repository;

    public AppUserController(AppUserRepository repository) {
        this.repository = repository;
    }

    @SuppressWarnings("null")
    @PostMapping
    public AppUser create(@RequestBody AppUser user) {
        return repository.save(user);
    }

    @GetMapping
    public List<AppUser> getAll() {
        return repository.findAll();
    }
}