package com.wy.adbook.mvp.view.activity;

import java.lang.System;

@android.support.annotation.IntDef(value = {1, 2})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000\u00a8\u0006\u0003"}, d2 = {"Lcom/wy/adbook/mvp/view/activity/LoginFor;", "", "Companion", "application_debug"})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
public abstract @interface LoginFor {
    public static final com.wy.adbook.mvp.view.activity.LoginFor.Companion Companion = null;
    public static final int FOR_PUT_ON = 1;
    public static final int FOR_REMOVE = 2;
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/wy/adbook/mvp/view/activity/LoginFor$Companion;", "", "()V", "FOR_PUT_ON", "", "FOR_REMOVE", "application_debug"})
    public static final class Companion {
        public static final int FOR_PUT_ON = 1;
        public static final int FOR_REMOVE = 2;
        
        private Companion() {
            super();
        }
    }
}