package ro.sevens.payload.game

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ro.sevens.payload.Card

@Serializable
class NewRoundResponse constructor(
    @SerialName("cards")
    val cards: Array<Card>,
    @SerialName("players")
    val players: Array<SimplePlayerResponse>,
    @SerialName("starting_player_id")
    val startingPlayerId: Long,
    @SerialName("current_player_id")
    val currentPlayerId: Long,
    @SerialName("round_cards")
    val roundCards: Array<Card>,
    @SerialName("won_points")
    val wonPoints: Int?,
    @SerialName("won_cards")
    val wonCards: Int?
) {

    override fun toString(): String {
        return "NewRoundResponse(cards=${cards.contentToString()}, players=$players, startingPlayerId=$startingPlayerId, currentPlayerId=$currentPlayerId, roundCards=${roundCards.contentToString()}, wonPoints=$wonPoints, wonCards=$wonCards)"
    }
}