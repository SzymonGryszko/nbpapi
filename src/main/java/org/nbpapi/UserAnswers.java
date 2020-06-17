package org.nbpapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAnswers {

    private NBPCurrency currency;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;

    public void setCurrency(String currency) throws CurrencyNotFoundException {
        this.currency = NBPCurrency.parse(currency);
    }
}
