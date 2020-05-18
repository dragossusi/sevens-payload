package ro.sevens.payload

import com.google.gson.annotations.SerializedName

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
class Card(
    @SerializedName("number")
    val number: Int,
    @SerializedName("type")
    val type: Type
) {

    override fun toString(): String {
        return "$number$type"
    }

    /**
     * if this can cut card
     */
    fun canCut(card: Card, playerCount: Int): Boolean {
        return card.number == number || number == 7 || (playerCount == 3 && number == 8)
    }

    fun theSame(card: Card): Boolean {
        return number == card.number && type == card.type
    }

    val isPoint: Boolean
        get() = number == 10 || number == 11

    enum class Type {
        @SerializedName("neagra")
        NEAGRA,

        @SerializedName("rosie")
        ROSIE,

        @SerializedName("romb")
        ROMB,

        @SerializedName("trefla")
        TREFLA
    }

}