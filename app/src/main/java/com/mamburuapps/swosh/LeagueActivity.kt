package com.mamburuapps.swosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedLeague =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
     fun leagueNextClicked(view:View){
         if (selectedLeague!=""){
             val skillActivity = Intent(this, SkillActivity::class.java)
             skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
             startActivity(skillActivity)
         } else {
             Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()}

     }

     fun onMensClicked(view: View){
         womenLeagueBtn.isChecked = false
         coedBtn.isChecked = false
         selectedLeague = "mens"
     }

    fun onWomenClicked(view: View){
        menLeagueBtn.isChecked= false
        coedBtn.isChecked = false
        selectedLeague = "womens"
    }

    fun onCoedClicked(view: View){
        menLeagueBtn.isChecked= false
        womenLeagueBtn.isChecked = false
        selectedLeague = "Co-Ed"
    }
}