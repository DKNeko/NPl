package nlp.week2.Tokenization;

import java.io.*;
import java.util.*;

import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.parser.lexparser.*;
import edu.stanford.nlp.process.*;
import edu.stanford.nlp.trees.*;


public class Tokenize {
public static void main(String[] args) throws IOException {
    for (String arg : args) {
      // option #1: By sentence.
      DocumentPreprocessor dp = new DocumentPreprocessor(arg);
      for (List<HasWord> sentence : dp) {
        System.out.println(sentence);
      }
      // option #2: By token
      PTBTokenizer<CoreLabel> ptbt = new PTBTokenizer<>(new FileReader(arg),
              new CoreLabelTokenFactory(), "");
      while (ptbt.hasNext()) {
        CoreLabel label = ptbt.next();
        System.out.println(label);
      }
    }
  }
}



