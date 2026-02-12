
inherit dnf-bridge

PN = "liboqs"
PE = "0"
PV = "0.12.0"
PR = "2.el10"
PACKAGES = "liboqs liboqs-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/liboqs-0.12.0-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_liboqs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liboqs-0.12.0-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_liboqs}"
RDEPENDS:liboqs = " \
 glibc \
"

URI_liboqs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liboqs-devel-0.12.0-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_liboqs-devel}"
RDEPENDS:liboqs-devel = " \
 openssl-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
 liboqs \
"
