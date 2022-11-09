# Tutorial to this: https://www.youtube.com/watch?v=qbLc5a9jdXo
# Stackexchange: https://api.stackexchange.com

import requests
import json

# ** consumption of the API **
#sends request to the url and sets it equal to response
response = requests.get(
    'https://api.stackexchange.com/2.3/questions?order=desc&sort=activity&site=stackoverflow')

# prints response and the data with the .json method. just like in postman

print(response.json())
# only lookes for items 
print(response.json()['items'])
# iteration
for data in response.json()['items']:
    if data['answer_count'] == 0 : #only prints if there are no answers jet
        print(data['title']) # prints every tittle attribute
        print(data['link']) # prints every link attribute
    else:
        print("skipped")
    print()       
