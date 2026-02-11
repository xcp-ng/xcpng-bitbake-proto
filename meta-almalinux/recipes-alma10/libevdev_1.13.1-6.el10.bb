
inherit dnf-bridge

PN = "libevdev"
PE = "0"
PV = "1.13.1"
PR = "6.el10"
PACKAGES = "libevdev libevdev-devel libevdev-utils"


URI_libevdev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libevdev-1.13.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libevdev = " \
 glibc \
"

URI_libevdev-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libevdev-devel-1.13.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libevdev-devel = " \
 libevdev \
 pkgconf-pkg-config \
"

URI_libevdev-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libevdev-utils-1.13.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libevdev-utils = " \
 glibc \
 libevdev \
"
