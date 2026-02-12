
inherit dnf-bridge

PN = "xhost"
PE = "0"
PV = "1.0.9"
PR = "9.el10"
PACKAGES = "xhost"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xhost-1.0.9-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xhost = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xhost-1.0.9-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xhost}"
RDEPENDS:xhost = " \
 glibc \
 libXmu \
 libX11 \
"
