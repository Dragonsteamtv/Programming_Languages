Here is the documentation for the first category on PicoCTF called:
** GENERAL SKILLS **

/// CTF 1: Obedient Cat
Description
This file has a flag in plain sight (aka "in-the-clear"). https://mercury.picoctf.net/static/0e428b2db9788d31189329bed089ce98/flag

Solving: 
Step 1: Download or import into Browser Shell using: wget {url}

Step 2: run cat {file} | to extract the contents of the file

Solution: picoCTF{s4n1ty_v3r1f13d_2fd6ed29}

Conclusion: 
Hints Needed: 0 | Personal diffculty: 1/10 |

/// CTF 2: Python Wrangling
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

/// CTF 3: Wave a flag
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

/// CTF 4: Nice netcat...
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

/// CTF 5: Static ain't always noise
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

/// CTF 6: Tab, Tab, Attack
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

/// CTF 7: Magikarp Ground Mission
Description
Do you know how to move between directories and read files in the shell? Start the container, 
`ssh` to it, and then `ls` once connected to begin.
Login via `ssh` as `ctf-player` with the password, `a13b7f9d`

Solution:
picoCTF{xxsh_0ut_0f_\/\/4t3r_71be5264}

///CTF 8: Lets Warm Up
Description
If I told you a word started with 0x70 in hexadecimal,
what would it start with in ASCII?
