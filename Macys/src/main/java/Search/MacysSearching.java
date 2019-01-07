package Search;

import base.CommonAPI;

public class MacysSearching extends CommonAPI {

    public void searchMenu(){
        typeOnElementEntry("#globalSearchInputField", "Dresses");
        navigateBack();
        typeOnElementEntry("#globalSearchInputField", "Bags");
        navigateBack();
        typeOnElementEntry("#globalSearchInputField", "Makeup");
        navigateBack();
        typeOnElementEntry("#globalSearchInputField", "Perfumes");
        navigateBack();
        typeOnElementEntry("#globalSearchInputField", "Watches");
        navigateBack();
        typeOnElementEntry("#globalSearchInputField", "Sunglasses");
        navigateBack();
    }
}

