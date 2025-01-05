package net.youssfi.backend;

import net.youssfi.backend.entities.CryptoCurrency;
import net.youssfi.backend.repository.CryptoCurrencyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.UUID;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CryptoCurrencyRepository cryptoCurrencyRepository){
        return args -> {
           cryptoCurrencyRepository.save(
             CryptoCurrency.builder()
                     .id(UUID.randomUUID().toString())
                     .name("Binance Coin (BNB)")
                     .unit("BNB")
                     .emission(200000000.0)
                     .type("service")
                     .protocol("open source")
                     .algorithm("Ethash")
                     .platform("Binance")
                     .consensusRule("Proof of Work")
                     .webSite("https://binance.com")
                     .community("Annonces projet, Facebook, Medium, Reddit, Steemit, Telegram")
                     .build()
           );
            cryptoCurrencyRepository.save(
                    CryptoCurrency.builder()
                            .id(UUID.randomUUID().toString())
                            .name("Bitcoin (BTC)")
                            .unit("BTC")
                            .emission(21_000_000.0)
                            .type("Paiement")
                            .protocol("open source")
                            .algorithm("SHA 256")
                            .platform("Binance, Bitfinex, Bittrex, Coinbase, GDAX")
                            .consensusRule("Proof of Work")
                            .webSite("https://bitcoin.fr")
                            .community("Bitcointalk (forum), GitHub, Reddit.")
                            .build()
            );
            cryptoCurrencyRepository.save(
                    CryptoCurrency.builder()
                            .id(UUID.randomUUID().toString())
                            .name("Ethereum (ETH)")
                            .unit("ETH")
                            .emission(72_000_000.0)
                            .type("infrastructure")
                            .protocol("open source")
                            .algorithm("Ethash")
                            .platform("Binance, Bitfinex, Bittrex, Coinbase, GDAX")
                            .consensusRule("Proof of Work")
                            .webSite("https://www.ethereum.org/")
                            .community("Blog, Twitter, GitHub, Youtube, Reddit, Facebook, Gitter")
                            .build()
            );
            cryptoCurrencyRepository.save(
                    CryptoCurrency.builder()
                            .id(UUID.randomUUID().toString())
                            .name("TRON (TRX)")
                            .unit("TRX")
                            .emission(100_000_000_000.0)
                            .type("service")
                            .protocol("open source")
                            .algorithm("Ethash")
                            .platform("Binance, HitBTC, Huobi, Yobit")
                            .consensusRule("Proof of Replication")
                            .webSite("https://tron.network/")
                            .community("Discord, Facebook, GitHub, Reddit, Telegram.")
                            .build()
            );
        };
    }

}
