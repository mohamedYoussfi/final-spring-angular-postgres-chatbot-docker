package net.youssfi.backend.web;

import net.youssfi.backend.entities.CryptoCurrency;
import net.youssfi.backend.repository.CryptoCurrencyRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class HotelsController {
    private CryptoCurrencyRepository hotelRepository;

    public HotelsController(CryptoCurrencyRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    @GetMapping("/crypto")
    public List<CryptoCurrency> listHotels(){
        return hotelRepository.findAll();
    }
}
