
PN = "rpmdevtools"
PE = "0"
PV = "9.6"
PR = "9.el10"
PACKAGES = "rpmdevtools"


URI_rpmdevtools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpmdevtools-9.6-9.el10.noarch.rpm;unpack=0"
RDEPENDS:rpmdevtools = "/usr/bin/sh ( ) /usr/bin/python3 ( ) /usr/bin/bash ( ) findutils ( ) grep ( ) gawk ( ) sed ( ) curl ( ) diffutils ( ) emacs-filesystem ( ) file ( ) python3dist(argcomplete) ( ) python3dist(requests) ( ) python3dist(rpm) ( ) rpm-build ( >=  4.4.2.3)"
RPROVIDES:rpmdevtools = "config(rpmdevtools) ( =  9.6-9.el10) rpmdevtools ( =  9.6-9.el10)"
