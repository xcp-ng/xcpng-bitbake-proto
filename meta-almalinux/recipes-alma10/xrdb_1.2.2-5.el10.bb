
inherit dnf-bridge

PN = "xrdb"
PE = "0"
PV = "1.2.2"
PR = "5.el10"
PACKAGES = "xrdb"


URI_xrdb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xrdb-1.2.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xrdb = " \
 glibc \
 libXmu \
 libX11 \
"
