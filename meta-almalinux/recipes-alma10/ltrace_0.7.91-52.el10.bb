
inherit dnf-bridge

PN = "ltrace"
PE = "0"
PV = "0.7.91"
PR = "52.el10"
PACKAGES = "ltrace"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ltrace-0.7.91-52.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ltrace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ltrace-0.7.91-52.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ltrace}"
RDEPENDS:ltrace = " \
 elfutils-libelf \
 elfutils-libs \
 libstdc++ \
 glibc \
 libselinux \
"
