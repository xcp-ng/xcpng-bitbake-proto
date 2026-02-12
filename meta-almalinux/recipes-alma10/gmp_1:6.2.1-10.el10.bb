
inherit dnf-bridge

PN = "gmp"
PE = "1"
PV = "6.2.1"
PR = "10.el10"
PACKAGES = "gmp gmp-c++ gmp-devel gmp-static"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/gmp-6.2.1-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gmp = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gmp-6.2.1-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gmp}"
RDEPENDS:gmp = " \
 glibc \
"

URI_gmp-c++ = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gmp-c++-6.2.1-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gmp-c++}"
RDEPENDS:gmp-c++ = " \
 glibc \
 gmp \
 libgcc \
 libstdc++ \
"

URI_gmp-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gmp-devel-6.2.1-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gmp-devel}"
RDEPENDS:gmp-devel = " \
 gmp \
 gmp-c++ \
 pkgconf-pkg-config \
 gmp-devel \
"

URI_gmp-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gmp-static-6.2.1-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gmp-static}"
RDEPENDS:gmp-static = " \
 gmp-devel \
"
