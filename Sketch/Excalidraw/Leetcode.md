---

excalidraw-plugin: parsed
tags: [excalidraw]

---
==⚠  Switch to EXCALIDRAW VIEW in the MORE OPTIONS menu of this document. ⚠== You can decompress Drawing data with the command palette: 'Decompress current Excalidraw file'. For more info check in plugin settings under 'Saving'

# Excalidraw Data
## Text Elements
Leetcode (Online Coding Competition) ^Y2OooH8G

LeetCode is a platform that helps software engineers prepare for coding interviews. 
It offers a vast collection of coding problems, ranging from easy to hard, and provides 
a platform for users to answer questions and get feedback on their solutions. 
They also run periodic coding competitions. ^UPw8lLOw

Requirements ^FSerpDtz

1 ^KGgXq0bI

Core Entities ^Owns3mtS

API or 
Interface ^TeoTeTWi

High-level 
Design ^zSm6Yjw4

5 ^weWA2S42

Deep Dives ^1hrAYibf

6 ^1gkXy1HC

Primary Goal: Satisfy 
Functional Requirements ^k7XmAzuI

Primary Goal: Satisfy
Non-functional Requirements ^kG34S8sO

Data Flow ^rbg9f3Ok

2 ^tTngjIWA

3 ^IqhqKx7J

4 ^4ai6aF1N

Functional Requirements

- view a list of problems
- view a given problem & code a solution
- submit solution & get feedback
- support competitions w/ live leaderboard ^EtwTGY0w

Non-functional Requirements

- availability >> consistency 
- security & isolation when running users code
- scale to support competitions with 100k users
- fresh / near realtime leaderboard
 ^kWJQPEz9

Scale:
- 100k DAU (5M total accounts) 
- 3k problems
- 100k peak for competitions ^DDMtThba

Core Entities

- User
- Problem
- Submission
- Competition
- Leaderboard ^ru3n7It3

API

// view a list of problems
GET /problems?category={}&difficulty={}&page={}&size={} -> Partial<Problems>[] ^2MEFCOhK

// view a problem
GET /problems/:problemId -> Problem ^y3PifISu

// submit solution
POST /problems/:problemId -> 200
{
    code,
    language,
    competitionId?
}

GET /problems/:problemId/submission/:submissionId -> Submission

 ^bNpen9jf

// get leaderboard
GET /leaderboard/:competitionId?page={}&size={} -> Leaderboard ^UmUD3q9w

Client
- Monaco IDE ^Guk52ckn

GET /problems
GET /problem/:id
POST /problem/:id
GET /leaderboard/:id ^rjwN28pW

Primary Server ^6x4pOCGe

Database ^k5vq9QfZ

Problem
- id (PK)
- name
- difficulty
- category
- codeStubs[]
- testCases[]
- description
- ... ^2wAcPWY5

Docker Containers ^7uQx7u3L

Java Runtime 
Service ^5E00sfaP

Python Runtime 
Service ^5ngP0uZJ

Javascript 
Runtime Service ^mks8uCJI

X Runtime Service ^R7FzwSTB

Submission
- id
- competitionId (PK)
- problemId
- userId
- testCaseResults
- passed
- error?
- runTime
- completionTime
- ... ^pTppaZjk

Competition
- id
- startTime
- endTime
- problems[] ^O6lrMCVT

What is a competition?

- 90 min
- 10 problems
- Up to 100k users
- Rank by number of problems solved in the 90 minutes. 
- In case of tie, rank by fastest time to complete ^XhhvD7go

User
- id ^iCYc2sec

SELECT 
    userId,
    COUNT(*) AS passedSubmissions,
    MIN(submittedAt) AS lastSubmissionTime
FROM 
    Submissions
WHERE 
    competitionId = {competition_id} AND 
    passed = TRUE
GROUP BY 
    userId
ORDER BY 
    passedSubmissions DESC,
    lastSubmissionTime ASC; ^WlZ8cxwY

Security
- Explicit timeout per execution
- CPU and memory bounds
- Read only filesystem (write to tmp)
- Network isolation (VPC)
- No system calls ^4PJkfOyO

Redis 
Cache ^qGHCbFWY

key: leaderboard:competitionId
value: Sorted Set ^FhC72atY

element: userId
ranking on: score ^icnkkMsG

CDC ^gQijOqAW

AWS SQS ^gnIq3f9s

worker ^j1fx93Ml

write this submission 
data ^fEsrZA1T

%%
## Drawing
```compressed-json
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

Oa+gTKwQJlwSEIUEAA==
```
%%