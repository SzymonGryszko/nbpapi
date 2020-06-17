package org.nbpapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAnswers {
    private NBPCurrency currency;
    private LocalDate dateStart;
    private LocalDate dateEnd;

    public void setCurrency(String currency) throws CurrencyNotFoundException {
        this.currency = NBPCurrency.parse(currency);
    }

    public void setDateStart(String dateToParse) throws WrongDateException {
        this.dateStart = DateParseUtil.parseDate(dateToParse);
    }

    public void setDateEnd(String dateToParse) throws WrongDateException {
        this.dateEnd = DateParseUtil.parseDate(dateToParse, dateStart);
    }
}
