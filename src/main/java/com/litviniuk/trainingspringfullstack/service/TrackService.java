package com.litviniuk.trainingspringfullstack.service;

import com.litviniuk.trainingspringfullstack.model.Track;

import java.util.List;

public interface TrackService {
    public void saveTrack(Track track);

    public List<Track> getAllTracks();
}
