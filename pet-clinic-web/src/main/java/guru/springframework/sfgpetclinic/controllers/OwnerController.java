package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author d.monterey on 09/07/2020
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String getOwners(){

        return "owners/index";
    }
}
