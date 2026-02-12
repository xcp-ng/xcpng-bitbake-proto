
inherit dnf-bridge

PN = "wsmancli"
PE = "0"
PV = "2.6.2"
PR = "5.el10"
PACKAGES = "wsmancli"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/wsmancli-2.6.2-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_wsmancli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wsmancli-2.6.2-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_wsmancli}"
RDEPENDS:wsmancli = " \
 glibc \
 libwsman1 \
 curl \
"
