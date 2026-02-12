
inherit dnf-bridge

PN = "memstrack"
PE = "0"
PV = "0.2.5"
PR = "6.el10"
PACKAGES = "memstrack"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/memstrack-0.2.5-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_memstrack = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/memstrack-0.2.5-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_memstrack}"
RDEPENDS:memstrack = " \
 glibc \
 ncurses-libs \
"
