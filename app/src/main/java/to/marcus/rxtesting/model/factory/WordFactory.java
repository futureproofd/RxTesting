package to.marcus.rxtesting.model.factory;

import to.marcus.rxtesting.model.Word;

/**
 * Created by marcus on 9/8/2015.
 * get word of the day
 *  1. create a newWord in presenter using factory method
 *  2. add some repository data to that word
 */
public interface WordFactory{
    Word newWordInstance();
}
