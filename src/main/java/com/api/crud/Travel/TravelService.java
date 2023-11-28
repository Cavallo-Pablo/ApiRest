package com.api.crud.Travel;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TravelService {

    private final TravelRepository travelRepo;
    public void createTravel(Travel travel) {
        travelRepo.save(travel);
    }
}
