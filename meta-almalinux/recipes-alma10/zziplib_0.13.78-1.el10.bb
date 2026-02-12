
inherit dnf-bridge

PN = "zziplib"
PE = "0"
PV = "0.13.78"
PR = "1.el10"
PACKAGES = "zziplib zziplib-utils zziplib-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/zziplib-0.13.78-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_zziplib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/zziplib-0.13.78-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_zziplib}"
RDEPENDS:zziplib = " \
 glibc \
 zlib-ng-compat \
"

URI_zziplib-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/zziplib-utils-0.13.78-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_zziplib-utils}"
RDEPENDS:zziplib-utils = " \
 glibc \
 zlib-ng-compat \
 zziplib \
"

URI_zziplib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/zziplib-devel-0.13.78-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_zziplib-devel}"
RDEPENDS:zziplib-devel = " \
 sdl12-compat-devel \
 zlib-ng-compat-devel \
 zziplib-devel \
 zziplib \
 pkgconf-pkg-config \
"
