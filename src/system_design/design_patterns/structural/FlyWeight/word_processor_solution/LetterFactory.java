package system_design.design_patterns.structural.FlyWeight.word_processor_solution;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {

    Map<Character, ILetter> characterCache = new HashMap<>();


    public ILetter createCharacter(char character) {
        if (characterCache.containsKey(character)) {
            return characterCache.get(character);
        } else {
            ILetter iLetter = new DocumentCharacter(character, 4);
            characterCache.put(character, iLetter);
            return iLetter;
        }
    }
}
