package nlp.week2.Tokenization;

import java.io.*;
import java.util.*;
import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import edu.stanford.nlp.process.*;
import edu.stanford.nlp.trees.*;
//import edu.stanford.nlp.pipeline.*;
//import edu.stanford.nlp.util.*;

public class Tokenize {
    public List cutter(String st)   {
       LexicalizedParser LexP = LexicalizedParser.loadModel
        ("edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz");
       //for term Token
       TokenizerFactory<CoreLabel> tokenizer = PTBTokenizer.factory(new CoreLabelTokenFactory(), "");
       Tokenizer<CoreLabel> token = tokenizer.getTokenizer(new StringReader(st));
       //for map class objects as keys 
       List<CoreLabel>  word = token.tokenize();
       //for the parse tree of the current sentence
        Tree parse = LexP.apply(word);
        TreebankLanguagePack tree = LexP.treebankLanguagePack();
       //for Grammar of sentence
        GrammaticalStructureFactory gramstruct = tree.grammaticalStructureFactory();
        GrammaticalStructure struct = gramstruct.newGrammaticalStructure(parse);
        List<TypedDependency> sent = struct.typedDependenciesCCprocessed();
        // creates a StanfordCoreNLP object, with POS tagging, lemmatization, NER, parsing, and coreference resolution
        /*Properties props = new Properties();
        props.put("annotators","tokenize, ssplit, pos, lemma, ner, parse, dcoref");
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);*/
        // read text form textbox
       //Annotation annotation = new Annotation(text);
        return sent;
    }
  
}



