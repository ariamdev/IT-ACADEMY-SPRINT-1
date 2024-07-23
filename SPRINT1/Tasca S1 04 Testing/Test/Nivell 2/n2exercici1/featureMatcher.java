package Test.n2exercici1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class featureMatcher {

    @Test
    public void mordorContains(){
        assertThat("Mordor",length(is(8)));
    }

    public static Matcher<String> length(Matcher<? super Integer> matcher){
        return new FeatureMatcher<String, Integer>( matcher, "a String of lenght that", "length") {
            @Override
            protected  Integer featureValueOf (String actual){
                return actual.length();
            }
        };

    }
}
