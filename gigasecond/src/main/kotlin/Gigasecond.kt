import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(birthdate: LocalDateTime) {
    val date = birthdate.plusSeconds(1_000_000_000)

    constructor (birthdate: LocalDate) : this(birthdate.atStartOfDay())
}
