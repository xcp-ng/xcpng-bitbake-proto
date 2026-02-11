
PN = "libsass"
PE = "0"
PV = "3.4.5"
PR = "6.el10"
PACKAGES = "libsass libsass-devel"


URI_libsass = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsass-3.4.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsass = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_libsass-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsass-devel-3.4.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsass-devel = " \
 libsass \
 pkgconf-pkg-config \
"
