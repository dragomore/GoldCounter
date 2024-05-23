package org.example

class Kayangel() : Dungeon{
    // TODO: переписать код так, что бы данные хранились в отдельном файле
    override var normalMode: MutableMap<Int, Int> = mutableMapOf(   1 to 1000,
                                                                    2 to 1500,
                                                                    3 to 2000)
    override var heroicMode: MutableMap<Int, Int> = mutableMapOf(   1 to 1500,
                                                                    2 to 2000,
                                                                    3 to 3000)

}