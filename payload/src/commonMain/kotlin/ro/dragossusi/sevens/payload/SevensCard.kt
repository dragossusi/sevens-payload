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
fun Card.isCut(playerCount: Int): Boolean {
    return number == 7 || (playerCount == 3 && number == 8)
}

/**
 * if this can cut card
 */
fun Card.canCut(card: Card, playerCount: Int): Boolean {
    return card.number == number || number == 7 || (playerCount == 3 && number == 8)
}

val Card.isSevensPoint: Boolean
    get() = number == 10 || number == 11