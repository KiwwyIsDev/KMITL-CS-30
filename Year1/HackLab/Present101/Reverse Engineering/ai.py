import requests
import time

data = [
    {
        "event": "laBrowseNext",
        "properties": {
            "$os": "Windows",
            "$browser": "Chrome",
            "$referrer": "https://ed20.engdis.com/",
            "$referring_domain": "ed20.engdis.com",
            "$current_url": "https://ed20.engdis.com/Runtime/learningArea.html?v=5",
            "$browser_version": 128,
            "$screen_height": 768,
            "$screen_width": 1366,
            "mp_lib": "web",
            "$lib_version": "2.55.1",
            "$insert_id": "a43uyskyp2xrwsd7",
            "time": time.time(),  # Replacing with real-time Unix timestamp
            "distinct_id": "5232957138511",
            "$device_id": "192058482b54ba7-0d3209ff865575-26001151-100200-192058482b54ba8",
            "communityId": "5232957",
            "studentId": "5232957138511",
            "course": {
                "courseId": 523662620,
                "courseName": "KMITL FE1 Intermediate 2 1-67",
            },
            "institution": {
                "cannonicalDomain": "ed20.engdis.com//thai",
                "name": "ITed-MOE(Thai)",
                "institutionAlias": "thai",
            },
            "languageSupport": "eng",
            "levelLanguageSupport": "low",
            "$initial_referrer": "$direct",
            "$initial_referring_domain": "$direct",
            "$user_id": "5232957138511",
            "itemSequentialNumber": 1,
            "unitId": 523662621,
            "lessonId": 209,
            "taskId": 5,
            "step": "Test",
            "itemType": "7",
            "token": "1696d222874161800f7df82532baf94e",
            "mp_sent_by_lib_version": "2.55.1",
        },
    },
    {
        "event": "EnteringLApage",
        "properties": {
            "$os": "Windows",
            "$browser": "Chrome",
            "$referrer": "https://ed20.engdis.com/",
            "$referring_domain": "ed20.engdis.com",
            "$current_url": "https://ed20.engdis.com/Runtime/learningArea.html?v=5",
            "$browser_version": 128,
            "$screen_height": 768,
            "$screen_width": 1366,
            "mp_lib": "web",
            "$lib_version": "2.55.1",
            "$insert_id": "91md99khl364rgkw",
            "time": time.time(),  # Replacing with real-time Unix timestamp
            "distinct_id": "5232957138511",
            "$device_id": "192058482b54ba7-0d3209ff865575-26001151-100200-192058482b54ba8",
            "communityId": "5232957",
            "studentId": "5232957138511",
            "course": {
                "courseId": 523662620,
                "courseName": "KMITL FE1 Intermediate 2 1-67",
            },
            "institution": {
                "cannonicalDomain": "ed20.engdis.com//thai",
                "name": "ITed-MOE(Thai)",
                "institutionAlias": "thai",
            },
            "languageSupport": "eng",
            "levelLanguageSupport": "low",
            "$initial_referrer": "$direct",
            "$initial_referring_domain": "$direct",
            "$user_id": "5232957138511",
            "unitId": 523662621,
            "lessonId": 209,
            "taskId": 24154,
            "step": "Test",
            "itemType": "7",
            "token": "1696d222874161800f7df82532baf94e",
            "mp_sent_by_lib_version": "2.55.1",
        },
    },
]

# Set up headers and URL
url = "https://api-js.mixpanel.com/track/?verbose=1&ip=1&_=1726672527068"
headers = {"Content-Type": "application/json"}


data: [
    {"event": "EnteringLApage","properties": {"$os": "Windows","$browser": "Chrome","$referrer": "https://ed20.engdis.com/","$referring_domain": "ed20.engdis.com","$current_url": "https://ed20.engdis.com/Runtime/learningArea.html?v=5","$browser_version": 128,"$screen_height": 768,"$screen_width": 1366,"mp_lib": "web","$lib_version": "2.55.1","$insert_id": "41kzx8pnvthnbg91","time": 1726672883.876,"distinct_id": "5232957138511","$device_id": "192058482b54ba7-0d3209ff865575-26001151-100200-192058482b54ba8","communityId": "5232957","studentId": "5232957138511","course": {"courseId": 523662620,"courseName": "KMITL FE1 Intermediate 2 1-67"},"institution": {"cannonicalDomain": "ed20.engdis.com//thai","name": "ITed-MOE(Thai)","institutionAlias": "thai"},"languageSupport": "eng","levelLanguageSupport": "low","$initial_referrer": "$direct","$initial_referring_domain": "$direct","$user_id": "5232957138511","unitId": 523662621,"lessonId": 209,"taskId": 24154,"step": "Test","itemType": "25","token": "1696d222874161800f7df82532baf94e","mp_sent_by_lib_version": "2.55.1"}},
    {"event": "laBrowseBack","properties": {"$os": "Windows","$browser": "Chrome","$referrer": "https://ed20.engdis.com/","$referring_domain": "ed20.engdis.com","$current_url": "https://ed20.engdis.com/Runtime/learningArea.html?v=5","$browser_version": 128,"$screen_height": 768,"$screen_width": 1366,"mp_lib": "web","$lib_version": "2.55.1","$insert_id": "r1z270lg6u7p8zur","time": 1726672883.888,"distinct_id": "5232957138511","$device_id": "192058482b54ba7-0d3209ff865575-26001151-100200-192058482b54ba8","communityId": "5232957","studentId": "5232957138511","course": {"courseId": 523662620,"courseName": "KMITL FE1 Intermediate 2 1-67"},"institution": {"cannonicalDomain": "ed20.engdis.com//thai","name": "ITed-MOE(Thai)","institutionAlias": "thai"},"languageSupport": "eng","levelLanguageSupport": "low","$initial_referrer": "$direct","$initial_referring_domain": "$direct","$user_id": "5232957138511","itemSequentialNumber": 1,"unitId": 523662621,"lessonId": 209,"taskId": 24155,"step": "Test","itemType": "25","token": "1696d222874161800f7df82532baf94e","mp_sent_by_lib_version": "2.55.1"}}
]

data: [
    {"event": "EnteringLApage","properties": {"$os": "Windows","$browser": "Chrome","$referrer": "https://ed20.engdis.com/","$referring_domain": "ed20.engdis.com","$current_url": "https://ed20.engdis.com/Runtime/learningArea.html?v=5","$browser_version": 128,"$screen_height": 768,"$screen_width": 1366,"mp_lib": "web","$lib_version": "2.55.1","$insert_id": "o0vfqh73km8xq2zh","time": 1726672925.357,"distinct_id": "5232957138511","$device_id": "192058482b54ba7-0d3209ff865575-26001151-100200-192058482b54ba8","communityId": "5232957","studentId": "5232957138511","course": {"courseId": 523662620,"courseName": "KMITL FE1 Intermediate 2 1-67"},"institution": {"cannonicalDomain": "ed20.engdis.com//thai","name": "ITed-MOE(Thai)","institutionAlias": "thai"},"languageSupport": "eng","levelLanguageSupport": "low","$initial_referrer": "$direct","$initial_referring_domain": "$direct","$user_id": "5232957138511","unitId": 523662621,"lessonId": 209,"taskId": 24154,"step": "Test","itemType": "25","token": "1696d222874161800f7df82532baf94e","mp_sent_by_lib_version": "2.55.1"}},
    {"event": "laBrowseBack","properties": {"$os": "Windows","$browser": "Chrome","$referrer": "https://ed20.engdis.com/","$referring_domain": "ed20.engdis.com","$current_url": "https://ed20.engdis.com/Runtime/learningArea.html?v=5","$browser_version": 128,"$screen_height": 768,"$screen_width": 1366,"mp_lib": "web","$lib_version": "2.55.1","$insert_id": "6qtdna77gi6qxn8b","time": 1726672925.363,"distinct_id": "5232957138511","$device_id": "192058482b54ba7-0d3209ff865575-26001151-100200-192058482b54ba8","communityId": "5232957","studentId": "5232957138511","course": {"courseId": 523662620,"courseName": "KMITL FE1 Intermediate 2 1-67"},"institution": {"cannonicalDomain": "ed20.engdis.com//thai","name": "ITed-MOE(Thai)","institutionAlias": "thai"},"languageSupport": "eng","levelLanguageSupport": "low","$initial_referrer": "$direct","$initial_referring_domain": "$direct","$user_id": "5232957138511","itemSequentialNumber": 1,"unitId": 523662621,"lessonId": 209,"taskId": 24155,"step": "Test","itemType": "25","token": "1696d222874161800f7df82532baf94e","mp_sent_by_lib_version": "2.55.1"}}
]
# Send the request
response = requests.post(url, json=data, headers=headers)

# Print response status and content
print(f"Status Code: {response.status_code}")
print(f"Response Content: {response.text}")
