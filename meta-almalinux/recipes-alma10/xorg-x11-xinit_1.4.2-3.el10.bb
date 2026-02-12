
inherit dnf-bridge

PN = "xorg-x11-xinit"
PE = "0"
PV = "1.4.2"
PR = "3.el10"
PACKAGES = "xorg-x11-xinit xorg-x11-xinit-session"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/xorg-x11-xinit-1.4.2-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xorg-x11-xinit = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-xinit-1.4.2-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xorg-x11-xinit}"
RDEPENDS:xorg-x11-xinit = " \
 libX11 \
 xmodmap \
 xhost \
 bash \
 xorg-x11-xauth \
 xrdb \
 glibc \
 coreutils \
 setxkbmap \
"

URI_xorg-x11-xinit-session = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-xinit-session-1.4.2-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xorg-x11-xinit-session}"
RDEPENDS:xorg-x11-xinit-session = " \
 bash \
"
