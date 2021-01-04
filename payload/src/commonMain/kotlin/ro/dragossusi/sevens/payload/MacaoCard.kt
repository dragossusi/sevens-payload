package ro.dragossusi.sevens.payload

/**
 * sevens-game
 *
 * Copyright (C) 2020  Rachieru Dragos-Mihai
 *
 * sevens-game is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * sevens-game is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with sevens-game.  If not, see [License](http://www.gnu.org/licenses/) .
 *
 */

/**
 * if card is cut
 */
val ro.dragossusi.sevens.payload.Card.isChangeColor: Boolean
    get() = number == 11

/**
 * if can stop player
 */
val ro.dragossusi.sevens.payload.Card.isStopPlayer: Boolean
    get() = number == 4

val ro.dragossusi.sevens.payload.Card.isDrawCard: Boolean
    get() = number == 2 || number == 3

/**
 * if this can cut card
 */
fun ro.dragossusi.sevens.payload.Card.canAddMore(card: ro.dragossusi.sevens.payload.Card): Boolean {
    return isDrawCard && (card.number == number || card.type == type)
}
