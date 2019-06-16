package com.adammendak.crosswords.domain.dto;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CrosswordTableRepresentationDTO {
    private IntegerProperty crossNumber;
    private StringProperty crossValue;
    private StringProperty crossDescription;

    public CrosswordTableRepresentationDTO(IntegerProperty crossNumber,
                                           StringProperty crossValue,
                                           StringProperty crossDescription) {
        this.crossNumber = crossNumber;
        this.crossValue = crossValue;
        this.crossDescription = crossDescription;
    }
}
