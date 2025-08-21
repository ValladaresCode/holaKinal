package org.jrae.holakinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @Autowired
    private final HolaServiceAI serviceAI;

    public HolaController(HolaServiceAI serviceAI) {
        this.serviceAI = serviceAI;
    }

    @GetMapping("/")
    public String holaKinal() {
        return this.serviceAI.generarSaludo();
    }

}
