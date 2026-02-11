
PN = "libcdio"
PE = "0"
PV = "2.1.0"
PR = "15.el10"
PACKAGES = "libcdio libcdio-devel"


URI_libcdio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcdio-2.1.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcdio = " \
 glibc \
 libgcc \
 ncurses-libs \
 libstdc++ \
"

URI_libcdio-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libcdio-devel-2.1.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcdio-devel = " \
 libcdio-devel \
 pkgconf-pkg-config \
 libcdio \
"
