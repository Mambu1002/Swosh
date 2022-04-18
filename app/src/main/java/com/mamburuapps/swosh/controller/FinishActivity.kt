package com.mamburuapps.swosh.controller

import android.os.Bundle
import com.mamburuapps.swosh.EXTRA_LEAGUE
import com.mamburuapps.swosh.EXTRA_SKILL
import com.mamburuapps.swosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val  skill = intent.getStringExtra((EXTRA_SKILL))
        searchLeagueText.text = "looking for $league  $skill  near you"
    }


}