package com.antibanmart.app

import android.app.*
import android.os.*
import android.graphics.Color
import android.view.*
import android.widget.*
import android.graphics.Typeface

class MainActivity : Activity() {
    lateinit var root: LinearLayout

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        showLogin()
    }

    fun base() {
        root = LinearLayout(this)
        root.orientation = LinearLayout.VERTICAL
        root.setPadding(35,35,35,35)
        root.setBackgroundColor(Color.WHITE)
        setContentView(root)
    }

    fun btn(t:String): Button {
        val b = Button(this)
        b.text = t
        b.textSize = 16f
        b.setTextColor(Color.WHITE)
        b.setBackgroundColor(Color.rgb(0,207,232))
        root.addView(b)
        return b
    }

    fun title(t:String) {
        val v = TextView(this)
        v.text = t
        v.textSize = 28f
        v.setTextColor(Color.rgb(0,188,212))
        v.typeface = Typeface.DEFAULT_BOLD
        v.gravity = Gravity.CENTER
        root.addView(v)
    }

    fun showLogin() {
        base()
        title("ANTIBAN MART")
        val m = EditText(this); m.hint="Mobile Number"; root.addView(m)
        val p = EditText(this); p.hint="Password"; root.addView(p)
        btn("Login").setOnClickListener { showLang() }
        btn("Create Account").setOnClickListener { Toast.makeText(this,"Account Created ✅",Toast.LENGTH_SHORT).show() }
    }

    fun showLang() {
        base()
        title("Select Language 🌐")
        btn("English").setOnClickListener { showHome() }
        btn("Hindi").setOnClickListener { showHome() }
        btn("Bengali").setOnClickListener { showHome() }
    }

    fun nav() {
        btn("🏠 Home").setOnClickListener { showHome() }
        btn("💰 Wallet").setOnClickListener { showWallet() }
        btn("💙 Root").setOnClickListener { showRoot() }
        btn("☎️ Support").setOnClickListener { showSupport() }
    }

    fun showHome() {
        base()
        title("ANTIBAN MART")
        val card = TextView(this)
        card.text = "\nEF PAID PANEL\n₹299\n"
        card.textSize = 22f
        card.gravity = Gravity.CENTER
        root.addView(card)
        btn("Buy Now")
        btn("Download Locked 🔒")
        nav()
    }

    fun showWallet() {
        base()
        title("Wallet")
        val t = TextView(this)
        t.text = "Balance: ₹0\n\nAdd Money\nScreenshot Upload\nUTR Submit"
        t.textSize = 20f
        root.addView(t)
        btn("Submit Payment")
        nav()
    }

    fun showRoot() {
        base()
        title("Root Services")
        val t = TextView(this)
        t.text = "OnePlus ₹299\nRealme ₹299\nRedmi ₹199\nSamsung ₹299\nVivo ₹299\nOppo ₹399"
        t.textSize = 20f
        root.addView(t)
        btn("Buy Root Service")
        nav()
    }

    fun showSupport() {
        base()
        title("Support")
        btn("Telegram")
        btn("Instagram")
        btn("WhatsApp")
        nav()
    }
}
