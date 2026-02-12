
inherit dnf-bridge

PN = "libxshmfence"
PE = "0"
PV = "1.3.2"
PR = "5.el10"
PACKAGES = "libxshmfence libxshmfence-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libxshmfence-1.3.2-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libxshmfence = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxshmfence-1.3.2-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libxshmfence}"
RDEPENDS:libxshmfence = " \
 glibc \
"

URI_libxshmfence-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxshmfence-devel-1.3.2-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libxshmfence-devel}"
RDEPENDS:libxshmfence-devel = " \
 libxshmfence \
 pkgconf-pkg-config \
"
