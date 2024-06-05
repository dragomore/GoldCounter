package org.example

interface Dungeon {
    var normal: MutableMap<Int, Int>
    var heroic: MutableMap<Int, Int>

//    fun getRewards( difficulty: String ): Int{
//        var result = 0
//        when( difficulty ){
//            "normal" -> result = calculateRewards( "normal" )
//            "heroic" -> result = calculateRewards( "heroic" )
//        }
//        return result
//    }

//    fun getRewardByPhase( difficulty: String, phase: Int ): Int {
//        var result = 0
//        when( difficulty ) {
//            "normal" -> result = normal.getValue( phase )
//            "heroic" -> result = heroic.getValue( phase )
//        }
//        return result
//    }

    fun setRewardByPhase( difficulty: String, phase: Int, reward: Int){
        when( difficulty ){
            "normal" -> normal[ phase ] = reward
            "heroic" -> heroic[ phase ] = reward
        }
    }

    fun calculateRewards( difficulty: String ): Int{
        var result = 0
        when( difficulty ){
            "normal" -> {
                for( phase in normal ){
                    result += phase.value
                }
            }
            "heroic" -> {
                for( phase in heroic ){
                    result += phase.value
                }
            }
        }
        return result
    }
}