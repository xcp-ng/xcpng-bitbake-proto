
inherit dnf-bridge

PN = "flac"
PE = "0"
PV = "1.4.3"
PR = "6.el10"
PACKAGES = "flac-libs flac flac-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/flac-1.4.3-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_flac-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flac-libs-1.4.3-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_flac-libs}"
RDEPENDS:flac-libs = " \
 glibc \
 libogg \
 libgcc \
 libstdc++ \
"

URI_flac = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/flac-1.4.3-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_flac}"
RDEPENDS:flac = " \
 glibc \
 flac-libs \
"

URI_flac-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/flac-devel-1.4.3-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_flac-devel}"
RDEPENDS:flac-devel = " \
 flac-devel \
 libogg-devel \
 flac-libs \
 pkgconf-pkg-config \
"
