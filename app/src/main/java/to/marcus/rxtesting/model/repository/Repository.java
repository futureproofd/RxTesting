package to.marcus.rxtesting.model.repository;

import java.util.ArrayList;
import java.util.Map;

import rx.Observable;
import to.marcus.rxtesting.model.Word;
import to.marcus.rxtesting.model.Words;

/**
 * Created by marcus on 9/8/2015
 *
 */
public interface Repository {

    void addWord(Word word);
    void addFavorite(int position);
    void toggleFavorite(Word word);
    void saveWords();
    void setHidden(int position);
    Word getWord(int position);
    String getLatestWordDate();
    ArrayList<Word> getWordsDataset();
    int getDatasetSize();
    void deleteWord(int position);
    void deleteWords();
    void deleteFavorites();
    //Preference values
    void saveWirelessPref(String key, boolean value);
    void saveNotifyPref(String key, boolean value);
    void savePullPref(String key, boolean value);
    boolean getWirelessPref();
    boolean getNotifyPref();
    boolean getPullPref();
    Word getLatestWord();

}
