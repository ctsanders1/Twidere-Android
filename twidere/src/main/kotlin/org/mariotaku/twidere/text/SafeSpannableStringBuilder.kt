package org.mariotaku.twidere.text

import android.text.SpannableStringBuilder

import org.mariotaku.twidere.util.CheckUtils
import org.mariotaku.twidere.util.TwidereStringUtils

/**
 * Created by Ningyuan on 2015/5/1.
 */
class SafeSpannableStringBuilder(source: CharSequence) : SpannableStringBuilder(source) {

    init {
        TwidereStringUtils.fixSHY(this)
    }

    override fun setSpan(what: Any, start: Int, end: Int, flags: Int) {
        if (!CheckUtils.checkRange(this, start, end)) {
            // Silently ignore
            return
        }
        super.setSpan(what, start, end, flags)
    }


}
