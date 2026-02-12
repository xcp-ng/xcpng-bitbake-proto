
inherit dnf-bridge

PN = "libxcrypt"
PE = "0"
PV = "4.4.36"
PR = "10.el10"
PACKAGES = "libxcrypt libxcrypt-compat libxcrypt-devel libxcrypt-static"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libxcrypt-4.4.36-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libxcrypt = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libxcrypt-4.4.36-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libxcrypt}"
RDEPENDS:libxcrypt = " \
 glibc \
"

URI_libxcrypt-compat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxcrypt-compat-4.4.36-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libxcrypt-compat}"
RDEPENDS:libxcrypt-compat = " \
 glibc \
 libxcrypt \
"

URI_libxcrypt-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxcrypt-devel-4.4.36-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libxcrypt-devel}"
RDEPENDS:libxcrypt-devel = " \
 libxcrypt \
 pkgconf-pkg-config \
 glibc-devel \
"

URI_libxcrypt-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxcrypt-static-4.4.36-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libxcrypt-static}"
RDEPENDS:libxcrypt-static = " \
 libxcrypt-devel \
 glibc-static \
"
