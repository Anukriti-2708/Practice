import os                     #The OS module in Pytehon provides functions for interacting with the operating system.
import time                   #The Python time module provides many ways of representing time in code
import playsound              #With this module, you can play a sound file with a single line of code
import speech_recognition as sr      #Recognize speech input from the microphone.
from gtts import gTTS              # converts the text entered, into audio

def speak (text):                                #converts given text to speech
    tts=gTTS(text=text , lang="en")
    filename = "voice.mp3"
    tts.save(filename)
    playsound.playsound(filename)

def get_audio():
    r = sr.Recognizer()
    with sr.Microphone()as source:
      audio = r.listen(source)
      said =""

      try:
        said = r.recognize_google(audio)
        print(said)
      except Exception as e:
        print("Exception " + str(e))

    return said
