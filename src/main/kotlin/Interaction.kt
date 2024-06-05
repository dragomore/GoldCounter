package org.example

import java.sql.*

class Interaction {
    // classes:
    private val kayangel = Kayangel()
    private val brelshaza = Brelshaza()
    private val clown = Clown()
    private val akkan = Akkan()
    private val tower = Tower()

    // dungeon dictionary
    private val dungeonList: Map<Int, String> = mapOf(
        0 to "Kayangel",
        1 to "Brelshaza",
        2 to "Clown",
        3 to "Akkan",
        4 to "House of Wisdom"
    )

    // run the program
    fun run(){
        var isExit = false
        var characterName = ""
        do {
            println("1 - Select character")
            println("2 - Write data")
            println("3 - Show data")
            println("---! ! ! ! !---")
            println("4 - Remove character")
            println("5 - Clear data -- not working yet")
            println("---! ! ! ! !---")
            println("9 - exit")

            val action = readln().toInt()
            when( action ){
                // write name
                1 -> {
                    println("Character name: ")
                    characterName = readln()
                }
                // write dungeon
                2 -> {
                    println("Chose dungeon by ID:")
                    for ( dungeon in dungeonList )
                        println("${dungeon.key} - ${dungeon.value}")
                    val dungeonId = readln().toInt()
                    println("Enter difficulty: normal OR heroic")
                    val difficulty = readln()
                    inputPhaseDataAction( dungeonId, difficulty, characterName )
                }
                // show data
                3 -> {
                    val connection = connect()
                    showData( connection )
                    connection?.close()
                }
                4 -> {

                }
                // drop table
                5 ->{

                }
                // exit from program
                9 -> {
                    isExit = true
                }
            }
        } while( !isExit )
    }

    private fun inputPhaseDataAction( dungeonId: Int, difficulty: String, character: String){
        when( dungeonId ){
            // kayangel
            0 -> {
                println("Enter phase count: ")
                val phaseCount = readln().toInt()
                var i = 1
                while( i != phaseCount + 1 ){
                    println("Enter reward for phase $i: ")
                    val reward = readln().toInt()
                    when( difficulty ){
                        "normal" -> {
                            kayangel.setRewardByPhase( difficulty, i, reward )
                        }
                        "heroic" -> {
                            kayangel.setRewardByPhase( difficulty, i, reward )
                        }
                    }
                    i++
                }
                // save data
                when( difficulty ){
                    "normal" -> {
                        val connection = connect()
                        inputData( connection, character, dungeonList[dungeonId].toString(), difficulty, kayangel.calculateRewards( difficulty ))
                        connection?.close()
                    }
                    "heroic" -> {
                        val connection = connect()
                        inputData( connection, character, dungeonList[dungeonId].toString(), difficulty, kayangel.calculateRewards( difficulty ))
                        connection?.close()
                    }
                }
            }
            // brelshaza
            1 -> {
                println("Enter phase count: ")
                val phaseCount = readln().toInt()
                var i = 1
                while( i != phaseCount + 1 ){
                    println("Enter reward for phase $i: ")
                    val reward = readln().toInt()
                    when( difficulty ){
                        "normal" -> {
                            brelshaza.setRewardByPhase( difficulty, i, reward )
                        }
                        "heroic" -> {
                            brelshaza.setRewardByPhase( difficulty, i, reward )
                        }
                    }
                    i++
                }
                // save data
                when( difficulty ){
                    "normal" -> {
                        val connection = connect()
                        inputData( connection, character, dungeonList[dungeonId].toString(), difficulty, brelshaza.calculateRewards( difficulty ))
                        connection?.close()
                    }
                    "heroic" -> {
                        val connection = connect()
                        inputData( connection, character, dungeonList[dungeonId].toString(), difficulty, brelshaza.calculateRewards( difficulty ))
                        connection?.close()
                    }
                }
            }
            // clown
            2 -> {
                println("Enter phase count: ")
                val phaseCount = readln().toInt()
                var i = 1
                while( i != phaseCount + 1 ){
                    println("Enter reward for phase $i: ")
                    val reward = readln().toInt()
                    when( difficulty ){
                        "normal" -> {
                            clown.setRewardByPhase( difficulty, i, reward )
                        }
                        "heroic" -> {
                            clown.setRewardByPhase( difficulty, i, reward )
                        }
                    }
                    i++
                }
                // save data
                when( difficulty ){
                    "normal" -> {
                        val connection = connect()
                        inputData( connection, character, dungeonList[dungeonId].toString(), difficulty, clown.calculateRewards( difficulty ))
                        connection?.close()
                    }
                    "heroic" -> {
                        val connection = connect()
                        inputData( connection, character, dungeonList[dungeonId].toString(), difficulty, clown.calculateRewards( difficulty ))
                        connection?.close()
                    }
                }
            }
            // akkan
            3 -> {
                println("Enter phase count: ")
                val phaseCount = readln().toInt()
                var i = 1
                while( i != phaseCount + 1 ){
                    println("Enter reward for phase $i: ")
                    val reward = readln().toInt()
                    when( difficulty ){
                        "normal" -> {
                            akkan.setRewardByPhase( difficulty, i, reward )
                        }
                        "heroic" -> {
                            akkan.setRewardByPhase( difficulty, i, reward )
                        }
                    }
                    i++
                }
                // save data
                when( difficulty ){
                    "normal" -> {
                        val connection = connect()
                        inputData( connection, character, dungeonList[dungeonId].toString(), difficulty, akkan.calculateRewards( difficulty ))
                        connection?.close()
                    }
                    "heroic" -> {
                        val connection = connect()
                        inputData( connection, character, dungeonList[dungeonId].toString(), difficulty, akkan.calculateRewards( difficulty ))
                        connection?.close()
                    }
                }
            }
            // tower
            4 -> {
                println("Enter phase count: ")
                val phaseCount = readln().toInt()
                var i = 1
                while( i != phaseCount + 1 ){
                    println("Enter reward for phase $i: ")
                    val reward = readln().toInt()
                    when( difficulty ){
                        "normal" -> {
                            tower.setRewardByPhase( difficulty, i, reward )
                        }
                        "heroic" -> {
                            tower.setRewardByPhase( difficulty, i, reward )
                        }
                    }
                    i++
                }
                // save data
                when( difficulty ){
                    "normal" -> {
                        val connection = connect()
                        inputData( connection, character, dungeonList[dungeonId].toString(), difficulty, tower.calculateRewards( difficulty ))
                        connection?.close()
                    }
                    "heroic" -> {
                        val connection = connect()
                        inputData( connection, character, dungeonList[dungeonId].toString(), difficulty, tower.calculateRewards( difficulty ))
                        connection?.close()
                    }
                }
            }
        }
    }

    private fun connect(): Connection?{
        return try {
            val url = "jdbc:sqlite:src/main/resources/dungeons.db"
            DriverManager.getConnection(url)
        } catch( e: SQLException ){
            println( e.message )
            null
        }
    }
    private fun createTable( connection: Connection? ){
        val createTableSQL = "CREATE TABLE IF NOT EXISTS user(characterName TEXT, dungeonName TEXT, dungeonDifficulty TEXT, dungeonReward TEXT);"
        try {
            connection?.let {
                val statement: Statement = it.createStatement()
                statement.execute( createTableSQL )
            }
        } catch ( e: SQLException ){
            println( e.message )
        }
    }

    private fun dropTable( connection: Connection? ){
        val dropTableSQL = "DROP TABLE user"
        try{
            connection?.let {
                val statement = it.createStatement()
                statement.executeQuery( dropTableSQL )
            }
        } catch ( e: SQLException ){
            println( e.message )
        }
    }

    private fun showData( connection: Connection? ){
        val showTableSQL = "SELECT * FROM user"
        try{
            connection?.let {
                val statement: Statement = it.createStatement()
                val resultSet: ResultSet = statement.executeQuery( showTableSQL )
                println("Your dungeons:")
                while ( resultSet.next() ){
                    val charName = resultSet.getString( "characterName" )
                    val dungName = resultSet.getString( "dungeonName" )
                    val dungDiff = resultSet.getString( "dungeonDifficulty" )
                    val dungReward = resultSet.getString( "dungeonReward" )
                    println("$charName : $dungName($dungDiff) -> $dungReward")
                }
            }
        } catch ( e: SQLException ){
            println( e.message )
        }
    }
    private fun inputData( connection: Connection?, characterName: String, dungeonName: String, dungeonDifficulty: String, dungeonReward: Int ){
        val insertDataSQL = "INSERT INTO user VALUES(\"$characterName\", \"$dungeonName\", \"$dungeonDifficulty\", \"$dungeonReward\");"
        if( !isDungeonExist(connection, characterName, dungeonName, dungeonDifficulty) ){
            try {
                connection?.let {
                    val statement: Statement = it.createStatement()
                    statement.execute( insertDataSQL )
                }
            } catch ( e: SQLException ){
                println( e.message )
            }
        }
        else{
            println("This dungeon already exist")
        }
    }

    private fun isDungeonExist( connection: Connection?, characterName: String, dungeonName: String, dungeonDifficulty: String): Boolean{
        val characterDungeonSQL = "SELECT * FROM user WHERE $characterName IN ($dungeonName, $dungeonDifficulty);"
        try {
            connection?.let {
                val statement: Statement = it.createStatement()
                val resultSet: ResultSet = statement.executeQuery( characterDungeonSQL )
                if( resultSet.next() )
                    return true
            }
        } catch ( e: SQLException ){
            println( e.message )
        }
        return false
    }
}