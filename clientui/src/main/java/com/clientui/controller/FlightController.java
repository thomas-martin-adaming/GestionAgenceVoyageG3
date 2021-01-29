package com.clientui.controller;

import com.clientui.beans.FlightBean;
import com.clientui.proxies.MicroServiceFlightProxies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@Controller
public class FlightController {

    @Autowired
    MicroServiceFlightProxies flightProxies;

    @GetMapping("/flights")
    public List<FlightBean> findAll() {
        return flightProxies.findAll();
    }

    @GetMapping("/flight/{idJourney}")
    public FlightBean findOne(@PathVariable("idJourney") Long id) {
        return flightProxies.findOne(id);
    }

    @PostMapping("/flight")
    public FlightBean save(@RequestBody FlightBean flight) {
        return flightProxies.save(flight);
    }

    @DeleteMapping("/flight/{idJourney}")
    public void delete(@PathVariable("idJourney") Long idJourney) {
        flightProxies.delete(idJourney);
    }
}
