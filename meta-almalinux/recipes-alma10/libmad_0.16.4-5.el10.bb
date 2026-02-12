
inherit dnf-bridge

PN = "libmad"
PE = "0"
PV = "0.16.4"
PR = "5.el10"
PACKAGES = "libmad libmad-devel"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/libmad-0.16.4-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libmad = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmad-0.16.4-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmad}"
RDEPENDS:libmad = " \
 glibc \
"

URI_libmad-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmad-devel-0.16.4-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmad-devel}"
RDEPENDS:libmad-devel = " \
 libmad \
 cmake-filesystem \
 pkgconf-pkg-config \
"
