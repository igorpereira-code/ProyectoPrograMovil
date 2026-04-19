import kotlinx.serialization.Serializable

@Serializable
sealed class NavRoute {

    @Serializable
    object Profile : NavRoute()

    @Serializable
    object ProfileEdit : NavRoute()
}