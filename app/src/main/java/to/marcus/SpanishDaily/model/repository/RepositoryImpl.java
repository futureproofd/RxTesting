package to.marcus.SpanishDaily.model.repository;

import java.util.ArrayList;

import javax.inject.Inject;

import to.marcus.SpanishDaily.model.AppPreferences;
import to.marcus.SpanishDaily.model.Word;
import to.marcus.SpanishDaily.model.WordStorage;

/**
 * Created by marcus on 9/4/2015.
 * Inject our model (database, json list) - WordStorage
 * Inject preferences to access application-wide preferences
 * Inject search history to access previous user search queries
 * use a repository interface (observable get methods)
 *      these will require an observable to obtain data from any source (database OR network pull)

 */
public class RepositoryImpl implements Repository{

    private final WordStorage mWordStorage;
    private final AppPreferences mAppPreferences;

    @Inject
    public RepositoryImpl(WordStorage wordStrg, AppPreferences appPrefs){
        mWordStorage = wordStrg;
        mAppPreferences = appPrefs;
    }

    @Override
    public void saveWords(){
        mWordStorage.saveWordsToJSON();
    }

    @Override
    public void addWord(Word word){
        mWordStorage.saveWord(word);
    }

    @Override
    public Word getWord(String itemId){
        return mWordStorage.getWord(itemId);
    }


    @Override
    public String getLatestWordDate(){
        return mWordStorage.getLatestDate();
    }

    @Override
    public Word getLatestWord(){
        return mWordStorage.getLatestWord();
    }

    @Override
    public ArrayList<Word> getWordsDataset(){
        return mWordStorage.getWordsDataSet();
    }

    @Override
    public int getDatasetSize(){
        return mWordStorage.wordCount();
    }

    @Override
    public void deleteWord(String itemId){
        mWordStorage.deleteWord(itemId);
    }

    @Override
    public void deleteWords() {
        mWordStorage.deleteAllWords();
    }

    @Override
    public void deleteFavorites(){
        mWordStorage.deleteFavorites();
    }

    @Override
    public void deleteRecycled(){
        mWordStorage.deleteRecycled();
    }

    @Override
    public void addFavorite(String itemId){
        mWordStorage.addFavorite(itemId);
    }

    @Override
    public void removeFavorite(String itemId){
        mWordStorage.removeFavorite(itemId);
    }

    @Override
    public void toggleFavorite(Word word){
        mWordStorage.toggleFavorite(word);
    }

    @Override
    public void toggleHidden(String itemId){
        mWordStorage.toggleHidden(itemId);
    }

    @Override
    public void setSearched(String itemId){
        mWordStorage.setSearched(itemId);
    }

    @Override
    public int getSearched(String itemId){
        return mWordStorage.getSearched(itemId);
    }

    /*
    Preferences
    */
    @Override
    public void saveWirelessPref(String key, boolean value){
        mAppPreferences.setWirelessPref(key, value);
    }

    @Override
    public void saveNotifyPref(String key, boolean value){
        mAppPreferences.setNotifyPref(key, value);
    }

    @Override
    public void savePullPref(String key, boolean value){
        mAppPreferences.setPullPref(key, value);
    }

    @Override
    public void saveGridCntHomePref(boolean value){
        mAppPreferences.setGridCntHome(value);
    }

    @Override
    public void saveGridCntFavPref(boolean value){
        mAppPreferences.setGridCntFav(value);
    }

    @Override
    public void saveGridCntRecyclePref(boolean value){
        mAppPreferences.setGridCntRecycle(value);
    }

    @Override
    public boolean getNotifyPref(){return mAppPreferences.getNotifyPref();}

    @Override
    public boolean getPullPref(){return mAppPreferences.getPullPref();}

    @Override
    public boolean getWirelessPref(){return mAppPreferences.getWirelessPref();}

    @Override
    public boolean getGridCntHomePref(){
        return mAppPreferences.getGridCntHome();
    }

    @Override
    public boolean getGridCntFavPref(){
        return mAppPreferences.getGridCntFav();
    }

    @Override
    public boolean getGridCntRecyclePref(){
        return mAppPreferences.getGridCntRecycle();
    }

    /*
    Sound Cache access
     */
    public void doSomething(){

    }

}
