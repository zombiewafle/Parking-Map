package uvg.Map.Parking

import java.util.ArrayList

class Levels(
        var name: String = " ",
        var width: Int = 0,
        var height: Int = 0,
        var Id: Int = 0,
        var Walls: ArrayList<Walls>,
        var Parking: ArrayList<ParkingMap>,
        var Plates: ArrayList<String>

){
    override fun toString(): String {
        return """
            Nivel:
                Name: $name
                ID:$Id
        """.trimIndent()
    }
}