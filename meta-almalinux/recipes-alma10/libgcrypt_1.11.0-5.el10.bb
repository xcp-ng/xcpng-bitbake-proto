
inherit dnf-bridge

PN = "libgcrypt"
PE = "0"
PV = "1.11.0"
PR = "5.el10"
PACKAGES = "libgcrypt libgcrypt-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libgcrypt-1.11.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libgcrypt = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgcrypt-1.11.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libgcrypt}"
RDEPENDS:libgcrypt = " \
 glibc \
 libgpg-error \
"

URI_libgcrypt-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgcrypt-devel-1.11.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libgcrypt-devel}"
RDEPENDS:libgcrypt-devel = " \
 libgcrypt \
 pkgconf-pkg-config \
 libgpg-error-devel \
 libgpg-error \
 bash \
 glibc \
"
