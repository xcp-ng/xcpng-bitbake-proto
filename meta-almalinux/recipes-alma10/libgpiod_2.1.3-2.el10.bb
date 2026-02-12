
inherit dnf-bridge

PN = "libgpiod"
PE = "0"
PV = "2.1.3"
PR = "2.el10"
PACKAGES = "libgpiod libgpiod-c++ libgpiod-devel libgpiod-utils python3-libgpiod"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libgpiod-2.1.3-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libgpiod = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgpiod-2.1.3-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libgpiod}"
RDEPENDS:libgpiod = " \
 glibc \
"

URI_libgpiod-c++ = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgpiod-c++-2.1.3-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libgpiod-c++}"
RDEPENDS:libgpiod-c++ = " \
 glibc \
 libgcc \
 libstdc++ \
 libgpiod \
"

URI_libgpiod-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgpiod-devel-2.1.3-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libgpiod-devel}"
RDEPENDS:libgpiod-devel = " \
 libgpiod-c++ \
 python3-libgpiod \
 pkgconf-pkg-config \
 libgpiod \
"

URI_libgpiod-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgpiod-utils-2.1.3-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libgpiod-utils}"
RDEPENDS:libgpiod-utils = " \
 glibc \
 libgpiod \
"

URI_python3-libgpiod = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libgpiod-2.1.3-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-libgpiod}"
RDEPENDS:python3-libgpiod = " \
 glibc \
 python3 \
 libgpiod \
"
