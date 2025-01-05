package net.youssfi.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class CryptoCurrency {
    @Id
    private String id;
    private String name;
    private String type;
    private  String unit;
    private double emission;
    private String consensusRule;
    private  String algorithm;
    private String protocol;
    private String platform;
    private String webSite;
    private String community;
}
