#variables for whole circle
spa = 126
eng = 380
franz = 206

#true values
spa_real = 6

#two varibles
ef = 140
fs = 60

#everyone
everyone = 18

#none



#variables of cuts minus middle
var_ef_minus = ((ef) - (everyone))
var_fs_minus = ((fs) - (everyone))
#var_se_minus = ((se) - (everyone))#

print (var_ef_minus, "cut between (eng,french) minus who speaks every language")
print (var_fs_minus, "cut between (french, span) minus who speaks every language")

#variables of cuts
var_sp_minus = ((spa) - (fs) - (spa_real))
print (var_sp_minus, "cut between span and eng")

#eng real
var_eng_real = ((eng) - (ef) - (var_sp_minus))
print (var_eng_real, "eng real")

#franz real
var_franz_real = ((franz) - (fs) - (var_ef_minus))
print (var_franz_real, "franz real")

#span real
var_span_real = ((spa) - (fs) - (var_sp_minus))
print (var_span_real, "spanish real")


#calculate complete
complete = ((var_franz_real) + (ef) + (var_fs_minus) + (var_eng_real) + (var_sp_minus) + (spa_real))
print (complete, "everything together")


print (500 - (complete), "G - everything")

