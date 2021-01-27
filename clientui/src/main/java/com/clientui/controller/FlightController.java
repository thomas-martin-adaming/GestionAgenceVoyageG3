package com.clientui.controller;

import com.clientui.beans.FlightBean;
import com.clientui.proxies.MicroServiceFlightProxies;
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
public class FlightController {

    @Autowired
    MicroServiceFlightProxies flightProxies;

    @GetMapping("/flights")
    public List<FlightBean> findAll() {
        return flightProxies.findAll();
    }

    @GetMapping("/flight/{idFlight}")
    public FlightBean findOne(@PathParam("idFlight") Long id) {
        return flightProxies.findOne(id);
    }

    @PostMapping("/flight")
    public FlightBean save(@RequestBody FlightBean flight) {
        return flightProxies.save(flight);
    }

    @DeleteMapping("/flight/{idFlight}")
    public void delete(@PathParam("idflight") Long id) {
        flightProxies.delete(id);
    }
}
