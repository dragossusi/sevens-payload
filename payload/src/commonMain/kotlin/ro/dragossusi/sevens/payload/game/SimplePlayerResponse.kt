package ro.dragossusi.sevens.payload.game

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ro.dragossusi.sevens.payload.base.UserData

@Serializable
data class SimplePlayerResponse constructor(
    @SerialName("id")
    override val id: Long,
    @SerialName("name")
    val name: String,
    @SerialName("image")
    override val image: String?,
    @SerialName("card_count")
    val cardCount: Int,
    @SerialName("won_cards")
    val wonCards: Int?,
    @SerialName("won_points")
    val wonPoints: Int?
) : UserData {

    override val username: String
        get() = name

}