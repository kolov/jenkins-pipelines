package com.xxx

class Github {
    static def callMe(script, args) {
        script.sh "println '$args'"
    }

}