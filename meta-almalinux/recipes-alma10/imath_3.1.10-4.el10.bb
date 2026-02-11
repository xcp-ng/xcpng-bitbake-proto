
inherit dnf-bridge

PN = "imath"
PE = "0"
PV = "3.1.10"
PR = "4.el10"
PACKAGES = "imath python3-imath imath-devel"


URI_imath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/imath-3.1.10-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:imath = " \
 glibc \
 libstdc++ \
"

URI_python3-imath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-imath-3.1.10-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-imath = " \
 python3 \
 imath \
 libgcc \
 boost-python3 \
 python3-libs \
 libstdc++ \
 glibc \
"

URI_imath-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/imath-devel-3.1.10-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:imath-devel = " \
 imath \
 cmake-filesystem \
 python3-imath \
 pkgconf-pkg-config \
 python3-devel \
 boost-devel \
"
