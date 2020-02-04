package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController {

    private CakeView cakeView;
    private CakeModel cakemodel;

    public void makeCake(CakeView view)
    {
       cakeView = view;
       cakemodel = view.getCakemodel();
    }

    public void onClick(View view)
    {

    }
}
