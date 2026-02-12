
inherit dnf-bridge

PN = "lujavrite"
PE = "0"
PV = "1.0.2"
PR = "7.el10"
PACKAGES = "lujavrite"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/lujavrite-1.0.2-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_lujavrite = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lujavrite-1.0.2-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lujavrite}"
RDEPENDS:lujavrite = " \
 glibc \
 lua-libs \
"
