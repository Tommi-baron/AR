package com.google.ar.sceneform.samples.hellosceneform;

import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.google.ar.sceneform.ux.ArFragment;

public class ArFragmentEx extends ArFragment {

    @Override
    public void onResume() {
        super.onResume();
        setARConfig();
    }

    private void setARConfig() {
        if(getArSceneView() != null && getArSceneView().getSession() != null){
            Session session = getArSceneView().getSession();
            Config config = new Config(session);
            config.setPlaneFindingMode(Config.PlaneFindingMode.HORIZONTAL_AND_VERTICAL);
            config.setFocusMode(Config.FocusMode.AUTO);
            config.setUpdateMode(Config.UpdateMode.LATEST_CAMERA_IMAGE);
            session.configure(config);
        }
    }
}
