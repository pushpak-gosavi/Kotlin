fun main(){
    val objAirport = Airport("IND")
    val objPlane = Airport.Plane()
    objPlane.conact(objAirport)
}

class Airport(private val code:String) {
    class Plane{
        fun conact (airport: Airport){
            println(airport.code)
        }
    }
}