package com.litviniuk.trainingspringfullstack.controller;

import com.litviniuk.trainingspringfullstack.model.Track;
import com.litviniuk.trainingspringfullstack.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trackList")
@CrossOrigin
public class TrackController {

    private final TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @PostMapping("/add")
    public String add(@RequestBody Track track) {
        trackService.saveTrack(track);
        return "New Track is added";
    }

    @GetMapping("/getAll")
    public List<Track> getAllTracks() {
        return trackService.getAllTracks();
    }

}
