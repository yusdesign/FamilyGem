package app.familygem.model.extra

class PersonWrapper(
    val personId: String
) {
    var socialEstate: String? = null
    var associations: MutableList<Association> = mutableListOf()
}
