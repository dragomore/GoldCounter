package org.example

interface Dungeon {
    // TODO: переписать код так, что бы вместо 1,2 были данные из коллекции 1 to normal; 2 to heroic
    var normalMode: MutableMap<Int, Int>
    var heroicMode: MutableMap<Int, Int>


    // установить фазу + награду за фазу
    fun setData(mode: Int, phase: Int, reward: Int){
        when( mode ){
            1 -> normalMode[phase] = reward
            2 -> heroicMode[phase] = reward
            else -> error("Не существующий режим")
        }
    }
    // установить фазу с учётом null-награды
    fun setPhase(mode: Int, phase: Int, reward: Int?){
        when( mode ){
            1 -> normalMode[phase] = reward ?: 0
            2 -> heroicMode[phase] = reward ?: 0
            else -> error("Не существующий режим")
        }
    }

    // установить награду за фазу
    fun setReward(mode: Int, phase: Int, newReward: Int){
        when( mode ){
            1 -> normalMode.replace( phase, newReward )
            2 -> heroicMode.replace( phase, newReward )
            else -> error("Не существующий режим")
        }
    }
    // получить информацию о фазе
    fun getPhaseInfo(mode: Int, phase: Int): Int {
        return when( mode ){
            1 -> normalMode.getValue( phase )
            2 -> heroicMode.getValue( phase )
            else -> error("Не существующий режим")
        }
    }
}