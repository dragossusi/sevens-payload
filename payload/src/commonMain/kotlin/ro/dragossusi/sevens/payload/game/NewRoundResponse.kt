package ro.dragossusi.sevens.payload.game

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ro.dragossusi.sevens.payload.Card

@Serializable
data class NewRoundResponse constructor(
    @SerialName("cards")
    val cards: List<Card>,
    @SerialName("players")
    val players: List<SimplePlayerResponse>,
    @SerialName("starting_player_id")
    val startingPlayerId: Long,
    @SerialName("current_player_id")
    val currentPlayerId: Long,
    @SerialName("round_cards")
    val roundCards: List<Card>,
    @SerialName("won_points")
    val wonPoints: Int?,
    @SerialName("won_cards")
    val wonCards: Int?
) {

}