Handshake
=========
Peer-to-peer file transfer. No password/sign-up/storage/website required. Handshake is a Java program that allows you transfer
files between any two Internet-connected computers without requiring an external file-transfer server to act as intermediate.
Light, nimble and multi-platform, Handshake is everything a good, simple file transfer program should be, without being too 
geeky/nerdy. Also provides solid security measures.

| Build status |
| -------------------- |
|[![Build Status](https://travis-ci.org/SecureHandshake/HandshakeApp.svg?branch=develop)](https://travis-ci.org/SecureHandshake/HandshakeApp)

Project Structure
-----------------
The whole Handshake app is divided into two parts:
- This repo (HandshakApp) handles all of the GUI, majority of functionality and interfaces with `gnupg-for-java`. 
- [`gnupg-for-java`](http://github.com/SecureHandshake/gnupg-for-java): Provides an API for all the PGP related tasks such
as encryption, key generation and other crypto stuff.

Which branch?
------------
All the work happens on the `develop` branch, with specific branches for major feature (`feature/*` branches). No guarantee
of compilation of code on `develop` branch. Grab the `master` branch if you want functional, buildable code.

Grab the `gh-pages` branch if you want to improve the [website](http://securehandshake.github.io/HandshakeApp)

Yes, in short we follow Vincent Driessen's [branching model](http://nvie.com/posts/a-successful-git-branching-model/)

Compiling
--------
We prefer Linux for building and developing Handshake, but the compiling should work on Windows and Mac OS too.
To build you need
* [`gnupg-for-java`](http://github.com/SecureHandshake/gnupg-for-java)
* Java Development Kit (JDK): Version 7 and above
* NetBeans IDE: Version 8
* Maven (Default wth NetBeans)

**Note:** NetBeans IDE is required only beacuse of the GUI code. If contributing to non GUI code, any IDE with maven support 
will do.

Instructions for building `gnupg-for-java` can be found in its [own `README`](https://github.com/SecureHandshake/gnupg-for-java/blob/master/README.md)

Contributing
------------
If you notice any bug, have a suggestion then please open a GitHub issue. Pull requests are welcome. Get going! Please be 
consistent with your style throughout.

Please follow Vincent Driessen's [branching model](http://nvie.com/posts/a-successful-git-branching-model/). You can use a
GUI such as [Sourcetree](http://sourcetreeapp.com) or the [`gitflow`](https://github.com/nvie/gitflow) extension to make 
tasks easier for you.

Any kind of contribution is welcome.

License
-------
[![GPL v3](https://www.gnu.org/graphics/gplv3-127x51.png)](http://www.gnu.org/copyleft/gpl.html)

Your use and rights regarding the software are covered under the GNU GPL v3 License. See the
[`LICENSE`](https://github.com/SecureHandshake/HandshakeApp/blob/develop/LICENSE) file for full text.

More Information
----------------
Visit [Handshake App Wiki](https://github.com/SecureHandshake/HandshakeApp/wiki) for technical information or [Handshake App Github Page](http://securehandshake.github.io/HandshakeApp/) for more information.
