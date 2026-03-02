package com.remteh.joycontester;

import android.graphics.Color;

public class JoyConTestActivity extends BaseTestActivity {
    @Override protected int getAccentColor() { return Color.parseColor("#E60012"); }
    @Override protected String getControllerTitle() { return "🔴  JOY-CON / PRO"; }
    @Override protected String[] getFaceButtonLabels() { return new String[]{"B", "A", "Y", "X"}; }
    @Override protected int[] getFaceButtonColors() {
        return new int[]{ 0xFFE60012, 0xFFE60012, 0xFF0AB9E6, 0xFF0AB9E6 };
    }
    @Override protected String getShoulderLeftLabel() { return "L"; }
    @Override protected String getShoulderRightLabel() { return "R"; }
    @Override protected String getTriggerLeftLabel() { return "ZL"; }
    @Override protected String getTriggerRightLabel() { return "ZR"; }
    @Override protected String getStartLabel() { return "+"; }
    @Override protected String getSelectLabel() { return "—"; }
    @Override protected String getSystemLabel() { return "HOME ⌂"; }
    @Override protected String getExtraLabel() { return "CAPTURE ◻"; }
}
