package nlp.week2.Tokenization;

import java.io.*;
import java.util.*;
import java.util.Properties;

import edu.stanford.nlp.dcoref.CorefChain;
import edu.stanford.nlp.dcoref.CorefCoreAnnotations.CorefChainAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.NamedEntityTagAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.PartOfSpeechAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TextAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.process.CoreLabelTokenFactory;
import edu.stanford.nlp.process.PTBTokenizer;
import edu.stanford.nlp.process.Tokenizer;
import edu.stanford.nlp.process.TokenizerFactory;
import edu.stanford.nlp.semgraph.SemanticGraph;
import edu.stanford.nlp.semgraph.SemanticGraphCoreAnnotations.CollapsedCCProcessedDependenciesAnnotation;
import edu.stanford.nlp.trees.GrammaticalStructure;
import edu.stanford.nlp.trees.GrammaticalStructureFactory;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.trees.TreeCoreAnnotations.TreeAnnotation;
import edu.stanford.nlp.trees.TreebankLanguagePack;
import edu.stanford.nlp.trees.TypedDependency;
import edu.stanford.nlp.util.CoreMap;




public class Tokenize {
    
   
   
    public List cutter(String ST)   {
       LexicalizedParser LexP = LexicalizedParser.loadModel
        ("edu/stanford/nlp/models/lexparser/englishPCFG.ser.gz");
       //for term Token
       TokenizerFactory<CoreLabel> tokenizer = PTBTokenizer.factory
                                    (new CoreLabelTokenFactory(), "");
       Tokenizer<CoreLabel> token = tokenizer.getTokenizer(new StringReader(ST));
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
        return null;
    
    }
  
}



