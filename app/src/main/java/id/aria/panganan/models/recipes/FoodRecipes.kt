package id.aria.panganan.models.recipes


import com.google.gson.annotations.SerializedName

data class FoodRecipes(
    @SerializedName("results")
    val results: List<Result>
)