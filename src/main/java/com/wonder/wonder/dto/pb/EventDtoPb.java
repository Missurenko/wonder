package com.wonder.wonder.dto.pb;

import com.wonder.wonder.cards.GameCard;
import lombok.Data;

/**
 * Creator: Pavlenko Bohdan
 * Date: 29.06.2017
 * Project: wonder
 */
@Data
public class EventDtoPb {
    private String nameEvent; // or enum
    private GameCard gameCard;
}
