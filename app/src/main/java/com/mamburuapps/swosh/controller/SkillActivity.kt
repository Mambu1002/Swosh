package com.mamburuapps.swosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.mamburuapps.swosh.EXTRA_LEAGUE
import com.mamburuapps.swosh.EXTRA_SKILL
import com.mamburuapps.swosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
    }
    fun onBallerClick(view: View){
     beginnerSkillBtn.isChecked = false
        skill = "Baller"
    }
    fun onBeginnerClick(view: View){
        ballerSkillBtn.isChecked=false
        skill = "beginner"
    }
    fun onSkillFinishClick(view: View){
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)} else {
            Toast.makeText(this, "please select skill level", Toast.LENGTH_SHORT).show()
        }

    }
}