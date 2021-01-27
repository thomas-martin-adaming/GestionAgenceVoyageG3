package com.clientui.controller;

import com.clientui.beans.RiverCruiseBean;
import com.clientui.proxies.MicroServiceRiverCruiseProxies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/riverCruise/{idriverCruise}")
    public RiverCruiseBean findOne(@PathParam("idriverCruise") Long id) {
        return riverCruiseProxies.findOne(id);
    }

    @PostMapping("/riverCruise")
    public RiverCruiseBean save(@RequestBody RiverCruiseBean riverCruise) {
        return riverCruiseProxies.save(riverCruise);
    }

    @DeleteMapping("/riverCruise/{idRiverCruise}")
    public void delete(@PathParam("idriverCruise") Long id) {
        riverCruiseProxies.delete(id);
    }
}
