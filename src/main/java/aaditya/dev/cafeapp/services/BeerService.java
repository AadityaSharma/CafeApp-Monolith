package aaditya.dev.cafeapp.services;

import aaditya.dev.cafeapp.web.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

public interface BeerService {

    Optional<BeerDto> getBeerById(UUID uuid);
}
