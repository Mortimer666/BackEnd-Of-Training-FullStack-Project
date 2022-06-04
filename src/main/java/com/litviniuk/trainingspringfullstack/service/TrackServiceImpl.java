package com.litviniuk.trainingspringfullstack.service;

import com.litviniuk.trainingspringfullstack.model.Track;
import com.litviniuk.trainingspringfullstack.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService{


    private final TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) {
        return trackRepository.save(track);
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }
}
