
inherit dnf-bridge

PN = "libsepol"
PE = "0"
PV = "3.8"
PR = "1.el10"
PACKAGES = "libsepol libsepol-devel libsepol-utils libsepol-static"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libsepol-3.8-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libsepol = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsepol-3.8-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsepol}"
RDEPENDS:libsepol = " \
 glibc \
"

URI_libsepol-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsepol-devel-3.8-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsepol-devel}"
RDEPENDS:libsepol-devel = " \
 pkgconf-pkg-config \
 libsepol \
"

URI_libsepol-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsepol-utils-3.8-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsepol-utils}"
RDEPENDS:libsepol-utils = " \
 glibc \
 libsepol \
"

URI_libsepol-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsepol-static-3.8-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsepol-static}"
RDEPENDS:libsepol-static = " \
 libsepol-devel \
"
