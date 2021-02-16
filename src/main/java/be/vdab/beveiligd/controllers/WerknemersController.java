package be.vdab.beveiligd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

@Controller
@RequestMapping("werknemers")
class WerknemersController {
    @GetMapping
    public String werknemers() {
        return "werknemers";
    }
}
