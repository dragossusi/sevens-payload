package ro.dragossusi.sevens.payload.game

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ro.dragossusi.sevens.payload.Card

@Deprecated("dont extend this")
@Serializable
data class CardsResponse(
    @SerialName("cards")
    override val cards: List<Card>
) : CardsContainer