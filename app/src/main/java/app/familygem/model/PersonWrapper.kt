package app.familygem.model

class PersonWrapper(
    val personId: String
) {
    var socialEstate: String? = null
    var associations: MutableList<Association> = mutableListOf()

    fun addAssociation(association: Association) {
        associations.add(association)
    }
}
