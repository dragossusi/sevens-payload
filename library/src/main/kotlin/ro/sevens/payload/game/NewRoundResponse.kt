package ro.sevens.payload.game

import com.google.gson.annotations.SerializedName
import ro.sevens.payload.Card

class NewRoundResponse(
    cards: List<Card>,
    startingPlayerId: Long,
    currentPlayerId: Long,
    roundCards: List<Card>,
    @SerializedName("won_points")
    val wonPoints: Int,
    @SerializedName("won_cards")
    val wonCards: Int
) : PlayerTurnResponse(cards, startingPlayerId, currentPlayerId, roundCards) {
}