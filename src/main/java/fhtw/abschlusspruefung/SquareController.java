package fhtw.abschlusspruefung;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareController {

    @GetMapping("api/square")
    public int square(int n) {
        return n * n;
    }

}
