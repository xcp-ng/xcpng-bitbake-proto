
inherit dnf-bridge

PN = "dotconf"
PE = "0"
PV = "1.3"
PR = "37.el10"
PACKAGES = "dotconf dotconf-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/dotconf-1.3-37.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dotconf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dotconf-1.3-37.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dotconf}"
RDEPENDS:dotconf = " \
 glibc \
"

URI_dotconf-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dotconf-devel-1.3-37.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dotconf-devel}"
RDEPENDS:dotconf-devel = " \
 dotconf \
 pkgconf-pkg-config \
"
