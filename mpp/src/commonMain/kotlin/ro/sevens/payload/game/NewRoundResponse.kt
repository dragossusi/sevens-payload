package ro.sevens.payload.game

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ro.sevens.payload.Card

@Serializable
class NewRoundResponse constructor(
    @SerialName("cards")
    override val cards: List<Card>,
    @SerialName("players")
    val players: List<SimplePlayerResponse>,
    @SerialName("starting_player_id")
    val startingPlayerId: Long,
    @SerialName("current_player_id")
    val currentPlayerId: Long,
    @SerialName("round_cards")
    val roundCards: List<Card>,
    @SerialName("won_points")
    val wonPoints: Int,
    @SerialName("won_cards")
    val wonCards: Int
):CardsContainer