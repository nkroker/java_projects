/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speechutils;

import java.beans.PropertyVetoException;
import java.util.Locale;

import javax.speech.AudioException;
import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.EngineStateError;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Voice;

public class SpeechUtils {
  
  SynthesizerModeDesc desc;
  Synthesizer synthesizer;
  Voice voice;
  

  public void init(String voiceName) 
    throws EngineException, AudioException, EngineStateError, 
           PropertyVetoException 
  {
    if (desc == null) {
      
      System.setProperty("freetts.voices", 
        "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
      
      desc = new SynthesizerModeDesc(Locale.US);
      Central.registerEngineCentral
        ("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
      synthesizer = Central.createSynthesizer(desc);
      synthesizer.allocate();
      synthesizer.resume();
      SynthesizerModeDesc smd = 
        (SynthesizerModeDesc)synthesizer.getEngineModeDesc();
      Voice[] voices = smd.getVoices();
      Voice voice = null;
      for(int i = 0; i < voices.length; i++) {
        if(voices[i].getName().equals(voiceName)) {
          voice = voices[i];
          break;
        }
      }
      synthesizer.getSynthesizerProperties().setVoice(voice);
    }
    
  }

  public void terminate() throws EngineException, EngineStateError {
    synthesizer.deallocate();
  }
  
  public void doSpeak(String speakText) 
    throws EngineException, AudioException, IllegalArgumentException, 
           InterruptedException 
  {
      synthesizer.speakPlainText(speakText, null);
      synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);

  }
  
  
  public static void main (String[]args) throws Exception{
    SpeechUtils su = new SpeechUtils();
    
    su.init("kevin16");
    // high quality
    su.doSpeak("Hii Nikhil\n how are you welcome to Clezaar");
    su.terminate();
  }
} 