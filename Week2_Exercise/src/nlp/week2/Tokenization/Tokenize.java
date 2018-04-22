package nlp.week2.Tokenization;

import java.io.*;
import java.util.*;

import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.parser.lexparser.*;
import edu.stanford.nlp.process.*;
import edu.stanford.nlp.trees.*;


public class Tokenize {
/*LexicalizedParser lp = LexicalizedParser.loadModel("edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz");
TokenizerFactory<CoreLabel> tokenizerFactory = PTBTokenizer.factory(new CoreLabelTokenFactory(), "");
Tokenizer<CoreLabel> tok = tokenizerFactory.getTokenizer(new StringReader("This is an example text"));
java.util.List<CoreLabel> rawWords = tok.tokenize();
Tree parse = lp.apply(rawWords);
TreebankLanguagePack tlp = lp.treebankLanguagePack();
GrammaticalStructureFactory gsf = tlp.grammaticalStructureFactory();
GrammaticalStructure gs = gsf.newGrammaticalStructure(parse);
List<TypedDependency> tdl = gs.typedDependenciesCCprocessed();
for (TypedDependency tdl_token : regEx) {

String w = tdl_token.dep().word();
System.out.println(w);

}*/
}

