package ro.sevens.payload.game

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ro.sevens.payload.Card

@Deprecated("dont extend this")
@Serializable
class CardsResponse(
    @SerialName("cards")
    override val cards: List<Card>
):CardsContainer