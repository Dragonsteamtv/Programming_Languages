Here is the documentation for the first category on PicoCTF called:
** GENERAL SKILLS **

/// CTF: Obedient Cat
Description
This file has a flag in plain sight (aka "in-the-clear"). https://mercury.picoctf.net/static/0e428b2db9788d31189329bed089ce98/flag

Solving: 
Step 1: Download or import into Browser Shell using: wget {url}

Step 2: run cat {file} | to extract the contents of the file

Solution: picoCTF{s4n1ty_v3r1f13d_2fd6ed29}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 |

/// CTF: Python Wrangling
Description
Python scripts are invoked kind of like programs in the Terminal... 
Can you run this Python script{https://mercury.picoctf.net/static/325a52d249be0bd3811421eacd2c877a/ende.py} 
using this password {https://mercury.picoctf.net/static/325a52d249be0bd3811421eacd2c877a/pw.txt} 
to get the flag {https://mercury.picoctf.net/static/325a52d249be0bd3811421eacd2c877a/flag.txt.en}?

Solving:
Step 1: Step 1: Download or import into Browser Shell using: wget {url}

Step 2: run cat the pw.txt to get the Password: ac9bd0ffac9bd0ffac9bd0ffac9bd0ff

Step 3: run python ende.py -d (flag for decription) flag.txt.en

Step 4: put in the password to start decription

Solution:
picoCTF{4p0110_1n_7h3_h0us3_ac9bd0ff}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 | 

/// CTF: Wave a flag
Description
Can you invoke help flags for a tool or binary? 
This program has extraordinarily helpful information... {https://mercury.picoctf.net/static/f95b1ee9f29d631d99073e34703a2826/warm}

Solving: 
Step 1: Step 1: Download or import into Browser Shell using: wget {url}

Step 2: run strings {file} to get the strings of the document
        --> Results in finding these lines:
       Hello user! Pass me a -h to learn what I can do!
       Oh, help? I actually don't do much, but I do have this flag here: picoCTF{b1scu1ts_4nd_gr4vy_f0668f62}
       I don't know what '%s' means! I do know what -h means though!

Solution: 
picoCTF{b1scu1ts_4nd_gr4vy_f0668f62}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 | needed minimal research

/// CTF: Nice netcat...
Description
There is a nice program that you can talk to by using this command in a shell:
$ nc mercury.picoctf.net 21135, but it doesn't speak English...

Solving:
Step 1: Step 1: Download or import into Browser Shell using: wget {url}

Step 2: run the command nc mercury.picoctf.net 21135 --> result:
112 105 99 111 67 84 70 123 103 48 48 100 95 107 49 116 116 121 33 95 
110 49 99 51 95 107 49 116 116 121 33 95 97 102 100 53 102 100 97 52 125 10

Step 3: input Text into ASCII to text converter

Solution: 
picoCTF{g00d_k1tty!_n1c3_k1tty!_afd5fda4}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 | 
Comment:
For this i had to think a little bit what these numbers where. But I soon got it.

/// CTF: Static ain't always noise
Description
Can you look at the data in this binary: static{https://mercury.picoctf.net/static/0f6ea599582dcce7b4f1ba94e3617baf/static}? 
This BASH script{https://mercury.picoctf.net/static/0f6ea599582dcce7b4f1ba94e3617baf/ltdis.sh} might help!

Step 1: Download or import into Browser Shell using: wget {url}

Step 2: run bash ltdis.sh static --> output into static.ltdis.strings.txt

Step 3: cat static.ltdis.strings.txt 
        --> 6e8 Oh hai! Wait what? A flag? Yes, it's around here somewhere!
            7c7 ;*3$"
            1020 picoCTF{d15a5m_t34s3r_6f8c8200}

Solution: 
picoCTF{d15a5m_t34s3r_6f8c8200}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 | 

/// CTF: Tab, Tab, Attack
Using tabcomplete in the Terminal will add years to your life, esp. 
when dealing with long rambling directory structures and filenames: Addadshashanammu.zip {https://mercury.picoctf.net/static/9689f2b453ad5daeb73ca7534e4d1521/Addadshashanammu.zip}

Step 1: Step 1: Download or import into Browser Shell using: wget {url}

Step 2: unzip {url} to unzip the file

Step 3: cd into the last directory

Step 4: run strings fang-of-haynekhtnamet to extract the key in the strings of the file

Solution: 
picoCTF{l3v3l_up!_t4k3_4_r35t!_2bcfb2ab}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 | 

/// CTF: Magikarp Ground Mission
Description
Do you know how to move between directories and read files in the shell? Start the container, 
`ssh` to it, and then `ls` once connected to begin.
Login via `ssh` as `ctf-player` with the password, `a13b7f9d`

Solution:
picoCTF{xxsh_0ut_0f_\/\/4t3r_71be5264}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 | 

///CTF: Lets Warm Up
Description
If I told you a word started with 0x70 in hexadecimal,
what would it start with in ASCII?

///CTF: what's a net cat? 
Description
Using netcat (nc) is going to be pretty important.
Can you connect to jupiter.challenges.picoctf.org at port 64287 to get the flag?

Step 1: run nc jupiter.challenges.picoctf.org

solution:
picoCTF{nEtCat_Mast3ry_284be8f7}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 | 

///CTF: strings it
Description
Can you find the flag in file{https://jupiter.challenges.picoctf.org/static/5bd86036f013ac3b9c958499adf3e2e2/strings} without running it?

Step 1: run wget {url}

Step 2: run strings {file} | grep picoCTF

Solution:
picoCTF{5tRIng5_1T_827aee91}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 | 

///CTF: First Grep
Description
Can you find the flag in file{https://jupiter.challenges.picoctf.org/static/495d43ee4a2b9f345a4307d053b4d88d/file}? 
This would be really tedious to look through manually, something tells me there is a better way.

Step 1: run wget {url}

Step 2: run strings file | grep picoCTF

Solution:
picoCTF{grep_is_good_to_find_things_dba08a45}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 | 

\\\\///CTF

///CTF:PW Crack 4
Description
Can you crack the password to get the flag?
Download the password checker here{https://artifacts.picoctf.net/c/60/level4.py} 
and you'll need the encrypted flag{https://artifacts.picoctf.net/c/60/level4.flag.txt.enc} 
and the hash{https://artifacts.picoctf.net/c/60/level4.hash.bin} in the same directory too.
There are 100 potential passwords with only 1 being correct. 
You can find these by examining the password checker script.

Step 1: wget {url}

Step 2: nano level4.py

Step 3: modify the script with a for loop so the file insert its on password and checks the mby itself:
        for p in pos_pw_list:
        user_pw = p
        user_pw_hash = hash_pw(p)
        if( user_pw_hash == correct_pw_hash):
            print("Welcome back... your flag, user:")
            decryption = str_xor(flag_enc.decode(), user_pw)
            print(decryption)
            break
        else:
            print("That password is incorrect")

Solution:
picoCTF{fl45h_5pr1ng1ng_d770d48c}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 2/10 | 

///CTF: PW Crack 5
Description
Can you crack the password to get the flag?
Download the password checker here{https://artifacts.picoctf.net/c/79/level5.py} 
and you'll need the encrypted flag{https://artifacts.picoctf.net/c/79/level5.flag.txt.enc} 
and the hash{https://artifacts.picoctf.net/c/79/level5.hash.bin} in the same directory{https://artifacts.picoctf.net/c/79/dictionary.txt} too. 
Here's a dictionary with all possible passwords based on the password conventions we've seen so far.

Step 1: wget {url}

Step 2: Make the same modifications to the python script but this time reading the dictionairy and .strip the lines from the dictionairy:
dict_pw = open('dictionary.txt', 'r+').readlines()

def level_5_pw_check():
    for p in dict_pw:
        user_pw = p.strip()
        print(user_pw)
        user_pw_hash = hash_pw(user_pw)
        print(user_pw_hash)
        print(correct_pw_hash)
        if( user_pw_hash == correct_pw_hash ):
            print("Welcome back... your flag, user:")
            decryption = str_xor(flag_enc.decode(), user_pw)
            print(decryption)
            break
        print("That password is incorrect")

Step 3: Run the script 

Solution:
picoCTF{h45h_sl1ng1ng_36e992a6}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 | 

///CTF: runme.py
Description
Run the runme.py{https://artifacts.picoctf.net/c/86/runme.py} script to get the flag. 
Download the script with your browser or with wget in the webshell.

Step 1: wget {url}

Step 2: run python {file}

Solution:
picoCTF{run_s4n1ty_run}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 0/10 | 

///CTF: Serpentine
Description
Find the flag in the Python script!
Download Python script{https://artifacts.picoctf.net/c/94/serpentine.py}

Step 1: wget {url}

Step 2: edit the file so on the case statement it runs the print_flag function:
        elif choice == 'b':
            print_flag()

Step 3: Run and anser b to print the flag

Solution:
picoCTF{7h3_r04d_l355_7r4v3l3d_aa2340b2}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 | 

///CTF: First Find
Description
Unzip this archive and find the file named 'uber-secret.txt'
Download zip file {https://artifacts.picoctf.net/c/551/files.zip}

Step 1: wget 

Step 2: unzip {file}

Step 3: run find | grep uber-secret.txt
        result: 
        /learning/picoctf/files/adequate_books/more_books/.secret/deeper_secrets/deepest_secrets

Step 4: cat uber-secret.txt

Solution:
picoCTF{f1nd_15_f457_ab443fd1}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 | 

///CTF: Big Zip
Description
Unzip this archive and find the flag.
Download zip file {https://artifacts.picoctf.net/c/554/big-zip-files.zip}

Step 1: wget {url} 

Step 2: untip {filename}

Step 3: grep -r "pico" ./big-zip-files.zip  | -r flag stands for recursive

Solution:
picoCTF{gr3p_15_m4g1c_ef8790dc}

///CTF: Based
Description
To get truly 1337, you must understand different data encodings, such as hexadecimal or binary. Can you get the flag from this program to prove you are on the way to becoming 1337? Connect with nc jupiter.challenges.picoctf.org 29221.

///CTF: plumbing
Description
Sometimes you need to handle process data outside of a file. 
Can you find a way to keep the output from this program and search for the flag? 
Connect to jupiter.challenges.picoctf.org 7480.

Step 1: nc jupiter.challenges.picoctf.org 7480 > response.txt

Step 2: run strings response.txt | grep pico 

Solution:
picoCTF{digital_plumb3r_06e9d954}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 | 

///CTF: mus1c
Description
I wrote you a song{https://jupiter.challenges.picoctf.org/static/c594d8d915de0129d92b4c41e25a2313/lyrics.txt}. 
Put it in the picoCTF{} flag format.

Step 1: Put lyrics.txt contents into the rockstar programming Language: 
        114 114 114 111 99 107 110 114 110 48 49 49 51 114

Step 2: convert from ASCII to Text: rrrocknrn0113r

Solution:
picoCTF{rrrocknrn0113r}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 | Already knew about the Art of Code Presentation