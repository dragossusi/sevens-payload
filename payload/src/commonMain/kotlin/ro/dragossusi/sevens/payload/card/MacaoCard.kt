package ro.dragossusi.sevens.payload.card

import ro.dragossusi.sevens.payload.Card

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
val Card.isChangeColorMacao: Boolean
    get() = number == 11

/**
 * if can stop player
 */
val Card.isStopPlayerMacao: Boolean
    get() = number == 4

val Card.isDrawCardMacao: Boolean
    get() = number == 2 || number == 3

/**
 * if card can be placed
 */
fun Card.canBePlacedMacao(after:Card):Boolean{
    return type == after.type || number == after.number
}

/**
 * if this can cut card
 */
fun Card.canDrawMoreMacao(after: Card): Boolean {
    return isDrawCardMacao && (after.number == number || after.type == type)
}
