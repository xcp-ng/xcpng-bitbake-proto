
inherit dnf-bridge

PN = "m4"
PE = "0"
PV = "1.4.19"
PR = "11.el10"
PACKAGES = "m4"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/m4-1.4.19-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_m4 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/m4-1.4.19-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_m4}"
RDEPENDS:m4 = " \
 glibc \
"
