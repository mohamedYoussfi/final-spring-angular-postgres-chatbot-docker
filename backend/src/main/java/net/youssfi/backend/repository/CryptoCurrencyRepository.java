package net.youssfi.backend.repository;

import net.youssfi.backend.entities.CryptoCurrency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CryptoCurrencyRepository extends JpaRepository<CryptoCurrency, String> {
}
