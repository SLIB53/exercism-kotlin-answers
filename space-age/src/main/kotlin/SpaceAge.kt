import kotlin.math.round

val EarthOrbitalPeriod = 31557600.0
val MercuryOrbitalPeriod = 7600543.81992
val VenusOrbitalPeriod = 1.9414149052176E7
val MarsOrbitalPeriod = 5.9354032690079994E7
val JupiterOrbitalPeriod = 3.74355659124E8
val SaturnOrbitalPeriod = 9.292923628848E8
val UranusOrbitalPeriod = 2.6513700193296E9
val NeptuneOrbitalPeriod = 5.200418560032001E9

class SpaceAge(private val age: Long) {
    fun onEarth() = onPlanet(EarthOrbitalPeriod)

    fun onMercury() = onPlanet(MercuryOrbitalPeriod)

    fun onVenus() = onPlanet(VenusOrbitalPeriod)

    fun onMars() = onPlanet(MarsOrbitalPeriod)

    fun onJupiter() = onPlanet(JupiterOrbitalPeriod)

    fun onSaturn() = onPlanet(SaturnOrbitalPeriod)

    fun onUranus() = onPlanet(UranusOrbitalPeriod)

    fun onNeptune() = onPlanet(NeptuneOrbitalPeriod)

    private fun onPlanet(orbitalPeriod: Double): Double {
        return round((age / orbitalPeriod) * 100) / 100
    }
}
