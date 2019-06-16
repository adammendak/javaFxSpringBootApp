package com.adammendak.crosswords.domain.mapper;

import com.adammendak.crosswords.domain.CrosswordEntry;
import com.adammendak.crosswords.domain.dto.CrosswordTableRepresentationDTO;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CrosswordEntryToDTO {

    public static CrosswordTableRepresentationDTO entityToDto(CrosswordEntry entity) {
        CrosswordTableRepresentationDTO dto = new CrosswordTableRepresentationDTO();
        dto.setCrossNumber(new SimpleIntegerProperty(entity.getId().intValue()));
        dto.setCrossValue(new SimpleStringProperty(entity.getValue()));
        dto.setCrossDescription(new SimpleStringProperty(entity.getDescription()));
        return dto;
    }
}
