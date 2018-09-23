package bd.ac.seu.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerController {
    @RequestMapping(value="/")
    @ResponseBody
    public String intdex(){
        return "Bangladehs";
    }
}
