
inherit dnf-bridge

PN = "libthai"
PE = "0"
PV = "0.1.29"
PR = "10.el10"
PACKAGES = "libthai libthai-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libthai-0.1.29-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libthai = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libthai-0.1.29-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libthai}"
RDEPENDS:libthai = " \
 glibc \
 libdatrie \
"

URI_libthai-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libthai-devel-0.1.29-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libthai-devel}"
RDEPENDS:libthai-devel = " \
 libdatrie-devel \
 libthai \
 pkgconf-pkg-config \
"
