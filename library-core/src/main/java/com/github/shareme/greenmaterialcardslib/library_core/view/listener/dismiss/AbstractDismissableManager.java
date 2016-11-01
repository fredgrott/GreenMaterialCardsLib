/*
 * ******************************************************************************
 *   Copyright (c) 2013-2014 Gabriele Mariotti.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *  *****************************************************************************
 */

package com.github.shareme.greenmaterialcardslib.library_core.view.listener.dismiss;

import android.widget.Adapter;

import com.github.shareme.greenmaterialcardslib.library_core.internal.Card;


/**
 * @author Gabriele Mariotti (gabri.mariotti@gmail.com)
 */
@SuppressWarnings("unused")
public abstract class AbstractDismissableManager implements Dismissable {

    protected Adapter mAdapter;

    @Override
    public final boolean isDismissable(int position, Card card) {
        return card.isSwipeable();
    }

    @Override
    public abstract SwipeDirection getSwipeDirectionAllowed();


    public void setAdapter(Adapter adapter) {
        mAdapter = adapter;
    }
}
