package app.familygem.model

class PersonExtra(
    val personId: String
) {
    var socialEstate: String? = null
    var associations: MutableList<Association> = mutableListOf()

    fun addAssociation(association: Association) {
        associations.add(association)
    }
}
