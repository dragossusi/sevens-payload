package ro.sevens.payload.game

import com.google.gson.annotations.SerializedName
import ro.sevens.payload.Card

open class CardsResponse(
    @SerializedName("cards")
    val cards: List<Card>
)