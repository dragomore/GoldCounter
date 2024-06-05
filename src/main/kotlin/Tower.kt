package org.example

class Tower: Dungeon {
    override var normal: MutableMap<Int, Int> = mutableMapOf()
    override var heroic: MutableMap<Int, Int> = mutableMapOf()
}