
PN = "libisoburn"
PE = "0"
PV = "1.5.6"
PR = "6.el10"
PACKAGES = "libisoburn libisoburn-doc xorriso libisoburn-devel"


URI_libisoburn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libisoburn-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libisoburn = " \
 libburn \
 libacl \
 zlib-ng-compat \
 readline \
 libisofs \
 glibc \
"

URI_libisoburn-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libisoburn-doc-1.5.6-6.el10.noarch.rpm;unpack=0"
RDEPENDS:libisoburn-doc = ""

URI_xorriso = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xorriso-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorriso = " \
 bash \
 libisoburn \
 glibc \
 coreutils \
 alternatives \
"

URI_libisoburn-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libisoburn-devel-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libisoburn-devel = " \
 pkgconf-pkg-config \
 libisoburn \
"
