@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Java CI/CD Pipeline - Version 2!";
    }
}
