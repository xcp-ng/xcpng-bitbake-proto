
PN = "libvpx"
PE = "0"
PV = "1.14.1"
PR = "3.el10_0"
PACKAGES = "libvpx libvpx-devel libvpx-utils"


URI_libvpx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvpx-1.14.1-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvpx = " \
 glibc \
"

URI_libvpx-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libvpx-devel-1.14.1-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvpx-devel = " \
 libvpx \
 pkgconf-pkg-config \
"

URI_libvpx-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libvpx-utils-1.14.1-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libvpx-utils = " \
 glibc \
 libvpx \
 libgcc \
 libstdc++ \
"
