package cs301.birthdaycake;

public class CakeController {

    private CakeView cakeView;
    private CakeModel cakemodel;

    public void makeCake(CakeView view)
    {
       cakeView = view;
       cakemodel = view.getCakemodel();
    }

}
