package com.wonder.wonder.service.cards.calc.point;

import com.wonder.wonder.service.cards.resouse_NeedRename.ActionSide;
import lombok.Data;

/**
 * Created: godex
 * DATE: 20.06.17.
 */
@Data
public class WonderLevelCalcPointStrategyImpl implements CalcPointStrategy {
    private final ActionSide actionSide;
    private final int pointForOneCard;

    public WonderLevelCalcPointStrategyImpl(ActionSide actionSide, int pointForOneCard) {
        this.actionSide = actionSide;
        this.pointForOneCard = pointForOneCard;
    }

    @Override
    public int getPoints() {
        return 0;
    }
}
