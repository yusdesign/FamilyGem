package app.familygem.model

import java.io.Serializable

class Association(
    var personId: String? = null,
    var relationship: String? = null,
    var type: String? = null,
    var details: String? = null
) : Serializable
