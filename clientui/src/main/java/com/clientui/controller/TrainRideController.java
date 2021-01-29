package com.clientui.controller;

import com.clientui.beans.RiverCruiseBean;
import com.clientui.beans.TrainRideBean;
import com.clientui.proxies.MicroServiceRiverCruiseProxies;
import com.clientui.proxies.MicroServiceTrainRideProxies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@Controller
public class TrainRideController {

    @Autowired
    MicroServiceTrainRideProxies trainRideProxies;

    @GetMapping("/trainRide")
    public List<TrainRideBean> findAll() {
        return trainRideProxies.findAll();
    }

    @GetMapping("/trainRide/{idJourney}")
    public TrainRideBean findOne(@PathVariable("idJourney") Long id) {
        return trainRideProxies.findOne(id);
    }

    @PostMapping("/trainRide")
    public TrainRideBean save(@RequestBody TrainRideBean trainRide) {
        return trainRideProxies.save(trainRide);
    }

    @DeleteMapping("/trainRide/{idJourney}")
    public void delete(@PathVariable("idJourney") Long id) {
        trainRideProxies.delete(id);
    }
}
