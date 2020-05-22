package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
private lateinit var recipeListView:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recipeListView = findViewById(R.id.recipe_lv)
        //adapter provide data to list view, adapte gets that data from data source
        //val recipeAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,getRecipiTitle())
        val recipeCustomAdapter = RecipeAdapter(this,getrecipies())
      recipeListView.adapter = recipeCustomAdapter
    }
    //data source
    fun getrecipies():ArrayList<Recipe>{
        val recipies:ArrayList<Recipe>  = ArrayList()
        recipies.add(Recipe(1,"cake", "cake recipe description"))
        recipies.add(Recipe(2,"cake", "cake recipe description"))
        recipies.add(Recipe(3,"choclate", "choclate recipe description"))
        recipies.add(Recipe(4,"icecream", "icecream recipe description"))
        recipies.add(Recipe(5,"noodle", "noodle recipe description"))
        recipies.add(Recipe(6,"fruit cake", "fruit cake recipe description"))
        recipies.add(Recipe(7,"fruit cake", "fruit cake recipe description"))
        recipies.add(Recipe(8,"lolipop", "lolipop recipe description"))
        recipies.add(Recipe(9,"frankie", "frankie recipe description"))
        recipies.add(Recipe(10,"rice noodle", "rice noodle recipe description"))
        recipies.add(Recipe(11,"cupcake", "cupcake recipe description"))
        recipies.add(Recipe(12,"french fries", "french fries recipe description"))
        recipies.add(Recipe(13,"naan", "naan recipe description"))
        recipies.add(Recipe(14,"cheese balls", "cheese balls recipe description"))
        recipies.add(Recipe(15,"krispy kreme", "krispy kreme recipe description"))
        recipies.add(Recipe(16,"popsicles", "popsicles recipe description"))
        recipies.add(Recipe(17,"fried rice", "fried rice recipe description"))
        recipies.add(Recipe(18,"biryani", "biryani recipe description"))
        recipies.add(Recipe(18,"curry", "curry recipe description"))
    return recipies
    }

    fun getRecipiTitle():ArrayList<String>{
        val recipieTitleList:ArrayList<String> = ArrayList()
        recipieTitleList.add("Cake")
        recipieTitleList.add("choclate")
        recipieTitleList.add("icecream")
        recipieTitleList.add("noodle")
        recipieTitleList.add("fruit cake")
        recipieTitleList.add("lolipop")
        recipieTitleList.add("frankie")
        recipieTitleList.add("rice noodle")
        recipieTitleList.add("cupcake")
        recipieTitleList.add("french fries")
        recipieTitleList.add("naan")
        recipieTitleList.add("cheese balls")
        recipieTitleList.add("krispy kreme")
        recipieTitleList.add("popsicles")
        recipieTitleList.add("fried rice")
        recipieTitleList.add("biryani")
        recipieTitleList.add("curry")
        return recipieTitleList

    }
}
