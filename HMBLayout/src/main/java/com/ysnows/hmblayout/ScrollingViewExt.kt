package com.ysnows.hmblayout

import android.app.Activity
import android.view.View
import androidx.core.view.ScrollingView
import androidx.fragment.app.Fragment


fun View.findHmbLayout(): HMBLayout? {
    var parent = this.parent

    var isHmbLayout = parent is HMBLayout
    var isView = parent is View
    var isNull = parent == null
    var isRootContentView = (parent as View).id == android.R.id.content

    while (!isHmbLayout && isView && !isNull && !isRootContentView) {
        parent = parent?.parent
        isHmbLayout = parent is HMBLayout
        isView = parent is View
        isNull = parent == null
        isRootContentView = (parent as View).id == android.R.id.content
    }

    return if (isHmbLayout) parent as HMBLayout? else null

}

fun Fragment.findHmbLayout(): HMBLayout? {
    var parent = view?.parent

    var isHmbLayout = parent is HMBLayout
    var isView = parent is View
    var isNull = parent == null
    var isRootContentView = (parent as View).id == android.R.id.content

    while (!isHmbLayout && isView && !isNull && !isRootContentView) {
        parent = parent?.parent
        isHmbLayout = parent is HMBLayout
        isView = parent is View
        isNull = parent == null
        isRootContentView = (parent as View).id == android.R.id.content
    }

    return if (isHmbLayout) parent as HMBLayout? else null

}


fun ScrollingView.autoSetUpHmbLayout() {
    if (this !is View) {
        return
    }
    var parent = this.parent

    var isHmbLayout = parent is HMBLayout
    var isView = parent is View
    var isNull = parent == null
    var isRootContentView = (parent as View).id == android.R.id.content

    while (!isHmbLayout && isView && !isNull && !isRootContentView) {
        parent = parent?.parent
        isHmbLayout = parent is HMBLayout
        isView = parent is View
        isNull = parent == null
        isRootContentView = (parent as View).id == android.R.id.content
    }

    if (isHmbLayout) {
        (parent as HMBLayout).setBottomCurScrollingView(this)
    }


}
