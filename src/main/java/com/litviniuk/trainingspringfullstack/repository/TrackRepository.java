package com.litviniuk.trainingspringfullstack.repository;

import com.litviniuk.trainingspringfullstack.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends JpaRepository<Track,Integer> {
}
