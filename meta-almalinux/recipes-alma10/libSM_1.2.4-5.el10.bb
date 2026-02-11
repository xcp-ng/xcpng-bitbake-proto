
PN = "libSM"
PE = "0"
PV = "1.2.4"
PR = "5.el10"
PACKAGES = "libSM libSM-devel"


URI_libSM = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libSM-1.2.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libSM = " \
 glibc \
 libuuid \
 libICE \
"

URI_libSM-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libSM-devel-1.2.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libSM-devel = " \
 libICE-devel \
 pkgconf-pkg-config \
 libSM \
 libuuid-devel \
 xorg-x11-proto-devel \
"
