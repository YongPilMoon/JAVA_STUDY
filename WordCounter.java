/**
 * Created by nick on 17. 1. 3.
 */

import java.util.HashMap;
import java.util.Map;
public class WordCounter {
    static String LOREM_IPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed orci libero, mollis vitae metus in, faucibus bibendum urna. Praesent vel luctus libero. Morbi eros ex, suscipit vel commodo sit amet, sagittis ac justo. Suspendisse eget arcu nec dui rutrum aliquet. Morbi vestibulum est in tellus commodo, id semper purus sagittis. Integer non lorem vitae nunc ornare sodales. Suspendisse tempor arcu et lacus condimentum accumsan. Etiam vehicula magna ligula, ac hendrerit nisl dignissim sed. Curabitur sed feugiat libero, eu imperdiet neque. Donec sed tellus purus. Aliquam vitae neque at ante scelerisque vehicula sodales vel tellus. Quisque ornare tellus vel nulla pulvinar, et pharetra ex rhoncus. Proin lacinia nisl massa, eu condimentum nisi efficitur id.\n" +
            "\n" +
            "Donec tempor nunc at tortor sodales egestas. Praesent eu feugiat tellus, vel finibus lacus. Donec ac pulvinar nulla. Nunc gravida, nisl sed ultricies sodales, erat purus aliquam tortor, in facilisis lorem nulla volutpat justo. Pellentesque at iaculis leo. Cras molestie imperdiet varius. Donec non egestas sem. Duis eu egestas velit, ut ornare leo. In fringilla lacinia purus, vitae aliquam metus tincidunt a. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Phasellus eget turpis tellus.\n" +
            "\n" +
            "Curabitur vel tellus ut est sodales finibus a egestas nunc. Cras et feugiat purus. Vestibulum egestas id urna at luctus. Integer quis ipsum eget leo semper vulputate. Nam dictum commodo ipsum, ut placerat magna elementum at. Donec finibus odio nec turpis feugiat condimentum. Integer et finibus lorem, ut efficitur justo. Quisque porttitor nibh vitae diam faucibus, vitae pretium libero consequat. Sed eget turpis vitae nunc bibendum vehicula. Nulla scelerisque pellentesque felis, quis cursus neque luctus sollicitudin. Suspendisse sed dui eget mauris convallis commodo non consequat odio. Cras vel tempor dui. Etiam id sem tristique, mattis nisi sed, imperdiet diam. Nunc at libero imperdiet, laoreet massa a, luctus orci. Integer sodales bibendum mauris et gravida. Curabitur at posuere justo, maximus maximus dolor.\n" +
            "\n" +
            "Morbi a ipsum ipsum. Fusce a consectetur purus, a placerat lacus. Sed tincidunt mauris eget rhoncus aliquam. Aliquam dui metus, maximus quis mi eu, tempus imperdiet lectus. Nulla odio neque, tempor cursus hendrerit id, mollis nec elit. Curabitur et nisi lacus. Fusce commodo sollicitudin tempus. Vivamus et enim hendrerit orci tincidunt ullamcorper. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Morbi facilisis tristique interdum. Phasellus posuere odio sed ex consequat, vel luctus enim condimentum. Vestibulum sollicitudin risus a augue feugiat pretium. Vivamus consequat quam ut neque tristique blandit.\n" +
            "\n" +
            "Nunc euismod dignissim erat sit amet semper. Phasellus varius arcu lacus, sit amet laoreet libero commodo eu. Suspendisse in nunc et enim sodales mollis vitae ac mauris. Aenean a tristique nisl. Aliquam molestie malesuada mi. Integer commodo turpis sit amet purus faucibus posuere. Nulla velit sem, semper in cursus sit amet, aliquam sit amet libero. Sed scelerisque orci a dolor aliquam, at pharetra tellus sagittis. Praesent mattis diam suscipit vulputate pellentesque. Cras tristique magna nec ante sagittis rutrum. Etiam laoreet elementum ipsum non maximus. Mauris ligula magna, faucibus efficitur pulvinar et, viverra id libero. Praesent in diam et lacus lacinia eleifend.";

    public static void main(String[] args) {

        String[] words;
        String regex = "^[a-zA-Z]+";
        words = LOREM_IPSUM.split(" |\\n");
        Map<String, Integer> wordCount = new HashMap<>();

        for(String word: words){
            if (word.length() == 0)
                continue;
            else if(!word.matches(regex))
                word = word.substring(0, word.length()-1);

            if (wordCount.containsKey(word))
                wordCount.put(word, wordCount.get(word) + 1);
            else
                wordCount.put(word, 1);
        }

        for ( String key : wordCount.keySet() ) {
            System.out.println(key + ": " + wordCount.get(key));
        }
    }
}
