package to.marcus.rxtesting.presenter.view;

import java.util.ArrayList;
import to.marcus.rxtesting.model.Word;

/**
 * Created by marcus on 9/14/2015
 */
public interface HomeView {
    void showLoading();
    void hideLoading();
    void showWordList(ArrayList<Word> words);
    void refreshWordList();
    void showNotification(String notification);
}
