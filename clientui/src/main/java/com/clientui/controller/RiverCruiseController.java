package com.clientui.controller;

import com.clientui.beans.RiverCruiseBean;
import com.clientui.proxies.MicroServiceRiverCruiseProxies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@Controller
public class RiverCruiseController {

    @Autowired
    MicroServiceRiverCruiseProxies riverCruiseProxies;

    @GetMapping("/riverCruise")
    public List<RiverCruiseBean> findAll() {
        return riverCruiseProxies.findAll();
    }

    @GetMapping("/riverCruise/{idJourney}")
    public RiverCruiseBean findOne(@PathVariable("idJourney") Long id) {
        return riverCruiseProxies.findOne(id);
    }

    @PostMapping("/riverCruise")
    public RiverCruiseBean save(@RequestBody RiverCruiseBean riverCruise) {
        return riverCruiseProxies.save(riverCruise);
    }

    @DeleteMapping("/riverCruise/{idJourney}")
    public void delete(@PathVariable("idJourney") Long id) {
        riverCruiseProxies.delete(id);
    }
}
