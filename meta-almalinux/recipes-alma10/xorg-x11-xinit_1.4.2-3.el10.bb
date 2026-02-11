
PN = "xorg-x11-xinit"
PE = "0"
PV = "1.4.2"
PR = "3.el10"
PACKAGES = "xorg-x11-xinit xorg-x11-xinit-session"


URI_xorg-x11-xinit = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-xinit-1.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-xinit = "rtld(GNU_HASH) ( ) /usr/bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/bash ( ) coreutils ( ) libX11.so.6()(64bit) ( ) setxkbmap ( ) xmodmap ( ) xhost ( ) xorg-x11-xauth ( ) xrdb ( )"
RPROVIDES:xorg-x11-xinit = "config(xorg-x11-xinit) ( =  1.4.2-3.el10) xinit ( =  1.4.2) xorg-x11-xinit ( =  1.4.2-3.el10) xorg-x11-xinit(x86-64) ( =  1.4.2-3.el10)"

URI_xorg-x11-xinit-session = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-xinit-session-1.4.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-xinit-session = "/usr/bin/sh ( )"
RPROVIDES:xorg-x11-xinit-session = "xorg-x11-xinit-session ( =  1.4.2-3.el10) xorg-x11-xinit-session(x86-64) ( =  1.4.2-3.el10)"
