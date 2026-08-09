package app.familygem.model

import java.io.Serializable

class PersonWrapper(
    val personId: String
) : Serializable {
    var socialEstate: String? = null
    var associations: MutableList<Association> = mutableListOf()

    fun addAssociation(association: Association) {
        associations.add(association)
    }
}
