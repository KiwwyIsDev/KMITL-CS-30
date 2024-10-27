# Q2
import requests, json

url = "https://online-movie-database.p.rapidapi.com/auto-complete"

query = {"q": "dead p"}

headers = {
    "x-rapidapi-key": "ccff853f45mshca622d12d5d65fdp1020bajsncca6b5d32221",
    "x-rapidapi-host": "online-movie-database.p.rapidapi.com",
}

res = requests.get(url, headers=headers, params=query)

# print(res.json())
# res = json.loads(res.text)
# resformat = json.dumps(res, indent=4)
# print(resformat)

for movie in res.json()["d"]:
    print(movie["l"])
