
inherit dnf-bridge

PN = "libecpg"
PE = "0"
PV = "16.1"
PR = "14.el10_0"
PACKAGES = "libecpg libpgtypes libecpg-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libecpg-16.1-14.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libecpg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libecpg-16.1-14.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libecpg}"
RDEPENDS:libecpg = " \
 glibc \
 libpgtypes \
 libpq \
"

URI_libpgtypes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpgtypes-16.1-14.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libpgtypes}"
RDEPENDS:libpgtypes = " \
 glibc \
"

URI_libecpg-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libecpg-devel-16.1-14.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libecpg-devel}"
RDEPENDS:libecpg-devel = " \
 libecpg \
 pkgconf-pkg-config \
 libpgtypes \
 libecpg-devel \
 glibc \
 libpq-devel \
"
