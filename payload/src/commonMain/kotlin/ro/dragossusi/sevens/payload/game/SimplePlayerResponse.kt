package ro.dragossusi.sevens.payload.game

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class SimplePlayerResponse constructor(
    @SerialName("id")
    val id: Long,
    @SerialName("name")
    val name: String,
    @SerialName("image")
    val image: String?,
    @SerialName("card_count")
    val cardCount: Int,
    @SerialName("won_cards")
    val wonCards: Int?,
    @SerialName("won_points")
    val wonPoints: Int?
)