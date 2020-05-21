package ro.sevens.payload.game

import com.google.gson.annotations.SerializedName

class SimplePlayerResponse constructor(
    @SerializedName("id")
    val id: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String?,
    @SerializedName("card_count")
    val cardCount: Int,
    @SerializedName("won_cards")
    val wonCards: Int,
    @SerializedName("won_points")
    val wonPoints: Int
)