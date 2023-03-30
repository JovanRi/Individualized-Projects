package com.ltp.getshows;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetshowsController {

    @GetMapping("/shows")
    public String getShows() {
        return "shows";
    }

}
