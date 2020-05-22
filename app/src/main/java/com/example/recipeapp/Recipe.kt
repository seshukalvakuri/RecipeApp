package com.example.recipeapp

class Recipe(var recipeId:Int, var recipeName:String, var recipeDescription:String ) {
  fun grtRecipeName():String{
      return recipeName
  }
    fun getDescription():String{
        return recipeDescription
    }
    fun getRecipeId():Long{
        return recipeId.toLong()
    }
}