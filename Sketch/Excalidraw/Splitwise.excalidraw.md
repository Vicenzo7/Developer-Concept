---

excalidraw-plugin: parsed
tags: [excalidraw]

---
==⚠  Switch to EXCALIDRAW VIEW in the MORE OPTIONS menu of this document. ⚠==


# Text Elements
LLD of Splitwise ^Xwr9RBrE

Happy flow ^iWOKoNdt

1. Add friends (f1,f2,f3...)
2. Add Groups (Collage group,trip group, etc..)
3. You can add friends into the group.
4. Add expense in the group or directly to a friend. ^AsssSSYe

Requirement
1. Add friends capability
2. Add/Manage group
3. Add/Manage Friend inside the group
4. Manage expenses Inside a group or without the group.
5. Split Expenses Capability
    -> Equal Split
    -> Unequal split
    -> Percentage wise split
6. Balance sheet of each user ^BnVIoSpg

Object Identification

1. Splitwise - the driver app
2. User
3. Group
4. Expense
5. Split
6. Balance sheet ^xIudY2XG

What happens when Expense is created?? ^FEZobUXV

From the front-end we will get who owe's how much??
  -> I pay 400 and do equal split with 4 friends so each owe me 100,
  -> if split is percentage wise then it may be 5%, 5%, 10% and 80% ^3xIgzpmJ

Balance sheet ^ZT3awSzX

Total Amount you Owe - 500
Total Amount to get back - 1000 ^phhFxpZC

Shreyansh owe 200 to f1
Shreyansh get back 500 from f2 ^8MBvqAQT

shreyansh ^BVdCsy4h

f1 ^zqpjHovh

f2 ^2SOvHRo5

f3 ^z6SwweyK

How Much I owe to friend 1 ^54DhR3xb

How much I get from friend 1 ^5EA17TWk

LLD ^VanYdwUB

Expense ^Fzi3KbLY

string expenseId;
string description;
double expenseAmount;
User paidBy;
ExpenseSplitType expenseType; ^2YhIjJpk

ExpenseSplitType ^iC5aegFz

EQUAL,
UNEQUAL,
PERCENTAGE ^QD8ZEVAc

List<Split> splitDetails ^s9In1Sxd

Split ^AxKgM8MQ

User user;
double oweAmount; ^cKAzAhOE

ExpenseController ^jRu8I065

+validateRequest();
+createExpense(details)
+createUpdateUserBalanceSheet(); ^yibZaffw

ExpenseSplit ^mxWkrMgQ

+validateRequest() ^YspIlMoz

EqualSplit ^csd8RkzX

Un-EqualSplit ^2m3hYbMf

Percentage Split ^f3R2GEKk

ExpenseSplitFactory ^pqzvEnNW

ExpenseSplitFactory splitFactory;
BalanceSheetController balanceController; ^Q9eqw0Mr

+getSplitFactoryBySplitType(type) ^flWXB4ji

User ^siGkGwLn

int userId;
string name;
UserExpenseBalanceSheet balanceSheet; ^37Yhk0RT

UserController ^nf5P78Er

List<User> userList; ^pTMnPPLO

// perform crud operation ^4hYcfSIf

SplitWiseApp ^gTyjux0Q

UserController userController;
GroupController groupController;
BalanceSheetController balanceController ^rxZsgGiY

Group ^LMliLDUA

int groupId;
string groupName;
List<User> groupMembers;
List<Expense> expenseList
ExpenseController expenseController; ^Fx1MSD3J

GroupController ^Xh0xn8ob

List<Group> groupList ^X6JXWHji

UserExpenseBalanceSheet ^Nl0Ey8JU

Map<User,Balance> friendBalnceSheet
double myTotalExpense;
double myTotalOwe;
double myTotalGetBack; ^tOIx7UAY

double amountOwe;
double amountGetBack; ^vYnlluey

Balance ^j30gaDNJ

// business logic to create/update balance as soon as
expense is created

+cretaeUpdateUserBalanceSheet(); ^YKuDkFGI

BalanceSheetController ^nENepN8Q

%%
# Drawing
```json
{
	"type": "excalidraw",
	"version": 2,
	"source": "https://github.com/zsviczian/obsidian-excalidraw-plugin/releases/tag/2.1.3",
	"elements": [
		{
			"type": "text",
			"version": 71,
			"versionNonce": 452368831,
			"isDeleted": false,
			"id": "Xwr9RBrE",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 48,
			"y": -176.9453125,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 187.5,
			"height": 24,
			"seed": 1861271807,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "LLD of Splitwise",
			"rawText": "LLD of Splitwise",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "LLD of Splitwise",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 35,
			"versionNonce": 1085599953,
			"isDeleted": false,
			"id": "iWOKoNdt",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -473,
			"y": 54.8203125,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 117.1875,
			"height": 24,
			"seed": 1359594193,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168029885,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Happy flow",
			"rawText": "Happy flow",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Happy flow",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 266,
			"versionNonce": 526429873,
			"isDeleted": false,
			"id": "AsssSSYe",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -398,
			"y": 113.8203125,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 609.375,
			"height": 96,
			"seed": 663930353,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168029885,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "1. Add friends (f1,f2,f3...)\n2. Add Groups (Collage group,trip group, etc..)\n3. You can add friends into the group.\n4. Add expense in the group or directly to a friend.",
			"rawText": "1. Add friends (f1,f2,f3...)\n2. Add Groups (Collage group,trip group, etc..)\n3. You can add friends into the group.\n4. Add expense in the group or directly to a friend.",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "1. Add friends (f1,f2,f3...)\n2. Add Groups (Collage group,trip group, etc..)\n3. You can add friends into the group.\n4. Add expense in the group or directly to a friend.",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 306,
			"versionNonce": 282740625,
			"isDeleted": false,
			"id": "BnVIoSpg",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -430,
			"y": 281.8203125,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 644.53125,
			"height": 240,
			"seed": 861039537,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Requirement\n1. Add friends capability\n2. Add/Manage group\n3. Add/Manage Friend inside the group\n4. Manage expenses Inside a group or without the group.\n5. Split Expenses Capability\n    -> Equal Split\n    -> Unequal split\n    -> Percentage wise split\n6. Balance sheet of each user",
			"rawText": "Requirement\n1. Add friends capability\n2. Add/Manage group\n3. Add/Manage Friend inside the group\n4. Manage expenses Inside a group or without the group.\n5. Split Expenses Capability\n    -> Equal Split\n    -> Unequal split\n    -> Percentage wise split\n6. Balance sheet of each user",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Requirement\n1. Add friends capability\n2. Add/Manage group\n3. Add/Manage Friend inside the group\n4. Manage expenses Inside a group or without the group.\n5. Split Expenses Capability\n    -> Equal Split\n    -> Unequal split\n    -> Percentage wise split\n6. Balance sheet of each user",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 145,
			"versionNonce": 914126335,
			"isDeleted": false,
			"id": "xIudY2XG",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -448.3125,
			"y": 610.875,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 339.84375,
			"height": 192,
			"seed": 655844657,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Object Identification\n\n1. Splitwise - the driver app\n2. User\n3. Group\n4. Expense\n5. Split\n6. Balance sheet",
			"rawText": "Object Identification\n\n1. Splitwise - the driver app\n2. User\n3. Group\n4. Expense\n5. Split\n6. Balance sheet",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Object Identification\n\n1. Splitwise - the driver app\n2. User\n3. Group\n4. Expense\n5. Split\n6. Balance sheet",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 67,
			"versionNonce": 1445801329,
			"isDeleted": false,
			"id": "FEZobUXV",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -444.3125,
			"y": 877.875,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 445.3125,
			"height": 24,
			"seed": 1456501855,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "What happens when Expense is created??",
			"rawText": "What happens when Expense is created??",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "What happens when Expense is created??",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 330,
			"versionNonce": 1352359455,
			"isDeleted": false,
			"id": "3xIgzpmJ",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -415.46875,
			"y": 926.21484375,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 796.875,
			"height": 72,
			"seed": 1940634897,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "From the front-end we will get who owe's how much??\n  -> I pay 400 and do equal split with 4 friends so each owe me 100,\n  -> if split is percentage wise then it may be 5%, 5%, 10% and 80%",
			"rawText": "From the front-end we will get who owe's how much??\n  -> I pay 400 and do equal split with 4 friends so each owe me 100,\n  -> if split is percentage wise then it may be 5%, 5%, 10% and 80%",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "From the front-end we will get who owe's how much??\n  -> I pay 400 and do equal split with 4 friends so each owe me 100,\n  -> if split is percentage wise then it may be 5%, 5%, 10% and 80%",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 20,
			"versionNonce": 535320401,
			"isDeleted": false,
			"id": "ZT3awSzX",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -470.85336538461536,
			"y": 1147.7533052884614,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 152.34375,
			"height": 24,
			"seed": 1273176625,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Balance sheet",
			"rawText": "Balance sheet",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Balance sheet",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 123,
			"versionNonce": 1927823935,
			"isDeleted": false,
			"id": "ZcrUzl3kgyD7Gej-8rbP0",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -464.69951923076917,
			"y": 1235.445612980769,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 439.9999999999999,
			"height": 241.15384615384642,
			"seed": 1484863295,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 71,
			"versionNonce": 1080247601,
			"isDeleted": false,
			"id": "phhFxpZC",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -444.69951923076917,
			"y": 1276.9840745192307,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 363.28125,
			"height": 48,
			"seed": 1698855057,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Total Amount you Owe - 500\nTotal Amount to get back - 1000",
			"rawText": "Total Amount you Owe - 500\nTotal Amount to get back - 1000",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Total Amount you Owe - 500\nTotal Amount to get back - 1000",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 105,
			"versionNonce": 1581490783,
			"isDeleted": false,
			"id": "8MBvqAQT",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -432.58413461538464,
			"y": 1375.637920673077,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 351.5625,
			"height": 48,
			"seed": 651211487,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Shreyansh owe 200 to f1\nShreyansh get back 500 from f2",
			"rawText": "Shreyansh owe 200 to f1\nShreyansh get back 500 from f2",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Shreyansh owe 200 to f1\nShreyansh get back 500 from f2",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 20,
			"versionNonce": 1392867089,
			"isDeleted": false,
			"id": "BVdCsy4h",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 246.06971153846143,
			"y": 1332.3686899038462,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 105.46875,
			"height": 24,
			"seed": 1245161055,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "shreyansh",
			"rawText": "shreyansh",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "shreyansh",
			"lineHeight": 1.2
		},
		{
			"type": "freedraw",
			"version": 43,
			"versionNonce": 1669201535,
			"isDeleted": false,
			"id": "04OXjLEqhCdNT2D5Bz3vr",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 370.6850961538462,
			"y": 1343.137920673077,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 175.38461538461524,
			"height": 87.69230769230785,
			"seed": 812839185,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					4.615384615384528,
					0
				],
				[
					7.692307692307622,
					0
				],
				[
					16.923076923076906,
					0
				],
				[
					24.615384615384528,
					0
				],
				[
					29.230769230769283,
					0
				],
				[
					35.384615384615245,
					0
				],
				[
					41.53846153846143,
					0
				],
				[
					50.76923076923072,
					0
				],
				[
					52.30769230769238,
					0
				],
				[
					53.84615384615381,
					0
				],
				[
					53.84615384615381,
					-1.538461538461661
				],
				[
					53.84615384615381,
					-3.0769230769230944
				],
				[
					53.84615384615381,
					-7.69230769230785
				],
				[
					53.84615384615381,
					-10.769230769230717
				],
				[
					50.76923076923072,
					-16.923076923076906
				],
				[
					50.76923076923072,
					-21.53846153846166
				],
				[
					47.69230769230762,
					-32.30769230769215
				],
				[
					47.69230769230762,
					-35.38461538461547
				],
				[
					47.69230769230762,
					-43.076923076923094
				],
				[
					47.69230769230762,
					-50.76923076923072
				],
				[
					47.69230769230762,
					-60
				],
				[
					46.15384615384619,
					-66.15384615384619
				],
				[
					46.15384615384619,
					-69.23076923076928
				],
				[
					44.61538461538453,
					-73.84615384615381
				],
				[
					43.076923076923094,
					-75.38461538461547
				],
				[
					41.53846153846143,
					-80
				],
				[
					43.076923076923094,
					-80
				],
				[
					60,
					-80
				],
				[
					80,
					-80
				],
				[
					112.30769230769238,
					-80
				],
				[
					132.30769230769215,
					-83.0769230769231
				],
				[
					152.30769230769215,
					-86.15384615384619
				],
				[
					172.30769230769215,
					-87.69230769230785
				],
				[
					175.38461538461524,
					-87.69230769230785
				],
				[
					175.38461538461524,
					-87.69230769230785
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 22,
			"versionNonce": 440823025,
			"isDeleted": false,
			"id": "eulAm6f29O2usBVt5DgS1",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 429.1466346153845,
			"y": 1343.137920673077,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 103.0769230769231,
			"height": 1.538461538461661,
			"seed": 576856689,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					1.538461538461661
				],
				[
					6.153846153846189,
					1.538461538461661
				],
				[
					16.923076923076906,
					1.538461538461661
				],
				[
					27.69230769230785,
					1.538461538461661
				],
				[
					38.46153846153857,
					1.538461538461661
				],
				[
					49.23076923076928,
					1.538461538461661
				],
				[
					58.46153846153857,
					1.538461538461661
				],
				[
					60,
					1.538461538461661
				],
				[
					69.23076923076928,
					1.538461538461661
				],
				[
					80,
					1.538461538461661
				],
				[
					90.76923076923094,
					1.538461538461661
				],
				[
					96.9230769230769,
					1.538461538461661
				],
				[
					103.0769230769231,
					1.538461538461661
				],
				[
					103.0769230769231,
					1.538461538461661
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 35,
			"versionNonce": 1700255391,
			"isDeleted": false,
			"id": "5O6TuairyREUYDJvSuYYW",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 418.3774038461538,
			"y": 1349.291766826923,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 130.76923076923072,
			"height": 93.84615384615381,
			"seed": 1830199409,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					1.538461538461661
				],
				[
					0,
					10.769230769230717
				],
				[
					0,
					16.923076923076906
				],
				[
					1.538461538461661,
					24.615384615384528
				],
				[
					3.0769230769230944,
					35.38461538461547
				],
				[
					3.0769230769230944,
					40
				],
				[
					3.0769230769230944,
					44.61538461538453
				],
				[
					3.0769230769230944,
					49.23076923076928
				],
				[
					3.0769230769230944,
					52.30769230769215
				],
				[
					4.615384615384755,
					56.923076923076906
				],
				[
					6.153846153846189,
					60
				],
				[
					6.153846153846189,
					61.53846153846166
				],
				[
					10.769230769230717,
					70.76923076923072
				],
				[
					12.307692307692378,
					76.9230769230769
				],
				[
					15.384615384615472,
					86.15384615384596
				],
				[
					16.923076923076906,
					92.30769230769215
				],
				[
					18.461538461538566,
					93.84615384615381
				],
				[
					21.53846153846166,
					93.84615384615381
				],
				[
					26.15384615384619,
					93.84615384615381
				],
				[
					40,
					93.84615384615381
				],
				[
					56.923076923076906,
					93.84615384615381
				],
				[
					98.46153846153857,
					90.76923076923072
				],
				[
					115.38461538461547,
					87.69230769230762
				],
				[
					129.23076923076928,
					86.15384615384596
				],
				[
					130.76923076923072,
					84.61538461538453
				],
				[
					130.76923076923072,
					83.0769230769231
				],
				[
					130.76923076923072,
					83.0769230769231
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "text",
			"version": 20,
			"versionNonce": 497919697,
			"isDeleted": false,
			"id": "zqpjHovh",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 562.9927884615383,
			"y": 1243.1379206730771,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 23.4375,
			"height": 24,
			"seed": 1266371295,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "f1",
			"rawText": "f1",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "f1",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 15,
			"versionNonce": 444705471,
			"isDeleted": false,
			"id": "2SOvHRo5",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 555.300480769231,
			"y": 1326.21484375,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 23.4375,
			"height": 24,
			"seed": 6622143,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "f2",
			"rawText": "f2",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "f2",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 16,
			"versionNonce": 131245233,
			"isDeleted": false,
			"id": "z6SwweyK",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 581.4543269230771,
			"y": 1424.6763822115386,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 23.4375,
			"height": 24,
			"seed": 376099935,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "f3",
			"rawText": "f3",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "f3",
			"lineHeight": 1.2
		},
		{
			"type": "freedraw",
			"version": 38,
			"versionNonce": 261880543,
			"isDeleted": false,
			"id": "omvfo4H6ZlunSfhd4214m",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 593.7620192307693,
			"y": 1249.291766826923,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 35.384615384615245,
			"height": 70.76923076923094,
			"seed": 738136305,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					1.5384615384614335,
					1.538461538461661
				],
				[
					4.615384615384528,
					1.538461538461661
				],
				[
					6.153846153846189,
					1.538461538461661
				],
				[
					9.230769230769056,
					1.538461538461661
				],
				[
					13.846153846153811,
					-1.538461538461661
				],
				[
					16.923076923076906,
					-1.538461538461661
				],
				[
					21.538461538461434,
					-4.615384615384528
				],
				[
					23.076923076923094,
					-4.615384615384528
				],
				[
					24.615384615384528,
					-6.153846153846189
				],
				[
					27.692307692307622,
					-7.69230769230785
				],
				[
					29.230769230769056,
					-9.230769230769283
				],
				[
					27.692307692307622,
					-12.307692307692378
				],
				[
					26.15384615384619,
					-16.923076923076906
				],
				[
					23.076923076923094,
					-20
				],
				[
					21.538461538461434,
					-21.53846153846166
				],
				[
					16.923076923076906,
					-27.69230769230785
				],
				[
					10.769230769230717,
					-33.84615384615404
				],
				[
					9.230769230769056,
					-36.923076923076906
				],
				[
					7.692307692307622,
					-40
				],
				[
					6.153846153846189,
					-43.076923076923094
				],
				[
					4.615384615384528,
					-47.69230769230785
				],
				[
					1.5384615384614335,
					-55.38461538461547
				],
				[
					1.5384615384614335,
					-56.923076923076906
				],
				[
					1.5384615384614335,
					-58.46153846153834
				],
				[
					0,
					-60
				],
				[
					10.769230769230717,
					-61.53846153846166
				],
				[
					16.923076923076906,
					-64.61538461538453
				],
				[
					26.15384615384619,
					-67.69230769230785
				],
				[
					30.769230769230717,
					-69.23076923076928
				],
				[
					35.384615384615245,
					-69.23076923076928
				],
				[
					35.384615384615245,
					-69.23076923076928
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 27,
			"versionNonce": 1146939025,
			"isDeleted": false,
			"id": "FxmUFipYiSZepKX1E-vUG",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 615.3004807692307,
			"y": 1238.5225360576924,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 63.076923076923094,
			"height": 33.84615384615381,
			"seed": 150740703,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					3.0769230769230944,
					3.076923076922867
				],
				[
					7.692307692307622,
					9.230769230769056
				],
				[
					9.230769230769283,
					15.384615384615245
				],
				[
					10.769230769230717,
					18.46153846153834
				],
				[
					10.769230769230717,
					21.538461538461434
				],
				[
					10.769230769230717,
					23.076923076922867
				],
				[
					10.769230769230717,
					24.615384615384528
				],
				[
					10.769230769230717,
					27.692307692307622
				],
				[
					12.307692307692378,
					30.769230769230717
				],
				[
					13.846153846153811,
					32.30769230769238
				],
				[
					15.384615384615472,
					33.84615384615381
				],
				[
					20,
					33.84615384615381
				],
				[
					30.769230769230717,
					33.84615384615381
				],
				[
					35.38461538461547,
					33.84615384615381
				],
				[
					44.615384615384755,
					32.30769230769238
				],
				[
					53.84615384615381,
					30.769230769230717
				],
				[
					56.923076923076906,
					29.230769230769056
				],
				[
					60,
					27.692307692307622
				],
				[
					61.53846153846166,
					27.692307692307622
				],
				[
					63.076923076923094,
					27.692307692307622
				],
				[
					63.076923076923094,
					27.692307692307622
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "text",
			"version": 43,
			"versionNonce": 1765230335,
			"isDeleted": false,
			"id": "54DhR3xb",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 662.9927884615383,
			"y": 1158.5225360576922,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 304.6875,
			"height": 24,
			"seed": 1908769215,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "How Much I owe to friend 1",
			"rawText": "How Much I owe to friend 1",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "How Much I owe to friend 1",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 43,
			"versionNonce": 1577315441,
			"isDeleted": false,
			"id": "5EA17TWk",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 696.8389423076926,
			"y": 1249.2917668269233,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 328.125,
			"height": 24,
			"seed": 1628161471,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713166170961,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "How much I get from friend 1",
			"rawText": "How much I get from friend 1",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "How much I get from friend 1",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 380,
			"versionNonce": 796833983,
			"isDeleted": false,
			"id": "VanYdwUB",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -457.96191160232877,
			"y": 1634.6232430561463,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 79.266357421875,
			"height": 54.124352542192874,
			"seed": 229195519,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168381035,
			"link": null,
			"locked": false,
			"fontSize": 45.10362711849406,
			"fontFamily": 3,
			"text": "LLD",
			"rawText": "LLD",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "LLD",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 312,
			"versionNonce": 1436076287,
			"isDeleted": false,
			"id": "SYmwzJtc0mhAY_oefZEnk",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1755.5797734187365,
			"y": 2539.3537462220606,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 467.4999999999998,
			"height": 230,
			"seed": 798109681,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "6MqxsNGv871mKdixdoikF",
					"type": "arrow"
				},
				{
					"id": "fOzh5XQABDJZFBqNvxAW5",
					"type": "arrow"
				},
				{
					"id": "WFrXv8aH0Mwecwh8EP4jv",
					"type": "arrow"
				}
			],
			"updated": 1713168084904,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 267,
			"versionNonce": 1683542399,
			"isDeleted": false,
			"id": "Fzi3KbLY",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1896.2940591330223,
			"y": 2503.282317650632,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 82.03125,
			"height": 24,
			"seed": 597407903,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084904,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Expense",
			"rawText": "Expense",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Expense",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 337,
			"versionNonce": 1231047071,
			"isDeleted": false,
			"id": "2YhIjJpk",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1803.794059133022,
			"y": 2582.2108890792033,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 339.84375,
			"height": 120,
			"seed": 1220305105,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084904,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "string expenseId;\nstring description;\ndouble expenseAmount;\nUser paidBy;\nExpenseSplitType expenseType;",
			"rawText": "string expenseId;\nstring description;\ndouble expenseAmount;\nUser paidBy;\nExpenseSplitType expenseType;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "string expenseId;\nstring description;\ndouble expenseAmount;\nUser paidBy;\nExpenseSplitType expenseType;",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 229,
			"versionNonce": 1795407295,
			"isDeleted": false,
			"id": "_YGtW4b2x6wb6Ie6w4aSR",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 2392.365487704451,
			"y": 2573.639460507775,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 382.8571428571429,
			"height": 262.85714285714266,
			"seed": 613074207,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084904,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 239,
			"versionNonce": 1281600991,
			"isDeleted": false,
			"id": "iC5aegFz",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 2438.0797734187363,
			"y": 2537.925174793489,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 187.5,
			"height": 24,
			"seed": 146084721,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084904,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "ExpenseSplitType",
			"rawText": "ExpenseSplitType",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "ExpenseSplitType",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 237,
			"versionNonce": 949000703,
			"isDeleted": false,
			"id": "QD8ZEVAc",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 2445.2226305615936,
			"y": 2633.639460507775,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 117.1875,
			"height": 72,
			"seed": 1755555889,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084904,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "EQUAL,\nUNEQUAL,\nPERCENTAGE",
			"rawText": "EQUAL,\nUNEQUAL,\nPERCENTAGE",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "EQUAL,\nUNEQUAL,\nPERCENTAGE",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 243,
			"versionNonce": 1149960735,
			"isDeleted": false,
			"id": "s9In1Sxd",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1803.794059133022,
			"y": 2710.7823176506317,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 281.25,
			"height": 24,
			"seed": 1436384479,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084904,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "List<Split> splitDetails",
			"rawText": "List<Split> splitDetails",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "List<Split> splitDetails",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 255,
			"versionNonce": 1912104977,
			"isDeleted": false,
			"id": "6CVnWPMG7rlsjXRK3Pu8R",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 2239.508344847308,
			"y": 2305.0680319363464,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 271.4285714285713,
			"height": 174.28571428571445,
			"seed": 392011729,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084991,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 222,
			"versionNonce": 2019566207,
			"isDeleted": false,
			"id": "AxKgM8MQ",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 2265.2226305615936,
			"y": 2266.496603364918,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 58.59375,
			"height": 24,
			"seed": 1155279697,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084904,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Split",
			"rawText": "Split",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Split",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 237,
			"versionNonce": 1649769119,
			"isDeleted": false,
			"id": "cKAzAhOE",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 2262.365487704451,
			"y": 2346.496603364918,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 199.21875,
			"height": 48,
			"seed": 1173547345,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084904,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "User user;\ndouble oweAmount;",
			"rawText": "User user;\ndouble oweAmount;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "User user;\ndouble oweAmount;",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 744,
			"versionNonce": 4411185,
			"isDeleted": false,
			"id": "6MqxsNGv871mKdixdoikF",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 2128.8738354377624,
			"y": 2537.925174793489,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 115.71428571428555,
			"height": 167.1428571428571,
			"seed": 288039953,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085279,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "SYmwzJtc0mhAY_oefZEnk",
				"focus": 0.603100181800786,
				"gap": 1.4285714285715585
			},
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					-5.079776304739994,
					-167.1428571428571
				],
				[
					110.63450940954556,
					-165.71428571428578
				]
			]
		},
		{
			"type": "arrow",
			"version": 333,
			"versionNonce": 478191327,
			"isDeleted": false,
			"id": "g8Iy-VO1boupxj89KuYi5",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 2222.365487704451,
			"y": 2699.493741766878,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 171.42857142857127,
			"height": 1.288575883753765,
			"seed": 483001247,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084904,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					171.42857142857127,
					1.288575883753765
				]
			]
		},
		{
			"type": "rectangle",
			"version": 296,
			"versionNonce": 971467519,
			"isDeleted": false,
			"id": "EmKukr1z4GXay9NBXCkw2",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 975.4533180572807,
			"y": 2500.7823176506317,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 584.0550267900269,
			"height": 411.42857142857156,
			"seed": 1747953041,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "fOzh5XQABDJZFBqNvxAW5",
					"type": "arrow"
				},
				{
					"id": "74Cuhj0kh0Uw8JdrsAFm4",
					"type": "arrow"
				},
				{
					"id": "G2xZEtOQuIR02FKppa0wf",
					"type": "arrow"
				},
				{
					"id": "00Ge77IJR2qeq0HHt7GoD",
					"type": "arrow"
				},
				{
					"id": "rnUefRUT5QFodyD_KxfYQ",
					"type": "arrow"
				}
			],
			"updated": 1713168084904,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 228,
			"versionNonce": 7397311,
			"isDeleted": false,
			"id": "jRu8I065",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1306.6512019901647,
			"y": 2456.4966033649175,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 199.21875,
			"height": 24,
			"seed": 846791793,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "ExpenseController",
			"rawText": "ExpenseController",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "ExpenseController",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 408,
			"versionNonce": 1004310495,
			"isDeleted": false,
			"id": "yibZaffw",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1007.0020689612215,
			"y": 2621.6468277091285,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 375,
			"height": 72,
			"seed": 298531249,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "+validateRequest();\n+createExpense(details)\n+createUpdateUserBalanceSheet();",
			"rawText": "+validateRequest();\n+createExpense(details)\n+createUpdateUserBalanceSheet();",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "+validateRequest();\n+createExpense(details)\n+createUpdateUserBalanceSheet();",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 248,
			"versionNonce": 1251818495,
			"isDeleted": false,
			"id": "QecHl6UXD_f2dFZ6edDen",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1709.5083448473076,
			"y": 2966.4966033649175,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 360,
			"height": 161.4285714285711,
			"seed": 79661137,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "fCg2wPvK891WUB2Hrp0Ov",
					"type": "arrow"
				},
				{
					"id": "fGpaJ7TfNo-eIuwhfj9Am",
					"type": "arrow"
				},
				{
					"id": "B6AA8TQegTsw9ClBV7HTI",
					"type": "arrow"
				},
				{
					"id": "74Cuhj0kh0Uw8JdrsAFm4",
					"type": "arrow"
				}
			],
			"updated": 1713168084905,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 221,
			"versionNonce": 775740575,
			"isDeleted": false,
			"id": "mxWkrMgQ",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1740.936916275879,
			"y": 2915.068031936346,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 140.625,
			"height": 24,
			"seed": 1028415775,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "ExpenseSplit",
			"rawText": "ExpenseSplit",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "ExpenseSplit",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 253,
			"versionNonce": 1289089215,
			"isDeleted": false,
			"id": "YspIlMoz",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1778.079773418736,
			"y": 3032.210889079203,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 210.9375,
			"height": 24,
			"seed": 369130239,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "+validateRequest()",
			"rawText": "+validateRequest()",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "+validateRequest()",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 286,
			"versionNonce": 997687519,
			"isDeleted": false,
			"id": "pBJCM8ybGNTgZQs9EapYU",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1516.6512019901647,
			"y": 3223.639460507775,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 270,
			"height": 85.71428571428623,
			"seed": 900361841,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "fCg2wPvK891WUB2Hrp0Ov",
					"type": "arrow"
				}
			],
			"updated": 1713168084905,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 231,
			"versionNonce": 151393567,
			"isDeleted": false,
			"id": "csd8RkzX",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1593.7940591330218,
			"y": 3256.4966033649175,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 117.1875,
			"height": 24,
			"seed": 93138513,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "EqualSplit",
			"rawText": "EqualSplit",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "EqualSplit",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 325,
			"versionNonce": 1524898111,
			"isDeleted": false,
			"id": "O2e0tpaw0HDVmlb6dqHfC",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1818.7940591330218,
			"y": 3220.7823176506317,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 270,
			"height": 85.71428571428623,
			"seed": 1015668465,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 276,
			"versionNonce": 648845663,
			"isDeleted": false,
			"id": "2m3hYbMf",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1895.936916275879,
			"y": 3253.639460507774,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 152.34375,
			"height": 24,
			"seed": 1253234897,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Un-EqualSplit",
			"rawText": "Un-EqualSplit",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Un-EqualSplit",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 373,
			"versionNonce": 1102058879,
			"isDeleted": false,
			"id": "iYO6RIAx89ACnOAAmH1Q1",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 2134.5083448473074,
			"y": 3219.3537462220593,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 270,
			"height": 85.71428571428623,
			"seed": 2054274335,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 353,
			"versionNonce": 53415327,
			"isDeleted": false,
			"id": "f3R2GEKk",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 2173.6205810578977,
			"y": 3254.323701353217,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 187.5,
			"height": 24,
			"seed": 1889190207,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Percentage Split",
			"rawText": "Percentage Split",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Percentage Split",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 847,
			"versionNonce": 892073713,
			"isDeleted": false,
			"id": "fCg2wPvK891WUB2Hrp0Ov",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1796.6512019901647,
			"y": 3132.2108890792033,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 137.50836254024063,
			"height": 91.42188139637847,
			"seed": 1327298929,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085279,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "QecHl6UXD_f2dFZ6edDen",
				"focus": 0.5223058175267575,
				"gap": 4.285714285714448
			},
			"endBinding": {
				"elementId": "pBJCM8ybGNTgZQs9EapYU",
				"focus": 0.06299108934431309,
				"gap": 1
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle_outline",
			"points": [
				[
					0,
					0
				],
				[
					1.4285714285713311,
					52.85714285714266
				],
				[
					-135.71428571428578,
					51.42857142857156
				],
				[
					-136.0797911116693,
					91.42188139637847
				]
			]
		},
		{
			"type": "arrow",
			"version": 494,
			"versionNonce": 391246033,
			"isDeleted": false,
			"id": "fGpaJ7TfNo-eIuwhfj9Am",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1903.7940591330218,
			"y": 3130.7823176506317,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 1.7052252993380534,
			"height": 90.15693190751244,
			"seed": 126373393,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085279,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "QecHl6UXD_f2dFZ6edDen",
				"focus": -0.06998999081426989,
				"gap": 2.8571428571428896
			},
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle_outline",
			"points": [
				[
					0,
					0
				],
				[
					1.7052252993380534,
					90.15693190751244
				]
			]
		},
		{
			"type": "arrow",
			"version": 590,
			"versionNonce": 442347185,
			"isDeleted": false,
			"id": "B6AA8TQegTsw9ClBV7HTI",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 2005.2226305615932,
			"y": 3133.639460507775,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 210.95238095238096,
			"height": 87.61904761904725,
			"seed": 664731967,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085279,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "QecHl6UXD_f2dFZ6edDen",
				"focus": -0.6223376072904485,
				"gap": 5.714285714286007
			},
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle_outline",
			"points": [
				[
					0,
					0
				],
				[
					1.4285714285715585,
					52.85714285714266
				],
				[
					210,
					50
				],
				[
					210.95238095238096,
					87.61904761904725
				]
			]
		},
		{
			"type": "arrow",
			"version": 748,
			"versionNonce": 1557427825,
			"isDeleted": false,
			"id": "fOzh5XQABDJZFBqNvxAW5",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1564.852994319706,
			"y": 2657.5577174028776,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 188.04029238731778,
			"height": 1.9029963154143843,
			"seed": 1583043473,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085279,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "EmKukr1z4GXay9NBXCkw2",
				"focus": -0.24895013617991527,
				"gap": 5.344649472398373
			},
			"endBinding": {
				"elementId": "SYmwzJtc0mhAY_oefZEnk",
				"focus": -0.06390067936861749,
				"gap": 2.6864867117125186
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					188.04029238731778,
					1.9029963154143843
				]
			]
		},
		{
			"type": "arrow",
			"version": 773,
			"versionNonce": 445402673,
			"isDeleted": false,
			"id": "74Cuhj0kh0Uw8JdrsAFm4",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1454.3266681593368,
			"y": 2912.7510365243834,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 249.97193624534657,
			"height": 139.44561008497703,
			"seed": 1128852689,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085279,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "EmKukr1z4GXay9NBXCkw2",
				"focus": -0.6171334461115219,
				"gap": 1
			},
			"endBinding": {
				"elementId": "QecHl6UXD_f2dFZ6edDen",
				"focus": -0.01568283205940325,
				"gap": 5.209740442624366
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					2.772900185614162,
					139.44561008497703
				],
				[
					249.97193624534657,
					137.3327978109619
				]
			]
		},
		{
			"type": "rectangle",
			"version": 228,
			"versionNonce": 914754143,
			"isDeleted": false,
			"id": "omzWIm3hBk56aPTW7Etrx",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 920.4452507451899,
			"y": 3130.370700747908,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 441.5777652690947,
			"height": 232.40935014162915,
			"seed": 1973117137,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "G2xZEtOQuIR02FKppa0wf",
					"type": "arrow"
				}
			],
			"updated": 1713168084905,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 237,
			"versionNonce": 236994207,
			"isDeleted": false,
			"id": "pqzvEnNW",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1026.0858644459304,
			"y": 3092.3400798156417,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 222.65625,
			"height": 24,
			"seed": 2029721375,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "ExpenseSplitFactory",
			"rawText": "ExpenseSplitFactory",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "ExpenseSplitFactory",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 354,
			"versionNonce": 1576866495,
			"isDeleted": false,
			"id": "Q9eqw0Mr",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1000.7321171577529,
			"y": 2549.347325393836,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 480.46875,
			"height": 48,
			"seed": 736849343,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "ExpenseSplitFactory splitFactory;\nBalanceSheetController balanceController;",
			"rawText": "ExpenseSplitFactory splitFactory;\nBalanceSheetController balanceController;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "ExpenseSplitFactory splitFactory;\nBalanceSheetController balanceController;",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 305,
			"versionNonce": 527065823,
			"isDeleted": false,
			"id": "flWXB4ji",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 947.9118103073824,
			"y": 3229.672877626604,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 386.71875,
			"height": 24,
			"seed": 441265905,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "+getSplitFactoryBySplitType(type)",
			"rawText": "+getSplitFactoryBySplitType(type)",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "+getSplitFactoryBySplitType(type)",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 702,
			"versionNonce": 578893297,
			"isDeleted": false,
			"id": "G2xZEtOQuIR02FKppa0wf",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1313.428333711944,
			"y": 2912.751036524383,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 2.1128122740148,
			"height": 213.3940396754956,
			"seed": 530360159,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085280,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "EmKukr1z4GXay9NBXCkw2",
				"focus": -0.14930537598718865,
				"gap": 1
			},
			"endBinding": {
				"elementId": "omzWIm3hBk56aPTW7Etrx",
				"focus": 0.7907535699137564,
				"gap": 4.225624548029373
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					2.1128122740148,
					213.3940396754956
				]
			]
		},
		{
			"type": "rectangle",
			"version": 349,
			"versionNonce": 1395160863,
			"isDeleted": false,
			"id": "F9KTIkkFs0mqzEx4walcT",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 33.33554089456561,
			"y": 2212.369839446298,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 553.5568157918796,
			"height": 147.89685918103646,
			"seed": 22817809,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "l8lfrqN_lNtDJzl7mjsgd",
					"type": "arrow"
				},
				{
					"id": "OwXArENXmMOzB6Jw14XIW",
					"type": "arrow"
				},
				{
					"id": "lQjxGr0IfsgiOSCH02utS",
					"type": "arrow"
				},
				{
					"id": "c9nwaW4NMmM4EhVafKhc4",
					"type": "arrow"
				}
			],
			"updated": 1713168084905,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 178,
			"versionNonce": 79635391,
			"isDeleted": false,
			"id": "siGkGwLn",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 155.8786527874238,
			"y": 2153.2110957738823,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 46.875,
			"height": 24,
			"seed": 800389151,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "User",
			"rawText": "User",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "User",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 281,
			"versionNonce": 633492447,
			"isDeleted": false,
			"id": "37Yhk0RT",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 60.802100456757444,
			"y": 2244.0620235565193,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 433.59375,
			"height": 72,
			"seed": 1812078847,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "int userId;\nstring name;\nUserExpenseBalanceSheet balanceSheet;",
			"rawText": "int userId;\nstring name;\nUserExpenseBalanceSheet balanceSheet;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "int userId;\nstring name;\nUserExpenseBalanceSheet balanceSheet;",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 274,
			"versionNonce": 2066382847,
			"isDeleted": false,
			"id": "YFkUBy-ZNeGe9TfKUqr3K",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 29.10991634653533,
			"y": 2487.035435068222,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 695.1152381508716,
			"height": 252.34104874030118,
			"seed": 204587391,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "l8lfrqN_lNtDJzl7mjsgd",
					"type": "arrow"
				}
			],
			"updated": 1713168084905,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 209,
			"versionNonce": 924568639,
			"isDeleted": false,
			"id": "nf5P78Er",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 229.8270823779419,
			"y": 2442.6663773139117,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 164.0625,
			"height": 24,
			"seed": 122902001,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "UserController",
			"rawText": "UserController",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "UserController",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 194,
			"versionNonce": 662039647,
			"isDeleted": false,
			"id": "pTMnPPLO",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 56.57647590872784,
			"y": 2556.7582401107106,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 234.375,
			"height": 24,
			"seed": 1324559825,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "List<User> userList;",
			"rawText": "List<User> userList;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "List<User> userList;",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 214,
			"versionNonce": 601294975,
			"isDeleted": false,
			"id": "4hYcfSIf",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 54.07637444260581,
			"y": 2628.0924676545033,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 292.96875,
			"height": 24,
			"seed": 1321700735,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "// perform crud operation",
			"rawText": "// perform crud operation",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "// perform crud operation",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 243,
			"versionNonce": 918646431,
			"isDeleted": false,
			"id": "XLiVcZRGVErPb3jiS29u_",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -651.2156358862326,
			"y": 3059.6075613262346,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 669.7614908626938,
			"height": 155.96777250062132,
			"seed": 40814847,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "BVjXOTJTlrQwbItqgDZiT",
					"type": "arrow"
				},
				{
					"id": "NJX4vSLOAQk7t9KzvAm5l",
					"type": "arrow"
				}
			],
			"updated": 1713168284762,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 204,
			"versionNonce": 1348027615,
			"isDeleted": false,
			"id": "gTyjux0Q",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -505.4315889792108,
			"y": 2983.546319461702,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 140.625,
			"height": 24,
			"seed": 92964465,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "SplitWiseApp",
			"rawText": "SplitWiseApp",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "SplitWiseApp",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 286,
			"versionNonce": 489187851,
			"isDeleted": false,
			"id": "rxZsgGiY",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -604.7337658579067,
			"y": 3114.54068045062,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 468.75,
			"height": 72,
			"seed": 1716522065,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713177650703,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "UserController userController;\nGroupController groupController;\nBalanceSheetController balanceController",
			"rawText": "UserController userController;\nGroupController groupController;\nBalanceSheetController balanceController",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "UserController userController;\nGroupController groupController;\nBalanceSheetController balanceController",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 769,
			"versionNonce": 883895729,
			"isDeleted": false,
			"id": "l8lfrqN_lNtDJzl7mjsgd",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 502.90487796520847,
			"y": 2480.696998246178,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 2.362276644490521,
			"height": 116.20467507081457,
			"seed": 608206655,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085280,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "YFkUBy-ZNeGe9TfKUqr3K",
				"focus": 0.368245590961095,
				"gap": 6.338436822044287
			},
			"endBinding": {
				"elementId": "F9KTIkkFs0mqzEx4walcT",
				"focus": -0.6785911602209926,
				"gap": 4.225624548028918
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					-2.362276644490521,
					-116.20467507081457
				]
			]
		},
		{
			"type": "arrow",
			"version": 520,
			"versionNonce": 381702033,
			"isDeleted": false,
			"id": "BVjXOTJTlrQwbItqgDZiT",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -179.72610089566854,
			"y": 3055.3819367782053,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 213.3940396754956,
			"height": 361.2908988565323,
			"seed": 998299167,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085280,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "XLiVcZRGVErPb3jiS29u_",
				"focus": 0.4089555551445425,
				"gap": 4.225624548029373
			},
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					-2.445210159276826,
					-359.17808658251715
				],
				[
					210.94882951621878,
					-361.2908988565323
				]
			]
		},
		{
			"type": "rectangle",
			"version": 243,
			"versionNonce": 713842015,
			"isDeleted": false,
			"id": "wd_hK944BOxllMLhiOYKj",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 244.61676829604562,
			"y": 3101.863806806531,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 454.2546389131837,
			"height": 259.87590970382143,
			"seed": 55336607,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "00Ge77IJR2qeq0HHt7GoD",
					"type": "arrow"
				},
				{
					"id": "Z2Kppd_O_rq60eI8WP63Q",
					"type": "arrow"
				}
			],
			"updated": 1713168084905,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 181,
			"versionNonce": 60835263,
			"isDeleted": false,
			"id": "LMliLDUA",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 398.8520642991266,
			"y": 3059.607561326235,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 58.59375,
			"height": 24,
			"seed": 2102535007,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Group",
			"rawText": "Group",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Group",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 310,
			"versionNonce": 808400351,
			"isDeleted": false,
			"id": "Fx1MSD3J",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 274.19614013225305,
			"y": 3142.0072400128124,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 421.875,
			"height": 120,
			"seed": 2020901151,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "int groupId;\nstring groupName;\nList<User> groupMembers;\nList<Expense> expenseList\nExpenseController expenseController;",
			"rawText": "int groupId;\nstring groupName;\nList<User> groupMembers;\nList<Expense> expenseList\nExpenseController expenseController;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "int groupId;\nstring groupName;\nList<User> groupMembers;\nList<Expense> expenseList\nExpenseController expenseController;",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 788,
			"versionNonce": 1508663121,
			"isDeleted": false,
			"id": "00Ge77IJR2qeq0HHt7GoD",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 580.5539198644001,
			"y": 3099.7509945325164,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 392.87473136672713,
			"height": 353.49576425179885,
			"seed": 1313598367,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085280,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "wd_hK944BOxllMLhiOYKj",
				"focus": 0.4790697674418604,
				"gap": 2.112812274014914
			},
			"endBinding": {
				"elementId": "EmKukr1z4GXay9NBXCkw2",
				"focus": -0.17676393981323463,
				"gap": 2.0246668261536342
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					0,
					-154.2352960030812
				],
				[
					328.1982151236366,
					-152.02566143103923
				],
				[
					326.0854028496219,
					-352.8396497604731
				],
				[
					392.87473136672713,
					-353.49576425179885
				]
			]
		},
		{
			"type": "arrow",
			"version": 479,
			"versionNonce": 749096241,
			"isDeleted": false,
			"id": "OwXArENXmMOzB6Jw14XIW",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 796.3444362755338,
			"y": 2948.405526335857,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 203.28638062783534,
			"height": 680.56744818884,
			"seed": 1481054047,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085280,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": {
				"elementId": "F9KTIkkFs0mqzEx4walcT",
				"focus": -0.09608086721535072,
				"gap": 6.16569896125327
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					-6.6289037161250235,
					-680.56744818884
				],
				[
					-203.28638062783534,
					-676.1481790447565
				]
			]
		},
		{
			"type": "arrow",
			"version": 471,
			"versionNonce": 1369931537,
			"isDeleted": false,
			"id": "WFrXv8aH0Mwecwh8EP4jv",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 791.9251671314503,
			"y": 2356.2234610286846,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 1023.0608068553022,
			"height": 181.19003490741852,
			"seed": 1028143985,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085281,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": {
				"elementId": "SYmwzJtc0mhAY_oefZEnk",
				"focus": -0.7241708714076248,
				"gap": 1.940250285957518
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					1018.6415377112187,
					6.6289037161250235
				],
				[
					1023.0608068553022,
					181.19003490741852
				]
			]
		},
		{
			"type": "rectangle",
			"version": 291,
			"versionNonce": 360682207,
			"isDeleted": false,
			"id": "PxNVdpPHa0aCyKTSaqTaY",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 248.35506240919494,
			"y": 3533.958687926905,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 486.1196058491714,
			"height": 121.52990146229286,
			"seed": 1315204209,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "Z2Kppd_O_rq60eI8WP63Q",
					"type": "arrow"
				},
				{
					"id": "NJX4vSLOAQk7t9KzvAm5l",
					"type": "arrow"
				}
			],
			"updated": 1713168284762,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 215,
			"versionNonce": 702218911,
			"isDeleted": false,
			"id": "Xh0xn8ob",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 394.19094416394614,
			"y": 3485.346727341988,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 175.78125,
			"height": 24,
			"seed": 1514422431,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "GroupController",
			"rawText": "GroupController",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "GroupController",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 200,
			"versionNonce": 1035949759,
			"isDeleted": false,
			"id": "X6JXWHji",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 279.28994641777854,
			"y": 3578.1513793677386,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 246.09375,
			"height": 24,
			"seed": 796675007,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "List<Group> groupList",
			"rawText": "List<Group> groupList",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "List<Group> groupList",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 676,
			"versionNonce": 1366142673,
			"isDeleted": false,
			"id": "Z2Kppd_O_rq60eI8WP63Q",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 629.8889204556139,
			"y": 3532.9586879269054,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 5.035993902915152,
			"height": 164.7225929031274,
			"seed": 1623294481,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085281,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "PxNVdpPHa0aCyKTSaqTaY",
				"focus": 0.5731005074854219,
				"gap": 1
			},
			"endBinding": {
				"elementId": "wd_hK944BOxllMLhiOYKj",
				"focus": -0.6444733092023625,
				"gap": 6.49637851342527
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					-5.035993902915152,
					-164.7225929031274
				]
			]
		},
		{
			"type": "rectangle",
			"version": 248,
			"versionNonce": 33157887,
			"isDeleted": false,
			"id": "vbEEbvcw04G8uWTtedDde",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -880.7682039041083,
			"y": 2161.7756186890156,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 658.4711024684232,
			"height": 225.38272634825253,
			"seed": 522654783,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "D0OTS7T9G45gEMKHDjXxe",
					"type": "arrow"
				},
				{
					"id": "lQjxGr0IfsgiOSCH02utS",
					"type": "arrow"
				},
				{
					"id": "c9nwaW4NMmM4EhVafKhc4",
					"type": "arrow"
				}
			],
			"updated": 1713168084905,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 196,
			"versionNonce": 164952959,
			"isDeleted": false,
			"id": "Nl0Ey8JU",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -721.6745147171068,
			"y": 2102.11548524389,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 269.53125,
			"height": 24,
			"seed": 2082906129,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "UserExpenseBalanceSheet",
			"rawText": "UserExpenseBalanceSheet",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "UserExpenseBalanceSheet",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 329,
			"versionNonce": 29832095,
			"isDeleted": false,
			"id": "tOIx7UAY",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -825.5273396030661,
			"y": 2201.549040985766,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 410.15625,
			"height": 96,
			"seed": 1161735377,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Map<User,Balance> friendBalnceSheet\ndouble myTotalExpense;\ndouble myTotalOwe;\ndouble myTotalGetBack;",
			"rawText": "Map<User,Balance> friendBalnceSheet\ndouble myTotalExpense;\ndouble myTotalOwe;\ndouble myTotalGetBack;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Map<User,Balance> friendBalnceSheet\ndouble myTotalExpense;\ndouble myTotalOwe;\ndouble myTotalGetBack;",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 251,
			"versionNonce": 184379327,
			"isDeleted": false,
			"id": "9Z8s9O7FkBcAHafxcnhoZ",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -1397.8226937618638,
			"y": 2150.727445828807,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 353.5415315266705,
			"height": 125.94917060637681,
			"seed": 576567057,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 218,
			"versionNonce": 1402476511,
			"isDeleted": false,
			"id": "vYnlluey",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -1351.4203677489882,
			"y": 2197.1297718416827,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 246.09375,
			"height": 48,
			"seed": 1875441983,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "double amountOwe;\ndouble amountGetBack;",
			"rawText": "double amountOwe;\ndouble amountGetBack;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "double amountOwe;\ndouble amountGetBack;",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 188,
			"versionNonce": 1906820095,
			"isDeleted": false,
			"id": "j30gaDNJ",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -1307.2276763081545,
			"y": 2099.9058506718484,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 82.03125,
			"height": 24,
			"seed": 1687117631,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Balance",
			"rawText": "Balance",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Balance",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 383,
			"versionNonce": 1448193201,
			"isDeleted": false,
			"id": "D0OTS7T9G45gEMKHDjXxe",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -885.1874730481918,
			"y": 2219.2261175620997,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 163.51295833108497,
			"height": 4.419269144083273,
			"seed": 30768447,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085281,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "vbEEbvcw04G8uWTtedDde",
				"focus": 0.5284872298624718,
				"gap": 4.419269144083501
			},
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					-163.51295833108497,
					4.419269144083273
				]
			]
		},
		{
			"type": "arrow",
			"version": 572,
			"versionNonce": 1314976881,
			"isDeleted": false,
			"id": "lQjxGr0IfsgiOSCH02utS",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -217.87783229160164,
			"y": 2265.628443574975,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 249.68870664071073,
			"height": 2.2096345720417503,
			"seed": 1263517055,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085281,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "vbEEbvcw04G8uWTtedDde",
				"focus": -0.1019959404600862,
				"gap": 4.419269144083501
			},
			"endBinding": {
				"elementId": "F9KTIkkFs0mqzEx4walcT",
				"focus": 0.20965698823590553,
				"gap": 1.5246665454565118
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					249.68870664071073,
					2.2096345720417503
				]
			]
		},
		{
			"type": "arrow",
			"version": 586,
			"versionNonce": 361843761,
			"isDeleted": false,
			"id": "c9nwaW4NMmM4EhVafKhc4",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 27.391605205025826,
			"y": 2305.4018658717255,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 245.26943749662746,
			"height": 4.419269144083273,
			"seed": 1364809489,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085281,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "F9KTIkkFs0mqzEx4walcT",
				"focus": -0.1772271452853954,
				"gap": 5.943935689539785
			},
			"endBinding": {
				"elementId": "vbEEbvcw04G8uWTtedDde",
				"focus": 0.3487162275549601,
				"gap": 4.419269144083501
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					-245.26943749662746,
					4.419269144083273
				]
			]
		},
		{
			"type": "rectangle",
			"version": 233,
			"versionNonce": 1590462879,
			"isDeleted": false,
			"id": "MDAQkwg-Sh6qKcDZXnQFD",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 672.6575615646109,
			"y": 1934.2669665093995,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 740.3404083392029,
			"height": 162.31642189493982,
			"seed": 1423595921,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "rnUefRUT5QFodyD_KxfYQ",
					"type": "arrow"
				}
			],
			"updated": 1713168336717,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 295,
			"versionNonce": 475691199,
			"isDeleted": false,
			"id": "YKuDkFGI",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 718.9288370858114,
			"y": 1973.9280598132855,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 621.09375,
			"height": 96,
			"seed": 2066728721,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "// business logic to create/update balance as soon as\nexpense is created\n\n+cretaeUpdateUserBalanceSheet();",
			"rawText": "// business logic to create/update balance as soon as\nexpense is created\n\n+cretaeUpdateUserBalanceSheet();",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "// business logic to create/update balance as soon as\nexpense is created\n\n+cretaeUpdateUserBalanceSheet();",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 200,
			"versionNonce": 959121631,
			"isDeleted": false,
			"id": "nENepN8Q",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 866.1389712639185,
			"y": 1884.789027132179,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 257.8125,
			"height": 24,
			"seed": 1202661055,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168084905,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "BalanceSheetController",
			"rawText": "BalanceSheetController",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "BalanceSheetController",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 638,
			"versionNonce": 48149489,
			"isDeleted": false,
			"id": "rnUefRUT5QFodyD_KxfYQ",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 1113.7041477873327,
			"y": 2497.850099702845,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 3.6454647649782146,
			"height": 397.21072635583505,
			"seed": 973572735,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168085281,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "EmKukr1z4GXay9NBXCkw2",
				"focus": -0.516685247201858,
				"gap": 2.9322179477867394
			},
			"endBinding": {
				"elementId": "MDAQkwg-Sh6qKcDZXnQFD",
				"focus": -0.17914843582511128,
				"gap": 4.05598494267042
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					-3.6454647649782146,
					-397.21072635583505
				]
			]
		},
		{
			"type": "arrow",
			"version": 96,
			"versionNonce": 189322353,
			"isDeleted": false,
			"id": "NJX4vSLOAQk7t9KzvAm5l",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": -125.18892048902399,
			"y": 3221.546068008091,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 368.8888888888889,
			"height": 388.88888888888914,
			"seed": 662788753,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168284763,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "XLiVcZRGVErPb3jiS29u_",
				"focus": -0.5642379848665988,
				"gap": 5.970734181235002
			},
			"endBinding": {
				"elementId": "PxNVdpPHa0aCyKTSaqTaY",
				"focus": -0.25855889044398234,
				"gap": 4.655094009330014
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					6.6666666666667425,
					388.88888888888914
				],
				[
					368.8888888888889,
					388.88888888888914
				]
			]
		},
		{
			"type": "arrow",
			"version": 87,
			"versionNonce": 550963473,
			"isDeleted": false,
			"id": "l3XHGoLF3pTayyMu1mOV7",
			"fillStyle": "solid",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 0,
			"opacity": 100,
			"angle": 0,
			"x": 676.2809429808401,
			"y": 2021.9449469069687,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 1027.6923076923076,
			"height": 140,
			"seed": 149421503,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713168344717,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "triangle",
			"points": [
				[
					0,
					0
				],
				[
					-1027.6923076923076,
					1.538461538461661
				],
				[
					-1027.6923076923076,
					140
				]
			]
		}
	],
	"appState": {
		"theme": "light",
		"viewBackgroundColor": "#1e1e1e",
		"currentItemStrokeColor": "#f08c00",
		"currentItemBackgroundColor": "transparent",
		"currentItemFillStyle": "solid",
		"currentItemStrokeWidth": 1,
		"currentItemStrokeStyle": "solid",
		"currentItemRoughness": 0,
		"currentItemOpacity": 100,
		"currentItemFontFamily": 3,
		"currentItemFontSize": 20,
		"currentItemTextAlign": "left",
		"currentItemStartArrowhead": null,
		"currentItemEndArrowhead": "triangle",
		"scrollX": 1251.6247069248097,
		"scrollY": -2197.744751269275,
		"zoom": {
			"value": 0.5499999999999999
		},
		"currentItemRoundness": "sharp",
		"gridSize": null,
		"gridColor": {
			"Bold": "#545454FF",
			"Regular": "#303030FF"
		},
		"currentStrokeOptions": null,
		"previousGridSize": null,
		"frameRendering": {
			"enabled": true,
			"clip": true,
			"name": true,
			"outline": true
		}
	},
	"files": {}
}
```
%%