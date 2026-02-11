
PN = "libgpg-error"
PE = "0"
PV = "1.50"
PR = "2.el10"
PACKAGES = "libgpg-error libgpg-error-devel"


URI_libgpg-error = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgpg-error-1.50-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgpg-error = " \
 glibc \
"

URI_libgpg-error-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgpg-error-devel-1.50-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgpg-error-devel = " \
 glibc \
 bash \
 pkgconf-pkg-config \
 libgpg-error \
"
