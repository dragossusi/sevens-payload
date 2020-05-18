package ro.sevens.payload.game

import com.google.gson.annotations.SerializedName
import ro.sevens.payload.Card

/**
 * server
 *
 * Copyright (C) 2020  Rachieru Dragos-Mihai
 *
 * server is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with server.  If not, see [License](http://www.gnu.org/licenses/) .
 *
 */
open class PlayerTurnResponse(
    cards: List<Card>,
    @SerializedName("starting_player_id")
    val startingPlayerId: Long,
    @SerializedName("current_player_id")
    val currentPlayerId: Long,
    @SerializedName("round_cards")
    val roundCards: List<Card>
) : CardsResponse(cards)