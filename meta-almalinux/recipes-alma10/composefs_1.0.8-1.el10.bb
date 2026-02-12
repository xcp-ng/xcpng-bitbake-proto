
inherit dnf-bridge

PN = "composefs"
PE = "0"
PV = "1.0.8"
PR = "1.el10"
PACKAGES = "composefs composefs-libs composefs-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/composefs-1.0.8-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_composefs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/composefs-1.0.8-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_composefs}"
RDEPENDS:composefs = " \
 glibc \
 composefs-libs \
 libgcc \
"

URI_composefs-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/composefs-libs-1.0.8-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_composefs-libs}"
RDEPENDS:composefs-libs = " \
 glibc \
 openssl-libs \
 libgcc \
"

URI_composefs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/composefs-devel-1.0.8-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_composefs-devel}"
RDEPENDS:composefs-devel = " \
 composefs \
 composefs-libs \
 openssl-devel \
 pkgconf-pkg-config \
"
