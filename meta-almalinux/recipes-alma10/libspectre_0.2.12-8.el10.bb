
PN = "libspectre"
PE = "0"
PV = "0.2.12"
PR = "8.el10"
PACKAGES = "libspectre libspectre-devel"


URI_libspectre = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libspectre-0.2.12-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libspectre = " \
 glibc \
 libgs \
"

URI_libspectre-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libspectre-devel-0.2.12-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libspectre-devel = " \
 libspectre \
 pkgconf-pkg-config \
"
