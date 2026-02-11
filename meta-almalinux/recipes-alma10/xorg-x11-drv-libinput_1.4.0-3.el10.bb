
PN = "xorg-x11-drv-libinput"
PE = "0"
PV = "1.4.0"
PR = "3.el10"
PACKAGES = "xorg-x11-drv-libinput xorg-x11-drv-libinput-devel"


URI_xorg-x11-drv-libinput = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-drv-libinput-1.4.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-drv-libinput = "
 glibc
 libinput
 xkeyboard-config
 xorg-x11-server-Xorg
"

URI_xorg-x11-drv-libinput-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xorg-x11-drv-libinput-devel-1.4.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorg-x11-drv-libinput-devel = "
 pkgconf-pkg-config
"
