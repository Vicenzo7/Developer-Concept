---

excalidraw-plugin: parsed
tags: [excalidraw]

---
==⚠  Switch to EXCALIDRAW VIEW in the MORE OPTIONS menu of this document. ⚠==


# Text Elements
LLD of Movie Booking Sytem / Book My Show ^FbAKzObh

Follow Up -> Same ticket is not booked for two same people ^X4J9Ypf2

Rough flow ^D7eu2g1S

user ^8OxbQo1K

enters location
    (city) ^dP9wAUFX

Movie1


Movie2


MovieN ^YJk7MajQ

Gets list of movues based on list ^dDzouGEz

gets list shoes based on movie
selected ^hmpy4uDn

Theater1
show at 8, 12, 16 ^Iex1dzpm

Theater1
show at 11, 13, 15 ^oYosC8ek

Theater N ^ZMVNGKmP

selects a a show of particular theater ^y7ja4grF

Seat selection in a 
Hall ^KMJjxptQ

After seat selection Booking ^sMBppSKV

Booking 
   +
Paymennt  ^VfKvMbNL

Objects
1. User
2. City
3. Movie
4. Theater
5. Screens(Halls)
6. Shows
7. Seats
8. Booking
9. Payment ^SYVsmDyh

Movie ^BesgNtci

int movieId;
string movieName;
int movieDurantion; ^2M1ibluV

Movie Controller ^K2GWC4aG

Map<City, List<Movies>> cityToMovies;
List<Movies> allMovies;  ^gwLOKFNW

+addMovie(Movie movie,City city);
+getMovieByName(String movieName);

//More Crud Based Operation, remove,
update, etc.. from the map ^pHLoS8PO

Theater ^rbRtGrrB

int theaterId;
string address;
City city;
List<Screen> screens;
List<Show> shows; ^EfFJ1XfQ

Screen ^MBMmDWTv

int screenId;
List<Seat> seats; ^3ZIwzkJT

Shows ^6IMrnMth

int showId;
Movie movie;
Screen screen;
int showStartTime;
List<Integer> bookedSeats; ^VrgngSZi

Seat ^pvviJiPt

int id;
int row;
int price;
SeatCategory category;
 ^mSHHZiik

SeatCategory ^qewEtkY7

SILVER,
GOLD,
PLATINUM ^BJmmQkyc

Theater Controller ^9Jls8ztu

Map<City, List<Theater>> cityToTheater;
List<Theater> allTheater;  ^7Ih9mckH

+addTheater(Theater theater,City city);
+getAllShows(String movieName,City city);

//More Crud Based Operation, remove,
update, etc.. from the map ^YzQYpHos

Booking ^gOEGSmBX

Show show;
List<Seat> seats;
Payment payment; ^Y0HsPcyL

Payment ^j4Yo8oj5

Payment details; ^Brrpnb1a

BookMyShow ^TMCIUxAL

MovieController movieController;
TheaterController theatherCOntroller; ^vjwGvjFv

+createBooking(City city, Movie movie); ^ONdn2ItG

How will you manage concurrency??

1. Two users cannot book same seat
2. If user1 has booked a seat , that seat should be booked for 10 mins, even if the payments fails
    the seat must be booked for 10 mins. ^WIJFhJIB

Two Type of Locking ^FsIzjbxF

Pessimistic Locking ^A5BvZJd3

Optimistic Locking ^KDYQxoop

- When user-1 tries to read, lock will be acquired 
  at the time of read itself.h

- If user-2 tries to read the same thing, it will fail
  because the lock is acquired on it.

- Lock will be released only after the update has occurred.

- Pessimistic Locking: If the database uses pessimistic locking,
 the first transaction to request a lock on the row will acquire it,
 and the other transaction will be forced to wait until the lock is released.
 The order in which the transactions request the lock depends on factors
 such as the timing of the requests and the locking strategy used by the database. ^QV848Hzv

- Allow's multiple user to do the read the value 
  and creates a version, let say seat 30 is not booked
  and it's version-1.

- But when the thread tries to update the seat to book it,
  it check whether the version is changed or is same.

- If same it allows to update, else throws conflict error.

- Optimistic Locking: With optimistic locking, each transaction reads the row's 
 current state and performs the update based on that state.
 When the transaction attempts to commit the changes, the database checks if the 
 row has been modified since it was read. If another transaction has modified the 
 row in the meantime, an optimistic locking conflict occurs, and the transaction may 
 need to be retried. ^hC2K2zgN

Optimistic Locking is the best way for Book My Show.
Because pessimistic locking can cause locking of all seats.


For example user seats two seats, these two seats are locked, later 
he decides these seats are not required and books other seats, 
but the previous seats are still booked. This causes a problem for other users
because they have to wait for 10 min until lock is released.


Now the above things can be handled in redis and in redis we can give lock time or expiry time. ^ITdacWaa

Retention Policy -> How long data must be kept.

Eviction Policy -> Which data must be removed and how, eg LRU, Round Robin method ^fevfZ1RJ

User ^KIl4jLqt

string name;
Booking booking; ^oj4qlZAW

enum City ^UySqCC1m

BANGALORE,
CHENNAI,
.
.
etc... ^ZJ007NgN

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
			"version": 206,
			"versionNonce": 682697180,
			"isDeleted": false,
			"id": "FbAKzObh",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 945.3142649938727,
			"y": -420.4671038157497,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 480.46875,
			"height": 24,
			"seed": 1595124031,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1714285023520,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "LLD of Movie Booking Sytem / Book My Show",
			"rawText": "LLD of Movie Booking Sytem / Book My Show",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "LLD of Movie Booking Sytem / Book My Show",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 225,
			"versionNonce": 1063416123,
			"isDeleted": false,
			"id": "X4J9Ypf2",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 884.4884466568036,
			"y": -325.12882340424517,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 679.6875,
			"height": 24,
			"seed": 336549535,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339425365,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Follow Up -> Same ticket is not booked for two same people",
			"rawText": "Follow Up -> Same ticket is not booked for two same people",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Follow Up -> Same ticket is not booked for two same people",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 53,
			"versionNonce": 1846972891,
			"isDeleted": false,
			"id": "D7eu2g1S",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -77.53764682371752,
			"y": -159.50286934866241,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 117.1875,
			"height": 24,
			"seed": 883696511,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339425365,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Rough flow",
			"rawText": "Rough flow",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Rough flow",
			"lineHeight": 1.2
		},
		{
			"type": "ellipse",
			"version": 72,
			"versionNonce": 1052614267,
			"isDeleted": false,
			"id": "KMI-Mwdp1MxzwvAKVVM1G",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -19.95761693440818,
			"y": -19.817982024597484,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 136.48599677465893,
			"height": 73.57448263633955,
			"seed": 1745861887,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 2
			},
			"boundElements": [
				{
					"type": "text",
					"id": "8OxbQo1K"
				}
			],
			"updated": 1713339425365,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 51,
			"versionNonce": 2003519836,
			"isDeleted": false,
			"id": "8OxbQo1K",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 25.09279452473799,
			"y": 4.956751496348495,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 46.875,
			"height": 24,
			"seed": 375270289,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1714284591882,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "user",
			"rawText": "user",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "KMI-Mwdp1MxzwvAKVVM1G",
			"originalText": "user",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 84,
			"versionNonce": 882801595,
			"isDeleted": false,
			"id": "lE-E-VWfBYY7Vg9KT_mT2",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 294.59995375718836,
			"y": -24.083169423805543,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 237.784197505851,
			"height": 71.4418889367355,
			"seed": 1574039391,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "ha0OlZ4g0yI8pruDh21An",
					"type": "arrow"
				},
				{
					"id": "mRsd_zIu1zTnzc5eew0iT",
					"type": "arrow"
				},
				{
					"id": "ZEisMADioWQfTl8wjB6PP",
					"type": "arrow"
				}
			],
			"updated": 1713339425365,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 66,
			"versionNonce": 2017543739,
			"isDeleted": false,
			"id": "dP9wAUFX",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 327.65515610105103,
			"y": -9.15501352657725,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 175.78125,
			"height": 48,
			"seed": 1411777599,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339425365,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "enters location\n    (city)",
			"rawText": "enters location\n    (city)",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "enters location\n    (city)",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 127,
			"versionNonce": 1327526133,
			"isDeleted": false,
			"id": "ha0OlZ4g0yI8pruDh21An",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 115.46208299044861,
			"y": 17.502407718473307,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 175.93898021733366,
			"height": 1.066296849802029,
			"seed": 1233933073,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1713339426383,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": {
				"elementId": "lE-E-VWfBYY7Vg9KT_mT2",
				"focus": -0.11136726369923657,
				"gap": 3.1988905494060873
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					175.93898021733366,
					-1.066296849802029
				]
			]
		},
		{
			"type": "text",
			"version": 257,
			"versionNonce": 1940599675,
			"isDeleted": false,
			"id": "YJk7MajQ",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 753.017915399694,
			"y": -53.74202689500933,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 70.3125,
			"height": 168,
			"seed": 1223371793,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "8eX_DxHUySbt1QzpvJD3Y",
					"type": "arrow"
				},
				{
					"id": "ZEisMADioWQfTl8wjB6PP",
					"type": "arrow"
				},
				{
					"id": "mRsd_zIu1zTnzc5eew0iT",
					"type": "arrow"
				}
			],
			"updated": 1713339425365,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Movie1\n\n\nMovie2\n\n\nMovieN",
			"rawText": "Movie1\n\n\nMovie2\n\n\nMovieN",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Movie1\n\n\nMovie2\n\n\nMovieN",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 485,
			"versionNonce": 1991669685,
			"isDeleted": false,
			"id": "ZEisMADioWQfTl8wjB6PP",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 534.0198282086113,
			"y": 0.5929941444489089,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 206.3514736737909,
			"height": 41.278180169275956,
			"seed": 11388735,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1713339426383,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "lE-E-VWfBYY7Vg9KT_mT2",
				"focus": 0.21957179934027768,
				"gap": 1.6356769455719586
			},
			"endBinding": {
				"elementId": "YJk7MajQ",
				"focus": 0.8843597167196193,
				"gap": 12.646613517291712
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					206.3514736737909,
					-41.278180169275956
				]
			]
		},
		{
			"type": "arrow",
			"version": 474,
			"versionNonce": 416790805,
			"isDeleted": false,
			"id": "8eX_DxHUySbt1QzpvJD3Y",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 532.3337578644033,
			"y": 1.9957983597869102,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 207.79049622638365,
			"height": 24.427758884245854,
			"seed": 1995711455,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1713339426383,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": {
				"elementId": "YJk7MajQ",
				"focus": -0.02058606237925604,
				"gap": 12.893661308906985
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					207.79049622638365,
					24.427758884245854
				]
			]
		},
		{
			"type": "arrow",
			"version": 542,
			"versionNonce": 252852181,
			"isDeleted": false,
			"id": "mRsd_zIu1zTnzc5eew0iT",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 538.7564146217323,
			"y": 8.239670013443842,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 206.35903945685985,
			"height": 96.40623350883594,
			"seed": 1025661375,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1713339426383,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "lE-E-VWfBYY7Vg9KT_mT2",
				"focus": -0.6784530130140126,
				"gap": 6.372263358692976
			},
			"endBinding": {
				"elementId": "YJk7MajQ",
				"focus": -0.9410478734128626,
				"gap": 7.902461321101782
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					206.35903945685985,
					96.40623350883594
				]
			]
		},
		{
			"type": "text",
			"version": 120,
			"versionNonce": 2001337307,
			"isDeleted": false,
			"id": "dDzouGEz",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 445.2817820537605,
			"y": -117.29629198923084,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 386.71875,
			"height": 24,
			"seed": 1951817649,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339425365,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Gets list of movues based on list",
			"rawText": "Gets list of movues based on list",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Gets list of movues based on list",
			"lineHeight": 1.2
		},
		{
			"type": "ellipse",
			"version": 81,
			"versionNonce": 1643366523,
			"isDeleted": false,
			"id": "f5QPPA96dmUL_GimX6wH3",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 736.9322102659281,
			"y": 10.406409010282175,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 111.34170025541334,
			"height": 39.914949148166954,
			"seed": 1203345937,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 2
			},
			"boundElements": [
				{
					"id": "8TqK8-G3G6MKx5TCd5tRr",
					"type": "arrow"
				},
				{
					"id": "98Mu1hZJEGxjK1y2KfhhS",
					"type": "arrow"
				},
				{
					"id": "vRSnK-oDj2pWWR2fysw11",
					"type": "arrow"
				}
			],
			"updated": 1713339425365,
			"link": null,
			"locked": false
		},
		{
			"type": "arrow",
			"version": 202,
			"versionNonce": 1313605269,
			"isDeleted": false,
			"id": "8TqK8-G3G6MKx5TCd5tRr",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 855.6266643117932,
			"y": 30.363883584365738,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 273.1022836453533,
			"height": 1.050393398635947,
			"seed": 1670120543,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1713339426383,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "f5QPPA96dmUL_GimX6wH3",
				"focus": 0.012145050024101826,
				"gap": 7.352753790451743
			},
			"endBinding": {
				"elementId": "HJESsL1NHXbgk-0LNQzeb",
				"focus": -0.012241164391802879,
				"gap": 3.1833711671499145
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					273.1022836453533,
					-1.050393398635947
				]
			]
		},
		{
			"type": "arrow",
			"version": 136,
			"versionNonce": 1217948661,
			"isDeleted": false,
			"id": "98Mu1hZJEGxjK1y2KfhhS",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 851.4250907172493,
			"y": 31.41427698300174,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 279.4046440371691,
			"height": 95.58579927587357,
			"seed": 1392266065,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1713339426383,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "f5QPPA96dmUL_GimX6wH3",
				"focus": -0.691382418453011,
				"gap": 3.204488882490743
			},
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					279.4046440371691,
					95.58579927587357
				]
			]
		},
		{
			"type": "arrow",
			"version": 147,
			"versionNonce": 2062624085,
			"isDeleted": false,
			"id": "vRSnK-oDj2pWWR2fysw11",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 850.3746973186134,
			"y": 31.41427698300174,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 255.2455958685416,
			"height": 97.68658607314558,
			"seed": 2011522129,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1713339426383,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "f5QPPA96dmUL_GimX6wH3",
				"focus": 0.7933492889866408,
				"gap": 2.1600743973241094
			},
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					255.2455958685416,
					-97.68658607314558
				]
			]
		},
		{
			"type": "text",
			"version": 213,
			"versionNonce": 503066843,
			"isDeleted": false,
			"id": "hmpy4uDn",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 934.4061692094913,
			"y": 143.80637063705092,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 351.5625,
			"height": 48,
			"seed": 43641631,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339425365,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "gets list shoes based on movie\nselected",
			"rawText": "gets list shoes based on movie\nselected",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "gets list shoes based on movie\nselected",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 72,
			"versionNonce": 1050107259,
			"isDeleted": false,
			"id": "Iex1dzpm",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1162.3415367134976,
			"y": -111.43922523149072,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 199.21875,
			"height": 48,
			"seed": 2140414239,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339425365,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Theater1\nshow at 8, 12, 16",
			"rawText": "Theater1\nshow at 8, 12, 16",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Theater1\nshow at 8, 12, 16",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 130,
			"versionNonce": 1214510619,
			"isDeleted": false,
			"id": "oYosC8ek",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1163.5699279825512,
			"y": 2.1623099898218356,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 210.9375,
			"height": 48,
			"seed": 1476300081,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339425365,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Theater1\nshow at 11, 13, 15",
			"rawText": "Theater1\nshow at 11, 13, 15",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Theater1\nshow at 11, 13, 15",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 63,
			"versionNonce": 1783921339,
			"isDeleted": false,
			"id": "ZMVNGKmP",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1165.4927169094055,
			"y": 109.14338848206393,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 105.46875,
			"height": 24,
			"seed": 873130865,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339425365,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Theater N",
			"rawText": "Theater N",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Theater N",
			"lineHeight": 1.2
		},
		{
			"type": "ellipse",
			"version": 109,
			"versionNonce": 1359702875,
			"isDeleted": false,
			"id": "HJESsL1NHXbgk-0LNQzeb",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1131.8801281530543,
			"y": -14.803032556981009,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 265.7495298549014,
			"height": 86.13225868814988,
			"seed": 1964266367,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 2
			},
			"boundElements": [
				{
					"id": "8TqK8-G3G6MKx5TCd5tRr",
					"type": "arrow"
				},
				{
					"id": "0BlfW_Cd4e5gfA-NSEmcz",
					"type": "arrow"
				}
			],
			"updated": 1713339425365,
			"link": null,
			"locked": false
		},
		{
			"type": "arrow",
			"version": 289,
			"versionNonce": 242062357,
			"isDeleted": false,
			"id": "0BlfW_Cd4e5gfA-NSEmcz",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1402.8816250011355,
			"y": 25.111916591186002,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 379.19201690758655,
			"height": 1.050393398635947,
			"seed": 1592445265,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 2
			},
			"boundElements": [
				{
					"type": "text",
					"id": "y7ja4grF"
				}
			],
			"updated": 1713339426383,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "HJESsL1NHXbgk-0LNQzeb",
				"focus": -0.06428384906895677,
				"gap": 5.507625781229734
			},
			"endBinding": {
				"elementId": "ib0rrQSgW_I7VDS5jkcJU",
				"focus": 0.10491711454596399,
				"gap": 15.755900979539547
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					379.19201690758655,
					-1.050393398635947
				]
			]
		},
		{
			"type": "text",
			"version": 49,
			"versionNonce": 957051707,
			"isDeleted": false,
			"id": "y7ja4grF",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 749.573871629033,
			"y": 46.03813257410309,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 222.65625,
			"height": 48,
			"seed": 1989642303,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "selects a a show of\nparticular theater",
			"rawText": "selects a a show of particular theater",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "0BlfW_Cd4e5gfA-NSEmcz",
			"originalText": "selects a a show of particular theater",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 94,
			"versionNonce": 2003396059,
			"isDeleted": false,
			"id": "ib0rrQSgW_I7VDS5jkcJU",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1797.8295428882616,
			"y": -73.62506288059546,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 268.90071005080927,
			"height": 217.43143351764655,
			"seed": 390617393,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "0BlfW_Cd4e5gfA-NSEmcz",
					"type": "arrow"
				}
			],
			"updated": 1713339425366,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 75,
			"versionNonce": 1439165211,
			"isDeleted": false,
			"id": "KMJjxptQ",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1828.2909514487048,
			"y": -0.09752497607735222,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 234.375,
			"height": 48,
			"seed": 2078138751,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "OFr6eBplNlWbeQfk8Hxk4",
					"type": "arrow"
				}
			],
			"updated": 1713339425366,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Seat selection in a \nHall",
			"rawText": "Seat selection in a \nHall",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Seat selection in a \nHall",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 382,
			"versionNonce": 388846293,
			"isDeleted": false,
			"id": "OFr6eBplNlWbeQfk8Hxk4",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2068.831039736343,
			"y": 30.079383871143676,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 323.52116677988033,
			"height": 0.27560410607213726,
			"seed": 2008567697,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 2
			},
			"boundElements": [
				{
					"type": "text",
					"id": "sMBppSKV"
				}
			],
			"updated": 1713339426384,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "KMJjxptQ",
				"focus": 0.25194476289927464,
				"gap": 6.1650882876384685
			},
			"endBinding": {
				"elementId": "S78GIkbwimGYnqGtkuW1v",
				"focus": 0.13617022362473938,
				"gap": 7.352753790451516
			},
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": "arrow",
			"points": [
				[
					0,
					0
				],
				[
					323.52116677988033,
					0.27560410607213726
				]
			]
		},
		{
			"type": "text",
			"version": 33,
			"versionNonce": 2140020859,
			"isDeleted": false,
			"id": "sMBppSKV",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1393.1042509085714,
			"y": 44.462542476149025,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 199.21875,
			"height": 48,
			"seed": 899564081,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "After seat\nselection Booking",
			"rawText": "After seat selection Booking",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "OFr6eBplNlWbeQfk8Hxk4",
			"originalText": "After seat selection Booking",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 185,
			"versionNonce": 1449614587,
			"isDeleted": false,
			"id": "S78GIkbwimGYnqGtkuW1v",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2399.704960306675,
			"y": -42.11326092151643,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 236.3385146930941,
			"height": 168.06294378175585,
			"seed": 1563906065,
			"groupIds": [],
			"frameId": null,
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"id": "OFr6eBplNlWbeQfk8Hxk4",
					"type": "arrow"
				}
			],
			"updated": 1713339425366,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 67,
			"versionNonce": 382376507,
			"isDeleted": false,
			"id": "VfKvMbNL",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2474.2828916098288,
			"y": 13.557589206190187,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 105.46875,
			"height": 72,
			"seed": 317302719,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339425366,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Booking \n   +\nPaymennt ",
			"rawText": "Booking \n   +\nPaymennt ",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Booking \n   +\nPaymennt ",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 226,
			"versionNonce": 1485937371,
			"isDeleted": false,
			"id": "SYVsmDyh",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1011.7908276106613,
			"y": 317.10935630320307,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 199.21875,
			"height": 240,
			"seed": 285285695,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339425366,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Objects\n1. User\n2. City\n3. Movie\n4. Theater\n5. Screens(Halls)\n6. Shows\n7. Seats\n8. Booking\n9. Payment",
			"rawText": "Objects\n1. User\n2. City\n3. Movie\n4. Theater\n5. Screens(Halls)\n6. Shows\n7. Seats\n8. Booking\n9. Payment",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Objects\n1. User\n2. City\n3. Movie\n4. Theater\n5. Screens(Halls)\n6. Shows\n7. Seats\n8. Booking\n9. Payment",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 233,
			"versionNonce": 951483835,
			"isDeleted": false,
			"id": "rQ7eWSodqI5DI_ZY449L4",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 835.3597977547581,
			"y": 1190.5253531155386,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 289.0248965417886,
			"height": 131.223947280467,
			"seed": 684369023,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "EVuMy5BvyKKXQX_KqzFoE",
					"type": "arrow"
				},
				{
					"id": "2PPVDHHpGgLnn3jkI8CIQ",
					"type": "arrow"
				}
			],
			"updated": 1713338819695,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 156,
			"versionNonce": 843419509,
			"isDeleted": false,
			"id": "BesgNtci",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 931.7014299353542,
			"y": 1147.3377248966506,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 58.59375,
			"height": 24,
			"seed": 230936081,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Movie",
			"rawText": "Movie",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Movie",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 232,
			"versionNonce": 708120155,
			"isDeleted": false,
			"id": "2M1ibluV",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 863.5978623594157,
			"y": 1217.1023550963928,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 222.65625,
			"height": 72,
			"seed": 846720273,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "int movieId;\nstring movieName;\nint movieDurantion;",
			"rawText": "int movieId;\nstring movieName;\nint movieDurantion;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "int movieId;\nstring movieName;\nint movieDurantion;",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 236,
			"versionNonce": 542362395,
			"isDeleted": false,
			"id": "fwWQGnbLcRJEUGIU6TLVv",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 664.2703475030097,
			"y": 1439.6847466860459,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 486.69134877439114,
			"height": 274.07533292755807,
			"seed": 180614161,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "EVuMy5BvyKKXQX_KqzFoE",
					"type": "arrow"
				},
				{
					"id": "htevxPdC36h7mGCcTZj1v",
					"type": "arrow"
				},
				{
					"id": "jVT7mxvFzZFYnBl56tyNp",
					"type": "arrow"
				}
			],
			"updated": 1713345092144,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 154,
			"versionNonce": 1524140795,
			"isDeleted": false,
			"id": "K2GWC4aG",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 675.8977858696335,
			"y": 1403.1413689623714,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 187.5,
			"height": 24,
			"seed": 1264804575,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Movie Controller",
			"rawText": "Movie Controller",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Movie Controller",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 240,
			"versionNonce": 1158018613,
			"isDeleted": false,
			"id": "gwLOKFNW",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 690.8473494838639,
			"y": 1479.5502496573272,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 433.59375,
			"height": 48,
			"seed": 1671119345,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Map<City, List<Movies>> cityToMovies;\nList<Movies> allMovies; ",
			"rawText": "Map<City, List<Movies>> cityToMovies;\nList<Movies> allMovies; ",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Map<City, List<Movies>> cityToMovies;\nList<Movies> allMovies; ",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 329,
			"versionNonce": 1864594331,
			"isDeleted": false,
			"id": "pHLoS8PO",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 695.830537355274,
			"y": 1575.8918818379236,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 421.875,
			"height": 120,
			"seed": 2040949393,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "+addMovie(Movie movie,City city);\n+getMovieByName(String movieName);\n\n//More Crud Based Operation, remove,\nupdate, etc.. from the map",
			"rawText": "+addMovie(Movie movie,City city);\n+getMovieByName(String movieName);\n\n//More Crud Based Operation, remove,\nupdate, etc.. from the map",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "+addMovie(Movie movie,City city);\n+getMovieByName(String movieName);\n\n//More Crud Based Operation, remove,\nupdate, etc.. from the map",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 447,
			"versionNonce": 498296725,
			"isDeleted": false,
			"id": "EVuMy5BvyKKXQX_KqzFoE",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 968.2448076590288,
			"y": 1434.7015588146357,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 1.661062623803332,
			"height": 112.95225841862998,
			"seed": 54545617,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "fwWQGnbLcRJEUGIU6TLVv",
				"focus": 0.23858828214445757,
				"gap": 4.983187871410109
			},
			"endBinding": {
				"elementId": "rQ7eWSodqI5DI_ZY449L4",
				"focus": 0.06187557719754893,
				"gap": 1
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
					1.661062623803332,
					-112.95225841862998
				]
			]
		},
		{
			"type": "rectangle",
			"version": 387,
			"versionNonce": 1464354875,
			"isDeleted": false,
			"id": "5e1EVen-0lTKaNbudJTr_",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1280.4019798487227,
			"y": 1179.8745962857474,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 313.9408358988394,
			"height": 194.34432698499586,
			"seed": 517342641,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "-ylSRa1GJtmqUJbgwEqyY",
					"type": "arrow"
				},
				{
					"id": "Zu8K6ehTaei6IjgxePvVD",
					"type": "arrow"
				},
				{
					"id": "cs8phSt__nTpDnGoVPCWg",
					"type": "arrow"
				}
			],
			"updated": 1713338819695,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 222,
			"versionNonce": 1449897205,
			"isDeleted": false,
			"id": "rbRtGrrB",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1365.1161736626955,
			"y": 1135.0259054430562,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 82.03125,
			"height": 24,
			"seed": 1367319263,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Theater",
			"rawText": "Theater",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Theater",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 308,
			"versionNonce": 1495894235,
			"isDeleted": false,
			"id": "EfFJ1XfQ",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1320.2674828200038,
			"y": 1228.0454123760455,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 246.09375,
			"height": 120,
			"seed": 998074399,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "int theaterId;\nstring address;\nCity city;\nList<Screen> screens;\nList<Show> shows;",
			"rawText": "int theaterId;\nstring address;\nCity city;\nList<Screen> screens;\nList<Show> shows;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "int theaterId;\nstring address;\nCity city;\nList<Screen> screens;\nList<Show> shows;",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 322,
			"versionNonce": 1320437333,
			"isDeleted": false,
			"id": "-QHWyBfExwmn9FZKltkWY",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1697.328698394653,
			"y": 1184.8577843951912,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 343.83996312730005,
			"height": 107.96907054721987,
			"seed": 7233727,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "-ylSRa1GJtmqUJbgwEqyY",
					"type": "arrow"
				},
				{
					"id": "H1tyMxvMQg6I59dZGZvGL",
					"type": "arrow"
				}
			],
			"updated": 1713338819695,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 253,
			"versionNonce": 1515828603,
			"isDeleted": false,
			"id": "MBMmDWTv",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1730.5499508707205,
			"y": 1136.686968304893,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 70.3125,
			"height": 24,
			"seed": 906780223,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Screen",
			"rawText": "Screen",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Screen",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 294,
			"versionNonce": 1499640757,
			"isDeleted": false,
			"id": "3ZIwzkJT",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1747.1605771087543,
			"y": 1214.756911623652,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 199.21875,
			"height": 48,
			"seed": 788773393,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "int screenId;\nList<Seat> seats;",
			"rawText": "int screenId;\nList<Seat> seats;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "int screenId;\nList<Seat> seats;",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 599,
			"versionNonce": 1780174363,
			"isDeleted": false,
			"id": "-ylSRa1GJtmqUJbgwEqyY",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1597.6649409951688,
			"y": 1257.9445396045062,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 94.68056955679276,
			"height": 1.6610626238034456,
			"seed": 934455423,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "5e1EVen-0lTKaNbudJTr_",
				"focus": -0.16302128900554233,
				"gap": 3.322125247606664
			},
			"endBinding": {
				"elementId": "-QHWyBfExwmn9FZKltkWY",
				"focus": -0.25153373816414126,
				"gap": 4.98318784269145
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
					94.68056955679276,
					-1.6610626238034456
				]
			]
		},
		{
			"type": "rectangle",
			"version": 196,
			"versionNonce": 1385985301,
			"isDeleted": false,
			"id": "dwi0saERcbhyIWC7eBecu",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1333.2820983426357,
			"y": 1491.199190606458,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 344.6153846153845,
			"height": 198.46153846153834,
			"seed": 526155487,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "gpQclP74APIDBaFCNri0T",
					"type": "arrow"
				}
			],
			"updated": 1713338819695,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 140,
			"versionNonce": 190894779,
			"isDeleted": false,
			"id": "6IMrnMth",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1370.2051752657126,
			"y": 1441.9684213756886,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 58.59375,
			"height": 24,
			"seed": 959373983,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Shows",
			"rawText": "Shows",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Shows",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 328,
			"versionNonce": 1977027189,
			"isDeleted": false,
			"id": "VrgngSZi",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1348.666713727251,
			"y": 1509.6607290679963,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 304.6875,
			"height": 120,
			"seed": 1550367185,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "H1tyMxvMQg6I59dZGZvGL",
					"type": "arrow"
				},
				{
					"id": "2PPVDHHpGgLnn3jkI8CIQ",
					"type": "arrow"
				},
				{
					"id": "cs8phSt__nTpDnGoVPCWg",
					"type": "arrow"
				}
			],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "int showId;\nMovie movie;\nScreen screen;\nint showStartTime;\nList<Integer> bookedSeats;",
			"rawText": "int showId;\nMovie movie;\nScreen screen;\nint showStartTime;\nList<Integer> bookedSeats;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "int showId;\nMovie movie;\nScreen screen;\nint showStartTime;\nList<Integer> bookedSeats;",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 497,
			"versionNonce": 1053606747,
			"isDeleted": false,
			"id": "H1tyMxvMQg6I59dZGZvGL",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1660.9744060349433,
			"y": 1491.199190606458,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 121.53846153846166,
			"height": 195.38461538461524,
			"seed": 454173073,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "VrgngSZi",
				"focus": 0.5860661156942315,
				"gap": 18.46153846153834
			},
			"endBinding": {
				"elementId": "-QHWyBfExwmn9FZKltkWY",
				"focus": 0.2496163014111954,
				"gap": 2.9877202794316418
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
					121.53846153846166,
					-195.38461538461524
				]
			]
		},
		{
			"type": "arrow",
			"version": 451,
			"versionNonce": 1943532501,
			"isDeleted": false,
			"id": "2PPVDHHpGgLnn3jkI8CIQ",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1336.3590214195588,
			"y": 1488.1222675295348,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 232.30769230769226,
			"height": 163.07692307692287,
			"seed": 963903263,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "VrgngSZi",
				"focus": -0.20392954510995245,
				"gap": 21.538461538461434
			},
			"endBinding": {
				"elementId": "rQ7eWSodqI5DI_ZY449L4",
				"focus": -0.10932775401372952,
				"gap": 3.296044056606547
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
					-232.30769230769226,
					-163.07692307692287
				]
			]
		},
		{
			"type": "rectangle",
			"version": 178,
			"versionNonce": 1286709243,
			"isDeleted": false,
			"id": "7CO1Rxr3jlwgC1qV6eKL7",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2138.762867573405,
			"y": 1173.795344452612,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 284.99999999999994,
			"height": 146.24999999999997,
			"seed": 593608607,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "afcCpW7mAylcWwtpwURQH",
					"type": "arrow"
				},
				{
					"id": "sdl6WY0OLOltxQXItKvZX",
					"type": "arrow"
				}
			],
			"updated": 1713338819695,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 121,
			"versionNonce": 1219801397,
			"isDeleted": false,
			"id": "pvviJiPt",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2160.012867573405,
			"y": 1130.045344452612,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 46.875,
			"height": 24,
			"seed": 1750576881,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Seat",
			"rawText": "Seat",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Seat",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 185,
			"versionNonce": 1326573723,
			"isDeleted": false,
			"id": "mSHHZiik",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2158.762867573405,
			"y": 1196.295344452612,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 257.8125,
			"height": 120,
			"seed": 1496324113,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "afcCpW7mAylcWwtpwURQH",
					"type": "arrow"
				},
				{
					"id": "sdl6WY0OLOltxQXItKvZX",
					"type": "arrow"
				},
				{
					"id": "jId6BPpIR7xQgpPmuoJ3n",
					"type": "arrow"
				}
			],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "int id;\nint row;\nint price;\nSeatCategory category;\n",
			"rawText": "int id;\nint row;\nint price;\nSeatCategory category;\n",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "int id;\nint row;\nint price;\nSeatCategory category;\n",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 292,
			"versionNonce": 1372766869,
			"isDeleted": false,
			"id": "afcCpW7mAylcWwtpwURQH",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2039.718204449504,
			"y": 1242.2506813287112,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 96.20737870941093,
			"height": 1.195400305945327,
			"seed": 1546812369,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": {
				"elementId": "mSHHZiik",
				"focus": 0.17797907520135905,
				"gap": 22.837284414490114
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
					96.20737870941093,
					1.195400305945327
				]
			]
		},
		{
			"type": "rectangle",
			"version": 175,
			"versionNonce": 2074090811,
			"isDeleted": false,
			"id": "knGqZLf-yvRthpxs34YWv",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2521.3570735734047,
			"y": 1177.525905452612,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 215,
			"height": 118.75,
			"seed": 614700689,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "sdl6WY0OLOltxQXItKvZX",
					"type": "arrow"
				}
			],
			"updated": 1713338819695,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 171,
			"versionNonce": 602384373,
			"isDeleted": false,
			"id": "qewEtkY7",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2551.3570735734047,
			"y": 1135.025905452612,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 140.625,
			"height": 24,
			"seed": 1437814449,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "SeatCategory",
			"rawText": "SeatCategory",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "SeatCategory",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 171,
			"versionNonce": 767475163,
			"isDeleted": false,
			"id": "BJmmQkyc",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2548.8570735734047,
			"y": 1205.025905452612,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 93.75,
			"height": 72,
			"seed": 409259153,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "SILVER,\nGOLD,\nPLATINUM",
			"rawText": "SILVER,\nGOLD,\nPLATINUM",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "SILVER,\nGOLD,\nPLATINUM",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 354,
			"versionNonce": 553181525,
			"isDeleted": false,
			"id": "sdl6WY0OLOltxQXItKvZX",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2423.762867573405,
			"y": 1243.7203354704004,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 96.25,
			"height": 0.041723983715769464,
			"seed": 1913392753,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "mSHHZiik",
				"focus": -0.2103708246225285,
				"gap": 7.1875
			},
			"endBinding": {
				"elementId": "knGqZLf-yvRthpxs34YWv",
				"focus": -0.1162597006442954,
				"gap": 1.3442059999997582
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
					96.25,
					0.041723983715769464
				]
			]
		},
		{
			"type": "rectangle",
			"version": 326,
			"versionNonce": 1445311163,
			"isDeleted": false,
			"id": "xjd4N132zcSuHqftHxoeh",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 926.4508027936005,
			"y": 796.0721084208606,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 551.9141972323049,
			"height": 274.07533292755807,
			"seed": 1854412529,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "qdJ18-_daYo2iUG38GglC",
					"type": "arrow"
				}
			],
			"updated": 1713345077618,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 244,
			"versionNonce": 1314647733,
			"isDeleted": false,
			"id": "9Jls8ztu",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 938.0782411602243,
			"y": 759.5287306971861,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 210.9375,
			"height": 24,
			"seed": 271192273,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Theater Controller",
			"rawText": "Theater Controller",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Theater Controller",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 382,
			"versionNonce": 1218921243,
			"isDeleted": false,
			"id": "7Ih9mckH",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 953.0278047744547,
			"y": 835.9376113921419,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 457.03125,
			"height": 48,
			"seed": 53595825,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Map<City, List<Theater>> cityToTheater;\nList<Theater> allTheater; ",
			"rawText": "Map<City, List<Theater>> cityToTheater;\nList<Theater> allTheater; ",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Map<City, List<Theater>> cityToTheater;\nList<Theater> allTheater; ",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 497,
			"versionNonce": 338318651,
			"isDeleted": false,
			"id": "YzQYpHos",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 958.0109926458648,
			"y": 932.2792435727381,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 480.46875,
			"height": 120,
			"seed": 507957393,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "Zu8K6ehTaei6IjgxePvVD",
					"type": "arrow"
				}
			],
			"updated": 1713345071651,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "+addTheater(Theater theater,City city);\n+getAllShows(String movieName,City city);\n\n//More Crud Based Operation, remove,\nupdate, etc.. from the map",
			"rawText": "+addTheater(Theater theater,City city);\n+getAllShows(String movieName,City city);\n\n//More Crud Based Operation, remove,\nupdate, etc.. from the map",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "+addTheater(Theater theater,City city);\n+getAllShows(String movieName,City city);\n\n//More Crud Based Operation, remove,\nupdate, etc.. from the map",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 247,
			"versionNonce": 2124818363,
			"isDeleted": false,
			"id": "Zu8K6ehTaei6IjgxePvVD",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1319.7124056819746,
			"y": 1066.4386566725375,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 1.375244452115794,
			"height": 112.43593961320994,
			"seed": 1282885791,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "YzQYpHos",
				"focus": -0.5078432746326095,
				"gap": 14.159413099799394
			},
			"endBinding": {
				"elementId": "5e1EVen-0lTKaNbudJTr_",
				"focus": -0.7602225718748988,
				"gap": 1
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
					-1.375244452115794,
					112.43593961320994
				]
			]
		},
		{
			"type": "rectangle",
			"version": 279,
			"versionNonce": 1604104213,
			"isDeleted": false,
			"id": "c0x7T_8pnKK2boUxk_Vfk",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1212.8202073743305,
			"y": 1847.610213559303,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 325.81539822576815,
			"height": 157.3107697613334,
			"seed": 490665087,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "gpQclP74APIDBaFCNri0T",
					"type": "arrow"
				},
				{
					"id": "jId6BPpIR7xQgpPmuoJ3n",
					"type": "arrow"
				},
				{
					"id": "eS1fBA1oJl1C5M7nHQs-v",
					"type": "arrow"
				},
				{
					"id": "qVspudLBjNi7CsmbPYPyK",
					"type": "arrow"
				}
			],
			"updated": 1713344516542,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 133,
			"versionNonce": 681539675,
			"isDeleted": false,
			"id": "gOEGSmBX",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1251.2144625250817,
			"y": 1815.1227668932827,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 82.03125,
			"height": 24,
			"seed": 1968901265,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Booking",
			"rawText": "Booking",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Booking",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 173,
			"versionNonce": 1299648213,
			"isDeleted": false,
			"id": "Y0HsPcyL",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1257.1212710098125,
			"y": 1896.3413835583333,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 199.21875,
			"height": 72,
			"seed": 298695505,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Show show;\nList<Seat> seats;\nPayment payment;",
			"rawText": "Show show;\nList<Seat> seats;\nPayment payment;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Show show;\nList<Seat> seats;\nPayment payment;",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 622,
			"versionNonce": 879080699,
			"isDeleted": false,
			"id": "gpQclP74APIDBaFCNri0T",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1431.1386350863254,
			"y": 1844.6568093169378,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 1.1036399125135858,
			"height": 149.25579731438643,
			"seed": 1897210673,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "c0x7T_8pnKK2boUxk_Vfk",
				"focus": 0.3426167182670359,
				"gap": 2.953404242365309
			},
			"endBinding": {
				"elementId": "dwi0saERcbhyIWC7eBecu",
				"focus": 0.4411139001754851,
				"gap": 5.740282934555012
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
					-1.1036399125135858,
					-149.25579731438643
				]
			]
		},
		{
			"type": "arrow",
			"version": 598,
			"versionNonce": 1975020597,
			"isDeleted": false,
			"id": "jId6BPpIR7xQgpPmuoJ3n",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1524.1024920360796,
			"y": 1839.933030886538,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 622.9178385818052,
			"height": 526.9591720785629,
			"seed": 1408197567,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "c0x7T_8pnKK2boUxk_Vfk",
				"focus": 0.1810217446590352,
				"gap": 7.6771826727650705
			},
			"endBinding": {
				"elementId": "mSHHZiik",
				"focus": 0.36855514892867636,
				"gap": 11.742536955520336
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
					622.9178385818052,
					-526.9591720785629
				]
			]
		},
		{
			"type": "rectangle",
			"version": 311,
			"versionNonce": 830168475,
			"isDeleted": false,
			"id": "7uTkgsm3ytz8vde25HuEv",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1210.329877802728,
			"y": 2121.2996678162663,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 292.6945810679904,
			"height": 138.4609551570993,
			"seed": 1035956927,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "eS1fBA1oJl1C5M7nHQs-v",
					"type": "arrow"
				}
			],
			"updated": 1713338819695,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 232,
			"versionNonce": 1017585045,
			"isDeleted": false,
			"id": "j4Yo8oj5",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1303.9662024605152,
			"y": 2074.4815054873725,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 82.03125,
			"height": 24,
			"seed": 1405775935,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Payment",
			"rawText": "Payment",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Payment",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 237,
			"versionNonce": 454226491,
			"isDeleted": false,
			"id": "Brrpnb1a",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1247.784407665843,
			"y": 2169.186003193162,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 187.5,
			"height": 24,
			"seed": 1837964529,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Payment details;",
			"rawText": "Payment details;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Payment details;",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 743,
			"versionNonce": 158900981,
			"isDeleted": false,
			"id": "eS1fBA1oJl1C5M7nHQs-v",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1434.7433429718067,
			"y": 2006.7058803844152,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 2.1221660053406595,
			"height": 112.2447103886916,
			"seed": 581119199,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "c0x7T_8pnKK2boUxk_Vfk",
				"focus": -0.3497347990279728,
				"gap": 1.7848970637786579
			},
			"endBinding": {
				"elementId": "7uTkgsm3ytz8vde25HuEv",
				"focus": 0.5522400330901959,
				"gap": 2.3490770431594683
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
					2.1221660053406595,
					112.2447103886916
				]
			]
		},
		{
			"type": "arrow",
			"version": 201,
			"versionNonce": 1645146843,
			"isDeleted": false,
			"id": "cs8phSt__nTpDnGoVPCWg",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1542.8946569775576,
			"y": 1381.5260657801532,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 2.193186079485713,
			"height": 105.27293181531468,
			"seed": 329362865,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "5e1EVen-0lTKaNbudJTr_",
				"focus": -0.6499934731002097,
				"gap": 7.307142509409914
			},
			"endBinding": {
				"elementId": "VrgngSZi",
				"focus": 0.2982130809498221,
				"gap": 22.86173147252839
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
					2.193186079485713,
					105.27293181531468
				]
			]
		},
		{
			"type": "rectangle",
			"version": 82,
			"versionNonce": 1085439061,
			"isDeleted": false,
			"id": "eAgDCikXlhFK_OhiXAfQt",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -108.91214626214361,
			"y": 989.2198949009351,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 498.06538822406736,
			"height": 280.6558933643555,
			"seed": 946439377,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "htevxPdC36h7mGCcTZj1v",
					"type": "arrow"
				}
			],
			"updated": 1713338819695,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 36,
			"versionNonce": 922869627,
			"isDeleted": false,
			"id": "TMCIUxAL",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -67.40669724347134,
			"y": 916.091246629941,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 117.1875,
			"height": 24,
			"seed": 1116125361,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "BookMyShow",
			"rawText": "BookMyShow",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "BookMyShow",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 83,
			"versionNonce": 438970805,
			"isDeleted": false,
			"id": "vjwGvjFv",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -57.52444747712076,
			"y": 1032.7017938728775,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 433.59375,
			"height": 48,
			"seed": 2062460433,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "X3gY-5P3o-ZsYzfV6XisA",
					"type": "arrow"
				}
			],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "MovieController movieController;\nTheaterController theatherCOntroller;",
			"rawText": "MovieController movieController;\nTheaterController theatherCOntroller;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "MovieController movieController;\nTheaterController theatherCOntroller;",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 57,
			"versionNonce": 338573339,
			"isDeleted": false,
			"id": "ONdn2ItG",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -79.26539696309197,
			"y": 1139.4300913494635,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 457.03125,
			"height": 24,
			"seed": 252717489,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "+createBooking(City city, Movie movie);",
			"rawText": "+createBooking(City city, Movie movie);",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "+createBooking(City city, Movie movie);",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 54,
			"versionNonce": 923085589,
			"isDeleted": false,
			"id": "X3gY-5P3o-ZsYzfV6XisA",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 391.1296919151939,
			"y": 1078.16014279809,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 535.6179373361995,
			"height": 171.95114593449944,
			"seed": 234147551,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "vjwGvjFv",
				"focus": 1.024500626713811,
				"gap": 15.060389392314676
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
					535.6179373361995,
					-171.95114593449944
				]
			]
		},
		{
			"type": "arrow",
			"version": 99,
			"versionNonce": 126254267,
			"isDeleted": false,
			"id": "htevxPdC36h7mGCcTZj1v",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 397.0590417750043,
			"y": 1125.5949416765725,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 264.84429373819444,
			"height": 341.92584191572905,
			"seed": 2026459647,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713338819695,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "eAgDCikXlhFK_OhiXAfQt",
				"focus": -0.7268140010219732,
				"gap": 7.905799813080563
			},
			"endBinding": {
				"elementId": "fwWQGnbLcRJEUGIU6TLVv",
				"focus": -0.46103909911818125,
				"gap": 2.367011989811033
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
					264.84429373819444,
					341.92584191572905
				]
			]
		},
		{
			"type": "text",
			"version": 344,
			"versionNonce": 2046991349,
			"isDeleted": false,
			"id": "WIJFhJIB",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 696.3306967634917,
			"y": 2457.2969082121717,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 1148.4375,
			"height": 120,
			"seed": 1153990353,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339420413,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "How will you manage concurrency??\n\n1. Two users cannot book same seat\n2. If user1 has booked a seat , that seat should be booked for 10 mins, even if the payments fails\n    the seat must be booked for 10 mins.",
			"rawText": "How will you manage concurrency??\n\n1. Two users cannot book same seat\n2. If user1 has booked a seat , that seat should be booked for 10 mins, even if the payments fails\n    the seat must be booked for 10 mins.",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "How will you manage concurrency??\n\n1. Two users cannot book same seat\n2. If user1 has booked a seat , that seat should be booked for 10 mins, even if the payments fails\n    the seat must be booked for 10 mins.",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 46,
			"versionNonce": 593066331,
			"isDeleted": false,
			"id": "FsIzjbxF",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1191.6957921046223,
			"y": 2660.234452144034,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 222.65625,
			"height": 24,
			"seed": 1206063135,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "GTSHb9H58Rw-5bdo7c67h",
					"type": "arrow"
				},
				{
					"id": "4azILY4APqaJRrMAmTSTh",
					"type": "arrow"
				}
			],
			"updated": 1713339420493,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Two Type of Locking",
			"rawText": "Two Type of Locking",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Two Type of Locking",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 123,
			"versionNonce": 708285947,
			"isDeleted": false,
			"id": "GTSHb9H58Rw-5bdo7c67h",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1247.8053226194102,
			"y": 2693.2400583292033,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 282.1979328831968,
			"height": 146.87494752400335,
			"seed": 1832800433,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339420493,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "FsIzjbxF",
				"focus": 0.11057473169126959,
				"gap": 9.0056061851692
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
					-282.1979328831968,
					146.87494752400335
				]
			]
		},
		{
			"type": "arrow",
			"version": 148,
			"versionNonce": 879304347,
			"isDeleted": false,
			"id": "4azILY4APqaJRrMAmTSTh",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1254.4064438564442,
			"y": 2694.890338638462,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 435.6740016442342,
			"height": 143.57438690548634,
			"seed": 1666939103,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339420493,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "FsIzjbxF",
				"focus": 0.7944012891088016,
				"gap": 10.655886494427705
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
					435.6740016442342,
					143.57438690548634
				]
			]
		},
		{
			"type": "text",
			"version": 37,
			"versionNonce": 809075413,
			"isDeleted": false,
			"id": "A5BvZJd3",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 856.6888893251547,
			"y": 2861.568649873566,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 222.65625,
			"height": 24,
			"seed": 81237375,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339420413,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Pessimistic Locking",
			"rawText": "Pessimistic Locking",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Pessimistic Locking",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 52,
			"versionNonce": 1074552885,
			"isDeleted": false,
			"id": "KDYQxoop",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1660.375399758072,
			"y": 2861.568649873566,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 210.9375,
			"height": 24,
			"seed": 185429087,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339420413,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Optimistic Locking",
			"rawText": "Optimistic Locking",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Optimistic Locking",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 382,
			"versionNonce": 6066581,
			"isDeleted": false,
			"id": "QV848Hzv",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 437.8237319177653,
			"y": 2926.1584330808346,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 960.9375,
			"height": 312,
			"seed": 1752568031,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339420413,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "- When user-1 tries to read, lock will be acquired \n  at the time of read itself.h\n\n- If user-2 tries to read the same thing, it will fail\n  because the lock is acquired on it.\n\n- Lock will be released only after the update has occurred.\n\n- Pessimistic Locking: If the database uses pessimistic locking,\n the first transaction to request a lock on the row will acquire it,\n and the other transaction will be forced to wait until the lock is released.\n The order in which the transactions request the lock depends on factors\n such as the timing of the requests and the locking strategy used by the database.",
			"rawText": "- When user-1 tries to read, lock will be acquired \n  at the time of read itself.h\n\n- If user-2 tries to read the same thing, it will fail\n  because the lock is acquired on it.\n\n- Lock will be released only after the update has occurred.\n\n- Pessimistic Locking: If the database uses pessimistic locking,\n the first transaction to request a lock on the row will acquire it,\n and the other transaction will be forced to wait until the lock is released.\n The order in which the transactions request the lock depends on factors\n such as the timing of the requests and the locking strategy used by the database.",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "- When user-1 tries to read, lock will be acquired \n  at the time of read itself.h\n\n- If user-2 tries to read the same thing, it will fail\n  because the lock is acquired on it.\n\n- Lock will be released only after the update has occurred.\n\n- Pessimistic Locking: If the database uses pessimistic locking,\n the first transaction to request a lock on the row will acquire it,\n and the other transaction will be forced to wait until the lock is released.\n The order in which the transactions request the lock depends on factors\n such as the timing of the requests and the locking strategy used by the database.",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 471,
			"versionNonce": 509581045,
			"isDeleted": false,
			"id": "hC2K2zgN",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1615.9876778939843,
			"y": 2921.576242469738,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 996.09375,
			"height": 360,
			"seed": 13406651,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339420413,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "- Allow's multiple user to do the read the value \n  and creates a version, let say seat 30 is not booked\n  and it's version-1.\n\n- But when the thread tries to update the seat to book it,\n  it check whether the version is changed or is same.\n\n- If same it allows to update, else throws conflict error.\n\n- Optimistic Locking: With optimistic locking, each transaction reads the row's \n current state and performs the update based on that state.\n When the transaction attempts to commit the changes, the database checks if the \n row has been modified since it was read. If another transaction has modified the \n row in the meantime, an optimistic locking conflict occurs, and the transaction may \n need to be retried.",
			"rawText": "- Allow's multiple user to do the read the value \n  and creates a version, let say seat 30 is not booked\n  and it's version-1.\n\n- But when the thread tries to update the seat to book it,\n  it check whether the version is changed or is same.\n\n- If same it allows to update, else throws conflict error.\n\n- Optimistic Locking: With optimistic locking, each transaction reads the row's \n current state and performs the update based on that state.\n When the transaction attempts to commit the changes, the database checks if the \n row has been modified since it was read. If another transaction has modified the \n row in the meantime, an optimistic locking conflict occurs, and the transaction may \n need to be retried.",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "- Allow's multiple user to do the read the value \n  and creates a version, let say seat 30 is not booked\n  and it's version-1.\n\n- But when the thread tries to update the seat to book it,\n  it check whether the version is changed or is same.\n\n- If same it allows to update, else throws conflict error.\n\n- Optimistic Locking: With optimistic locking, each transaction reads the row's \n current state and performs the update based on that state.\n When the transaction attempts to commit the changes, the database checks if the \n row has been modified since it was read. If another transaction has modified the \n row in the meantime, an optimistic locking conflict occurs, and the transaction may \n need to be retried.",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 691,
			"versionNonce": 77262933,
			"isDeleted": false,
			"id": "ITdacWaa",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 442.4666303141131,
			"y": 3380.08056167994,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 1113.28125,
			"height": 264,
			"seed": 111830773,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339420413,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Optimistic Locking is the best way for Book My Show.\nBecause pessimistic locking can cause locking of all seats.\n\n\nFor example user seats two seats, these two seats are locked, later \nhe decides these seats are not required and books other seats, \nbut the previous seats are still booked. This causes a problem for other users\nbecause they have to wait for 10 min until lock is released.\n\n\nNow the above things can be handled in redis and in redis we can give lock time or expiry time.",
			"rawText": "Optimistic Locking is the best way for Book My Show.\nBecause pessimistic locking can cause locking of all seats.\n\n\nFor example user seats two seats, these two seats are locked, later \nhe decides these seats are not required and books other seats, \nbut the previous seats are still booked. This causes a problem for other users\nbecause they have to wait for 10 min until lock is released.\n\n\nNow the above things can be handled in redis and in redis we can give lock time or expiry time.",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Optimistic Locking is the best way for Book My Show.\nBecause pessimistic locking can cause locking of all seats.\n\n\nFor example user seats two seats, these two seats are locked, later \nhe decides these seats are not required and books other seats, \nbut the previous seats are still booked. This causes a problem for other users\nbecause they have to wait for 10 min until lock is released.\n\n\nNow the above things can be handled in redis and in redis we can give lock time or expiry time.",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 206,
			"versionNonce": 820256181,
			"isDeleted": false,
			"id": "fevfZ1RJ",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1716.4666303141134,
			"y": 3442.08056167994,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 949.21875,
			"height": 72,
			"seed": 675670741,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713339420413,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "Retention Policy -> How long data must be kept.\n\nEviction Policy -> Which data must be removed and how, eg LRU, Round Robin method",
			"rawText": "Retention Policy -> How long data must be kept.\n\nEviction Policy -> Which data must be removed and how, eg LRU, Round Robin method",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Retention Policy -> How long data must be kept.\n\nEviction Policy -> Which data must be removed and how, eg LRU, Round Robin method",
			"lineHeight": 1.2
		},
		{
			"type": "rectangle",
			"version": 35,
			"versionNonce": 972505429,
			"isDeleted": false,
			"id": "Yp4XxRtyjwEEpF1-RcbCV",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1827.6034160365823,
			"y": 1839.8327593253125,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 277.7777777777776,
			"height": 173.33333333333303,
			"seed": 1521946581,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "qVspudLBjNi7CsmbPYPyK",
					"type": "arrow"
				}
			],
			"updated": 1713344516542,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 5,
			"versionNonce": 823695061,
			"isDeleted": false,
			"id": "KIl4jLqt",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1872.0478604810266,
			"y": 1788.7216482142012,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 46.875,
			"height": 24,
			"seed": 1905571291,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713344493672,
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
			"version": 30,
			"versionNonce": 1124532949,
			"isDeleted": false,
			"id": "oj4qlZAW",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1858.7145271476936,
			"y": 1890.9438704364234,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 187.5,
			"height": 48,
			"seed": 567274043,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713344509317,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "string name;\nBooking booking;",
			"rawText": "string name;\nBooking booking;",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "string name;\nBooking booking;",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 30,
			"versionNonce": 1113785077,
			"isDeleted": false,
			"id": "qVspudLBjNi7CsmbPYPyK",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1827.6034160365823,
			"y": 1930.9438704364234,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 286.6666666666665,
			"height": 0,
			"seed": 1221148219,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713344517117,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "Yp4XxRtyjwEEpF1-RcbCV",
				"focus": -0.0512820512820502,
				"gap": 1
			},
			"endBinding": {
				"elementId": "c0x7T_8pnKK2boUxk_Vfk",
				"focus": 0.059478089180432445,
				"gap": 2.301143769817145
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
					-286.6666666666665,
					0
				]
			]
		},
		{
			"type": "rectangle",
			"version": 93,
			"versionNonce": 1422524507,
			"isDeleted": false,
			"id": "gA68nqGhPWIjMFMD4iJ9f",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -45.72991729675118,
			"y": 1520.7851402776937,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 331.42857142857144,
			"height": 202.8571428571429,
			"seed": 1457899483,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [
				{
					"id": "qdJ18-_daYo2iUG38GglC",
					"type": "arrow"
				},
				{
					"id": "jVT7mxvFzZFYnBl56tyNp",
					"type": "arrow"
				}
			],
			"updated": 1713345092144,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 79,
			"versionNonce": 1176840987,
			"isDeleted": false,
			"id": "UySqCC1m",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -0.01563158246540297,
			"y": 1460.7851402776937,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 105.46875,
			"height": 24,
			"seed": 445471899,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713345046251,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "enum City",
			"rawText": "enum City",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "enum City",
			"lineHeight": 1.2
		},
		{
			"type": "text",
			"version": 112,
			"versionNonce": 1680281531,
			"isDeleted": false,
			"id": "ZJ007NgN",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 2.841511274677373,
			"y": 1563.6422831348366,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 117.1875,
			"height": 120,
			"seed": 650118619,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713345046251,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 3,
			"text": "BANGALORE,\nCHENNAI,\n.\n.\netc...",
			"rawText": "BANGALORE,\nCHENNAI,\n.\n.\netc...",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "BANGALORE,\nCHENNAI,\n.\n.\netc...",
			"lineHeight": 1.2
		},
		{
			"type": "arrow",
			"version": 63,
			"versionNonce": 732439323,
			"isDeleted": false,
			"id": "qdJ18-_daYo2iUG38GglC",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 917.1272255603918,
			"y": 995.0708545634081,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 631.4285714285716,
			"height": 605.7142857142858,
			"seed": 1835346261,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713345078147,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "xjd4N132zcSuHqftHxoeh",
				"focus": 0.526940396212209,
				"gap": 9.323577233208596
			},
			"endBinding": {
				"elementId": "gA68nqGhPWIjMFMD4iJ9f",
				"focus": 0.5281880694089321,
				"gap": 1
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
					-631.4285714285716,
					605.7142857142858
				]
			]
		},
		{
			"type": "arrow",
			"version": 62,
			"versionNonce": 1335322491,
			"isDeleted": false,
			"id": "jVT7mxvFzZFYnBl56tyNp",
			"fillStyle": "solid",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 662.8415112746774,
			"y": 1649.3565688491226,
			"strokeColor": "#f08c00",
			"backgroundColor": "transparent",
			"width": 365.7142857142858,
			"height": 2.8571428571428896,
			"seed": 441949269,
			"groupIds": [],
			"frameId": null,
			"roundness": null,
			"boundElements": [],
			"updated": 1713345092671,
			"link": null,
			"locked": false,
			"startBinding": {
				"elementId": "fwWQGnbLcRJEUGIU6TLVv",
				"focus": -0.5365416580893012,
				"gap": 1.4288362283323863
			},
			"endBinding": {
				"elementId": "gA68nqGhPWIjMFMD4iJ9f",
				"focus": 0.22294654498044464,
				"gap": 11.428571428571331
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
					-365.7142857142858,
					-2.8571428571428896
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
		"currentItemStrokeWidth": 2,
		"currentItemStrokeStyle": "solid",
		"currentItemRoughness": 1,
		"currentItemOpacity": 100,
		"currentItemFontFamily": 3,
		"currentItemFontSize": 20,
		"currentItemTextAlign": "left",
		"currentItemStartArrowhead": null,
		"currentItemEndArrowhead": "triangle",
		"scrollX": 203.55026361709608,
		"scrollY": 699.7699756133599,
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