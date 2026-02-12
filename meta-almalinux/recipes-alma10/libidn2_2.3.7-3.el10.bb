
inherit dnf-bridge

PN = "libidn2"
PE = "0"
PV = "2.3.7"
PR = "3.el10"
PACKAGES = "libidn2 idn2 libidn2-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libidn2-2.3.7-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libidn2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libidn2-2.3.7-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libidn2}"
RDEPENDS:libidn2 = " \
 glibc \
 libunistring \
"

URI_idn2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idn2-2.3.7-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_idn2}"
RDEPENDS:idn2 = " \
 glibc \
 libidn2 \
 libunistring \
"

URI_libidn2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libidn2-devel-2.3.7-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libidn2-devel}"
RDEPENDS:libidn2-devel = " \
 libidn2 \
 pkgconf-pkg-config \
"
