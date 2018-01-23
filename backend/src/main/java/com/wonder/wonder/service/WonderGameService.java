package com.wonder.wonder.service;

import com.wonder.wonder.dto.BoardDto;
import com.wonder.wonder.dto.EventDto;
import com.wonder.wonder.model.Game;

/**
 * Created: Shostak Roman
 * Date: 24.06.2017.
 */
public interface WonderGameService  {


    void playCard(EventDto eventDto);

    BoardDto getCurrentBoard(Long gameId);
}

