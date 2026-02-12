
inherit dnf-bridge

PN = "lzo"
PE = "0"
PV = "2.10"
PR = "14.el10"
PACKAGES = "lzo lzo-devel lzo-minilzo"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/lzo-2.10-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_lzo = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lzo-2.10-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lzo}"
RDEPENDS:lzo = " \
 glibc \
"

URI_lzo-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lzo-devel-2.10-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lzo-devel}"
RDEPENDS:lzo-devel = " \
 zlib-ng-compat-devel \
 lzo \
 pkgconf-pkg-config \
 lzo-minilzo \
"

URI_lzo-minilzo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lzo-minilzo-2.10-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lzo-minilzo}"
RDEPENDS:lzo-minilzo = " \
 glibc \
"
