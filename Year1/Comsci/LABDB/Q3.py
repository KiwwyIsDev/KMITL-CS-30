# Q3
import requests, json

headers = {"api-key": "ZswohoVvnFmxIxbh7dixxKhUtZO2RaYe"}
res = requests.get(
    "https://opend.data.go.th/get-ckan/datastore_search?resource_id=1c2f6045-c600-410a-995c-a37a88594ab4&limit=5",
    headers=headers,
)

# print(res.json())

resformat = json.dumps(json.loads(res.text), indent=4, ensure_ascii=False)
print(resformat)
